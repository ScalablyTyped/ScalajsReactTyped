package typingsJapgolly.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AllocateAddressRequest extends js.Object {
  /**
    * [EC2-VPC] The Elastic IP address to recover or an IPv4 address from an address pool.
    */
  var Address: js.UndefOr[String] = js.native
  /**
    * The ID of a customer-owned address pool. Use this parameter to let Amazon EC2 select an address from the address pool. Alternatively, specify a specific address from the address pool.
    */
  var CustomerOwnedIpv4Pool: js.UndefOr[String] = js.native
  /**
    * Set to vpc to allocate the address for use with instances in a VPC. Default: The address is for use with instances in EC2-Classic.
    */
  var Domain: js.UndefOr[DomainType] = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The location from which the IP address is advertised. Use this parameter to limit the address to this location. Use DescribeVpcs to view the network border groups.  You cannot use a network border group with EC2 Classic. If you attempt this operation on EC2 classic, you will receive an InvalidParameterCombination error. For more information, see Error Codes. 
    */
  var NetworkBorderGroup: js.UndefOr[String] = js.native
  /**
    * The ID of an address pool that you own. Use this parameter to let Amazon EC2 select an address from the address pool. To specify a specific address from the address pool, use the Address parameter instead.
    */
  var PublicIpv4Pool: js.UndefOr[String] = js.native
}

object AllocateAddressRequest {
  @scala.inline
  def apply(
    Address: String = null,
    CustomerOwnedIpv4Pool: String = null,
    Domain: DomainType = null,
    DryRun: js.UndefOr[scala.Boolean] = js.undefined,
    NetworkBorderGroup: String = null,
    PublicIpv4Pool: String = null
  ): AllocateAddressRequest = {
    val __obj = js.Dynamic.literal()
    if (Address != null) __obj.updateDynamic("Address")(Address.asInstanceOf[js.Any])
    if (CustomerOwnedIpv4Pool != null) __obj.updateDynamic("CustomerOwnedIpv4Pool")(CustomerOwnedIpv4Pool.asInstanceOf[js.Any])
    if (Domain != null) __obj.updateDynamic("Domain")(Domain.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.asInstanceOf[js.Any])
    if (NetworkBorderGroup != null) __obj.updateDynamic("NetworkBorderGroup")(NetworkBorderGroup.asInstanceOf[js.Any])
    if (PublicIpv4Pool != null) __obj.updateDynamic("PublicIpv4Pool")(PublicIpv4Pool.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllocateAddressRequest]
  }
}

