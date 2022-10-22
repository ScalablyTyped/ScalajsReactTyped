package typingsJapgolly.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteNetworkInterfacePermissionRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specify true to remove the permission even if the network interface is attached to an instance.
    */
  var Force: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the network interface permission.
    */
  var NetworkInterfacePermissionId: typingsJapgolly.awsSdk.clientsEc2Mod.NetworkInterfacePermissionId
}
object DeleteNetworkInterfacePermissionRequest {
  
  inline def apply(NetworkInterfacePermissionId: NetworkInterfacePermissionId): DeleteNetworkInterfacePermissionRequest = {
    val __obj = js.Dynamic.literal(NetworkInterfacePermissionId = NetworkInterfacePermissionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteNetworkInterfacePermissionRequest]
  }
  
  extension [Self <: DeleteNetworkInterfacePermissionRequest](x: Self) {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setForce(value: Boolean): Self = StObject.set(x, "Force", value.asInstanceOf[js.Any])
    
    inline def setForceUndefined: Self = StObject.set(x, "Force", js.undefined)
    
    inline def setNetworkInterfacePermissionId(value: NetworkInterfacePermissionId): Self = StObject.set(x, "NetworkInterfacePermissionId", value.asInstanceOf[js.Any])
  }
}
