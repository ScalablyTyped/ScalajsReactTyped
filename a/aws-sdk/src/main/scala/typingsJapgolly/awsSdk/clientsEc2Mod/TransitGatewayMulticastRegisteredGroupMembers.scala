package typingsJapgolly.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransitGatewayMulticastRegisteredGroupMembers extends StObject {
  
  /**
    * The IP address assigned to the transit gateway multicast group.
    */
  var GroupIpAddress: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the registered network interfaces.
    */
  var RegisteredNetworkInterfaceIds: js.UndefOr[ValueStringList] = js.undefined
  
  /**
    * The ID of the transit gateway multicast domain.
    */
  var TransitGatewayMulticastDomainId: js.UndefOr[String] = js.undefined
}
object TransitGatewayMulticastRegisteredGroupMembers {
  
  inline def apply(): TransitGatewayMulticastRegisteredGroupMembers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitGatewayMulticastRegisteredGroupMembers]
  }
  
  extension [Self <: TransitGatewayMulticastRegisteredGroupMembers](x: Self) {
    
    inline def setGroupIpAddress(value: String): Self = StObject.set(x, "GroupIpAddress", value.asInstanceOf[js.Any])
    
    inline def setGroupIpAddressUndefined: Self = StObject.set(x, "GroupIpAddress", js.undefined)
    
    inline def setRegisteredNetworkInterfaceIds(value: ValueStringList): Self = StObject.set(x, "RegisteredNetworkInterfaceIds", value.asInstanceOf[js.Any])
    
    inline def setRegisteredNetworkInterfaceIdsUndefined: Self = StObject.set(x, "RegisteredNetworkInterfaceIds", js.undefined)
    
    inline def setRegisteredNetworkInterfaceIdsVarargs(value: String*): Self = StObject.set(x, "RegisteredNetworkInterfaceIds", js.Array(value*))
    
    inline def setTransitGatewayMulticastDomainId(value: String): Self = StObject.set(x, "TransitGatewayMulticastDomainId", value.asInstanceOf[js.Any])
    
    inline def setTransitGatewayMulticastDomainIdUndefined: Self = StObject.set(x, "TransitGatewayMulticastDomainId", js.undefined)
  }
}
