package typingsJapgolly.dexie.mod

import japgolly.scalajs.react.Callback
import org.scalajs.dom.IDBVersionChangeEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DexieVersionChangeEvent extends StObject {
  
  def fire(event: IDBVersionChangeEvent): Any
  
  def subscribe(fn: js.Function1[/* event */ IDBVersionChangeEvent, Any]): Unit
  
  def unsubscribe(fn: js.Function1[/* event */ IDBVersionChangeEvent, Any]): Unit
}
object DexieVersionChangeEvent {
  
  inline def apply(
    fire: IDBVersionChangeEvent => Any,
    subscribe: js.Function1[/* event */ IDBVersionChangeEvent, Any] => Callback,
    unsubscribe: js.Function1[/* event */ IDBVersionChangeEvent, Any] => Callback
  ): DexieVersionChangeEvent = {
    val __obj = js.Dynamic.literal(fire = js.Any.fromFunction1(fire), subscribe = js.Any.fromFunction1((t0: js.Function1[/* event */ IDBVersionChangeEvent, Any]) => subscribe(t0).runNow()), unsubscribe = js.Any.fromFunction1((t0: js.Function1[/* event */ IDBVersionChangeEvent, Any]) => unsubscribe(t0).runNow()))
    __obj.asInstanceOf[DexieVersionChangeEvent]
  }
  
  extension [Self <: DexieVersionChangeEvent](x: Self) {
    
    inline def setFire(value: IDBVersionChangeEvent => Any): Self = StObject.set(x, "fire", js.Any.fromFunction1(value))
    
    inline def setSubscribe(value: js.Function1[/* event */ IDBVersionChangeEvent, Any] => Callback): Self = StObject.set(x, "subscribe", js.Any.fromFunction1((t0: js.Function1[/* event */ IDBVersionChangeEvent, Any]) => value(t0).runNow()))
    
    inline def setUnsubscribe(value: js.Function1[/* event */ IDBVersionChangeEvent, Any] => Callback): Self = StObject.set(x, "unsubscribe", js.Any.fromFunction1((t0: js.Function1[/* event */ IDBVersionChangeEvent, Any]) => value(t0).runNow()))
  }
}
