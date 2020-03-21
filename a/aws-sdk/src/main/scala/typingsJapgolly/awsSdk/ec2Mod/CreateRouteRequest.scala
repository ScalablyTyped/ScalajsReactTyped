package typingsJapgolly.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateRouteRequest extends js.Object {
  /**
    * The IPv4 CIDR address block used for the destination match. Routing decisions are based on the most specific match.
    */
  var DestinationCidrBlock: js.UndefOr[String] = js.native
  /**
    * The IPv6 CIDR block used for the destination match. Routing decisions are based on the most specific match.
    */
  var DestinationIpv6CidrBlock: js.UndefOr[String] = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * [IPv6 traffic only] The ID of an egress-only internet gateway.
    */
  var EgressOnlyInternetGatewayId: js.UndefOr[typingsJapgolly.awsSdk.ec2Mod.EgressOnlyInternetGatewayId] = js.native
  /**
    * The ID of an internet gateway or virtual private gateway attached to your VPC.
    */
  var GatewayId: js.UndefOr[RouteTableGatewayId] = js.native
  /**
    * The ID of a NAT instance in your VPC. The operation fails if you specify an instance ID unless exactly one network interface is attached.
    */
  var InstanceId: js.UndefOr[typingsJapgolly.awsSdk.ec2Mod.InstanceId] = js.native
  /**
    * The ID of the local gateway.
    */
  var LocalGatewayId: js.UndefOr[String] = js.native
  /**
    * [IPv4 traffic only] The ID of a NAT gateway.
    */
  var NatGatewayId: js.UndefOr[typingsJapgolly.awsSdk.ec2Mod.NatGatewayId] = js.native
  /**
    * The ID of a network interface.
    */
  var NetworkInterfaceId: js.UndefOr[typingsJapgolly.awsSdk.ec2Mod.NetworkInterfaceId] = js.native
  /**
    * The ID of the route table for the route.
    */
  var RouteTableId: typingsJapgolly.awsSdk.ec2Mod.RouteTableId = js.native
  /**
    * The ID of a transit gateway.
    */
  var TransitGatewayId: js.UndefOr[typingsJapgolly.awsSdk.ec2Mod.TransitGatewayId] = js.native
  /**
    * The ID of a VPC peering connection.
    */
  var VpcPeeringConnectionId: js.UndefOr[typingsJapgolly.awsSdk.ec2Mod.VpcPeeringConnectionId] = js.native
}

object CreateRouteRequest {
  @scala.inline
  def apply(
    RouteTableId: RouteTableId,
    DestinationCidrBlock: String = null,
    DestinationIpv6CidrBlock: String = null,
    DryRun: js.UndefOr[scala.Boolean] = js.undefined,
    EgressOnlyInternetGatewayId: EgressOnlyInternetGatewayId = null,
    GatewayId: RouteTableGatewayId = null,
    InstanceId: InstanceId = null,
    LocalGatewayId: String = null,
    NatGatewayId: NatGatewayId = null,
    NetworkInterfaceId: NetworkInterfaceId = null,
    TransitGatewayId: TransitGatewayId = null,
    VpcPeeringConnectionId: VpcPeeringConnectionId = null
  ): CreateRouteRequest = {
    val __obj = js.Dynamic.literal(RouteTableId = RouteTableId.asInstanceOf[js.Any])
    if (DestinationCidrBlock != null) __obj.updateDynamic("DestinationCidrBlock")(DestinationCidrBlock.asInstanceOf[js.Any])
    if (DestinationIpv6CidrBlock != null) __obj.updateDynamic("DestinationIpv6CidrBlock")(DestinationIpv6CidrBlock.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.asInstanceOf[js.Any])
    if (EgressOnlyInternetGatewayId != null) __obj.updateDynamic("EgressOnlyInternetGatewayId")(EgressOnlyInternetGatewayId.asInstanceOf[js.Any])
    if (GatewayId != null) __obj.updateDynamic("GatewayId")(GatewayId.asInstanceOf[js.Any])
    if (InstanceId != null) __obj.updateDynamic("InstanceId")(InstanceId.asInstanceOf[js.Any])
    if (LocalGatewayId != null) __obj.updateDynamic("LocalGatewayId")(LocalGatewayId.asInstanceOf[js.Any])
    if (NatGatewayId != null) __obj.updateDynamic("NatGatewayId")(NatGatewayId.asInstanceOf[js.Any])
    if (NetworkInterfaceId != null) __obj.updateDynamic("NetworkInterfaceId")(NetworkInterfaceId.asInstanceOf[js.Any])
    if (TransitGatewayId != null) __obj.updateDynamic("TransitGatewayId")(TransitGatewayId.asInstanceOf[js.Any])
    if (VpcPeeringConnectionId != null) __obj.updateDynamic("VpcPeeringConnectionId")(VpcPeeringConnectionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRouteRequest]
  }
}

