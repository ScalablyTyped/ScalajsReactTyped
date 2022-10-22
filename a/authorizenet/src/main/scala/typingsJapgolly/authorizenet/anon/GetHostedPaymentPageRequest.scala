package typingsJapgolly.authorizenet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetHostedPaymentPageRequest extends StObject {
  
  var getHostedPaymentPageRequest: typingsJapgolly.authorizenet.mod.APIContracts.GetHostedPaymentPageRequest
}
object GetHostedPaymentPageRequest {
  
  inline def apply(
    getHostedPaymentPageRequest: typingsJapgolly.authorizenet.mod.APIContracts.GetHostedPaymentPageRequest
  ): GetHostedPaymentPageRequest = {
    val __obj = js.Dynamic.literal(getHostedPaymentPageRequest = getHostedPaymentPageRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetHostedPaymentPageRequest]
  }
  
  extension [Self <: GetHostedPaymentPageRequest](x: Self) {
    
    inline def setGetHostedPaymentPageRequest(value: typingsJapgolly.authorizenet.mod.APIContracts.GetHostedPaymentPageRequest): Self = StObject.set(x, "getHostedPaymentPageRequest", value.asInstanceOf[js.Any])
  }
}
