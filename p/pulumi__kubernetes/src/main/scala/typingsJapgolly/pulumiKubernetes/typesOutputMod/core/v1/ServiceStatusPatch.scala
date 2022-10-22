package typingsJapgolly.pulumiKubernetes.typesOutputMod.core.v1

import typingsJapgolly.pulumiKubernetes.typesOutputMod.meta.v1.ConditionPatch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ServiceStatus represents the current status of a service.
  */
trait ServiceStatusPatch extends StObject {
  
  /**
    * Current service state
    */
  var conditions: js.Array[ConditionPatch]
  
  /**
    * LoadBalancer contains the current status of the load-balancer, if one is present.
    */
  var loadBalancer: LoadBalancerStatusPatch
}
object ServiceStatusPatch {
  
  inline def apply(conditions: js.Array[ConditionPatch], loadBalancer: LoadBalancerStatusPatch): ServiceStatusPatch = {
    val __obj = js.Dynamic.literal(conditions = conditions.asInstanceOf[js.Any], loadBalancer = loadBalancer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceStatusPatch]
  }
  
  extension [Self <: ServiceStatusPatch](x: Self) {
    
    inline def setConditions(value: js.Array[ConditionPatch]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    inline def setConditionsVarargs(value: ConditionPatch*): Self = StObject.set(x, "conditions", js.Array(value*))
    
    inline def setLoadBalancer(value: LoadBalancerStatusPatch): Self = StObject.set(x, "loadBalancer", value.asInstanceOf[js.Any])
  }
}
