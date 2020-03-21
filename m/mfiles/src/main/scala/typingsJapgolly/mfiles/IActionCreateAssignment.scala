package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IActionCreateAssignment extends js.Object {
  var AssignedTo: IUserOrUserGroupIDExs
  var Deadline: Boolean
  var DeadlineInDays: Double
  var Description: String
  var MonitoredBy: IUserOrUserGroupIDExs
  var Title: String
  def Clone(): IActionCreateAssignment
}

object IActionCreateAssignment {
  @scala.inline
  def apply(
    AssignedTo: IUserOrUserGroupIDExs,
    Clone: CallbackTo[IActionCreateAssignment],
    Deadline: Boolean,
    DeadlineInDays: Double,
    Description: String,
    MonitoredBy: IUserOrUserGroupIDExs,
    Title: String
  ): IActionCreateAssignment = {
    val __obj = js.Dynamic.literal(AssignedTo = AssignedTo.asInstanceOf[js.Any], Deadline = Deadline.asInstanceOf[js.Any], DeadlineInDays = DeadlineInDays.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], MonitoredBy = MonitoredBy.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any])
    __obj.updateDynamic("Clone")(Clone.toJsFn)
    __obj.asInstanceOf[IActionCreateAssignment]
  }
}

