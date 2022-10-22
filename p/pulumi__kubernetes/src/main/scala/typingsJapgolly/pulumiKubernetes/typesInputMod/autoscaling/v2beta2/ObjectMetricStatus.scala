package typingsJapgolly.pulumiKubernetes.typesInputMod.autoscaling.v2beta2

import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ObjectMetricStatus indicates the current value of a metric describing a kubernetes object (for example, hits-per-second on an Ingress object).
  */
trait ObjectMetricStatus extends StObject {
  
  /**
    * current contains the current value for the given metric
    */
  var current: Input[MetricValueStatus]
  
  var describedObject: Input[CrossVersionObjectReference]
  
  /**
    * metric identifies the target metric by name and selector
    */
  var metric: Input[MetricIdentifier]
}
object ObjectMetricStatus {
  
  inline def apply(
    current: Input[MetricValueStatus],
    describedObject: Input[CrossVersionObjectReference],
    metric: Input[MetricIdentifier]
  ): ObjectMetricStatus = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], describedObject = describedObject.asInstanceOf[js.Any], metric = metric.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectMetricStatus]
  }
  
  extension [Self <: ObjectMetricStatus](x: Self) {
    
    inline def setCurrent(value: Input[MetricValueStatus]): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    inline def setDescribedObject(value: Input[CrossVersionObjectReference]): Self = StObject.set(x, "describedObject", value.asInstanceOf[js.Any])
    
    inline def setMetric(value: Input[MetricIdentifier]): Self = StObject.set(x, "metric", value.asInstanceOf[js.Any])
  }
}
