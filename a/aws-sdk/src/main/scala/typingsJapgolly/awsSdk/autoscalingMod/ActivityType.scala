package typingsJapgolly.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActivityType extends js.Object {
  /**
    * A scaling activity.
    */
  var Activity: js.UndefOr[typingsJapgolly.awsSdk.autoscalingMod.Activity] = js.native
}

object ActivityType {
  @scala.inline
  def apply(Activity: Activity = null): ActivityType = {
    val __obj = js.Dynamic.literal()
    if (Activity != null) __obj.updateDynamic("Activity")(Activity.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivityType]
  }
}

