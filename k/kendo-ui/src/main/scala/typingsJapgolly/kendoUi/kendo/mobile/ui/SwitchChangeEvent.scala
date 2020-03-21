package typingsJapgolly.kendoUi.kendo.mobile.ui

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwitchChangeEvent extends SwitchEvent {
  var checked: js.UndefOr[js.Any] = js.undefined
}

object SwitchChangeEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: CallbackTo[Boolean],
    preventDefault: js.Function,
    sender: Switch,
    checked: js.Any = null
  ): SwitchChangeEvent = {
    val __obj = js.Dynamic.literal(preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented.toJsFn)
    if (checked != null) __obj.updateDynamic("checked")(checked.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwitchChangeEvent]
  }
}

