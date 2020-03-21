package typingsJapgolly.pulumiAws.maintenanceWindowTargetMod

import typingsJapgolly.pulumiAws.inputMod.ssm.MaintenanceWindowTargetTarget
import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaintenanceWindowTargetArgs extends js.Object {
  /**
    * The description of the maintenance window target.
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the maintenance window target.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * User-provided value that will be included in any CloudWatch events raised while running tasks for these targets in this Maintenance Window.
    */
  val ownerInformation: js.UndefOr[Input[String]] = js.native
  /**
    * The type of target being registered with the Maintenance Window. Possible values `INSTANCE`.
    */
  val resourceType: Input[String] = js.native
  /**
    * The targets (either instances or tags). Instances are specified using Key=InstanceIds,Values=InstanceId1,InstanceId2. Tags are specified using Key=tag name,Values=tag value.
    */
  val targets: Input[js.Array[Input[MaintenanceWindowTargetTarget]]] = js.native
  /**
    * The Id of the maintenance window to register the target with.
    */
  val windowId: Input[String] = js.native
}

object MaintenanceWindowTargetArgs {
  @scala.inline
  def apply(
    resourceType: Input[String],
    targets: Input[js.Array[Input[MaintenanceWindowTargetTarget]]],
    windowId: Input[String],
    description: Input[String] = null,
    name: Input[String] = null,
    ownerInformation: Input[String] = null
  ): MaintenanceWindowTargetArgs = {
    val __obj = js.Dynamic.literal(resourceType = resourceType.asInstanceOf[js.Any], targets = targets.asInstanceOf[js.Any], windowId = windowId.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (ownerInformation != null) __obj.updateDynamic("ownerInformation")(ownerInformation.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaintenanceWindowTargetArgs]
  }
}

