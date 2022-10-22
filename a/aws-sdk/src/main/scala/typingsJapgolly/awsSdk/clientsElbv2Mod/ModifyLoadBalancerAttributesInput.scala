package typingsJapgolly.awsSdk.clientsElbv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyLoadBalancerAttributesInput extends StObject {
  
  /**
    * The load balancer attributes.
    */
  var Attributes: LoadBalancerAttributes
  
  /**
    * The Amazon Resource Name (ARN) of the load balancer.
    */
  var LoadBalancerArn: typingsJapgolly.awsSdk.clientsElbv2Mod.LoadBalancerArn
}
object ModifyLoadBalancerAttributesInput {
  
  inline def apply(Attributes: LoadBalancerAttributes, LoadBalancerArn: LoadBalancerArn): ModifyLoadBalancerAttributesInput = {
    val __obj = js.Dynamic.literal(Attributes = Attributes.asInstanceOf[js.Any], LoadBalancerArn = LoadBalancerArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyLoadBalancerAttributesInput]
  }
  
  extension [Self <: ModifyLoadBalancerAttributesInput](x: Self) {
    
    inline def setAttributes(value: LoadBalancerAttributes): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesVarargs(value: LoadBalancerAttribute*): Self = StObject.set(x, "Attributes", js.Array(value*))
    
    inline def setLoadBalancerArn(value: LoadBalancerArn): Self = StObject.set(x, "LoadBalancerArn", value.asInstanceOf[js.Any])
  }
}
