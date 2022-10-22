package typingsJapgolly.xstate

import japgolly.scalajs.react.Callback
import typingsJapgolly.std.Set
import typingsJapgolly.xstate.anon.Unsubscribe
import typingsJapgolly.xstate.libTypesMod.AnyInterpreter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDevToolsMod {
  
  @JSImport("xstate/lib/devTools", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getGlobal(): js.UndefOr[/* globalThis */ Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getGlobal")().asInstanceOf[js.UndefOr[/* globalThis */ Any]]
  
  inline def registerService(service: AnyInterpreter): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerService")(service.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  type ServiceListener = js.Function1[/* service */ AnyInterpreter, Unit]
  
  trait XStateDevInterface extends StObject {
    
    def onRegister(listener: ServiceListener): Unsubscribe
    
    def register(service: AnyInterpreter): Unit
    
    var services: Set[AnyInterpreter]
    
    def unregister(service: AnyInterpreter): Unit
  }
  object XStateDevInterface {
    
    inline def apply(
      onRegister: ServiceListener => Unsubscribe,
      register: AnyInterpreter => Callback,
      services: Set[AnyInterpreter],
      unregister: AnyInterpreter => Callback
    ): XStateDevInterface = {
      val __obj = js.Dynamic.literal(onRegister = js.Any.fromFunction1(onRegister), register = js.Any.fromFunction1((t0: AnyInterpreter) => register(t0).runNow()), services = services.asInstanceOf[js.Any], unregister = js.Any.fromFunction1((t0: AnyInterpreter) => unregister(t0).runNow()))
      __obj.asInstanceOf[XStateDevInterface]
    }
    
    extension [Self <: XStateDevInterface](x: Self) {
      
      inline def setOnRegister(value: ServiceListener => Unsubscribe): Self = StObject.set(x, "onRegister", js.Any.fromFunction1(value))
      
      inline def setRegister(value: AnyInterpreter => Callback): Self = StObject.set(x, "register", js.Any.fromFunction1((t0: AnyInterpreter) => value(t0).runNow()))
      
      inline def setServices(value: Set[AnyInterpreter]): Self = StObject.set(x, "services", value.asInstanceOf[js.Any])
      
      inline def setUnregister(value: AnyInterpreter => Callback): Self = StObject.set(x, "unregister", js.Any.fromFunction1((t0: AnyInterpreter) => value(t0).runNow()))
    }
  }
}
