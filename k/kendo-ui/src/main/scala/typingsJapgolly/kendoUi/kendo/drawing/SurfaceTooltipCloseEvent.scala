package typingsJapgolly.kendoUi.kendo.drawing

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SurfaceTooltipCloseEvent extends SurfaceEvent {
  var element: js.UndefOr[Element] = js.undefined
  var target: js.UndefOr[Element] = js.undefined
}

object SurfaceTooltipCloseEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: CallbackTo[Boolean],
    preventDefault: js.Function,
    sender: Surface,
    element: Element = null,
    target: Element = null
  ): SurfaceTooltipCloseEvent = {
    val __obj = js.Dynamic.literal(preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented.toJsFn)
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[SurfaceTooltipCloseEvent]
  }
}

