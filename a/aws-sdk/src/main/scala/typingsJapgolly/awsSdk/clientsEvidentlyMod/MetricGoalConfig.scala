package typingsJapgolly.awsSdk.clientsEvidentlyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetricGoalConfig extends StObject {
  
  /**
    *  INCREASE means that a variation with a higher number for this metric is performing better.  DECREASE means that a variation with a lower number for this metric is performing better.
    */
  var desiredChange: js.UndefOr[ChangeDirectionEnum] = js.undefined
  
  /**
    * A structure that contains details about the metric.
    */
  var metricDefinition: MetricDefinitionConfig
}
object MetricGoalConfig {
  
  inline def apply(metricDefinition: MetricDefinitionConfig): MetricGoalConfig = {
    val __obj = js.Dynamic.literal(metricDefinition = metricDefinition.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricGoalConfig]
  }
  
  extension [Self <: MetricGoalConfig](x: Self) {
    
    inline def setDesiredChange(value: ChangeDirectionEnum): Self = StObject.set(x, "desiredChange", value.asInstanceOf[js.Any])
    
    inline def setDesiredChangeUndefined: Self = StObject.set(x, "desiredChange", js.undefined)
    
    inline def setMetricDefinition(value: MetricDefinitionConfig): Self = StObject.set(x, "metricDefinition", value.asInstanceOf[js.Any])
  }
}
