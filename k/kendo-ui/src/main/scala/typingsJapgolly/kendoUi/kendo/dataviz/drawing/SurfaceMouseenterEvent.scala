package typingsJapgolly.kendoUi.kendo.dataviz.drawing

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SurfaceMouseenterEvent extends SurfaceEvent {
  var element: js.UndefOr[typingsJapgolly.kendoUi.kendo.drawing.Element] = js.undefined
  var originalEvent: js.UndefOr[js.Any] = js.undefined
}

object SurfaceMouseenterEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: CallbackTo[Boolean],
    preventDefault: js.Function,
    sender: Surface,
    element: typingsJapgolly.kendoUi.kendo.drawing.Element = null,
    originalEvent: js.Any = null
  ): SurfaceMouseenterEvent = {
    val __obj = js.Dynamic.literal(preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented.toJsFn)
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (originalEvent != null) __obj.updateDynamic("originalEvent")(originalEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[SurfaceMouseenterEvent]
  }
}

