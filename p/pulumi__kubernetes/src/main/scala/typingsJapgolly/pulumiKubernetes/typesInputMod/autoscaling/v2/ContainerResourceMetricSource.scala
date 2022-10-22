package typingsJapgolly.pulumiKubernetes.typesInputMod.autoscaling.v2

import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ContainerResourceMetricSource indicates how to scale on a resource metric known to Kubernetes, as specified in requests and limits, describing each pod in the current scale target (e.g. CPU or memory).  The values will be averaged together before being compared to the target.  Such metrics are built in to Kubernetes, and have special scaling options on top of those available to normal per-pod metrics using the "pods" source.  Only one "target" type should be set.
  */
trait ContainerResourceMetricSource extends StObject {
  
  /**
    * container is the name of the container in the pods of the scaling target
    */
  var container: Input[String]
  
  /**
    * name is the name of the resource in question.
    */
  var name: Input[String]
  
  /**
    * target specifies the target value for the given metric
    */
  var target: Input[MetricTarget]
}
object ContainerResourceMetricSource {
  
  inline def apply(container: Input[String], name: Input[String], target: Input[MetricTarget]): ContainerResourceMetricSource = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerResourceMetricSource]
  }
  
  extension [Self <: ContainerResourceMetricSource](x: Self) {
    
    inline def setContainer(value: Input[String]): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: Input[MetricTarget]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
