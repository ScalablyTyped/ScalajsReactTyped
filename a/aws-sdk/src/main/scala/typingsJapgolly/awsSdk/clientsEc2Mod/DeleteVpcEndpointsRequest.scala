package typingsJapgolly.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteVpcEndpointsRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * One or more VPC endpoint IDs.
    */
  var VpcEndpointIds: VpcEndpointIdList
}
object DeleteVpcEndpointsRequest {
  
  inline def apply(VpcEndpointIds: VpcEndpointIdList): DeleteVpcEndpointsRequest = {
    val __obj = js.Dynamic.literal(VpcEndpointIds = VpcEndpointIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteVpcEndpointsRequest]
  }
  
  extension [Self <: DeleteVpcEndpointsRequest](x: Self) {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setVpcEndpointIds(value: VpcEndpointIdList): Self = StObject.set(x, "VpcEndpointIds", value.asInstanceOf[js.Any])
    
    inline def setVpcEndpointIdsVarargs(value: VpcEndpointId*): Self = StObject.set(x, "VpcEndpointIds", js.Array(value*))
  }
}
