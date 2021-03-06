package typingsJapgolly.kendoUi.kendo.ui

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.kendoUi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationHideEvent extends NotificationEvent {
  var element: js.UndefOr[JQuery] = js.undefined
}

object NotificationHideEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: CallbackTo[Boolean],
    preventDefault: js.Function,
    sender: Notification,
    element: JQuery = null
  ): NotificationHideEvent = {
    val __obj = js.Dynamic.literal(preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented.toJsFn)
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationHideEvent]
  }
}

