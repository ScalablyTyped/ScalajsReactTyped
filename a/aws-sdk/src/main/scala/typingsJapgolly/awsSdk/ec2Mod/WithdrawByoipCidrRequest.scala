package typingsJapgolly.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WithdrawByoipCidrRequest extends js.Object {
  /**
    * The address range, in CIDR notation.
    */
  var Cidr: String = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
}

object WithdrawByoipCidrRequest {
  @scala.inline
  def apply(Cidr: String, DryRun: js.UndefOr[scala.Boolean] = js.undefined): WithdrawByoipCidrRequest = {
    val __obj = js.Dynamic.literal(Cidr = Cidr.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.asInstanceOf[js.Any])
    __obj.asInstanceOf[WithdrawByoipCidrRequest]
  }
}

