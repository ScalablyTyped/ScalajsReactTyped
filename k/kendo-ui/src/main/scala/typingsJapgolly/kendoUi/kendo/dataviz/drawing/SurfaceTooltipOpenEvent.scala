package typingsJapgolly.kendoUi.kendo.dataviz.drawing

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SurfaceTooltipOpenEvent extends SurfaceEvent {
  var element: js.UndefOr[typingsJapgolly.kendoUi.kendo.drawing.Element] = js.undefined
  var target: js.UndefOr[typingsJapgolly.kendoUi.kendo.drawing.Element] = js.undefined
}

object SurfaceTooltipOpenEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: CallbackTo[Boolean],
    preventDefault: js.Function,
    sender: Surface,
    element: typingsJapgolly.kendoUi.kendo.drawing.Element = null,
    target: typingsJapgolly.kendoUi.kendo.drawing.Element = null
  ): SurfaceTooltipOpenEvent = {
    val __obj = js.Dynamic.literal(preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented.toJsFn)
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[SurfaceTooltipOpenEvent]
  }
}

