package typingsJapgolly.pulumiAws.subnetGroupMod

import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubnetGroupState extends js.Object {
  /**
    * A description of the subnet group.
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the subnet group.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * A list of VPC subnet IDs for the subnet group.
    */
  val subnetIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * VPC ID of the subnet group.
    */
  val vpcId: js.UndefOr[Input[String]] = js.native
}

object SubnetGroupState {
  @scala.inline
  def apply(
    description: Input[String] = null,
    name: Input[String] = null,
    subnetIds: Input[js.Array[Input[String]]] = null,
    vpcId: Input[String] = null
  ): SubnetGroupState = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (subnetIds != null) __obj.updateDynamic("subnetIds")(subnetIds.asInstanceOf[js.Any])
    if (vpcId != null) __obj.updateDynamic("vpcId")(vpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubnetGroupState]
  }
}

