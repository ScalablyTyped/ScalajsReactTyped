package typingsJapgolly.reactJoyride.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StoreHelpers extends StObject {
  
  def close(): Unit
  
  def go(nextIndex: Double): Unit
  
  def info(): StoreState
  
  def next(): Unit
  
  def open(): Unit
  
  def prev(): Unit
  
  def reset(restart: Boolean): Unit
  
  def skip(): Unit
}
object StoreHelpers {
  
  inline def apply(
    close: Callback,
    go: Double => Callback,
    info: CallbackTo[StoreState],
    next: Callback,
    open: Callback,
    prev: Callback,
    reset: Boolean => Callback,
    skip: Callback
  ): StoreHelpers = {
    val __obj = js.Dynamic.literal(close = close.toJsFn, go = js.Any.fromFunction1((t0: Double) => go(t0).runNow()), info = info.toJsFn, next = next.toJsFn, open = open.toJsFn, prev = prev.toJsFn, reset = js.Any.fromFunction1((t0: Boolean) => reset(t0).runNow()), skip = skip.toJsFn)
    __obj.asInstanceOf[StoreHelpers]
  }
  
  extension [Self <: StoreHelpers](x: Self) {
    
    inline def setClose(value: Callback): Self = StObject.set(x, "close", value.toJsFn)
    
    inline def setGo(value: Double => Callback): Self = StObject.set(x, "go", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setInfo(value: CallbackTo[StoreState]): Self = StObject.set(x, "info", value.toJsFn)
    
    inline def setNext(value: Callback): Self = StObject.set(x, "next", value.toJsFn)
    
    inline def setOpen(value: Callback): Self = StObject.set(x, "open", value.toJsFn)
    
    inline def setPrev(value: Callback): Self = StObject.set(x, "prev", value.toJsFn)
    
    inline def setReset(value: Boolean => Callback): Self = StObject.set(x, "reset", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setSkip(value: Callback): Self = StObject.set(x, "skip", value.toJsFn)
  }
}
