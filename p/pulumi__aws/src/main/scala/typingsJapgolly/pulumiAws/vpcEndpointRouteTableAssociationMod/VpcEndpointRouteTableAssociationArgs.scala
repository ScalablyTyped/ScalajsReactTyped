package typingsJapgolly.pulumiAws.vpcEndpointRouteTableAssociationMod

import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VpcEndpointRouteTableAssociationArgs extends js.Object {
  /**
    * Identifier of the EC2 Route Table to be associated with the VPC Endpoint.
    */
  val routeTableId: Input[String] = js.native
  /**
    * Identifier of the VPC Endpoint with which the EC2 Route Table will be associated.
    */
  val vpcEndpointId: Input[String] = js.native
}

object VpcEndpointRouteTableAssociationArgs {
  @scala.inline
  def apply(routeTableId: Input[String], vpcEndpointId: Input[String]): VpcEndpointRouteTableAssociationArgs = {
    val __obj = js.Dynamic.literal(routeTableId = routeTableId.asInstanceOf[js.Any], vpcEndpointId = vpcEndpointId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VpcEndpointRouteTableAssociationArgs]
  }
}

