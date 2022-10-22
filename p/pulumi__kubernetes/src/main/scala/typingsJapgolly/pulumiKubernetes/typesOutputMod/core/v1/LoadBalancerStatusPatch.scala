package typingsJapgolly.pulumiKubernetes.typesOutputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * LoadBalancerStatus represents the status of a load-balancer.
  */
trait LoadBalancerStatusPatch extends StObject {
  
  /**
    * Ingress is a list containing ingress points for the load-balancer. Traffic intended for the service should be sent to these ingress points.
    */
  var ingress: js.Array[LoadBalancerIngressPatch]
}
object LoadBalancerStatusPatch {
  
  inline def apply(ingress: js.Array[LoadBalancerIngressPatch]): LoadBalancerStatusPatch = {
    val __obj = js.Dynamic.literal(ingress = ingress.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadBalancerStatusPatch]
  }
  
  extension [Self <: LoadBalancerStatusPatch](x: Self) {
    
    inline def setIngress(value: js.Array[LoadBalancerIngressPatch]): Self = StObject.set(x, "ingress", value.asInstanceOf[js.Any])
    
    inline def setIngressVarargs(value: LoadBalancerIngressPatch*): Self = StObject.set(x, "ingress", js.Array(value*))
  }
}
