package typingsJapgolly.pulumiAws.ec2RouteTableAssociationMod

import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouteTableAssociationState extends js.Object {
  /**
    * The gateway ID to create an association. Conflicts with `subnetId`.
    */
  val gatewayId: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of the routing table to associate with.
    */
  val routeTableId: js.UndefOr[Input[String]] = js.native
  /**
    * The subnet ID to create an association. Conflicts with `gatewayId`.
    */
  val subnetId: js.UndefOr[Input[String]] = js.native
}

object RouteTableAssociationState {
  @scala.inline
  def apply(
    gatewayId: Input[String] = null,
    routeTableId: Input[String] = null,
    subnetId: Input[String] = null
  ): RouteTableAssociationState = {
    val __obj = js.Dynamic.literal()
    if (gatewayId != null) __obj.updateDynamic("gatewayId")(gatewayId.asInstanceOf[js.Any])
    if (routeTableId != null) __obj.updateDynamic("routeTableId")(routeTableId.asInstanceOf[js.Any])
    if (subnetId != null) __obj.updateDynamic("subnetId")(subnetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteTableAssociationState]
  }
}

