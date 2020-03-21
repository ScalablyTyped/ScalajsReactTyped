package typingsJapgolly.baseui.dataTableMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.baseui.AnonClearSelection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchActionT extends js.Object {
  var label: String
  var renderIcon: js.UndefOr[js.Any] = js.undefined
  def onClick(params: AnonClearSelection): js.Any
}

object BatchActionT {
  @scala.inline
  def apply(label: String, onClick: AnonClearSelection => CallbackTo[js.Any], renderIcon: js.Any = null): BatchActionT = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: typingsJapgolly.baseui.AnonClearSelection) => onClick(t0).runNow()))
    if (renderIcon != null) __obj.updateDynamic("renderIcon")(renderIcon.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchActionT]
  }
}

