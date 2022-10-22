package typingsJapgolly.pulumiKubernetes.typesInputMod.autoscaling.v2beta2

import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ObjectMetricSource indicates how to scale on a metric describing a kubernetes object (for example, hits-per-second on an Ingress object).
  */
trait ObjectMetricSourcePatch extends StObject {
  
  var describedObject: js.UndefOr[Input[CrossVersionObjectReferencePatch]] = js.undefined
  
  /**
    * metric identifies the target metric by name and selector
    */
  var metric: js.UndefOr[Input[MetricIdentifierPatch]] = js.undefined
  
  /**
    * target specifies the target value for the given metric
    */
  var target: js.UndefOr[Input[MetricTargetPatch]] = js.undefined
}
object ObjectMetricSourcePatch {
  
  inline def apply(): ObjectMetricSourcePatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectMetricSourcePatch]
  }
  
  extension [Self <: ObjectMetricSourcePatch](x: Self) {
    
    inline def setDescribedObject(value: Input[CrossVersionObjectReferencePatch]): Self = StObject.set(x, "describedObject", value.asInstanceOf[js.Any])
    
    inline def setDescribedObjectUndefined: Self = StObject.set(x, "describedObject", js.undefined)
    
    inline def setMetric(value: Input[MetricIdentifierPatch]): Self = StObject.set(x, "metric", value.asInstanceOf[js.Any])
    
    inline def setMetricUndefined: Self = StObject.set(x, "metric", js.undefined)
    
    inline def setTarget(value: Input[MetricTargetPatch]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
