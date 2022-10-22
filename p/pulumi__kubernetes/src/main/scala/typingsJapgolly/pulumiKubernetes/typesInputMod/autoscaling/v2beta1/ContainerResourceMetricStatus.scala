package typingsJapgolly.pulumiKubernetes.typesInputMod.autoscaling.v2beta1

import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ContainerResourceMetricStatus indicates the current value of a resource metric known to Kubernetes, as specified in requests and limits, describing a single container in each pod in the current scale target (e.g. CPU or memory).  Such metrics are built in to Kubernetes, and have special scaling options on top of those available to normal per-pod metrics using the "pods" source.
  */
trait ContainerResourceMetricStatus extends StObject {
  
  /**
    * container is the name of the container in the pods of the scaling target
    */
  var container: Input[String]
  
  /**
    * currentAverageUtilization is the current value of the average of the resource metric across all relevant pods, represented as a percentage of the requested value of the resource for the pods.  It will only be present if `targetAverageValue` was set in the corresponding metric specification.
    */
  var currentAverageUtilization: js.UndefOr[Input[Double]] = js.undefined
  
  /**
    * currentAverageValue is the current value of the average of the resource metric across all relevant pods, as a raw value (instead of as a percentage of the request), similar to the "pods" metric source type. It will always be set, regardless of the corresponding metric specification.
    */
  var currentAverageValue: Input[String]
  
  /**
    * name is the name of the resource in question.
    */
  var name: Input[String]
}
object ContainerResourceMetricStatus {
  
  inline def apply(container: Input[String], currentAverageValue: Input[String], name: Input[String]): ContainerResourceMetricStatus = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], currentAverageValue = currentAverageValue.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerResourceMetricStatus]
  }
  
  extension [Self <: ContainerResourceMetricStatus](x: Self) {
    
    inline def setContainer(value: Input[String]): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setCurrentAverageUtilization(value: Input[Double]): Self = StObject.set(x, "currentAverageUtilization", value.asInstanceOf[js.Any])
    
    inline def setCurrentAverageUtilizationUndefined: Self = StObject.set(x, "currentAverageUtilization", js.undefined)
    
    inline def setCurrentAverageValue(value: Input[String]): Self = StObject.set(x, "currentAverageValue", value.asInstanceOf[js.Any])
    
    inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
