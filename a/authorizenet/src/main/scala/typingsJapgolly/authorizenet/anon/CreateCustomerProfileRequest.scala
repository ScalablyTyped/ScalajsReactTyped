package typingsJapgolly.authorizenet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCustomerProfileRequest extends StObject {
  
  var createCustomerProfileRequest: typingsJapgolly.authorizenet.mod.APIContracts.CreateCustomerProfileRequest
}
object CreateCustomerProfileRequest {
  
  inline def apply(
    createCustomerProfileRequest: typingsJapgolly.authorizenet.mod.APIContracts.CreateCustomerProfileRequest
  ): CreateCustomerProfileRequest = {
    val __obj = js.Dynamic.literal(createCustomerProfileRequest = createCustomerProfileRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCustomerProfileRequest]
  }
  
  extension [Self <: CreateCustomerProfileRequest](x: Self) {
    
    inline def setCreateCustomerProfileRequest(value: typingsJapgolly.authorizenet.mod.APIContracts.CreateCustomerProfileRequest): Self = StObject.set(x, "createCustomerProfileRequest", value.asInstanceOf[js.Any])
  }
}
