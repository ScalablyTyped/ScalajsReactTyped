package typingsJapgolly.pulumiKubernetes.typesOutputMod.core.v1

import typingsJapgolly.pulumiKubernetes.typesOutputMod.meta.v1.Condition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ServiceStatus represents the current status of a service.
  */
trait ServiceStatus extends StObject {
  
  /**
    * Current service state
    */
  var conditions: js.Array[Condition]
  
  /**
    * LoadBalancer contains the current status of the load-balancer, if one is present.
    */
  var loadBalancer: LoadBalancerStatus
}
object ServiceStatus {
  
  inline def apply(conditions: js.Array[Condition], loadBalancer: LoadBalancerStatus): ServiceStatus = {
    val __obj = js.Dynamic.literal(conditions = conditions.asInstanceOf[js.Any], loadBalancer = loadBalancer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceStatus]
  }
  
  extension [Self <: ServiceStatus](x: Self) {
    
    inline def setConditions(value: js.Array[Condition]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    inline def setConditionsVarargs(value: Condition*): Self = StObject.set(x, "conditions", js.Array(value*))
    
    inline def setLoadBalancer(value: LoadBalancerStatus): Self = StObject.set(x, "loadBalancer", value.asInstanceOf[js.Any])
  }
}
