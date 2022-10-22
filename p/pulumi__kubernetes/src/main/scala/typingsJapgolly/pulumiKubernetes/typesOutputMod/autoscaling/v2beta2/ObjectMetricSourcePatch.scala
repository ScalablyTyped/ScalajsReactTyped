package typingsJapgolly.pulumiKubernetes.typesOutputMod.autoscaling.v2beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ObjectMetricSource indicates how to scale on a metric describing a kubernetes object (for example, hits-per-second on an Ingress object).
  */
trait ObjectMetricSourcePatch extends StObject {
  
  var describedObject: CrossVersionObjectReferencePatch
  
  /**
    * metric identifies the target metric by name and selector
    */
  var metric: MetricIdentifierPatch
  
  /**
    * target specifies the target value for the given metric
    */
  var target: MetricTargetPatch
}
object ObjectMetricSourcePatch {
  
  inline def apply(
    describedObject: CrossVersionObjectReferencePatch,
    metric: MetricIdentifierPatch,
    target: MetricTargetPatch
  ): ObjectMetricSourcePatch = {
    val __obj = js.Dynamic.literal(describedObject = describedObject.asInstanceOf[js.Any], metric = metric.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectMetricSourcePatch]
  }
  
  extension [Self <: ObjectMetricSourcePatch](x: Self) {
    
    inline def setDescribedObject(value: CrossVersionObjectReferencePatch): Self = StObject.set(x, "describedObject", value.asInstanceOf[js.Any])
    
    inline def setMetric(value: MetricIdentifierPatch): Self = StObject.set(x, "metric", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: MetricTargetPatch): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
