package typingsJapgolly.kendoUi.kendo.ui

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonGroupSelectEvent extends ButtonGroupEvent {
  var indices: js.UndefOr[js.Any] = js.undefined
}

object ButtonGroupSelectEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: CallbackTo[Boolean],
    preventDefault: js.Function,
    sender: ButtonGroup,
    indices: js.Any = null
  ): ButtonGroupSelectEvent = {
    val __obj = js.Dynamic.literal(preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented.toJsFn)
    if (indices != null) __obj.updateDynamic("indices")(indices.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonGroupSelectEvent]
  }
}

