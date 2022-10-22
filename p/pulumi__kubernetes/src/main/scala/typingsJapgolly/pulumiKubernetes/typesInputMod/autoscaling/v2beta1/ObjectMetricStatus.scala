package typingsJapgolly.pulumiKubernetes.typesInputMod.autoscaling.v2beta1

import typingsJapgolly.pulumiKubernetes.typesInputMod.meta.v1.LabelSelector
import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ObjectMetricStatus indicates the current value of a metric describing a kubernetes object (for example, hits-per-second on an Ingress object).
  */
trait ObjectMetricStatus extends StObject {
  
  /**
    * averageValue is the current value of the average of the metric across all relevant pods (as a quantity)
    */
  var averageValue: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * currentValue is the current value of the metric (as a quantity).
    */
  var currentValue: Input[String]
  
  /**
    * metricName is the name of the metric in question.
    */
  var metricName: Input[String]
  
  /**
    * selector is the string-encoded form of a standard kubernetes label selector for the given metric When set in the ObjectMetricSource, it is passed as an additional parameter to the metrics server for more specific metrics scoping. When unset, just the metricName will be used to gather metrics.
    */
  var selector: js.UndefOr[Input[LabelSelector]] = js.undefined
  
  /**
    * target is the described Kubernetes object.
    */
  var target: Input[CrossVersionObjectReference]
}
object ObjectMetricStatus {
  
  inline def apply(currentValue: Input[String], metricName: Input[String], target: Input[CrossVersionObjectReference]): ObjectMetricStatus = {
    val __obj = js.Dynamic.literal(currentValue = currentValue.asInstanceOf[js.Any], metricName = metricName.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectMetricStatus]
  }
  
  extension [Self <: ObjectMetricStatus](x: Self) {
    
    inline def setAverageValue(value: Input[String]): Self = StObject.set(x, "averageValue", value.asInstanceOf[js.Any])
    
    inline def setAverageValueUndefined: Self = StObject.set(x, "averageValue", js.undefined)
    
    inline def setCurrentValue(value: Input[String]): Self = StObject.set(x, "currentValue", value.asInstanceOf[js.Any])
    
    inline def setMetricName(value: Input[String]): Self = StObject.set(x, "metricName", value.asInstanceOf[js.Any])
    
    inline def setSelector(value: Input[LabelSelector]): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
    
    inline def setTarget(value: Input[CrossVersionObjectReference]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
