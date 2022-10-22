package typingsJapgolly.pulumiKubernetes.typesOutputMod.autoscaling.v2beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ResourceMetricStatus indicates the current value of a resource metric known to Kubernetes, as specified in requests and limits, describing each pod in the current scale target (e.g. CPU or memory).  Such metrics are built in to Kubernetes, and have special scaling options on top of those available to normal per-pod metrics using the "pods" source.
  */
trait ResourceMetricStatusPatch extends StObject {
  
  /**
    * current contains the current value for the given metric
    */
  var current: MetricValueStatusPatch
  
  /**
    * Name is the name of the resource in question.
    */
  var name: String
}
object ResourceMetricStatusPatch {
  
  inline def apply(current: MetricValueStatusPatch, name: String): ResourceMetricStatusPatch = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceMetricStatusPatch]
  }
  
  extension [Self <: ResourceMetricStatusPatch](x: Self) {
    
    inline def setCurrent(value: MetricValueStatusPatch): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
