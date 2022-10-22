package typingsJapgolly.amapJsSdk.AMap

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventBindable extends StObject {
  
  def off(eventName: String, callback: EventCallback): Unit
  
  def on(eventName: String, callback: EventCallback): Unit
}
object EventBindable {
  
  inline def apply(off: (String, EventCallback) => Callback, on: (String, EventCallback) => Callback): EventBindable = {
    val __obj = js.Dynamic.literal(off = js.Any.fromFunction2((t0: String, t1: EventCallback) => (off(t0, t1)).runNow()), on = js.Any.fromFunction2((t0: String, t1: EventCallback) => (on(t0, t1)).runNow()))
    __obj.asInstanceOf[EventBindable]
  }
  
  extension [Self <: EventBindable](x: Self) {
    
    inline def setOff(value: (String, EventCallback) => Callback): Self = StObject.set(x, "off", js.Any.fromFunction2((t0: String, t1: EventCallback) => (value(t0, t1)).runNow()))
    
    inline def setOn(value: (String, EventCallback) => Callback): Self = StObject.set(x, "on", js.Any.fromFunction2((t0: String, t1: EventCallback) => (value(t0, t1)).runNow()))
  }
}
