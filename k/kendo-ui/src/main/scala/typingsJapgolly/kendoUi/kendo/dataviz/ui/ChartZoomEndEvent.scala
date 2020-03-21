package typingsJapgolly.kendoUi.kendo.dataviz.ui

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartZoomEndEvent extends ChartEvent {
  var axisRanges: js.UndefOr[js.Any] = js.undefined
  var originalEvent: js.UndefOr[js.Any] = js.undefined
}

object ChartZoomEndEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: CallbackTo[Boolean],
    preventDefault: js.Function,
    sender: Chart,
    axisRanges: js.Any = null,
    originalEvent: js.Any = null
  ): ChartZoomEndEvent = {
    val __obj = js.Dynamic.literal(preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented.toJsFn)
    if (axisRanges != null) __obj.updateDynamic("axisRanges")(axisRanges.asInstanceOf[js.Any])
    if (originalEvent != null) __obj.updateDynamic("originalEvent")(originalEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartZoomEndEvent]
  }
}

