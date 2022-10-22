package typingsJapgolly.dexie.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DexiePopulateEvent extends StObject {
  
  def fire(trans: Transaction): Any
  
  def subscribe(fn: js.Function1[/* trans */ Transaction, Any]): Unit
  
  def unsubscribe(fn: js.Function1[/* trans */ Transaction, Any]): Unit
}
object DexiePopulateEvent {
  
  inline def apply(
    fire: Transaction => Any,
    subscribe: js.Function1[/* trans */ Transaction, Any] => Callback,
    unsubscribe: js.Function1[/* trans */ Transaction, Any] => Callback
  ): DexiePopulateEvent = {
    val __obj = js.Dynamic.literal(fire = js.Any.fromFunction1(fire), subscribe = js.Any.fromFunction1((t0: js.Function1[/* trans */ Transaction, Any]) => subscribe(t0).runNow()), unsubscribe = js.Any.fromFunction1((t0: js.Function1[/* trans */ Transaction, Any]) => unsubscribe(t0).runNow()))
    __obj.asInstanceOf[DexiePopulateEvent]
  }
  
  extension [Self <: DexiePopulateEvent](x: Self) {
    
    inline def setFire(value: Transaction => Any): Self = StObject.set(x, "fire", js.Any.fromFunction1(value))
    
    inline def setSubscribe(value: js.Function1[/* trans */ Transaction, Any] => Callback): Self = StObject.set(x, "subscribe", js.Any.fromFunction1((t0: js.Function1[/* trans */ Transaction, Any]) => value(t0).runNow()))
    
    inline def setUnsubscribe(value: js.Function1[/* trans */ Transaction, Any] => Callback): Self = StObject.set(x, "unsubscribe", js.Any.fromFunction1((t0: js.Function1[/* trans */ Transaction, Any]) => value(t0).runNow()))
  }
}
