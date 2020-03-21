package typingsJapgolly.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RevokeClientVpnIngressRequest extends js.Object {
  /**
    * The ID of the Active Directory group for which to revoke access. 
    */
  var AccessGroupId: js.UndefOr[String] = js.native
  /**
    * The ID of the Client VPN endpoint with which the authorization rule is associated.
    */
  var ClientVpnEndpointId: typingsJapgolly.awsSdk.ec2Mod.ClientVpnEndpointId = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether access should be revoked for all clients.
    */
  var RevokeAllGroups: js.UndefOr[Boolean] = js.native
  /**
    * The IPv4 address range, in CIDR notation, of the network for which access is being removed.
    */
  var TargetNetworkCidr: String = js.native
}

object RevokeClientVpnIngressRequest {
  @scala.inline
  def apply(
    ClientVpnEndpointId: ClientVpnEndpointId,
    TargetNetworkCidr: String,
    AccessGroupId: String = null,
    DryRun: js.UndefOr[scala.Boolean] = js.undefined,
    RevokeAllGroups: js.UndefOr[scala.Boolean] = js.undefined
  ): RevokeClientVpnIngressRequest = {
    val __obj = js.Dynamic.literal(ClientVpnEndpointId = ClientVpnEndpointId.asInstanceOf[js.Any], TargetNetworkCidr = TargetNetworkCidr.asInstanceOf[js.Any])
    if (AccessGroupId != null) __obj.updateDynamic("AccessGroupId")(AccessGroupId.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.asInstanceOf[js.Any])
    if (!js.isUndefined(RevokeAllGroups)) __obj.updateDynamic("RevokeAllGroups")(RevokeAllGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[RevokeClientVpnIngressRequest]
  }
}

