package typingsJapgolly.authorizenet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTransactionDetailsRequest extends StObject {
  
  var getTransactionDetailsRequest: typingsJapgolly.authorizenet.mod.APIContracts.GetTransactionDetailsRequest
}
object GetTransactionDetailsRequest {
  
  inline def apply(
    getTransactionDetailsRequest: typingsJapgolly.authorizenet.mod.APIContracts.GetTransactionDetailsRequest
  ): GetTransactionDetailsRequest = {
    val __obj = js.Dynamic.literal(getTransactionDetailsRequest = getTransactionDetailsRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTransactionDetailsRequest]
  }
  
  extension [Self <: GetTransactionDetailsRequest](x: Self) {
    
    inline def setGetTransactionDetailsRequest(value: typingsJapgolly.authorizenet.mod.APIContracts.GetTransactionDetailsRequest): Self = StObject.set(x, "getTransactionDetailsRequest", value.asInstanceOf[js.Any])
  }
}
