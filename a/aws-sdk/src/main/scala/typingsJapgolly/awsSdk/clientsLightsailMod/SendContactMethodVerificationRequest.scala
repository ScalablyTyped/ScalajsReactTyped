package typingsJapgolly.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendContactMethodVerificationRequest extends StObject {
  
  /**
    * The protocol to verify, such as Email or SMS (text messaging).
    */
  var protocol: ContactMethodVerificationProtocol
}
object SendContactMethodVerificationRequest {
  
  inline def apply(protocol: ContactMethodVerificationProtocol): SendContactMethodVerificationRequest = {
    val __obj = js.Dynamic.literal(protocol = protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendContactMethodVerificationRequest]
  }
  
  extension [Self <: SendContactMethodVerificationRequest](x: Self) {
    
    inline def setProtocol(value: ContactMethodVerificationProtocol): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
  }
}
