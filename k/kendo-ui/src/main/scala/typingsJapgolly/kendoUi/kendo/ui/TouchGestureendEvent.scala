package typingsJapgolly.kendoUi.kendo.ui

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.kendoUi.JQueryEventObject
import typingsJapgolly.kendoUi.kendo.mobile.ui.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TouchGestureendEvent extends TouchEvent {
  var center: js.UndefOr[Point] = js.undefined
  var distance: js.UndefOr[Double] = js.undefined
  var event: js.UndefOr[JQueryEventObject] = js.undefined
  var touches: js.UndefOr[js.Any] = js.undefined
}

object TouchGestureendEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: CallbackTo[Boolean],
    preventDefault: js.Function,
    sender: Touch,
    center: Point = null,
    distance: Int | Double = null,
    event: JQueryEventObject = null,
    touches: js.Any = null
  ): TouchGestureendEvent = {
    val __obj = js.Dynamic.literal(preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented.toJsFn)
    if (center != null) __obj.updateDynamic("center")(center.asInstanceOf[js.Any])
    if (distance != null) __obj.updateDynamic("distance")(distance.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (touches != null) __obj.updateDynamic("touches")(touches.asInstanceOf[js.Any])
    __obj.asInstanceOf[TouchGestureendEvent]
  }
}

