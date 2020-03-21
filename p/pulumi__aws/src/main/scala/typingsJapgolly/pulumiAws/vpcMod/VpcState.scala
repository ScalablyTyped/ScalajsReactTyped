package typingsJapgolly.pulumiAws.vpcMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VpcState extends js.Object {
  /**
    * Amazon Resource Name (ARN) of VPC
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * Requests an Amazon-provided IPv6 CIDR
    * block with a /56 prefix length for the VPC. You cannot specify the range of IP addresses, or
    * the size of the CIDR block. Default is `false`.
    */
  val assignGeneratedIpv6CidrBlock: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The CIDR block for the VPC.
    */
  val cidrBlock: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of the network ACL created by default on VPC creation
    */
  val defaultNetworkAclId: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of the route table created by default on VPC creation
    */
  val defaultRouteTableId: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of the security group created by default on VPC creation
    */
  val defaultSecurityGroupId: js.UndefOr[Input[String]] = js.native
  val dhcpOptionsId: js.UndefOr[Input[String]] = js.native
  /**
    * A boolean flag to enable/disable ClassicLink
    * for the VPC. Only valid in regions and accounts that support EC2 Classic.
    * See the [ClassicLink documentation][1] for more information. Defaults false.
    */
  val enableClassiclink: js.UndefOr[Input[Boolean]] = js.native
  /**
    * A boolean flag to enable/disable ClassicLink DNS Support for the VPC.
    * Only valid in regions and accounts that support EC2 Classic.
    */
  val enableClassiclinkDnsSupport: js.UndefOr[Input[Boolean]] = js.native
  /**
    * A boolean flag to enable/disable DNS hostnames in the VPC. Defaults false.
    */
  val enableDnsHostnames: js.UndefOr[Input[Boolean]] = js.native
  /**
    * A boolean flag to enable/disable DNS support in the VPC. Defaults true.
    */
  val enableDnsSupport: js.UndefOr[Input[Boolean]] = js.native
  /**
    * A tenancy option for instances launched into the VPC
    */
  val instanceTenancy: js.UndefOr[Input[String]] = js.native
  /**
    * The association ID for the IPv6 CIDR block.
    */
  val ipv6AssociationId: js.UndefOr[Input[String]] = js.native
  /**
    * The IPv6 CIDR block.
    */
  val ipv6CidrBlock: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of the main route table associated with
    * this VPC. Note that you can change a VPC's main route table by using an
    * [`aws.ec2.MainRouteTableAssociation`](https://www.terraform.io/docs/providers/aws/r/main_route_table_association.html).
    */
  val mainRouteTableId: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of the AWS account that owns the VPC.
    */
  val ownerId: js.UndefOr[Input[String]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object VpcState {
  @scala.inline
  def apply(
    arn: Input[String] = null,
    assignGeneratedIpv6CidrBlock: Input[Boolean] = null,
    cidrBlock: Input[String] = null,
    defaultNetworkAclId: Input[String] = null,
    defaultRouteTableId: Input[String] = null,
    defaultSecurityGroupId: Input[String] = null,
    dhcpOptionsId: Input[String] = null,
    enableClassiclink: Input[Boolean] = null,
    enableClassiclinkDnsSupport: Input[Boolean] = null,
    enableDnsHostnames: Input[Boolean] = null,
    enableDnsSupport: Input[Boolean] = null,
    instanceTenancy: Input[String] = null,
    ipv6AssociationId: Input[String] = null,
    ipv6CidrBlock: Input[String] = null,
    mainRouteTableId: Input[String] = null,
    ownerId: Input[String] = null,
    tags: Input[StringDictionary[_]] = null
  ): VpcState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (assignGeneratedIpv6CidrBlock != null) __obj.updateDynamic("assignGeneratedIpv6CidrBlock")(assignGeneratedIpv6CidrBlock.asInstanceOf[js.Any])
    if (cidrBlock != null) __obj.updateDynamic("cidrBlock")(cidrBlock.asInstanceOf[js.Any])
    if (defaultNetworkAclId != null) __obj.updateDynamic("defaultNetworkAclId")(defaultNetworkAclId.asInstanceOf[js.Any])
    if (defaultRouteTableId != null) __obj.updateDynamic("defaultRouteTableId")(defaultRouteTableId.asInstanceOf[js.Any])
    if (defaultSecurityGroupId != null) __obj.updateDynamic("defaultSecurityGroupId")(defaultSecurityGroupId.asInstanceOf[js.Any])
    if (dhcpOptionsId != null) __obj.updateDynamic("dhcpOptionsId")(dhcpOptionsId.asInstanceOf[js.Any])
    if (enableClassiclink != null) __obj.updateDynamic("enableClassiclink")(enableClassiclink.asInstanceOf[js.Any])
    if (enableClassiclinkDnsSupport != null) __obj.updateDynamic("enableClassiclinkDnsSupport")(enableClassiclinkDnsSupport.asInstanceOf[js.Any])
    if (enableDnsHostnames != null) __obj.updateDynamic("enableDnsHostnames")(enableDnsHostnames.asInstanceOf[js.Any])
    if (enableDnsSupport != null) __obj.updateDynamic("enableDnsSupport")(enableDnsSupport.asInstanceOf[js.Any])
    if (instanceTenancy != null) __obj.updateDynamic("instanceTenancy")(instanceTenancy.asInstanceOf[js.Any])
    if (ipv6AssociationId != null) __obj.updateDynamic("ipv6AssociationId")(ipv6AssociationId.asInstanceOf[js.Any])
    if (ipv6CidrBlock != null) __obj.updateDynamic("ipv6CidrBlock")(ipv6CidrBlock.asInstanceOf[js.Any])
    if (mainRouteTableId != null) __obj.updateDynamic("mainRouteTableId")(mainRouteTableId.asInstanceOf[js.Any])
    if (ownerId != null) __obj.updateDynamic("ownerId")(ownerId.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[VpcState]
  }
}

