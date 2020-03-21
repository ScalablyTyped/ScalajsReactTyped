package typingsJapgolly.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplySecurityGroupsToClientVpnTargetNetworkRequest extends js.Object {
  /**
    * The ID of the Client VPN endpoint.
    */
  var ClientVpnEndpointId: typingsJapgolly.awsSdk.ec2Mod.ClientVpnEndpointId = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The IDs of the security groups to apply to the associated target network. Up to 5 security groups can be applied to an associated target network.
    */
  var SecurityGroupIds: ClientVpnSecurityGroupIdSet = js.native
  /**
    * The ID of the VPC in which the associated target network is located.
    */
  var VpcId: typingsJapgolly.awsSdk.ec2Mod.VpcId = js.native
}

object ApplySecurityGroupsToClientVpnTargetNetworkRequest {
  @scala.inline
  def apply(
    ClientVpnEndpointId: ClientVpnEndpointId,
    SecurityGroupIds: ClientVpnSecurityGroupIdSet,
    VpcId: VpcId,
    DryRun: js.UndefOr[scala.Boolean] = js.undefined
  ): ApplySecurityGroupsToClientVpnTargetNetworkRequest = {
    val __obj = js.Dynamic.literal(ClientVpnEndpointId = ClientVpnEndpointId.asInstanceOf[js.Any], SecurityGroupIds = SecurityGroupIds.asInstanceOf[js.Any], VpcId = VpcId.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplySecurityGroupsToClientVpnTargetNetworkRequest]
  }
}

