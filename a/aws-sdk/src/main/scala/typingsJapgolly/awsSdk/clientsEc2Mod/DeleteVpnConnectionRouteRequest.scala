package typingsJapgolly.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteVpnConnectionRouteRequest extends StObject {
  
  /**
    * The CIDR block associated with the local subnet of the customer network.
    */
  var DestinationCidrBlock: String
  
  /**
    * The ID of the VPN connection.
    */
  var VpnConnectionId: typingsJapgolly.awsSdk.clientsEc2Mod.VpnConnectionId
}
object DeleteVpnConnectionRouteRequest {
  
  inline def apply(DestinationCidrBlock: String, VpnConnectionId: VpnConnectionId): DeleteVpnConnectionRouteRequest = {
    val __obj = js.Dynamic.literal(DestinationCidrBlock = DestinationCidrBlock.asInstanceOf[js.Any], VpnConnectionId = VpnConnectionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteVpnConnectionRouteRequest]
  }
  
  extension [Self <: DeleteVpnConnectionRouteRequest](x: Self) {
    
    inline def setDestinationCidrBlock(value: String): Self = StObject.set(x, "DestinationCidrBlock", value.asInstanceOf[js.Any])
    
    inline def setVpnConnectionId(value: VpnConnectionId): Self = StObject.set(x, "VpnConnectionId", value.asInstanceOf[js.Any])
  }
}
