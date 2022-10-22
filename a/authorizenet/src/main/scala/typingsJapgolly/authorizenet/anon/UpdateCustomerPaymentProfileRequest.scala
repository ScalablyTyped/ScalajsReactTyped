package typingsJapgolly.authorizenet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateCustomerPaymentProfileRequest extends StObject {
  
  var updateCustomerPaymentProfileRequest: typingsJapgolly.authorizenet.mod.APIContracts.UpdateCustomerPaymentProfileRequest
}
object UpdateCustomerPaymentProfileRequest {
  
  inline def apply(
    updateCustomerPaymentProfileRequest: typingsJapgolly.authorizenet.mod.APIContracts.UpdateCustomerPaymentProfileRequest
  ): UpdateCustomerPaymentProfileRequest = {
    val __obj = js.Dynamic.literal(updateCustomerPaymentProfileRequest = updateCustomerPaymentProfileRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateCustomerPaymentProfileRequest]
  }
  
  extension [Self <: UpdateCustomerPaymentProfileRequest](x: Self) {
    
    inline def setUpdateCustomerPaymentProfileRequest(value: typingsJapgolly.authorizenet.mod.APIContracts.UpdateCustomerPaymentProfileRequest): Self = StObject.set(x, "updateCustomerPaymentProfileRequest", value.asInstanceOf[js.Any])
  }
}
