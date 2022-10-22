package typingsJapgolly.authorizenet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCustomerProfileIdsRequest extends StObject {
  
  var getCustomerProfileIdsRequest: typingsJapgolly.authorizenet.mod.APIContracts.GetCustomerProfileIdsRequest
}
object GetCustomerProfileIdsRequest {
  
  inline def apply(
    getCustomerProfileIdsRequest: typingsJapgolly.authorizenet.mod.APIContracts.GetCustomerProfileIdsRequest
  ): GetCustomerProfileIdsRequest = {
    val __obj = js.Dynamic.literal(getCustomerProfileIdsRequest = getCustomerProfileIdsRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCustomerProfileIdsRequest]
  }
  
  extension [Self <: GetCustomerProfileIdsRequest](x: Self) {
    
    inline def setGetCustomerProfileIdsRequest(value: typingsJapgolly.authorizenet.mod.APIContracts.GetCustomerProfileIdsRequest): Self = StObject.set(x, "getCustomerProfileIdsRequest", value.asInstanceOf[js.Any])
  }
}
