package typingsJapgolly.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteNetworkInterfacePermissionRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * Specify true to remove the permission even if the network interface is attached to an instance.
    */
  var Force: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the network interface permission.
    */
  var NetworkInterfacePermissionId: String = js.native
}

object DeleteNetworkInterfacePermissionRequest {
  @scala.inline
  def apply(
    NetworkInterfacePermissionId: String,
    DryRun: js.UndefOr[scala.Boolean] = js.undefined,
    Force: js.UndefOr[scala.Boolean] = js.undefined
  ): DeleteNetworkInterfacePermissionRequest = {
    val __obj = js.Dynamic.literal(NetworkInterfacePermissionId = NetworkInterfacePermissionId.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.asInstanceOf[js.Any])
    if (!js.isUndefined(Force)) __obj.updateDynamic("Force")(Force.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteNetworkInterfacePermissionRequest]
  }
}

