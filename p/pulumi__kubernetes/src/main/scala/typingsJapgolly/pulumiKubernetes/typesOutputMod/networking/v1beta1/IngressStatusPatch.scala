package typingsJapgolly.pulumiKubernetes.typesOutputMod.networking.v1beta1

import typingsJapgolly.pulumiKubernetes.typesOutputMod.core.v1.LoadBalancerStatusPatch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * IngressStatus describe the current state of the Ingress.
  */
trait IngressStatusPatch extends StObject {
  
  /**
    * LoadBalancer contains the current status of the load-balancer.
    */
  var loadBalancer: LoadBalancerStatusPatch
}
object IngressStatusPatch {
  
  inline def apply(loadBalancer: LoadBalancerStatusPatch): IngressStatusPatch = {
    val __obj = js.Dynamic.literal(loadBalancer = loadBalancer.asInstanceOf[js.Any])
    __obj.asInstanceOf[IngressStatusPatch]
  }
  
  extension [Self <: IngressStatusPatch](x: Self) {
    
    inline def setLoadBalancer(value: LoadBalancerStatusPatch): Self = StObject.set(x, "loadBalancer", value.asInstanceOf[js.Any])
  }
}
