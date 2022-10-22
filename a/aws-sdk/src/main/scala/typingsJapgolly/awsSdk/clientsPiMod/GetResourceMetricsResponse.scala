package typingsJapgolly.awsSdk.clientsPiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResourceMetricsResponse extends StObject {
  
  /**
    * The end time for the returned metrics, after alignment to a granular boundary (as specified by PeriodInSeconds). AlignedEndTime will be greater than or equal to the value of the user-specified Endtime.
    */
  var AlignedEndTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The start time for the returned metrics, after alignment to a granular boundary (as specified by PeriodInSeconds). AlignedStartTime will be less than or equal to the value of the user-specified StartTime.
    */
  var AlignedStartTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * An immutable identifier for a data source that is unique for an Amazon Web Services Region. Performance Insights gathers metrics from this data source. In the console, the identifier is shown as ResourceID. When you call DescribeDBInstances, the identifier is returned as DbiResourceId.
    */
  var Identifier: js.UndefOr[String] = js.undefined
  
  /**
    * An array of metric results, where each array element contains all of the data points for a particular dimension.
    */
  var MetricList: js.UndefOr[MetricKeyDataPointsList] = js.undefined
  
  /**
    * An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the token, up to the value specified by MaxRecords. 
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.clientsPiMod.NextToken] = js.undefined
}
object GetResourceMetricsResponse {
  
  inline def apply(): GetResourceMetricsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetResourceMetricsResponse]
  }
  
  extension [Self <: GetResourceMetricsResponse](x: Self) {
    
    inline def setAlignedEndTime(value: js.Date): Self = StObject.set(x, "AlignedEndTime", value.asInstanceOf[js.Any])
    
    inline def setAlignedEndTimeUndefined: Self = StObject.set(x, "AlignedEndTime", js.undefined)
    
    inline def setAlignedStartTime(value: js.Date): Self = StObject.set(x, "AlignedStartTime", value.asInstanceOf[js.Any])
    
    inline def setAlignedStartTimeUndefined: Self = StObject.set(x, "AlignedStartTime", js.undefined)
    
    inline def setIdentifier(value: String): Self = StObject.set(x, "Identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "Identifier", js.undefined)
    
    inline def setMetricList(value: MetricKeyDataPointsList): Self = StObject.set(x, "MetricList", value.asInstanceOf[js.Any])
    
    inline def setMetricListUndefined: Self = StObject.set(x, "MetricList", js.undefined)
    
    inline def setMetricListVarargs(value: MetricKeyDataPoints*): Self = StObject.set(x, "MetricList", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
