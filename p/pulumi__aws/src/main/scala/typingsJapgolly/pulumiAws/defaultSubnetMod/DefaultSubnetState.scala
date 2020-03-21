package typingsJapgolly.pulumiAws.defaultSubnetMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultSubnetState extends js.Object {
  val arn: js.UndefOr[Input[String]] = js.native
  val assignIpv6AddressOnCreation: js.UndefOr[Input[Boolean]] = js.native
  val availabilityZone: js.UndefOr[Input[String]] = js.native
  val availabilityZoneId: js.UndefOr[Input[String]] = js.native
  /**
    * The CIDR block for the subnet.
    */
  val cidrBlock: js.UndefOr[Input[String]] = js.native
  /**
    * The IPv6 CIDR block.
    */
  val ipv6CidrBlock: js.UndefOr[Input[String]] = js.native
  val ipv6CidrBlockAssociationId: js.UndefOr[Input[String]] = js.native
  /**
    * Specify true to indicate
    * that instances launched into the subnet should be assigned
    * a public IP address.
    */
  val mapPublicIpOnLaunch: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The ID of the AWS account that owns the subnet.
    */
  val ownerId: js.UndefOr[Input[String]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * The VPC ID.
    */
  val vpcId: js.UndefOr[Input[String]] = js.native
}

object DefaultSubnetState {
  @scala.inline
  def apply(
    arn: Input[String] = null,
    assignIpv6AddressOnCreation: Input[Boolean] = null,
    availabilityZone: Input[String] = null,
    availabilityZoneId: Input[String] = null,
    cidrBlock: Input[String] = null,
    ipv6CidrBlock: Input[String] = null,
    ipv6CidrBlockAssociationId: Input[String] = null,
    mapPublicIpOnLaunch: Input[Boolean] = null,
    ownerId: Input[String] = null,
    tags: Input[StringDictionary[_]] = null,
    vpcId: Input[String] = null
  ): DefaultSubnetState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (assignIpv6AddressOnCreation != null) __obj.updateDynamic("assignIpv6AddressOnCreation")(assignIpv6AddressOnCreation.asInstanceOf[js.Any])
    if (availabilityZone != null) __obj.updateDynamic("availabilityZone")(availabilityZone.asInstanceOf[js.Any])
    if (availabilityZoneId != null) __obj.updateDynamic("availabilityZoneId")(availabilityZoneId.asInstanceOf[js.Any])
    if (cidrBlock != null) __obj.updateDynamic("cidrBlock")(cidrBlock.asInstanceOf[js.Any])
    if (ipv6CidrBlock != null) __obj.updateDynamic("ipv6CidrBlock")(ipv6CidrBlock.asInstanceOf[js.Any])
    if (ipv6CidrBlockAssociationId != null) __obj.updateDynamic("ipv6CidrBlockAssociationId")(ipv6CidrBlockAssociationId.asInstanceOf[js.Any])
    if (mapPublicIpOnLaunch != null) __obj.updateDynamic("mapPublicIpOnLaunch")(mapPublicIpOnLaunch.asInstanceOf[js.Any])
    if (ownerId != null) __obj.updateDynamic("ownerId")(ownerId.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (vpcId != null) __obj.updateDynamic("vpcId")(vpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultSubnetState]
  }
}

