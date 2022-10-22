package typingsJapgolly.pulumiKubernetes.typesInputMod.autoscaling.v2

import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ContainerResourceMetricStatus indicates the current value of a resource metric known to Kubernetes, as specified in requests and limits, describing a single container in each pod in the current scale target (e.g. CPU or memory).  Such metrics are built in to Kubernetes, and have special scaling options on top of those available to normal per-pod metrics using the "pods" source.
  */
trait ContainerResourceMetricStatus extends StObject {
  
  /**
    * Container is the name of the container in the pods of the scaling target
    */
  var container: Input[String]
  
  /**
    * current contains the current value for the given metric
    */
  var current: Input[MetricValueStatus]
  
  /**
    * Name is the name of the resource in question.
    */
  var name: Input[String]
}
object ContainerResourceMetricStatus {
  
  inline def apply(container: Input[String], current: Input[MetricValueStatus], name: Input[String]): ContainerResourceMetricStatus = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], current = current.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerResourceMetricStatus]
  }
  
  extension [Self <: ContainerResourceMetricStatus](x: Self) {
    
    inline def setContainer(value: Input[String]): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setCurrent(value: Input[MetricValueStatus]): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
