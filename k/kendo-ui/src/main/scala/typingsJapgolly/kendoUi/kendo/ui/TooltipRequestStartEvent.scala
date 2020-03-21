package typingsJapgolly.kendoUi.kendo.ui

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.kendoUi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooltipRequestStartEvent extends TooltipEvent {
  var options: js.UndefOr[js.Any] = js.undefined
  var target: js.UndefOr[JQuery] = js.undefined
}

object TooltipRequestStartEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: CallbackTo[Boolean],
    preventDefault: js.Function,
    sender: Tooltip,
    options: js.Any = null,
    target: JQuery = null
  ): TooltipRequestStartEvent = {
    val __obj = js.Dynamic.literal(preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented.toJsFn)
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipRequestStartEvent]
  }
}

