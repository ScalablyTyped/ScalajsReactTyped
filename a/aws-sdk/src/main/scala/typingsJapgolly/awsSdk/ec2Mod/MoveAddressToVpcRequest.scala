package typingsJapgolly.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MoveAddressToVpcRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The Elastic IP address.
    */
  var PublicIp: String = js.native
}

object MoveAddressToVpcRequest {
  @scala.inline
  def apply(PublicIp: String, DryRun: js.UndefOr[scala.Boolean] = js.undefined): MoveAddressToVpcRequest = {
    val __obj = js.Dynamic.literal(PublicIp = PublicIp.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.asInstanceOf[js.Any])
    __obj.asInstanceOf[MoveAddressToVpcRequest]
  }
}

