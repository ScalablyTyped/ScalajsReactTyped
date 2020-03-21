package typingsJapgolly.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttachInternetGatewayRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the internet gateway.
    */
  var InternetGatewayId: typingsJapgolly.awsSdk.ec2Mod.InternetGatewayId = js.native
  /**
    * The ID of the VPC.
    */
  var VpcId: typingsJapgolly.awsSdk.ec2Mod.VpcId = js.native
}

object AttachInternetGatewayRequest {
  @scala.inline
  def apply(
    InternetGatewayId: InternetGatewayId,
    VpcId: VpcId,
    DryRun: js.UndefOr[scala.Boolean] = js.undefined
  ): AttachInternetGatewayRequest = {
    val __obj = js.Dynamic.literal(InternetGatewayId = InternetGatewayId.asInstanceOf[js.Any], VpcId = VpcId.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachInternetGatewayRequest]
  }
}

