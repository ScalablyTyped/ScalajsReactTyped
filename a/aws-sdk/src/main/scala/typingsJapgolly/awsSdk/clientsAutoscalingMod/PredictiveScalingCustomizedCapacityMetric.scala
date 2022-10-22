package typingsJapgolly.awsSdk.clientsAutoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PredictiveScalingCustomizedCapacityMetric extends StObject {
  
  /**
    * One or more metric data queries to provide the data points for a capacity metric. Use multiple metric data queries only if you are performing a math expression on returned data. 
    */
  var MetricDataQueries: typingsJapgolly.awsSdk.clientsAutoscalingMod.MetricDataQueries
}
object PredictiveScalingCustomizedCapacityMetric {
  
  inline def apply(MetricDataQueries: MetricDataQueries): PredictiveScalingCustomizedCapacityMetric = {
    val __obj = js.Dynamic.literal(MetricDataQueries = MetricDataQueries.asInstanceOf[js.Any])
    __obj.asInstanceOf[PredictiveScalingCustomizedCapacityMetric]
  }
  
  extension [Self <: PredictiveScalingCustomizedCapacityMetric](x: Self) {
    
    inline def setMetricDataQueries(value: MetricDataQueries): Self = StObject.set(x, "MetricDataQueries", value.asInstanceOf[js.Any])
    
    inline def setMetricDataQueriesVarargs(value: MetricDataQuery*): Self = StObject.set(x, "MetricDataQueries", js.Array(value*))
  }
}
