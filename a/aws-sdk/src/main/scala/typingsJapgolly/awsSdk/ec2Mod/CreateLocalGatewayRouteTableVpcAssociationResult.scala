package typingsJapgolly.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateLocalGatewayRouteTableVpcAssociationResult extends js.Object {
  /**
    * Information about the association.
    */
  var LocalGatewayRouteTableVpcAssociation: js.UndefOr[typingsJapgolly.awsSdk.ec2Mod.LocalGatewayRouteTableVpcAssociation] = js.native
}

object CreateLocalGatewayRouteTableVpcAssociationResult {
  @scala.inline
  def apply(LocalGatewayRouteTableVpcAssociation: LocalGatewayRouteTableVpcAssociation = null): CreateLocalGatewayRouteTableVpcAssociationResult = {
    val __obj = js.Dynamic.literal()
    if (LocalGatewayRouteTableVpcAssociation != null) __obj.updateDynamic("LocalGatewayRouteTableVpcAssociation")(LocalGatewayRouteTableVpcAssociation.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLocalGatewayRouteTableVpcAssociationResult]
  }
}

