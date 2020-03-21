package typingsJapgolly.kendoUi.kendo.drawing

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SurfaceClickEvent extends SurfaceEvent {
  var element: js.UndefOr[Element] = js.undefined
  var originalEvent: js.UndefOr[js.Any] = js.undefined
}

object SurfaceClickEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: CallbackTo[Boolean],
    preventDefault: js.Function,
    sender: Surface,
    element: Element = null,
    originalEvent: js.Any = null
  ): SurfaceClickEvent = {
    val __obj = js.Dynamic.literal(preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented.toJsFn)
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (originalEvent != null) __obj.updateDynamic("originalEvent")(originalEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[SurfaceClickEvent]
  }
}

