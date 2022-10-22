package typingsJapgolly.pulumiKubernetes.typesInputMod.autoscaling.v2beta2

import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ContainerResourceMetricSource indicates how to scale on a resource metric known to Kubernetes, as specified in requests and limits, describing each pod in the current scale target (e.g. CPU or memory).  The values will be averaged together before being compared to the target.  Such metrics are built in to Kubernetes, and have special scaling options on top of those available to normal per-pod metrics using the "pods" source.  Only one "target" type should be set.
  */
trait ContainerResourceMetricSourcePatch extends StObject {
  
  /**
    * container is the name of the container in the pods of the scaling target
    */
  var container: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * name is the name of the resource in question.
    */
  var name: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * target specifies the target value for the given metric
    */
  var target: js.UndefOr[Input[MetricTargetPatch]] = js.undefined
}
object ContainerResourceMetricSourcePatch {
  
  inline def apply(): ContainerResourceMetricSourcePatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerResourceMetricSourcePatch]
  }
  
  extension [Self <: ContainerResourceMetricSourcePatch](x: Self) {
    
    inline def setContainer(value: Input[String]): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTarget(value: Input[MetricTargetPatch]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
