package typingsJapgolly.arangodb.Foxx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SessionsMiddleware
  extends StObject
     with DelegateMiddleware {
  
  var storage: SessionStorage
  
  var transport: js.Array[SessionTransport]
}
object SessionsMiddleware {
  
  inline def apply(
    register: Endpoint => SimpleMiddleware,
    storage: SessionStorage,
    transport: js.Array[SessionTransport]
  ): SessionsMiddleware = {
    val __obj = js.Dynamic.literal(register = js.Any.fromFunction1(register), storage = storage.asInstanceOf[js.Any], transport = transport.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionsMiddleware]
  }
  
  extension [Self <: SessionsMiddleware](x: Self) {
    
    inline def setStorage(value: SessionStorage): Self = StObject.set(x, "storage", value.asInstanceOf[js.Any])
    
    inline def setTransport(value: js.Array[SessionTransport]): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
    
    inline def setTransportVarargs(value: SessionTransport*): Self = StObject.set(x, "transport", js.Array(value*))
  }
}
