package typingsJapgolly.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Address extends StObject {
  
  /**
    * The ID representing the allocation of the address for use with EC2-VPC.
    */
  var AllocationId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID representing the association of the address with an instance in a VPC.
    */
  var AssociationId: js.UndefOr[String] = js.undefined
  
  /**
    * The carrier IP address associated. This option is only available for network interfaces which reside in a subnet in a Wavelength Zone (for example an EC2 instance). 
    */
  var CarrierIp: js.UndefOr[String] = js.undefined
  
  /**
    * The customer-owned IP address.
    */
  var CustomerOwnedIp: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the customer-owned address pool.
    */
  var CustomerOwnedIpv4Pool: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates whether this Elastic IP address is for use with instances in EC2-Classic (standard) or instances in a VPC (vpc).
    */
  var Domain: js.UndefOr[DomainType] = js.undefined
  
  /**
    * The ID of the instance that the address is associated with (if any).
    */
  var InstanceId: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the unique set of Availability Zones, Local Zones, or Wavelength Zones from which Amazon Web Services advertises IP addresses.
    */
  var NetworkBorderGroup: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the network interface.
    */
  var NetworkInterfaceId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the Amazon Web Services account that owns the network interface.
    */
  var NetworkInterfaceOwnerId: js.UndefOr[String] = js.undefined
  
  /**
    * The private IP address associated with the Elastic IP address.
    */
  var PrivateIpAddress: js.UndefOr[String] = js.undefined
  
  /**
    * The Elastic IP address.
    */
  var PublicIp: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of an address pool.
    */
  var PublicIpv4Pool: js.UndefOr[String] = js.undefined
  
  /**
    * Any tags assigned to the Elastic IP address.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object Address {
  
  inline def apply(): Address = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Address]
  }
  
  extension [Self <: Address](x: Self) {
    
    inline def setAllocationId(value: String): Self = StObject.set(x, "AllocationId", value.asInstanceOf[js.Any])
    
    inline def setAllocationIdUndefined: Self = StObject.set(x, "AllocationId", js.undefined)
    
    inline def setAssociationId(value: String): Self = StObject.set(x, "AssociationId", value.asInstanceOf[js.Any])
    
    inline def setAssociationIdUndefined: Self = StObject.set(x, "AssociationId", js.undefined)
    
    inline def setCarrierIp(value: String): Self = StObject.set(x, "CarrierIp", value.asInstanceOf[js.Any])
    
    inline def setCarrierIpUndefined: Self = StObject.set(x, "CarrierIp", js.undefined)
    
    inline def setCustomerOwnedIp(value: String): Self = StObject.set(x, "CustomerOwnedIp", value.asInstanceOf[js.Any])
    
    inline def setCustomerOwnedIpUndefined: Self = StObject.set(x, "CustomerOwnedIp", js.undefined)
    
    inline def setCustomerOwnedIpv4Pool(value: String): Self = StObject.set(x, "CustomerOwnedIpv4Pool", value.asInstanceOf[js.Any])
    
    inline def setCustomerOwnedIpv4PoolUndefined: Self = StObject.set(x, "CustomerOwnedIpv4Pool", js.undefined)
    
    inline def setDomain(value: DomainType): Self = StObject.set(x, "Domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "Domain", js.undefined)
    
    inline def setInstanceId(value: String): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setInstanceIdUndefined: Self = StObject.set(x, "InstanceId", js.undefined)
    
    inline def setNetworkBorderGroup(value: String): Self = StObject.set(x, "NetworkBorderGroup", value.asInstanceOf[js.Any])
    
    inline def setNetworkBorderGroupUndefined: Self = StObject.set(x, "NetworkBorderGroup", js.undefined)
    
    inline def setNetworkInterfaceId(value: String): Self = StObject.set(x, "NetworkInterfaceId", value.asInstanceOf[js.Any])
    
    inline def setNetworkInterfaceIdUndefined: Self = StObject.set(x, "NetworkInterfaceId", js.undefined)
    
    inline def setNetworkInterfaceOwnerId(value: String): Self = StObject.set(x, "NetworkInterfaceOwnerId", value.asInstanceOf[js.Any])
    
    inline def setNetworkInterfaceOwnerIdUndefined: Self = StObject.set(x, "NetworkInterfaceOwnerId", js.undefined)
    
    inline def setPrivateIpAddress(value: String): Self = StObject.set(x, "PrivateIpAddress", value.asInstanceOf[js.Any])
    
    inline def setPrivateIpAddressUndefined: Self = StObject.set(x, "PrivateIpAddress", js.undefined)
    
    inline def setPublicIp(value: String): Self = StObject.set(x, "PublicIp", value.asInstanceOf[js.Any])
    
    inline def setPublicIpUndefined: Self = StObject.set(x, "PublicIp", js.undefined)
    
    inline def setPublicIpv4Pool(value: String): Self = StObject.set(x, "PublicIpv4Pool", value.asInstanceOf[js.Any])
    
    inline def setPublicIpv4PoolUndefined: Self = StObject.set(x, "PublicIpv4Pool", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
