package typingsJapgolly.kendoUi.kendo.ui

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogCloseEvent extends DialogEvent {
  var userTriggered: js.UndefOr[Boolean] = js.undefined
}

object DialogCloseEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: CallbackTo[Boolean],
    preventDefault: js.Function,
    sender: Dialog,
    userTriggered: js.UndefOr[Boolean] = js.undefined
  ): DialogCloseEvent = {
    val __obj = js.Dynamic.literal(preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented.toJsFn)
    if (!js.isUndefined(userTriggered)) __obj.updateDynamic("userTriggered")(userTriggered.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogCloseEvent]
  }
}

