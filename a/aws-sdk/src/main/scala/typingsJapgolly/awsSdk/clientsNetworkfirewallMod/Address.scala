package typingsJapgolly.awsSdk.clientsNetworkfirewallMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Address extends StObject {
  
  /**
    * Specify an IP address or a block of IP addresses in Classless Inter-Domain Routing (CIDR) notation. Network Firewall supports all address ranges for IPv4.  Examples:    To configure Network Firewall to inspect for the IP address 192.0.2.44, specify 192.0.2.44/32.   To configure Network Firewall to inspect for IP addresses from 192.0.2.0 to 192.0.2.255, specify 192.0.2.0/24.   For more information about CIDR notation, see the Wikipedia entry Classless Inter-Domain Routing.
    */
  var AddressDefinition: typingsJapgolly.awsSdk.clientsNetworkfirewallMod.AddressDefinition
}
object Address {
  
  inline def apply(AddressDefinition: AddressDefinition): Address = {
    val __obj = js.Dynamic.literal(AddressDefinition = AddressDefinition.asInstanceOf[js.Any])
    __obj.asInstanceOf[Address]
  }
  
  extension [Self <: Address](x: Self) {
    
    inline def setAddressDefinition(value: AddressDefinition): Self = StObject.set(x, "AddressDefinition", value.asInstanceOf[js.Any])
  }
}
