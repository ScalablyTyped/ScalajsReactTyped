package typingsJapgolly.pulumiKubernetes.typesOutputMod.autoscaling.v2beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ExternalMetricStatus indicates the current value of a global metric not associated with any Kubernetes object.
  */
trait ExternalMetricStatusPatch extends StObject {
  
  /**
    * current contains the current value for the given metric
    */
  var current: MetricValueStatusPatch
  
  /**
    * metric identifies the target metric by name and selector
    */
  var metric: MetricIdentifierPatch
}
object ExternalMetricStatusPatch {
  
  inline def apply(current: MetricValueStatusPatch, metric: MetricIdentifierPatch): ExternalMetricStatusPatch = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], metric = metric.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExternalMetricStatusPatch]
  }
  
  extension [Self <: ExternalMetricStatusPatch](x: Self) {
    
    inline def setCurrent(value: MetricValueStatusPatch): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    inline def setMetric(value: MetricIdentifierPatch): Self = StObject.set(x, "metric", value.asInstanceOf[js.Any])
  }
}
