package typingsJapgolly.awsSdk.clientsDirectconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NewPublicVirtualInterface extends StObject {
  
  /**
    * The address family for the BGP peer.
    */
  var addressFamily: js.UndefOr[AddressFamily] = js.undefined
  
  /**
    * The IP address assigned to the Amazon interface.
    */
  var amazonAddress: js.UndefOr[AmazonAddress] = js.undefined
  
  /**
    * The autonomous system (AS) number for Border Gateway Protocol (BGP) configuration. The valid values are 1-2147483647.
    */
  var asn: ASN
  
  /**
    * The authentication key for BGP configuration. This string has a minimum length of 6 characters and and a maximun lenth of 80 characters.
    */
  var authKey: js.UndefOr[BGPAuthKey] = js.undefined
  
  /**
    * The IP address assigned to the customer interface.
    */
  var customerAddress: js.UndefOr[CustomerAddress] = js.undefined
  
  /**
    * The routes to be advertised to the Amazon Web Services network in this Region. Applies to public virtual interfaces.
    */
  var routeFilterPrefixes: js.UndefOr[RouteFilterPrefixList] = js.undefined
  
  /**
    * The tags associated with the public virtual interface.
    */
  var tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The name of the virtual interface assigned by the customer network. The name has a maximum of 100 characters. The following are valid characters: a-z, 0-9 and a hyphen (-).
    */
  var virtualInterfaceName: VirtualInterfaceName
  
  /**
    * The ID of the VLAN.
    */
  var vlan: VLAN
}
object NewPublicVirtualInterface {
  
  inline def apply(asn: ASN, virtualInterfaceName: VirtualInterfaceName, vlan: VLAN): NewPublicVirtualInterface = {
    val __obj = js.Dynamic.literal(asn = asn.asInstanceOf[js.Any], virtualInterfaceName = virtualInterfaceName.asInstanceOf[js.Any], vlan = vlan.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewPublicVirtualInterface]
  }
  
  extension [Self <: NewPublicVirtualInterface](x: Self) {
    
    inline def setAddressFamily(value: AddressFamily): Self = StObject.set(x, "addressFamily", value.asInstanceOf[js.Any])
    
    inline def setAddressFamilyUndefined: Self = StObject.set(x, "addressFamily", js.undefined)
    
    inline def setAmazonAddress(value: AmazonAddress): Self = StObject.set(x, "amazonAddress", value.asInstanceOf[js.Any])
    
    inline def setAmazonAddressUndefined: Self = StObject.set(x, "amazonAddress", js.undefined)
    
    inline def setAsn(value: ASN): Self = StObject.set(x, "asn", value.asInstanceOf[js.Any])
    
    inline def setAuthKey(value: BGPAuthKey): Self = StObject.set(x, "authKey", value.asInstanceOf[js.Any])
    
    inline def setAuthKeyUndefined: Self = StObject.set(x, "authKey", js.undefined)
    
    inline def setCustomerAddress(value: CustomerAddress): Self = StObject.set(x, "customerAddress", value.asInstanceOf[js.Any])
    
    inline def setCustomerAddressUndefined: Self = StObject.set(x, "customerAddress", js.undefined)
    
    inline def setRouteFilterPrefixes(value: RouteFilterPrefixList): Self = StObject.set(x, "routeFilterPrefixes", value.asInstanceOf[js.Any])
    
    inline def setRouteFilterPrefixesUndefined: Self = StObject.set(x, "routeFilterPrefixes", js.undefined)
    
    inline def setRouteFilterPrefixesVarargs(value: RouteFilterPrefix*): Self = StObject.set(x, "routeFilterPrefixes", js.Array(value*))
    
    inline def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def setVirtualInterfaceName(value: VirtualInterfaceName): Self = StObject.set(x, "virtualInterfaceName", value.asInstanceOf[js.Any])
    
    inline def setVlan(value: VLAN): Self = StObject.set(x, "vlan", value.asInstanceOf[js.Any])
  }
}
