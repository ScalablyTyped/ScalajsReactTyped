package typingsJapgolly.firebaseAuth.anon

import typingsJapgolly.firebaseAuth.distNodeSrcApiErrorsMod.ServerError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DomainMessageReason extends StObject {
  
  var domain: String
  
  var message: ServerError
  
  var reason: String
}
object DomainMessageReason {
  
  inline def apply(domain: String, message: ServerError, reason: String): DomainMessageReason = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainMessageReason]
  }
  
  extension [Self <: DomainMessageReason](x: Self) {
    
    inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: ServerError): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
  }
}
