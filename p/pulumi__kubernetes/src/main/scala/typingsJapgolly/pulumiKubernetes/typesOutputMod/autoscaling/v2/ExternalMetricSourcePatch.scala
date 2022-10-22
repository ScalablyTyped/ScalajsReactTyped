package typingsJapgolly.pulumiKubernetes.typesOutputMod.autoscaling.v2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ExternalMetricSource indicates how to scale on a metric not associated with any Kubernetes object (for example length of queue in cloud messaging service, or QPS from loadbalancer running outside of cluster).
  */
trait ExternalMetricSourcePatch extends StObject {
  
  /**
    * metric identifies the target metric by name and selector
    */
  var metric: MetricIdentifierPatch
  
  /**
    * target specifies the target value for the given metric
    */
  var target: MetricTargetPatch
}
object ExternalMetricSourcePatch {
  
  inline def apply(metric: MetricIdentifierPatch, target: MetricTargetPatch): ExternalMetricSourcePatch = {
    val __obj = js.Dynamic.literal(metric = metric.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExternalMetricSourcePatch]
  }
  
  extension [Self <: ExternalMetricSourcePatch](x: Self) {
    
    inline def setMetric(value: MetricIdentifierPatch): Self = StObject.set(x, "metric", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: MetricTargetPatch): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
