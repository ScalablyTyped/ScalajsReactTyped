package typingsJapgolly.pulumiKubernetes.typesOutputMod.autoscaling.v2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ContainerResourceMetricStatus indicates the current value of a resource metric known to Kubernetes, as specified in requests and limits, describing a single container in each pod in the current scale target (e.g. CPU or memory).  Such metrics are built in to Kubernetes, and have special scaling options on top of those available to normal per-pod metrics using the "pods" source.
  */
trait ContainerResourceMetricStatusPatch extends StObject {
  
  /**
    * container is the name of the container in the pods of the scaling target
    */
  var container: String
  
  /**
    * currentAverageUtilization is the current value of the average of the resource metric across all relevant pods, represented as a percentage of the requested value of the resource for the pods.  It will only be present if `targetAverageValue` was set in the corresponding metric specification.
    */
  var currentAverageUtilization: Double
  
  /**
    * currentAverageValue is the current value of the average of the resource metric across all relevant pods, as a raw value (instead of as a percentage of the request), similar to the "pods" metric source type. It will always be set, regardless of the corresponding metric specification.
    */
  var currentAverageValue: String
  
  /**
    * name is the name of the resource in question.
    */
  var name: String
}
object ContainerResourceMetricStatusPatch {
  
  inline def apply(container: String, currentAverageUtilization: Double, currentAverageValue: String, name: String): ContainerResourceMetricStatusPatch = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], currentAverageUtilization = currentAverageUtilization.asInstanceOf[js.Any], currentAverageValue = currentAverageValue.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerResourceMetricStatusPatch]
  }
  
  extension [Self <: ContainerResourceMetricStatusPatch](x: Self) {
    
    inline def setContainer(value: String): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setCurrentAverageUtilization(value: Double): Self = StObject.set(x, "currentAverageUtilization", value.asInstanceOf[js.Any])
    
    inline def setCurrentAverageValue(value: String): Self = StObject.set(x, "currentAverageValue", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
