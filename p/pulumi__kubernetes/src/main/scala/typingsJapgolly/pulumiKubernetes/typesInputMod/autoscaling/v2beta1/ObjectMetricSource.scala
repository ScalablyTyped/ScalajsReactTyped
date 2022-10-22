package typingsJapgolly.pulumiKubernetes.typesInputMod.autoscaling.v2beta1

import typingsJapgolly.pulumiKubernetes.typesInputMod.meta.v1.LabelSelector
import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ObjectMetricSource indicates how to scale on a metric describing a kubernetes object (for example, hits-per-second on an Ingress object).
  */
trait ObjectMetricSource extends StObject {
  
  /**
    * averageValue is the target value of the average of the metric across all relevant pods (as a quantity)
    */
  var averageValue: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * metricName is the name of the metric in question.
    */
  var metricName: Input[String]
  
  /**
    * selector is the string-encoded form of a standard kubernetes label selector for the given metric When set, it is passed as an additional parameter to the metrics server for more specific metrics scoping When unset, just the metricName will be used to gather metrics.
    */
  var selector: js.UndefOr[Input[LabelSelector]] = js.undefined
  
  /**
    * target is the described Kubernetes object.
    */
  var target: Input[CrossVersionObjectReference]
  
  /**
    * targetValue is the target value of the metric (as a quantity).
    */
  var targetValue: Input[String]
}
object ObjectMetricSource {
  
  inline def apply(metricName: Input[String], target: Input[CrossVersionObjectReference], targetValue: Input[String]): ObjectMetricSource = {
    val __obj = js.Dynamic.literal(metricName = metricName.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], targetValue = targetValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectMetricSource]
  }
  
  extension [Self <: ObjectMetricSource](x: Self) {
    
    inline def setAverageValue(value: Input[String]): Self = StObject.set(x, "averageValue", value.asInstanceOf[js.Any])
    
    inline def setAverageValueUndefined: Self = StObject.set(x, "averageValue", js.undefined)
    
    inline def setMetricName(value: Input[String]): Self = StObject.set(x, "metricName", value.asInstanceOf[js.Any])
    
    inline def setSelector(value: Input[LabelSelector]): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
    
    inline def setTarget(value: Input[CrossVersionObjectReference]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetValue(value: Input[String]): Self = StObject.set(x, "targetValue", value.asInstanceOf[js.Any])
  }
}
