package typingsJapgolly.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteAutoScalingGroupType extends js.Object {
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: ResourceName = js.native
  /**
    * Specifies that the group is to be deleted along with all instances associated with the group, without waiting for all instances to be terminated. This parameter also deletes any lifecycle actions associated with the group.
    */
  var ForceDelete: js.UndefOr[typingsJapgolly.awsSdk.autoscalingMod.ForceDelete] = js.native
}

object DeleteAutoScalingGroupType {
  @scala.inline
  def apply(AutoScalingGroupName: ResourceName, ForceDelete: js.UndefOr[Boolean] = js.undefined): DeleteAutoScalingGroupType = {
    val __obj = js.Dynamic.literal(AutoScalingGroupName = AutoScalingGroupName.asInstanceOf[js.Any])
    if (!js.isUndefined(ForceDelete)) __obj.updateDynamic("ForceDelete")(ForceDelete.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAutoScalingGroupType]
  }
}

