package typingsJapgolly.authorizenet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCustomerProfileTransactionRequest extends StObject {
  
  var createCustomerProfileTransactionRequest: typingsJapgolly.authorizenet.mod.APIContracts.CreateCustomerProfileTransactionRequest
}
object CreateCustomerProfileTransactionRequest {
  
  inline def apply(
    createCustomerProfileTransactionRequest: typingsJapgolly.authorizenet.mod.APIContracts.CreateCustomerProfileTransactionRequest
  ): CreateCustomerProfileTransactionRequest = {
    val __obj = js.Dynamic.literal(createCustomerProfileTransactionRequest = createCustomerProfileTransactionRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCustomerProfileTransactionRequest]
  }
  
  extension [Self <: CreateCustomerProfileTransactionRequest](x: Self) {
    
    inline def setCreateCustomerProfileTransactionRequest(value: typingsJapgolly.authorizenet.mod.APIContracts.CreateCustomerProfileTransactionRequest): Self = StObject.set(x, "createCustomerProfileTransactionRequest", value.asInstanceOf[js.Any])
  }
}
