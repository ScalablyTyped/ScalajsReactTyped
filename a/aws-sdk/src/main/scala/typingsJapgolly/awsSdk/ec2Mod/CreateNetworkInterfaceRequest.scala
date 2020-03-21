package typingsJapgolly.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateNetworkInterfaceRequest extends js.Object {
  /**
    * A description for the network interface.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The IDs of one or more security groups.
    */
  var Groups: js.UndefOr[SecurityGroupIdStringList] = js.native
  /**
    * Indicates the type of network interface. To create an Elastic Fabric Adapter (EFA), specify efa. For more information, see  Elastic Fabric Adapter in the Amazon Elastic Compute Cloud User Guide.
    */
  var InterfaceType: js.UndefOr[NetworkInterfaceCreationType] = js.native
  /**
    * The number of IPv6 addresses to assign to a network interface. Amazon EC2 automatically selects the IPv6 addresses from the subnet range. You can't use this option if specifying specific IPv6 addresses. If your subnet has the AssignIpv6AddressOnCreation attribute set to true, you can specify 0 to override this setting.
    */
  var Ipv6AddressCount: js.UndefOr[Integer] = js.native
  /**
    * One or more specific IPv6 addresses from the IPv6 CIDR block range of your subnet. You can't use this option if you're specifying a number of IPv6 addresses.
    */
  var Ipv6Addresses: js.UndefOr[InstanceIpv6AddressList] = js.native
  /**
    * The primary private IPv4 address of the network interface. If you don't specify an IPv4 address, Amazon EC2 selects one for you from the subnet's IPv4 CIDR range. If you specify an IP address, you cannot indicate any IP addresses specified in privateIpAddresses as primary (only one IP address can be designated as primary).
    */
  var PrivateIpAddress: js.UndefOr[String] = js.native
  /**
    * One or more private IPv4 addresses.
    */
  var PrivateIpAddresses: js.UndefOr[PrivateIpAddressSpecificationList] = js.native
  /**
    * The number of secondary private IPv4 addresses to assign to a network interface. When you specify a number of secondary IPv4 addresses, Amazon EC2 selects these IP addresses within the subnet's IPv4 CIDR range. You can't specify this option and specify more than one private IP address using privateIpAddresses. The number of IP addresses you can assign to a network interface varies by instance type. For more information, see IP Addresses Per ENI Per Instance Type in the Amazon Virtual Private Cloud User Guide.
    */
  var SecondaryPrivateIpAddressCount: js.UndefOr[Integer] = js.native
  /**
    * The ID of the subnet to associate with the network interface.
    */
  var SubnetId: typingsJapgolly.awsSdk.ec2Mod.SubnetId = js.native
}

object CreateNetworkInterfaceRequest {
  @scala.inline
  def apply(
    SubnetId: SubnetId,
    Description: String = null,
    DryRun: js.UndefOr[scala.Boolean] = js.undefined,
    Groups: SecurityGroupIdStringList = null,
    InterfaceType: NetworkInterfaceCreationType = null,
    Ipv6AddressCount: Int | scala.Double = null,
    Ipv6Addresses: InstanceIpv6AddressList = null,
    PrivateIpAddress: String = null,
    PrivateIpAddresses: PrivateIpAddressSpecificationList = null,
    SecondaryPrivateIpAddressCount: Int | scala.Double = null
  ): CreateNetworkInterfaceRequest = {
    val __obj = js.Dynamic.literal(SubnetId = SubnetId.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.asInstanceOf[js.Any])
    if (Groups != null) __obj.updateDynamic("Groups")(Groups.asInstanceOf[js.Any])
    if (InterfaceType != null) __obj.updateDynamic("InterfaceType")(InterfaceType.asInstanceOf[js.Any])
    if (Ipv6AddressCount != null) __obj.updateDynamic("Ipv6AddressCount")(Ipv6AddressCount.asInstanceOf[js.Any])
    if (Ipv6Addresses != null) __obj.updateDynamic("Ipv6Addresses")(Ipv6Addresses.asInstanceOf[js.Any])
    if (PrivateIpAddress != null) __obj.updateDynamic("PrivateIpAddress")(PrivateIpAddress.asInstanceOf[js.Any])
    if (PrivateIpAddresses != null) __obj.updateDynamic("PrivateIpAddresses")(PrivateIpAddresses.asInstanceOf[js.Any])
    if (SecondaryPrivateIpAddressCount != null) __obj.updateDynamic("SecondaryPrivateIpAddressCount")(SecondaryPrivateIpAddressCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateNetworkInterfaceRequest]
  }
}

