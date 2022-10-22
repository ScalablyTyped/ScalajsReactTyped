package typingsJapgolly.pulumiKubernetes.typesInputMod.autoscaling.v2beta2

import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ResourceMetricStatus indicates the current value of a resource metric known to Kubernetes, as specified in requests and limits, describing each pod in the current scale target (e.g. CPU or memory).  Such metrics are built in to Kubernetes, and have special scaling options on top of those available to normal per-pod metrics using the "pods" source.
  */
trait ResourceMetricStatus extends StObject {
  
  /**
    * current contains the current value for the given metric
    */
  var current: Input[MetricValueStatus]
  
  /**
    * Name is the name of the resource in question.
    */
  var name: Input[String]
}
object ResourceMetricStatus {
  
  inline def apply(current: Input[MetricValueStatus], name: Input[String]): ResourceMetricStatus = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceMetricStatus]
  }
  
  extension [Self <: ResourceMetricStatus](x: Self) {
    
    inline def setCurrent(value: Input[MetricValueStatus]): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
