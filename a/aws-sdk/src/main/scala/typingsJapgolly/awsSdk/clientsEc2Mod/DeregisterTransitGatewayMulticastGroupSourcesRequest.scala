package typingsJapgolly.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeregisterTransitGatewayMulticastGroupSourcesRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The IP address assigned to the transit gateway multicast group.
    */
  var GroupIpAddress: js.UndefOr[String] = js.undefined
  
  /**
    * The IDs of the group sources' network interfaces.
    */
  var NetworkInterfaceIds: js.UndefOr[TransitGatewayNetworkInterfaceIdList] = js.undefined
  
  /**
    * The ID of the transit gateway multicast domain.
    */
  var TransitGatewayMulticastDomainId: js.UndefOr[typingsJapgolly.awsSdk.clientsEc2Mod.TransitGatewayMulticastDomainId] = js.undefined
}
object DeregisterTransitGatewayMulticastGroupSourcesRequest {
  
  inline def apply(): DeregisterTransitGatewayMulticastGroupSourcesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeregisterTransitGatewayMulticastGroupSourcesRequest]
  }
  
  extension [Self <: DeregisterTransitGatewayMulticastGroupSourcesRequest](x: Self) {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setGroupIpAddress(value: String): Self = StObject.set(x, "GroupIpAddress", value.asInstanceOf[js.Any])
    
    inline def setGroupIpAddressUndefined: Self = StObject.set(x, "GroupIpAddress", js.undefined)
    
    inline def setNetworkInterfaceIds(value: TransitGatewayNetworkInterfaceIdList): Self = StObject.set(x, "NetworkInterfaceIds", value.asInstanceOf[js.Any])
    
    inline def setNetworkInterfaceIdsUndefined: Self = StObject.set(x, "NetworkInterfaceIds", js.undefined)
    
    inline def setNetworkInterfaceIdsVarargs(value: NetworkInterfaceId*): Self = StObject.set(x, "NetworkInterfaceIds", js.Array(value*))
    
    inline def setTransitGatewayMulticastDomainId(value: TransitGatewayMulticastDomainId): Self = StObject.set(x, "TransitGatewayMulticastDomainId", value.asInstanceOf[js.Any])
    
    inline def setTransitGatewayMulticastDomainIdUndefined: Self = StObject.set(x, "TransitGatewayMulticastDomainId", js.undefined)
  }
}
