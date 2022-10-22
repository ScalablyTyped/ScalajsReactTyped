package typingsJapgolly.awsSdk.clientsEcsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateContainerInstancesStateRequest extends StObject {
  
  /**
    * The short name or full Amazon Resource Name (ARN) of the cluster that hosts the container instance to update. If you do not specify a cluster, the default cluster is assumed.
    */
  var cluster: js.UndefOr[String] = js.undefined
  
  /**
    * A list of up to 10 container instance IDs or full ARN entries.
    */
  var containerInstances: StringList
  
  /**
    * The container instance state to update the container instance with. The only valid values for this action are ACTIVE and DRAINING. A container instance can only be updated to DRAINING status once it has reached an ACTIVE state. If a container instance is in REGISTERING, DEREGISTERING, or REGISTRATION_FAILED state you can describe the container instance but can't update the container instance state.
    */
  var status: ContainerInstanceStatus
}
object UpdateContainerInstancesStateRequest {
  
  inline def apply(containerInstances: StringList, status: ContainerInstanceStatus): UpdateContainerInstancesStateRequest = {
    val __obj = js.Dynamic.literal(containerInstances = containerInstances.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateContainerInstancesStateRequest]
  }
  
  extension [Self <: UpdateContainerInstancesStateRequest](x: Self) {
    
    inline def setCluster(value: String): Self = StObject.set(x, "cluster", value.asInstanceOf[js.Any])
    
    inline def setClusterUndefined: Self = StObject.set(x, "cluster", js.undefined)
    
    inline def setContainerInstances(value: StringList): Self = StObject.set(x, "containerInstances", value.asInstanceOf[js.Any])
    
    inline def setContainerInstancesVarargs(value: String*): Self = StObject.set(x, "containerInstances", js.Array(value*))
    
    inline def setStatus(value: ContainerInstanceStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
