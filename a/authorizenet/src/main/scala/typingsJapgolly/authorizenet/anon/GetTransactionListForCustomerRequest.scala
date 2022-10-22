package typingsJapgolly.authorizenet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTransactionListForCustomerRequest extends StObject {
  
  var getTransactionListForCustomerRequest: typingsJapgolly.authorizenet.mod.APIContracts.GetTransactionListForCustomerRequest
}
object GetTransactionListForCustomerRequest {
  
  inline def apply(
    getTransactionListForCustomerRequest: typingsJapgolly.authorizenet.mod.APIContracts.GetTransactionListForCustomerRequest
  ): GetTransactionListForCustomerRequest = {
    val __obj = js.Dynamic.literal(getTransactionListForCustomerRequest = getTransactionListForCustomerRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTransactionListForCustomerRequest]
  }
  
  extension [Self <: GetTransactionListForCustomerRequest](x: Self) {
    
    inline def setGetTransactionListForCustomerRequest(value: typingsJapgolly.authorizenet.mod.APIContracts.GetTransactionListForCustomerRequest): Self = StObject.set(x, "getTransactionListForCustomerRequest", value.asInstanceOf[js.Any])
  }
}
