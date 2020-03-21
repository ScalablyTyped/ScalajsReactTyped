package typingsJapgolly.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociateTransitGatewayRouteTableRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the attachment.
    */
  var TransitGatewayAttachmentId: String = js.native
  /**
    * The ID of the transit gateway route table.
    */
  var TransitGatewayRouteTableId: String = js.native
}

object AssociateTransitGatewayRouteTableRequest {
  @scala.inline
  def apply(
    TransitGatewayAttachmentId: String,
    TransitGatewayRouteTableId: String,
    DryRun: js.UndefOr[scala.Boolean] = js.undefined
  ): AssociateTransitGatewayRouteTableRequest = {
    val __obj = js.Dynamic.literal(TransitGatewayAttachmentId = TransitGatewayAttachmentId.asInstanceOf[js.Any], TransitGatewayRouteTableId = TransitGatewayRouteTableId.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateTransitGatewayRouteTableRequest]
  }
}

