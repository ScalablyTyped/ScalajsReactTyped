package typingsJapgolly.dexie.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DexieOnReadyEvent extends StObject {
  
  def fire(vipDb: Dexie): Any
  
  def subscribe(fn: js.Function1[/* vipDb */ Dexie, Any], bSticky: Boolean): Unit
  
  def unsubscribe(fn: js.Function1[/* vipDb */ Dexie, Any]): Unit
}
object DexieOnReadyEvent {
  
  inline def apply(
    fire: Dexie => Any,
    subscribe: (js.Function1[/* vipDb */ Dexie, Any], Boolean) => Callback,
    unsubscribe: js.Function1[/* vipDb */ Dexie, Any] => Callback
  ): DexieOnReadyEvent = {
    val __obj = js.Dynamic.literal(fire = js.Any.fromFunction1(fire), subscribe = js.Any.fromFunction2((t0: js.Function1[/* vipDb */ Dexie, Any], t1: Boolean) => (subscribe(t0, t1)).runNow()), unsubscribe = js.Any.fromFunction1((t0: js.Function1[/* vipDb */ Dexie, Any]) => unsubscribe(t0).runNow()))
    __obj.asInstanceOf[DexieOnReadyEvent]
  }
  
  extension [Self <: DexieOnReadyEvent](x: Self) {
    
    inline def setFire(value: Dexie => Any): Self = StObject.set(x, "fire", js.Any.fromFunction1(value))
    
    inline def setSubscribe(value: (js.Function1[/* vipDb */ Dexie, Any], Boolean) => Callback): Self = StObject.set(x, "subscribe", js.Any.fromFunction2((t0: js.Function1[/* vipDb */ Dexie, Any], t1: Boolean) => (value(t0, t1)).runNow()))
    
    inline def setUnsubscribe(value: js.Function1[/* vipDb */ Dexie, Any] => Callback): Self = StObject.set(x, "unsubscribe", js.Any.fromFunction1((t0: js.Function1[/* vipDb */ Dexie, Any]) => value(t0).runNow()))
  }
}
