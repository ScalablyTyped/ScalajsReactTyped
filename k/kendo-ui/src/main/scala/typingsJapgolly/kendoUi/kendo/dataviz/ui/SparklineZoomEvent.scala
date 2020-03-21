package typingsJapgolly.kendoUi.kendo.dataviz.ui

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SparklineZoomEvent extends SparklineEvent {
  var axisRanges: js.UndefOr[js.Any] = js.undefined
  var delta: js.UndefOr[Double] = js.undefined
  var originalEvent: js.UndefOr[js.Any] = js.undefined
}

object SparklineZoomEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: CallbackTo[Boolean],
    preventDefault: js.Function,
    sender: Sparkline,
    axisRanges: js.Any = null,
    delta: Int | Double = null,
    originalEvent: js.Any = null
  ): SparklineZoomEvent = {
    val __obj = js.Dynamic.literal(preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented.toJsFn)
    if (axisRanges != null) __obj.updateDynamic("axisRanges")(axisRanges.asInstanceOf[js.Any])
    if (delta != null) __obj.updateDynamic("delta")(delta.asInstanceOf[js.Any])
    if (originalEvent != null) __obj.updateDynamic("originalEvent")(originalEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[SparklineZoomEvent]
  }
}

