package typingsJapgolly.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRelationalDatabaseMetricDataResult extends StObject {
  
  /**
    * An array of objects that describe the metric data returned.
    */
  var metricData: js.UndefOr[MetricDatapointList] = js.undefined
  
  /**
    * The name of the metric returned.
    */
  var metricName: js.UndefOr[RelationalDatabaseMetricName] = js.undefined
}
object GetRelationalDatabaseMetricDataResult {
  
  inline def apply(): GetRelationalDatabaseMetricDataResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRelationalDatabaseMetricDataResult]
  }
  
  extension [Self <: GetRelationalDatabaseMetricDataResult](x: Self) {
    
    inline def setMetricData(value: MetricDatapointList): Self = StObject.set(x, "metricData", value.asInstanceOf[js.Any])
    
    inline def setMetricDataUndefined: Self = StObject.set(x, "metricData", js.undefined)
    
    inline def setMetricDataVarargs(value: MetricDatapoint*): Self = StObject.set(x, "metricData", js.Array(value*))
    
    inline def setMetricName(value: RelationalDatabaseMetricName): Self = StObject.set(x, "metricName", value.asInstanceOf[js.Any])
    
    inline def setMetricNameUndefined: Self = StObject.set(x, "metricName", js.undefined)
  }
}
