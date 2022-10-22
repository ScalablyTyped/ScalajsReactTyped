package typingsJapgolly.pulumiKubernetes.typesInputMod.autoscaling.v2

import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ExternalMetricSource indicates how to scale on a metric not associated with any Kubernetes object (for example length of queue in cloud messaging service, or QPS from loadbalancer running outside of cluster).
  */
trait ExternalMetricSource extends StObject {
  
  /**
    * metric identifies the target metric by name and selector
    */
  var metric: Input[MetricIdentifier]
  
  /**
    * target specifies the target value for the given metric
    */
  var target: Input[MetricTarget]
}
object ExternalMetricSource {
  
  inline def apply(metric: Input[MetricIdentifier], target: Input[MetricTarget]): ExternalMetricSource = {
    val __obj = js.Dynamic.literal(metric = metric.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExternalMetricSource]
  }
  
  extension [Self <: ExternalMetricSource](x: Self) {
    
    inline def setMetric(value: Input[MetricIdentifier]): Self = StObject.set(x, "metric", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: Input[MetricTarget]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
