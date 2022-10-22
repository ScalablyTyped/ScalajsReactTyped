package typingsJapgolly.authorizenet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCustomerShippingAddressRequest extends StObject {
  
  var getCustomerShippingAddressRequest: typingsJapgolly.authorizenet.mod.APIContracts.GetCustomerShippingAddressRequest
}
object GetCustomerShippingAddressRequest {
  
  inline def apply(
    getCustomerShippingAddressRequest: typingsJapgolly.authorizenet.mod.APIContracts.GetCustomerShippingAddressRequest
  ): GetCustomerShippingAddressRequest = {
    val __obj = js.Dynamic.literal(getCustomerShippingAddressRequest = getCustomerShippingAddressRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCustomerShippingAddressRequest]
  }
  
  extension [Self <: GetCustomerShippingAddressRequest](x: Self) {
    
    inline def setGetCustomerShippingAddressRequest(value: typingsJapgolly.authorizenet.mod.APIContracts.GetCustomerShippingAddressRequest): Self = StObject.set(x, "getCustomerShippingAddressRequest", value.asInstanceOf[js.Any])
  }
}
