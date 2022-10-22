package typingsJapgolly.pulumiKubernetes.typesInputMod.policy.v1beta1

import typingsJapgolly.pulumiKubernetes.typesInputMod.meta.v1.LabelSelector
import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * PodDisruptionBudgetSpec is a description of a PodDisruptionBudget.
  */
trait PodDisruptionBudgetSpec extends StObject {
  
  /**
    * An eviction is allowed if at most "maxUnavailable" pods selected by "selector" are unavailable after the eviction, i.e. even in absence of the evicted pod. For example, one can prevent all voluntary evictions by specifying 0. This is a mutually exclusive setting with "minAvailable".
    */
  var maxUnavailable: js.UndefOr[Input[Double | String]] = js.undefined
  
  /**
    * An eviction is allowed if at least "minAvailable" pods selected by "selector" will still be available after the eviction, i.e. even in the absence of the evicted pod.  So for example you can prevent all voluntary evictions by specifying "100%".
    */
  var minAvailable: js.UndefOr[Input[Double | String]] = js.undefined
  
  /**
    * Label query over pods whose evictions are managed by the disruption budget.
    */
  var selector: js.UndefOr[Input[LabelSelector]] = js.undefined
}
object PodDisruptionBudgetSpec {
  
  inline def apply(): PodDisruptionBudgetSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PodDisruptionBudgetSpec]
  }
  
  extension [Self <: PodDisruptionBudgetSpec](x: Self) {
    
    inline def setMaxUnavailable(value: Input[Double | String]): Self = StObject.set(x, "maxUnavailable", value.asInstanceOf[js.Any])
    
    inline def setMaxUnavailableUndefined: Self = StObject.set(x, "maxUnavailable", js.undefined)
    
    inline def setMinAvailable(value: Input[Double | String]): Self = StObject.set(x, "minAvailable", value.asInstanceOf[js.Any])
    
    inline def setMinAvailableUndefined: Self = StObject.set(x, "minAvailable", js.undefined)
    
    inline def setSelector(value: Input[LabelSelector]): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
  }
}
