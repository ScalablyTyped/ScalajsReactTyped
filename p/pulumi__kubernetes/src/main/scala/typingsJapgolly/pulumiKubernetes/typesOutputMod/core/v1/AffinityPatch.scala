package typingsJapgolly.pulumiKubernetes.typesOutputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Affinity is a group of affinity scheduling rules.
  */
trait AffinityPatch extends StObject {
  
  /**
    * Describes node affinity scheduling rules for the pod.
    */
  var nodeAffinity: NodeAffinityPatch
  
  /**
    * Describes pod affinity scheduling rules (e.g. co-locate this pod in the same node, zone, etc. as some other pod(s)).
    */
  var podAffinity: PodAffinityPatch
  
  /**
    * Describes pod anti-affinity scheduling rules (e.g. avoid putting this pod in the same node, zone, etc. as some other pod(s)).
    */
  var podAntiAffinity: PodAntiAffinityPatch
}
object AffinityPatch {
  
  inline def apply(
    nodeAffinity: NodeAffinityPatch,
    podAffinity: PodAffinityPatch,
    podAntiAffinity: PodAntiAffinityPatch
  ): AffinityPatch = {
    val __obj = js.Dynamic.literal(nodeAffinity = nodeAffinity.asInstanceOf[js.Any], podAffinity = podAffinity.asInstanceOf[js.Any], podAntiAffinity = podAntiAffinity.asInstanceOf[js.Any])
    __obj.asInstanceOf[AffinityPatch]
  }
  
  extension [Self <: AffinityPatch](x: Self) {
    
    inline def setNodeAffinity(value: NodeAffinityPatch): Self = StObject.set(x, "nodeAffinity", value.asInstanceOf[js.Any])
    
    inline def setPodAffinity(value: PodAffinityPatch): Self = StObject.set(x, "podAffinity", value.asInstanceOf[js.Any])
    
    inline def setPodAntiAffinity(value: PodAntiAffinityPatch): Self = StObject.set(x, "podAntiAffinity", value.asInstanceOf[js.Any])
  }
}
