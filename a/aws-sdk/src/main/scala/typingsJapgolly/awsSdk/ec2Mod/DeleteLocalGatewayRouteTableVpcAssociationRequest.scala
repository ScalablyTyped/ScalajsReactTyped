package typingsJapgolly.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteLocalGatewayRouteTableVpcAssociationRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the association.
    */
  var LocalGatewayRouteTableVpcAssociationId: String = js.native
}

object DeleteLocalGatewayRouteTableVpcAssociationRequest {
  @scala.inline
  def apply(LocalGatewayRouteTableVpcAssociationId: String, DryRun: js.UndefOr[scala.Boolean] = js.undefined): DeleteLocalGatewayRouteTableVpcAssociationRequest = {
    val __obj = js.Dynamic.literal(LocalGatewayRouteTableVpcAssociationId = LocalGatewayRouteTableVpcAssociationId.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteLocalGatewayRouteTableVpcAssociationRequest]
  }
}

