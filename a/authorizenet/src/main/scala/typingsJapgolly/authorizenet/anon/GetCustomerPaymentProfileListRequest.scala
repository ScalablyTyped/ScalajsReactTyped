package typingsJapgolly.authorizenet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCustomerPaymentProfileListRequest extends StObject {
  
  var getCustomerPaymentProfileListRequest: typingsJapgolly.authorizenet.mod.APIContracts.GetCustomerPaymentProfileListRequest
}
object GetCustomerPaymentProfileListRequest {
  
  inline def apply(
    getCustomerPaymentProfileListRequest: typingsJapgolly.authorizenet.mod.APIContracts.GetCustomerPaymentProfileListRequest
  ): GetCustomerPaymentProfileListRequest = {
    val __obj = js.Dynamic.literal(getCustomerPaymentProfileListRequest = getCustomerPaymentProfileListRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCustomerPaymentProfileListRequest]
  }
  
  extension [Self <: GetCustomerPaymentProfileListRequest](x: Self) {
    
    inline def setGetCustomerPaymentProfileListRequest(value: typingsJapgolly.authorizenet.mod.APIContracts.GetCustomerPaymentProfileListRequest): Self = StObject.set(x, "getCustomerPaymentProfileListRequest", value.asInstanceOf[js.Any])
  }
}
