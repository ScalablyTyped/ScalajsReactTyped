package typingsJapgolly.pulumiKubernetes.typesInputMod.core.v1

import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The weights of all of the matched WeightedPodAffinityTerm fields are added per-node to find the most preferred node(s)
  */
trait WeightedPodAffinityTermPatch extends StObject {
  
  /**
    * Required. A pod affinity term, associated with the corresponding weight.
    */
  var podAffinityTerm: js.UndefOr[Input[PodAffinityTermPatch]] = js.undefined
  
  /**
    * weight associated with matching the corresponding podAffinityTerm, in the range 1-100.
    */
  var weight: js.UndefOr[Input[Double]] = js.undefined
}
object WeightedPodAffinityTermPatch {
  
  inline def apply(): WeightedPodAffinityTermPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WeightedPodAffinityTermPatch]
  }
  
  extension [Self <: WeightedPodAffinityTermPatch](x: Self) {
    
    inline def setPodAffinityTerm(value: Input[PodAffinityTermPatch]): Self = StObject.set(x, "podAffinityTerm", value.asInstanceOf[js.Any])
    
    inline def setPodAffinityTermUndefined: Self = StObject.set(x, "podAffinityTerm", js.undefined)
    
    inline def setWeight(value: Input[Double]): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    
    inline def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
  }
}
