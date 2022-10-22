package typingsJapgolly.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateLocalGatewayRouteRequest extends StObject {
  
  /**
    * The CIDR range used for destination matches. Routing decisions are based on the most specific match.
    */
  var DestinationCidrBlock: String
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the local gateway route table.
    */
  var LocalGatewayRouteTableId: LocalGatewayRoutetableId
  
  /**
    * The ID of the virtual interface group.
    */
  var LocalGatewayVirtualInterfaceGroupId: js.UndefOr[typingsJapgolly.awsSdk.clientsEc2Mod.LocalGatewayVirtualInterfaceGroupId] = js.undefined
  
  /**
    * The ID of the network interface.
    */
  var NetworkInterfaceId: js.UndefOr[typingsJapgolly.awsSdk.clientsEc2Mod.NetworkInterfaceId] = js.undefined
}
object CreateLocalGatewayRouteRequest {
  
  inline def apply(DestinationCidrBlock: String, LocalGatewayRouteTableId: LocalGatewayRoutetableId): CreateLocalGatewayRouteRequest = {
    val __obj = js.Dynamic.literal(DestinationCidrBlock = DestinationCidrBlock.asInstanceOf[js.Any], LocalGatewayRouteTableId = LocalGatewayRouteTableId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLocalGatewayRouteRequest]
  }
  
  extension [Self <: CreateLocalGatewayRouteRequest](x: Self) {
    
    inline def setDestinationCidrBlock(value: String): Self = StObject.set(x, "DestinationCidrBlock", value.asInstanceOf[js.Any])
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setLocalGatewayRouteTableId(value: LocalGatewayRoutetableId): Self = StObject.set(x, "LocalGatewayRouteTableId", value.asInstanceOf[js.Any])
    
    inline def setLocalGatewayVirtualInterfaceGroupId(value: LocalGatewayVirtualInterfaceGroupId): Self = StObject.set(x, "LocalGatewayVirtualInterfaceGroupId", value.asInstanceOf[js.Any])
    
    inline def setLocalGatewayVirtualInterfaceGroupIdUndefined: Self = StObject.set(x, "LocalGatewayVirtualInterfaceGroupId", js.undefined)
    
    inline def setNetworkInterfaceId(value: NetworkInterfaceId): Self = StObject.set(x, "NetworkInterfaceId", value.asInstanceOf[js.Any])
    
    inline def setNetworkInterfaceIdUndefined: Self = StObject.set(x, "NetworkInterfaceId", js.undefined)
  }
}
