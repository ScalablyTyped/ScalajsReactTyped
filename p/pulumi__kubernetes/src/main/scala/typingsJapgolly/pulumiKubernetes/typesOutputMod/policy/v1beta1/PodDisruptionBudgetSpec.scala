package typingsJapgolly.pulumiKubernetes.typesOutputMod.policy.v1beta1

import typingsJapgolly.pulumiKubernetes.typesOutputMod.meta.v1.LabelSelector
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
  var maxUnavailable: Double | String
  
  /**
    * An eviction is allowed if at least "minAvailable" pods selected by "selector" will still be available after the eviction, i.e. even in the absence of the evicted pod.  So for example you can prevent all voluntary evictions by specifying "100%".
    */
  var minAvailable: Double | String
  
  /**
    * Label query over pods whose evictions are managed by the disruption budget.
    */
  var selector: LabelSelector
}
object PodDisruptionBudgetSpec {
  
  inline def apply(maxUnavailable: Double | String, minAvailable: Double | String, selector: LabelSelector): PodDisruptionBudgetSpec = {
    val __obj = js.Dynamic.literal(maxUnavailable = maxUnavailable.asInstanceOf[js.Any], minAvailable = minAvailable.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[PodDisruptionBudgetSpec]
  }
  
  extension [Self <: PodDisruptionBudgetSpec](x: Self) {
    
    inline def setMaxUnavailable(value: Double | String): Self = StObject.set(x, "maxUnavailable", value.asInstanceOf[js.Any])
    
    inline def setMinAvailable(value: Double | String): Self = StObject.set(x, "minAvailable", value.asInstanceOf[js.Any])
    
    inline def setSelector(value: LabelSelector): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
  }
}
