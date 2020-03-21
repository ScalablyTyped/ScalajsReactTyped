package typingsJapgolly.plotlyJs

import typingsJapgolly.plotlyJs.mod.Color
import typingsJapgolly.plotlyJs.plotlyJsStrings.angular
import typingsJapgolly.plotlyJs.plotlyJsStrings.bullet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<plotly.js.plotly.js.Gauge> */
trait PartialGaugeAxis extends js.Object {
  var axis: js.UndefOr[PartialAxisAutorange] = js.undefined
  var bar: js.UndefOr[PartialGaugeBarColor] = js.undefined
  var bgcolor: js.UndefOr[Color] = js.undefined
  var bordercolor: js.UndefOr[Color] = js.undefined
  var borderwidth: js.UndefOr[Double] = js.undefined
  var shape: js.UndefOr[angular | bullet] = js.undefined
  var steps: js.UndefOr[js.Array[AnonColor]] = js.undefined
  var threshold: js.UndefOr[PartialThresholdLine] = js.undefined
}

object PartialGaugeAxis {
  @scala.inline
  def apply(
    axis: PartialAxisAutorange = null,
    bar: PartialGaugeBarColor = null,
    bgcolor: Color = null,
    bordercolor: Color = null,
    borderwidth: Int | Double = null,
    shape: angular | bullet = null,
    steps: js.Array[AnonColor] = null,
    threshold: PartialThresholdLine = null
  ): PartialGaugeAxis = {
    val __obj = js.Dynamic.literal()
    if (axis != null) __obj.updateDynamic("axis")(axis.asInstanceOf[js.Any])
    if (bar != null) __obj.updateDynamic("bar")(bar.asInstanceOf[js.Any])
    if (bgcolor != null) __obj.updateDynamic("bgcolor")(bgcolor.asInstanceOf[js.Any])
    if (bordercolor != null) __obj.updateDynamic("bordercolor")(bordercolor.asInstanceOf[js.Any])
    if (borderwidth != null) __obj.updateDynamic("borderwidth")(borderwidth.asInstanceOf[js.Any])
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    if (steps != null) __obj.updateDynamic("steps")(steps.asInstanceOf[js.Any])
    if (threshold != null) __obj.updateDynamic("threshold")(threshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialGaugeAxis]
  }
}

