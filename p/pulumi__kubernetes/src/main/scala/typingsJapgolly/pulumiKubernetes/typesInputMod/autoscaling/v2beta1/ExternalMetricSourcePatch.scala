package typingsJapgolly.pulumiKubernetes.typesInputMod.autoscaling.v2beta1

import typingsJapgolly.pulumiKubernetes.typesInputMod.meta.v1.LabelSelectorPatch
import typingsJapgolly.pulumiPulumi.outputMod.Input
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
  var metricName: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * metricSelector is used to identify a specific time series within a given metric.
    */
  var metricSelector: js.UndefOr[Input[LabelSelectorPatch]] = js.undefined
  
  /**
    * targetAverageValue is the target per-pod value of global metric (as a quantity). Mutually exclusive with TargetValue.
    */
  var targetAverageValue: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * targetValue is the target value of the metric (as a quantity). Mutually exclusive with TargetAverageValue.
    */
  var targetValue: js.UndefOr[Input[String]] = js.undefined
}
object ExternalMetricSourcePatch {
  
  inline def apply(): ExternalMetricSourcePatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExternalMetricSourcePatch]
  }
  
  extension [Self <: ExternalMetricSourcePatch](x: Self) {
    
    inline def setMetricName(value: Input[String]): Self = StObject.set(x, "metricName", value.asInstanceOf[js.Any])
    
    inline def setMetricNameUndefined: Self = StObject.set(x, "metricName", js.undefined)
    
    inline def setMetricSelector(value: Input[LabelSelectorPatch]): Self = StObject.set(x, "metricSelector", value.asInstanceOf[js.Any])
    
    inline def setMetricSelectorUndefined: Self = StObject.set(x, "metricSelector", js.undefined)
    
    inline def setTargetAverageValue(value: Input[String]): Self = StObject.set(x, "targetAverageValue", value.asInstanceOf[js.Any])
    
    inline def setTargetAverageValueUndefined: Self = StObject.set(x, "targetAverageValue", js.undefined)
    
    inline def setTargetValue(value: Input[String]): Self = StObject.set(x, "targetValue", value.asInstanceOf[js.Any])
    
    inline def setTargetValueUndefined: Self = StObject.set(x, "targetValue", js.undefined)
  }
}
