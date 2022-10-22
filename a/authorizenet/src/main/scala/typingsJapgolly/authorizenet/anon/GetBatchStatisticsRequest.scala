package typingsJapgolly.authorizenet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBatchStatisticsRequest extends StObject {
  
  var getBatchStatisticsRequest: typingsJapgolly.authorizenet.mod.APIContracts.GetBatchStatisticsRequest
}
object GetBatchStatisticsRequest {
  
  inline def apply(getBatchStatisticsRequest: typingsJapgolly.authorizenet.mod.APIContracts.GetBatchStatisticsRequest): GetBatchStatisticsRequest = {
    val __obj = js.Dynamic.literal(getBatchStatisticsRequest = getBatchStatisticsRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBatchStatisticsRequest]
  }
  
  extension [Self <: GetBatchStatisticsRequest](x: Self) {
    
    inline def setGetBatchStatisticsRequest(value: typingsJapgolly.authorizenet.mod.APIContracts.GetBatchStatisticsRequest): Self = StObject.set(x, "getBatchStatisticsRequest", value.asInstanceOf[js.Any])
  }
}
