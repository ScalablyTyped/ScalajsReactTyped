package typingsJapgolly.pulumiKubernetes.typesInputMod.core.v1

import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The weights of all of the matched WeightedPodAffinityTerm fields are added per-node to find the most preferred node(s)
  */
trait WeightedPodAffinityTerm extends StObject {
  
  /**
    * Required. A pod affinity term, associated with the corresponding weight.
    */
  var podAffinityTerm: Input[PodAffinityTerm]
  
  /**
    * weight associated with matching the corresponding podAffinityTerm, in the range 1-100.
    */
  var weight: Input[Double]
}
object WeightedPodAffinityTerm {
  
  inline def apply(podAffinityTerm: Input[PodAffinityTerm], weight: Input[Double]): WeightedPodAffinityTerm = {
    val __obj = js.Dynamic.literal(podAffinityTerm = podAffinityTerm.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[WeightedPodAffinityTerm]
  }
  
  extension [Self <: WeightedPodAffinityTerm](x: Self) {
    
    inline def setPodAffinityTerm(value: Input[PodAffinityTerm]): Self = StObject.set(x, "podAffinityTerm", value.asInstanceOf[js.Any])
    
    inline def setWeight(value: Input[Double]): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
  }
}
