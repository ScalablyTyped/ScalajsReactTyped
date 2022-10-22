package typingsJapgolly.pulumiKubernetes.typesOutputMod.autoscaling.v2beta1

import typingsJapgolly.pulumiKubernetes.typesOutputMod.meta.v1.LabelSelectorPatch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ObjectMetricStatus indicates the current value of a metric describing a kubernetes object (for example, hits-per-second on an Ingress object).
  */
trait ObjectMetricStatusPatch extends StObject {
  
  /**
    * averageValue is the current value of the average of the metric across all relevant pods (as a quantity)
    */
  var averageValue: String
  
  /**
    * currentValue is the current value of the metric (as a quantity).
    */
  var currentValue: String
  
  /**
    * metricName is the name of the metric in question.
    */
  var metricName: String
  
  /**
    * selector is the string-encoded form of a standard kubernetes label selector for the given metric When set in the ObjectMetricSource, it is passed as an additional parameter to the metrics server for more specific metrics scoping. When unset, just the metricName will be used to gather metrics.
    */
  var selector: LabelSelectorPatch
  
  /**
    * target is the described Kubernetes object.
    */
  var target: CrossVersionObjectReferencePatch
}
object ObjectMetricStatusPatch {
  
  inline def apply(
    averageValue: String,
    currentValue: String,
    metricName: String,
    selector: LabelSelectorPatch,
    target: CrossVersionObjectReferencePatch
  ): ObjectMetricStatusPatch = {
    val __obj = js.Dynamic.literal(averageValue = averageValue.asInstanceOf[js.Any], currentValue = currentValue.asInstanceOf[js.Any], metricName = metricName.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectMetricStatusPatch]
  }
  
  extension [Self <: ObjectMetricStatusPatch](x: Self) {
    
    inline def setAverageValue(value: String): Self = StObject.set(x, "averageValue", value.asInstanceOf[js.Any])
    
    inline def setCurrentValue(value: String): Self = StObject.set(x, "currentValue", value.asInstanceOf[js.Any])
    
    inline def setMetricName(value: String): Self = StObject.set(x, "metricName", value.asInstanceOf[js.Any])
    
    inline def setSelector(value: LabelSelectorPatch): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: CrossVersionObjectReferencePatch): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
