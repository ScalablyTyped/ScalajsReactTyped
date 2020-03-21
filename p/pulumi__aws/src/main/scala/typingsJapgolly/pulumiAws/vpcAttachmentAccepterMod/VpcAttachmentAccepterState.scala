package typingsJapgolly.pulumiAws.vpcAttachmentAccepterMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VpcAttachmentAccepterState extends js.Object {
  /**
    * Whether DNS support is enabled. Valid values: `disable`, `enable`.
    */
  val dnsSupport: js.UndefOr[Input[String]] = js.native
  /**
    * Whether IPv6 support is enabled. Valid values: `disable`, `enable`.
    */
  val ipv6Support: js.UndefOr[Input[String]] = js.native
  /**
    * Identifiers of EC2 Subnets.
    */
  val subnetIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * Key-value tags for the EC2 Transit Gateway VPC Attachment.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * The ID of the EC2 Transit Gateway Attachment to manage.
    */
  val transitGatewayAttachmentId: js.UndefOr[Input[String]] = js.native
  /**
    * Boolean whether the VPC Attachment should be associated with the EC2 Transit Gateway association default route table. Default value: `true`.
    */
  val transitGatewayDefaultRouteTableAssociation: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Boolean whether the VPC Attachment should propagate routes with the EC2 Transit Gateway propagation default route table. Default value: `true`.
    */
  val transitGatewayDefaultRouteTablePropagation: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Identifier of EC2 Transit Gateway.
    */
  val transitGatewayId: js.UndefOr[Input[String]] = js.native
  /**
    * Identifier of EC2 VPC.
    */
  val vpcId: js.UndefOr[Input[String]] = js.native
  /**
    * Identifier of the AWS account that owns the EC2 VPC.
    */
  val vpcOwnerId: js.UndefOr[Input[String]] = js.native
}

object VpcAttachmentAccepterState {
  @scala.inline
  def apply(
    dnsSupport: Input[String] = null,
    ipv6Support: Input[String] = null,
    subnetIds: Input[js.Array[Input[String]]] = null,
    tags: Input[StringDictionary[_]] = null,
    transitGatewayAttachmentId: Input[String] = null,
    transitGatewayDefaultRouteTableAssociation: Input[Boolean] = null,
    transitGatewayDefaultRouteTablePropagation: Input[Boolean] = null,
    transitGatewayId: Input[String] = null,
    vpcId: Input[String] = null,
    vpcOwnerId: Input[String] = null
  ): VpcAttachmentAccepterState = {
    val __obj = js.Dynamic.literal()
    if (dnsSupport != null) __obj.updateDynamic("dnsSupport")(dnsSupport.asInstanceOf[js.Any])
    if (ipv6Support != null) __obj.updateDynamic("ipv6Support")(ipv6Support.asInstanceOf[js.Any])
    if (subnetIds != null) __obj.updateDynamic("subnetIds")(subnetIds.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (transitGatewayAttachmentId != null) __obj.updateDynamic("transitGatewayAttachmentId")(transitGatewayAttachmentId.asInstanceOf[js.Any])
    if (transitGatewayDefaultRouteTableAssociation != null) __obj.updateDynamic("transitGatewayDefaultRouteTableAssociation")(transitGatewayDefaultRouteTableAssociation.asInstanceOf[js.Any])
    if (transitGatewayDefaultRouteTablePropagation != null) __obj.updateDynamic("transitGatewayDefaultRouteTablePropagation")(transitGatewayDefaultRouteTablePropagation.asInstanceOf[js.Any])
    if (transitGatewayId != null) __obj.updateDynamic("transitGatewayId")(transitGatewayId.asInstanceOf[js.Any])
    if (vpcId != null) __obj.updateDynamic("vpcId")(vpcId.asInstanceOf[js.Any])
    if (vpcOwnerId != null) __obj.updateDynamic("vpcOwnerId")(vpcOwnerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[VpcAttachmentAccepterState]
  }
}

