package typingsJapgolly.authorizenet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteCustomerShippingAddressRequest extends StObject {
  
  var deleteCustomerShippingAddressRequest: typingsJapgolly.authorizenet.mod.APIContracts.DeleteCustomerShippingAddressRequest
}
object DeleteCustomerShippingAddressRequest {
  
  inline def apply(
    deleteCustomerShippingAddressRequest: typingsJapgolly.authorizenet.mod.APIContracts.DeleteCustomerShippingAddressRequest
  ): DeleteCustomerShippingAddressRequest = {
    val __obj = js.Dynamic.literal(deleteCustomerShippingAddressRequest = deleteCustomerShippingAddressRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteCustomerShippingAddressRequest]
  }
  
  extension [Self <: DeleteCustomerShippingAddressRequest](x: Self) {
    
    inline def setDeleteCustomerShippingAddressRequest(value: typingsJapgolly.authorizenet.mod.APIContracts.DeleteCustomerShippingAddressRequest): Self = StObject.set(x, "deleteCustomerShippingAddressRequest", value.asInstanceOf[js.Any])
  }
}
