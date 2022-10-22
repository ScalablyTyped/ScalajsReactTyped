package typingsJapgolly.pulumiKubernetes.typesOutputMod.core.v1

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
  var podAffinityTerm: PodAffinityTermPatch
  
  /**
    * weight associated with matching the corresponding podAffinityTerm, in the range 1-100.
    */
  var weight: Double
}
object WeightedPodAffinityTermPatch {
  
  inline def apply(podAffinityTerm: PodAffinityTermPatch, weight: Double): WeightedPodAffinityTermPatch = {
    val __obj = js.Dynamic.literal(podAffinityTerm = podAffinityTerm.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[WeightedPodAffinityTermPatch]
  }
  
  extension [Self <: WeightedPodAffinityTermPatch](x: Self) {
    
    inline def setPodAffinityTerm(value: PodAffinityTermPatch): Self = StObject.set(x, "podAffinityTerm", value.asInstanceOf[js.Any])
    
    inline def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
  }
}
