package typingsJapgolly.pulumiKubernetes.typesInputMod.autoscaling.v2beta2

import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * PodsMetricSource indicates how to scale on a metric describing each pod in the current scale target (for example, transactions-processed-per-second). The values will be averaged together before being compared to the target value.
  */
trait PodsMetricSourcePatch extends StObject {
  
  /**
    * metric identifies the target metric by name and selector
    */
  var metric: js.UndefOr[Input[MetricIdentifierPatch]] = js.undefined
  
  /**
    * target specifies the target value for the given metric
    */
  var target: js.UndefOr[Input[MetricTargetPatch]] = js.undefined
}
object PodsMetricSourcePatch {
  
  inline def apply(): PodsMetricSourcePatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PodsMetricSourcePatch]
  }
  
  extension [Self <: PodsMetricSourcePatch](x: Self) {
    
    inline def setMetric(value: Input[MetricIdentifierPatch]): Self = StObject.set(x, "metric", value.asInstanceOf[js.Any])
    
    inline def setMetricUndefined: Self = StObject.set(x, "metric", js.undefined)
    
    inline def setTarget(value: Input[MetricTargetPatch]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
