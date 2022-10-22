package typingsJapgolly.awsSdk.clientsLookoutmetricsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListMetricSetsResponse extends StObject {
  
  /**
    * A list of the datasets in the AWS Region, with configuration details for each.
    */
  var MetricSetSummaryList: js.UndefOr[typingsJapgolly.awsSdk.clientsLookoutmetricsMod.MetricSetSummaryList] = js.undefined
  
  /**
    * If the response is truncated, the list call returns this token. To retrieve the next set of results, use the token in the next list request. 
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.clientsLookoutmetricsMod.NextToken] = js.undefined
}
object ListMetricSetsResponse {
  
  inline def apply(): ListMetricSetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListMetricSetsResponse]
  }
  
  extension [Self <: ListMetricSetsResponse](x: Self) {
    
    inline def setMetricSetSummaryList(value: MetricSetSummaryList): Self = StObject.set(x, "MetricSetSummaryList", value.asInstanceOf[js.Any])
    
    inline def setMetricSetSummaryListUndefined: Self = StObject.set(x, "MetricSetSummaryList", js.undefined)
    
    inline def setMetricSetSummaryListVarargs(value: MetricSetSummary*): Self = StObject.set(x, "MetricSetSummaryList", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
