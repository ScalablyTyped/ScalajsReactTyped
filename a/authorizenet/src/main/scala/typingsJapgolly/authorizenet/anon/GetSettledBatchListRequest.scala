package typingsJapgolly.authorizenet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSettledBatchListRequest extends StObject {
  
  var getSettledBatchListRequest: typingsJapgolly.authorizenet.mod.APIContracts.GetSettledBatchListRequest
}
object GetSettledBatchListRequest {
  
  inline def apply(
    getSettledBatchListRequest: typingsJapgolly.authorizenet.mod.APIContracts.GetSettledBatchListRequest
  ): GetSettledBatchListRequest = {
    val __obj = js.Dynamic.literal(getSettledBatchListRequest = getSettledBatchListRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSettledBatchListRequest]
  }
  
  extension [Self <: GetSettledBatchListRequest](x: Self) {
    
    inline def setGetSettledBatchListRequest(value: typingsJapgolly.authorizenet.mod.APIContracts.GetSettledBatchListRequest): Self = StObject.set(x, "getSettledBatchListRequest", value.asInstanceOf[js.Any])
  }
}
