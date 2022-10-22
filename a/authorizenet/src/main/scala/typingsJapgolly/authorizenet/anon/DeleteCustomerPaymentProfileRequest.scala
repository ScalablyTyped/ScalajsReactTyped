package typingsJapgolly.authorizenet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteCustomerPaymentProfileRequest extends StObject {
  
  var deleteCustomerPaymentProfileRequest: typingsJapgolly.authorizenet.mod.APIContracts.DeleteCustomerPaymentProfileRequest
}
object DeleteCustomerPaymentProfileRequest {
  
  inline def apply(
    deleteCustomerPaymentProfileRequest: typingsJapgolly.authorizenet.mod.APIContracts.DeleteCustomerPaymentProfileRequest
  ): DeleteCustomerPaymentProfileRequest = {
    val __obj = js.Dynamic.literal(deleteCustomerPaymentProfileRequest = deleteCustomerPaymentProfileRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteCustomerPaymentProfileRequest]
  }
  
  extension [Self <: DeleteCustomerPaymentProfileRequest](x: Self) {
    
    inline def setDeleteCustomerPaymentProfileRequest(value: typingsJapgolly.authorizenet.mod.APIContracts.DeleteCustomerPaymentProfileRequest): Self = StObject.set(x, "deleteCustomerPaymentProfileRequest", value.asInstanceOf[js.Any])
  }
}
