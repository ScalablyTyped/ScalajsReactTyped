package typingsJapgolly.pulumiKubernetes.typesOutputMod.autoscaling.v2beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * PodsMetricSource indicates how to scale on a metric describing each pod in the current scale target (for example, transactions-processed-per-second). The values will be averaged together before being compared to the target value.
  */
trait PodsMetricSourcePatch extends StObject {
  
  /**
    * metric identifies the target metric by name and selector
    */
  var metric: MetricIdentifierPatch
  
  /**
    * target specifies the target value for the given metric
    */
  var target: MetricTargetPatch
}
object PodsMetricSourcePatch {
  
  inline def apply(metric: MetricIdentifierPatch, target: MetricTargetPatch): PodsMetricSourcePatch = {
    val __obj = js.Dynamic.literal(metric = metric.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[PodsMetricSourcePatch]
  }
  
  extension [Self <: PodsMetricSourcePatch](x: Self) {
    
    inline def setMetric(value: MetricIdentifierPatch): Self = StObject.set(x, "metric", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: MetricTargetPatch): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
