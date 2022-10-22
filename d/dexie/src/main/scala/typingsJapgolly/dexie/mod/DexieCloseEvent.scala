package typingsJapgolly.dexie.mod

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DexieCloseEvent extends StObject {
  
  def fire(event: Event): Any
  
  def subscribe(fn: js.Function1[/* event */ Event, Any]): Unit
  
  def unsubscribe(fn: js.Function1[/* event */ Event, Any]): Unit
}
object DexieCloseEvent {
  
  inline def apply(
    fire: Event => Any,
    subscribe: js.Function1[/* event */ Event, Any] => Callback,
    unsubscribe: js.Function1[/* event */ Event, Any] => Callback
  ): DexieCloseEvent = {
    val __obj = js.Dynamic.literal(fire = js.Any.fromFunction1(fire), subscribe = js.Any.fromFunction1((t0: js.Function1[/* event */ Event, Any]) => subscribe(t0).runNow()), unsubscribe = js.Any.fromFunction1((t0: js.Function1[/* event */ Event, Any]) => unsubscribe(t0).runNow()))
    __obj.asInstanceOf[DexieCloseEvent]
  }
  
  extension [Self <: DexieCloseEvent](x: Self) {
    
    inline def setFire(value: Event => Any): Self = StObject.set(x, "fire", js.Any.fromFunction1(value))
    
    inline def setSubscribe(value: js.Function1[/* event */ Event, Any] => Callback): Self = StObject.set(x, "subscribe", js.Any.fromFunction1((t0: js.Function1[/* event */ Event, Any]) => value(t0).runNow()))
    
    inline def setUnsubscribe(value: js.Function1[/* event */ Event, Any] => Callback): Self = StObject.set(x, "unsubscribe", js.Any.fromFunction1((t0: js.Function1[/* event */ Event, Any]) => value(t0).runNow()))
  }
}
