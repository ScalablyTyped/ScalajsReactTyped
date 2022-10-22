package typingsJapgolly.pulumiKubernetes.typesOutputMod.autoscaling.v2beta1

import typingsJapgolly.pulumiKubernetes.typesOutputMod.meta.v1.LabelSelectorPatch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ExternalMetricSource indicates how to scale on a metric not associated with any Kubernetes object (for example length of queue in cloud messaging service, or QPS from loadbalancer running outside of cluster). Exactly one "target" type should be set.
  */
trait ExternalMetricSourcePatch extends StObject {
  
  /**
    * metricName is the name of the metric in question.
    */
  var metricName: String
  
  /**
    * metricSelector is used to identify a specific time series within a given metric.
    */
  var metricSelector: LabelSelectorPatch
  
  /**
    * targetAverageValue is the target per-pod value of global metric (as a quantity). Mutually exclusive with TargetValue.
    */
  var targetAverageValue: String
  
  /**
    * targetValue is the target value of the metric (as a quantity). Mutually exclusive with TargetAverageValue.
    */
  var targetValue: String
}
object ExternalMetricSourcePatch {
  
  inline def apply(
    metricName: String,
    metricSelector: LabelSelectorPatch,
    targetAverageValue: String,
    targetValue: String
  ): ExternalMetricSourcePatch = {
    val __obj = js.Dynamic.literal(metricName = metricName.asInstanceOf[js.Any], metricSelector = metricSelector.asInstanceOf[js.Any], targetAverageValue = targetAverageValue.asInstanceOf[js.Any], targetValue = targetValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExternalMetricSourcePatch]
  }
  
  extension [Self <: ExternalMetricSourcePatch](x: Self) {
    
    inline def setMetricName(value: String): Self = StObject.set(x, "metricName", value.asInstanceOf[js.Any])
    
    inline def setMetricSelector(value: LabelSelectorPatch): Self = StObject.set(x, "metricSelector", value.asInstanceOf[js.Any])
    
    inline def setTargetAverageValue(value: String): Self = StObject.set(x, "targetAverageValue", value.asInstanceOf[js.Any])
    
    inline def setTargetValue(value: String): Self = StObject.set(x, "targetValue", value.asInstanceOf[js.Any])
  }
}
