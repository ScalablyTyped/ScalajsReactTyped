package typingsJapgolly.authorizenet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetUnsettledTransactionListRequest extends StObject {
  
  var getUnsettledTransactionListRequest: typingsJapgolly.authorizenet.mod.APIContracts.GetUnsettledTransactionListRequest
}
object GetUnsettledTransactionListRequest {
  
  inline def apply(
    getUnsettledTransactionListRequest: typingsJapgolly.authorizenet.mod.APIContracts.GetUnsettledTransactionListRequest
  ): GetUnsettledTransactionListRequest = {
    val __obj = js.Dynamic.literal(getUnsettledTransactionListRequest = getUnsettledTransactionListRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetUnsettledTransactionListRequest]
  }
  
  extension [Self <: GetUnsettledTransactionListRequest](x: Self) {
    
    inline def setGetUnsettledTransactionListRequest(value: typingsJapgolly.authorizenet.mod.APIContracts.GetUnsettledTransactionListRequest): Self = StObject.set(x, "getUnsettledTransactionListRequest", value.asInstanceOf[js.Any])
  }
}
