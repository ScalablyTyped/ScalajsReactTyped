package typingsJapgolly.pulumiKubernetes.typesOutputMod.autoscaling.v2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * PodsMetricStatus indicates the current value of a metric describing each pod in the current scale target (for example, transactions-processed-per-second).
  */
trait PodsMetricStatusPatch extends StObject {
  
  /**
    * current contains the current value for the given metric
    */
  var current: MetricValueStatusPatch
  
  /**
    * metric identifies the target metric by name and selector
    */
  var metric: MetricIdentifierPatch
}
object PodsMetricStatusPatch {
  
  inline def apply(current: MetricValueStatusPatch, metric: MetricIdentifierPatch): PodsMetricStatusPatch = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], metric = metric.asInstanceOf[js.Any])
    __obj.asInstanceOf[PodsMetricStatusPatch]
  }
  
  extension [Self <: PodsMetricStatusPatch](x: Self) {
    
    inline def setCurrent(value: MetricValueStatusPatch): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    inline def setMetric(value: MetricIdentifierPatch): Self = StObject.set(x, "metric", value.asInstanceOf[js.Any])
  }
}
