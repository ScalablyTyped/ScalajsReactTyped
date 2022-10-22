package typingsJapgolly.authorizenet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCustomerProfileFromTransactionRequest extends StObject {
  
  var createCustomerProfileFromTransactionRequest: typingsJapgolly.authorizenet.mod.APIContracts.CreateCustomerProfileFromTransactionRequest
}
object CreateCustomerProfileFromTransactionRequest {
  
  inline def apply(
    createCustomerProfileFromTransactionRequest: typingsJapgolly.authorizenet.mod.APIContracts.CreateCustomerProfileFromTransactionRequest
  ): CreateCustomerProfileFromTransactionRequest = {
    val __obj = js.Dynamic.literal(createCustomerProfileFromTransactionRequest = createCustomerProfileFromTransactionRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCustomerProfileFromTransactionRequest]
  }
  
  extension [Self <: CreateCustomerProfileFromTransactionRequest](x: Self) {
    
    inline def setCreateCustomerProfileFromTransactionRequest(value: typingsJapgolly.authorizenet.mod.APIContracts.CreateCustomerProfileFromTransactionRequest): Self = StObject.set(x, "createCustomerProfileFromTransactionRequest", value.asInstanceOf[js.Any])
  }
}
