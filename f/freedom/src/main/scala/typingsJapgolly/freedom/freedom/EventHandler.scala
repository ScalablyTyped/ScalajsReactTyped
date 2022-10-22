package typingsJapgolly.freedom.freedom

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventHandler extends StObject {
  
  // The |off| function removes the event event handling function |f| from
  // both |on| and the |once| event handling.
  def off(t: String, f: js.Function): Unit
  
  // Adds |f| as an event handler for all subsiquent events of type |t|.
  def on(t: String, f: js.Function): Unit
  
  // Adds |f| as an event handler for only the next event of type |t|.
  def once(t: String, f: js.Function): Unit
}
object EventHandler {
  
  inline def apply(
    off: (String, js.Function) => Callback,
    on: (String, js.Function) => Callback,
    once: (String, js.Function) => Callback
  ): EventHandler = {
    val __obj = js.Dynamic.literal(off = js.Any.fromFunction2((t0: String, t1: js.Function) => (off(t0, t1)).runNow()), on = js.Any.fromFunction2((t0: String, t1: js.Function) => (on(t0, t1)).runNow()), once = js.Any.fromFunction2((t0: String, t1: js.Function) => (once(t0, t1)).runNow()))
    __obj.asInstanceOf[EventHandler]
  }
  
  extension [Self <: EventHandler](x: Self) {
    
    inline def setOff(value: (String, js.Function) => Callback): Self = StObject.set(x, "off", js.Any.fromFunction2((t0: String, t1: js.Function) => (value(t0, t1)).runNow()))
    
    inline def setOn(value: (String, js.Function) => Callback): Self = StObject.set(x, "on", js.Any.fromFunction2((t0: String, t1: js.Function) => (value(t0, t1)).runNow()))
    
    inline def setOnce(value: (String, js.Function) => Callback): Self = StObject.set(x, "once", js.Any.fromFunction2((t0: String, t1: js.Function) => (value(t0, t1)).runNow()))
  }
}
