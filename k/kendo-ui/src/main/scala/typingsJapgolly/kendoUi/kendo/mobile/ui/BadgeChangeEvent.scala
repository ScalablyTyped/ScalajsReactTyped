package typingsJapgolly.kendoUi.kendo.mobile.ui

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BadgeChangeEvent extends BadgeEvent {
  var newValue: js.UndefOr[String | Double] = js.undefined
  var oldValue: js.UndefOr[String | Double] = js.undefined
}

object BadgeChangeEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: CallbackTo[Boolean],
    preventDefault: js.Function,
    sender: Badge,
    newValue: String | Double = null,
    oldValue: String | Double = null
  ): BadgeChangeEvent = {
    val __obj = js.Dynamic.literal(preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented.toJsFn)
    if (newValue != null) __obj.updateDynamic("newValue")(newValue.asInstanceOf[js.Any])
    if (oldValue != null) __obj.updateDynamic("oldValue")(oldValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[BadgeChangeEvent]
  }
}

