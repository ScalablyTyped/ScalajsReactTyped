package typingsJapgolly.pulumiKubernetes.typesInputMod.autoscaling.v2

import typingsJapgolly.pulumiPulumi.outputMod.Input
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
  var metric: js.UndefOr[Input[MetricIdentifierPatch]] = js.undefined
  
  /**
    * target specifies the target value for the given metric
    */
  var target: js.UndefOr[Input[MetricTargetPatch]] = js.undefined
}
object ExternalMetricSourcePatch {
  
  inline def apply(): ExternalMetricSourcePatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExternalMetricSourcePatch]
  }
  
  extension [Self <: ExternalMetricSourcePatch](x: Self) {
    
    inline def setMetric(value: Input[MetricIdentifierPatch]): Self = StObject.set(x, "metric", value.asInstanceOf[js.Any])
    
    inline def setMetricUndefined: Self = StObject.set(x, "metric", js.undefined)
    
    inline def setTarget(value: Input[MetricTargetPatch]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
