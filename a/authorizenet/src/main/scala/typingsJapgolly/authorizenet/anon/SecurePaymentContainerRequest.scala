package typingsJapgolly.authorizenet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurePaymentContainerRequest extends StObject {
  
  var securePaymentContainerRequest: typingsJapgolly.authorizenet.mod.APIContracts.SecurePaymentContainerRequest
}
object SecurePaymentContainerRequest {
  
  inline def apply(
    securePaymentContainerRequest: typingsJapgolly.authorizenet.mod.APIContracts.SecurePaymentContainerRequest
  ): SecurePaymentContainerRequest = {
    val __obj = js.Dynamic.literal(securePaymentContainerRequest = securePaymentContainerRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurePaymentContainerRequest]
  }
  
  extension [Self <: SecurePaymentContainerRequest](x: Self) {
    
    inline def setSecurePaymentContainerRequest(value: typingsJapgolly.authorizenet.mod.APIContracts.SecurePaymentContainerRequest): Self = StObject.set(x, "securePaymentContainerRequest", value.asInstanceOf[js.Any])
  }
}
