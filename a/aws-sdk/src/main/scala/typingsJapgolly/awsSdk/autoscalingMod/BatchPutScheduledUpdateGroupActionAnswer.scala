package typingsJapgolly.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchPutScheduledUpdateGroupActionAnswer extends js.Object {
  /**
    * The names of the scheduled actions that could not be created or updated, including an error message.
    */
  var FailedScheduledUpdateGroupActions: js.UndefOr[FailedScheduledUpdateGroupActionRequests] = js.native
}

object BatchPutScheduledUpdateGroupActionAnswer {
  @scala.inline
  def apply(FailedScheduledUpdateGroupActions: FailedScheduledUpdateGroupActionRequests = null): BatchPutScheduledUpdateGroupActionAnswer = {
    val __obj = js.Dynamic.literal()
    if (FailedScheduledUpdateGroupActions != null) __obj.updateDynamic("FailedScheduledUpdateGroupActions")(FailedScheduledUpdateGroupActions.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchPutScheduledUpdateGroupActionAnswer]
  }
}

