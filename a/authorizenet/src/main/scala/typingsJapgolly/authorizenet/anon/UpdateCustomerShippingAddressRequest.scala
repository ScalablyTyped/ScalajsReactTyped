package typingsJapgolly.authorizenet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateCustomerShippingAddressRequest extends StObject {
  
  var updateCustomerShippingAddressRequest: typingsJapgolly.authorizenet.mod.APIContracts.UpdateCustomerShippingAddressRequest
}
object UpdateCustomerShippingAddressRequest {
  
  inline def apply(
    updateCustomerShippingAddressRequest: typingsJapgolly.authorizenet.mod.APIContracts.UpdateCustomerShippingAddressRequest
  ): UpdateCustomerShippingAddressRequest = {
    val __obj = js.Dynamic.literal(updateCustomerShippingAddressRequest = updateCustomerShippingAddressRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateCustomerShippingAddressRequest]
  }
  
  extension [Self <: UpdateCustomerShippingAddressRequest](x: Self) {
    
    inline def setUpdateCustomerShippingAddressRequest(value: typingsJapgolly.authorizenet.mod.APIContracts.UpdateCustomerShippingAddressRequest): Self = StObject.set(x, "updateCustomerShippingAddressRequest", value.asInstanceOf[js.Any])
  }
}
