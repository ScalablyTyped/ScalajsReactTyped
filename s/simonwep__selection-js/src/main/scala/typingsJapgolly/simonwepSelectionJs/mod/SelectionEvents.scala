package typingsJapgolly.simonwepSelectionJs.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectionEvents extends StObject {
  
  def beforestart(e: SelectionEvent): Boolean
  
  def move(e: SelectionEvent): Unit
  
  def start(e: SelectionEvent): Unit
  
  def stop(e: SelectionEvent): Unit
}
object SelectionEvents {
  
  inline def apply(
    beforestart: SelectionEvent => Boolean,
    move: SelectionEvent => Callback,
    start: SelectionEvent => Callback,
    stop: SelectionEvent => Callback
  ): SelectionEvents = {
    val __obj = js.Dynamic.literal(beforestart = js.Any.fromFunction1(beforestart), move = js.Any.fromFunction1((t0: SelectionEvent) => move(t0).runNow()), start = js.Any.fromFunction1((t0: SelectionEvent) => start(t0).runNow()), stop = js.Any.fromFunction1((t0: SelectionEvent) => stop(t0).runNow()))
    __obj.asInstanceOf[SelectionEvents]
  }
  
  extension [Self <: SelectionEvents](x: Self) {
    
    inline def setBeforestart(value: SelectionEvent => Boolean): Self = StObject.set(x, "beforestart", js.Any.fromFunction1(value))
    
    inline def setMove(value: SelectionEvent => Callback): Self = StObject.set(x, "move", js.Any.fromFunction1((t0: SelectionEvent) => value(t0).runNow()))
    
    inline def setStart(value: SelectionEvent => Callback): Self = StObject.set(x, "start", js.Any.fromFunction1((t0: SelectionEvent) => value(t0).runNow()))
    
    inline def setStop(value: SelectionEvent => Callback): Self = StObject.set(x, "stop", js.Any.fromFunction1((t0: SelectionEvent) => value(t0).runNow()))
  }
}
