package typingsJapgolly.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteNetworkInterfaceRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the network interface.
    */
  var NetworkInterfaceId: typingsJapgolly.awsSdk.ec2Mod.NetworkInterfaceId = js.native
}

object DeleteNetworkInterfaceRequest {
  @scala.inline
  def apply(NetworkInterfaceId: NetworkInterfaceId, DryRun: js.UndefOr[scala.Boolean] = js.undefined): DeleteNetworkInterfaceRequest = {
    val __obj = js.Dynamic.literal(NetworkInterfaceId = NetworkInterfaceId.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteNetworkInterfaceRequest]
  }
}

