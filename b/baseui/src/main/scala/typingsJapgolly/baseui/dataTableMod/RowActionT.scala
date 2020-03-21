package typingsJapgolly.baseui.dataTableMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.baseui.AnonEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowActionT extends js.Object {
  var label: String
  var renderIcon: js.Any
  def onClick(params: AnonEvent): js.Any
}

object RowActionT {
  @scala.inline
  def apply(label: String, onClick: AnonEvent => CallbackTo[js.Any], renderIcon: js.Any): RowActionT = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], renderIcon = renderIcon.asInstanceOf[js.Any])
    __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: typingsJapgolly.baseui.AnonEvent) => onClick(t0).runNow()))
    __obj.asInstanceOf[RowActionT]
  }
}

