package typingsJapgolly.kendoUi.kendo.ui

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.kendoUi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToolBarOpenEvent extends ToolBarEvent {
  var SplitButton: js.UndefOr[JQuery] = js.undefined
}

object ToolBarOpenEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: CallbackTo[Boolean],
    preventDefault: js.Function,
    sender: ToolBar,
    SplitButton: JQuery = null
  ): ToolBarOpenEvent = {
    val __obj = js.Dynamic.literal(preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented.toJsFn)
    if (SplitButton != null) __obj.updateDynamic("SplitButton")(SplitButton.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToolBarOpenEvent]
  }
}

