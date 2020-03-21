package typingsJapgolly.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportClientVpnClientCertificateRevocationListRequest extends js.Object {
  /**
    * The ID of the Client VPN endpoint.
    */
  var ClientVpnEndpointId: typingsJapgolly.awsSdk.ec2Mod.ClientVpnEndpointId = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
}

object ExportClientVpnClientCertificateRevocationListRequest {
  @scala.inline
  def apply(ClientVpnEndpointId: ClientVpnEndpointId, DryRun: js.UndefOr[scala.Boolean] = js.undefined): ExportClientVpnClientCertificateRevocationListRequest = {
    val __obj = js.Dynamic.literal(ClientVpnEndpointId = ClientVpnEndpointId.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportClientVpnClientCertificateRevocationListRequest]
  }
}

