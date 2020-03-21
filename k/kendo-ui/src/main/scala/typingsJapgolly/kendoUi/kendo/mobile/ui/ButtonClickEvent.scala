package typingsJapgolly.kendoUi.kendo.mobile.ui

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.kendoUi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonClickEvent extends ButtonEvent {
  var button: js.UndefOr[JQuery] = js.undefined
  var target: js.UndefOr[JQuery] = js.undefined
}

object ButtonClickEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: CallbackTo[Boolean],
    preventDefault: js.Function,
    sender: Button,
    button: JQuery = null,
    target: JQuery = null
  ): ButtonClickEvent = {
    val __obj = js.Dynamic.literal(preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented.toJsFn)
    if (button != null) __obj.updateDynamic("button")(button.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonClickEvent]
  }
}

