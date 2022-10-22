package typingsJapgolly.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetNetworkResourcesRequest extends StObject {
  
  /**
    * The Amazon Web Services account ID.
    */
  var AccountId: js.UndefOr[AWSAccountId] = js.undefined
  
  /**
    * The Amazon Web Services Region.
    */
  var AwsRegion: js.UndefOr[ExternalRegionCode] = js.undefined
  
  /**
    * The ID of a core network.
    */
  var CoreNetworkId: js.UndefOr[typingsJapgolly.awsSdk.clientsNetworkmanagerMod.CoreNetworkId] = js.undefined
  
  /**
    * The ID of the global network.
    */
  var GlobalNetworkId: typingsJapgolly.awsSdk.clientsNetworkmanagerMod.GlobalNetworkId
  
  /**
    * The maximum number of results to return.
    */
  var MaxResults: js.UndefOr[typingsJapgolly.awsSdk.clientsNetworkmanagerMod.MaxResults] = js.undefined
  
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.clientsNetworkmanagerMod.NextToken] = js.undefined
  
  /**
    * The ARN of the gateway.
    */
  var RegisteredGatewayArn: js.UndefOr[ResourceArn] = js.undefined
  
  /**
    * The ARN of the resource.
    */
  var ResourceArn: js.UndefOr[typingsJapgolly.awsSdk.clientsNetworkmanagerMod.ResourceArn] = js.undefined
  
  /**
    * The resource type. The following are the supported resource types for Direct Connect:    dxcon - The definition model is Connection.    dx-gateway - The definition model is DirectConnectGateway.    dx-vif - The definition model is VirtualInterface.   The following are the supported resource types for Network Manager:    connection - The definition model is Connection.    device - The definition model is Device.    link - The definition model is Link.    site - The definition model is Site.   The following are the supported resource types for Amazon VPC:    customer-gateway - The definition model is CustomerGateway.    transit-gateway - The definition model is TransitGateway.    transit-gateway-attachment - The definition model is TransitGatewayAttachment.    transit-gateway-connect-peer - The definition model is TransitGatewayConnectPeer.    transit-gateway-route-table - The definition model is TransitGatewayRouteTable.    vpn-connection - The definition model is VpnConnection.  
    */
  var ResourceType: js.UndefOr[ConstrainedString] = js.undefined
}
object GetNetworkResourcesRequest {
  
  inline def apply(GlobalNetworkId: GlobalNetworkId): GetNetworkResourcesRequest = {
    val __obj = js.Dynamic.literal(GlobalNetworkId = GlobalNetworkId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetNetworkResourcesRequest]
  }
  
  extension [Self <: GetNetworkResourcesRequest](x: Self) {
    
    inline def setAccountId(value: AWSAccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "AccountId", js.undefined)
    
    inline def setAwsRegion(value: ExternalRegionCode): Self = StObject.set(x, "AwsRegion", value.asInstanceOf[js.Any])
    
    inline def setAwsRegionUndefined: Self = StObject.set(x, "AwsRegion", js.undefined)
    
    inline def setCoreNetworkId(value: CoreNetworkId): Self = StObject.set(x, "CoreNetworkId", value.asInstanceOf[js.Any])
    
    inline def setCoreNetworkIdUndefined: Self = StObject.set(x, "CoreNetworkId", js.undefined)
    
    inline def setGlobalNetworkId(value: GlobalNetworkId): Self = StObject.set(x, "GlobalNetworkId", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setRegisteredGatewayArn(value: ResourceArn): Self = StObject.set(x, "RegisteredGatewayArn", value.asInstanceOf[js.Any])
    
    inline def setRegisteredGatewayArnUndefined: Self = StObject.set(x, "RegisteredGatewayArn", js.undefined)
    
    inline def setResourceArn(value: ResourceArn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    inline def setResourceArnUndefined: Self = StObject.set(x, "ResourceArn", js.undefined)
    
    inline def setResourceType(value: ConstrainedString): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "ResourceType", js.undefined)
  }
}
