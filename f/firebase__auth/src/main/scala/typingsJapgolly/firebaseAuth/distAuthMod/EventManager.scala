package typingsJapgolly.firebaseAuth.distAuthMod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @internal
  */
trait EventManager extends StObject {
  
  def registerConsumer(authEventConsumer: AuthEventConsumer): Unit
  
  def unregisterConsumer(authEventConsumer: AuthEventConsumer): Unit
}
object EventManager {
  
  inline def apply(registerConsumer: AuthEventConsumer => Callback, unregisterConsumer: AuthEventConsumer => Callback): EventManager = {
    val __obj = js.Dynamic.literal(registerConsumer = js.Any.fromFunction1((t0: AuthEventConsumer) => registerConsumer(t0).runNow()), unregisterConsumer = js.Any.fromFunction1((t0: AuthEventConsumer) => unregisterConsumer(t0).runNow()))
    __obj.asInstanceOf[EventManager]
  }
  
  extension [Self <: EventManager](x: Self) {
    
    inline def setRegisterConsumer(value: AuthEventConsumer => Callback): Self = StObject.set(x, "registerConsumer", js.Any.fromFunction1((t0: AuthEventConsumer) => value(t0).runNow()))
    
    inline def setUnregisterConsumer(value: AuthEventConsumer => Callback): Self = StObject.set(x, "unregisterConsumer", js.Any.fromFunction1((t0: AuthEventConsumer) => value(t0).runNow()))
  }
}
