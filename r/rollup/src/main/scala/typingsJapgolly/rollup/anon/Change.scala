package typingsJapgolly.rollup.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.rollup.mod.RollupWatcherEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Change extends StObject {
  
  def change(id: String, change: Event): Unit
  
  def close(): Unit
  
  def event(event: RollupWatcherEvent): Unit
  
  def restart(): Unit
}
object Change {
  
  inline def apply(
    change: (String, Event) => Callback,
    close: Callback,
    event: RollupWatcherEvent => Callback,
    restart: Callback
  ): Change = {
    val __obj = js.Dynamic.literal(change = js.Any.fromFunction2((t0: String, t1: Event) => (change(t0, t1)).runNow()), close = close.toJsFn, event = js.Any.fromFunction1((t0: RollupWatcherEvent) => event(t0).runNow()), restart = restart.toJsFn)
    __obj.asInstanceOf[Change]
  }
  
  extension [Self <: Change](x: Self) {
    
    inline def setChange(value: (String, Event) => Callback): Self = StObject.set(x, "change", js.Any.fromFunction2((t0: String, t1: Event) => (value(t0, t1)).runNow()))
    
    inline def setClose(value: Callback): Self = StObject.set(x, "close", value.toJsFn)
    
    inline def setEvent(value: RollupWatcherEvent => Callback): Self = StObject.set(x, "event", js.Any.fromFunction1((t0: RollupWatcherEvent) => value(t0).runNow()))
    
    inline def setRestart(value: Callback): Self = StObject.set(x, "restart", value.toJsFn)
  }
}
