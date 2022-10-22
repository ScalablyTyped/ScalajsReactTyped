package typingsJapgolly.authorizenet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCustomerProfileRequest extends StObject {
  
  var getCustomerProfileRequest: typingsJapgolly.authorizenet.mod.APIContracts.GetCustomerProfileRequest
}
object GetCustomerProfileRequest {
  
  inline def apply(getCustomerProfileRequest: typingsJapgolly.authorizenet.mod.APIContracts.GetCustomerProfileRequest): GetCustomerProfileRequest = {
    val __obj = js.Dynamic.literal(getCustomerProfileRequest = getCustomerProfileRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCustomerProfileRequest]
  }
  
  extension [Self <: GetCustomerProfileRequest](x: Self) {
    
    inline def setGetCustomerProfileRequest(value: typingsJapgolly.authorizenet.mod.APIContracts.GetCustomerProfileRequest): Self = StObject.set(x, "getCustomerProfileRequest", value.asInstanceOf[js.Any])
  }
}
