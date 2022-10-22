package typingsJapgolly.pulumiKubernetes.typesOutputMod.autoscaling.v2beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ResourceMetricSource indicates how to scale on a resource metric known to Kubernetes, as specified in requests and limits, describing each pod in the current scale target (e.g. CPU or memory).  The values will be averaged together before being compared to the target.  Such metrics are built in to Kubernetes, and have special scaling options on top of those available to normal per-pod metrics using the "pods" source.  Only one "target" type should be set.
  */
trait ResourceMetricSourcePatch extends StObject {
  
  /**
    * name is the name of the resource in question.
    */
  var name: String
  
  /**
    * target specifies the target value for the given metric
    */
  var target: MetricTargetPatch
}
object ResourceMetricSourcePatch {
  
  inline def apply(name: String, target: MetricTargetPatch): ResourceMetricSourcePatch = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceMetricSourcePatch]
  }
  
  extension [Self <: ResourceMetricSourcePatch](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: MetricTargetPatch): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
