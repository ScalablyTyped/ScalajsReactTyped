package typingsJapgolly.pulumiKubernetes.typesInputMod.core.v1

import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * LoadBalancerStatus represents the status of a load-balancer.
  */
trait LoadBalancerStatus extends StObject {
  
  /**
    * Ingress is a list containing ingress points for the load-balancer. Traffic intended for the service should be sent to these ingress points.
    */
  var ingress: js.UndefOr[Input[js.Array[Input[LoadBalancerIngress]]]] = js.undefined
}
object LoadBalancerStatus {
  
  inline def apply(): LoadBalancerStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadBalancerStatus]
  }
  
  extension [Self <: LoadBalancerStatus](x: Self) {
    
    inline def setIngress(value: Input[js.Array[Input[LoadBalancerIngress]]]): Self = StObject.set(x, "ingress", value.asInstanceOf[js.Any])
    
    inline def setIngressUndefined: Self = StObject.set(x, "ingress", js.undefined)
    
    inline def setIngressVarargs(value: Input[LoadBalancerIngress]*): Self = StObject.set(x, "ingress", js.Array(value*))
  }
}
