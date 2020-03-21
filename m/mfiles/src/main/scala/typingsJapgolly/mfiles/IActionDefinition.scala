package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mfiles.MFiles.MFActionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IActionDefinition extends js.Object {
  var ActionCreateSeparateAssignment: IActionCreateAssignment
  val ActionType: MFActionType
  def Clear(): Unit
  def Clone(): IActionDefinition
}

object IActionDefinition {
  @scala.inline
  def apply(
    ActionCreateSeparateAssignment: IActionCreateAssignment,
    ActionType: MFActionType,
    Clear: Callback,
    Clone: CallbackTo[IActionDefinition]
  ): IActionDefinition = {
    val __obj = js.Dynamic.literal(ActionCreateSeparateAssignment = ActionCreateSeparateAssignment.asInstanceOf[js.Any], ActionType = ActionType.asInstanceOf[js.Any])
    __obj.updateDynamic("Clear")(Clear.toJsFn)
    __obj.updateDynamic("Clone")(Clone.toJsFn)
    __obj.asInstanceOf[IActionDefinition]
  }
}

