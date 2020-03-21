package typingsJapgolly.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartParallelAxesCrosshairOptions extends js.Object {
  /**
    * (Highcharts) A class name for the crosshair, especially as a hook for
    * styling.
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts) The color of the crosshair. Defaults to `#cccccc` for
    * numeric and datetime axes, and `rgba(204,214,235,0.25)` for category
    * axes, where the crosshair by default highlights the whole category.
    */
  var color: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  /**
    * (Highcharts) The dash style for the crosshair. See
    * plotOptions.series.dashStyle for possible values.
    */
  var dashStyle: js.UndefOr[DashStyleValue] = js.undefined
  /**
    * (Highstock) A label on the axis next to the crosshair.
    *
    * In styled mode, the label is styled with the
    * `.highcharts-crosshair-label` class.
    */
  var label: js.UndefOr[ChartParallelAxesCrosshairLabelOptions] = js.undefined
  /**
    * (Highcharts) Whether the crosshair should snap to the point or follow the
    * pointer independent of points.
    */
  var snap: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts) The pixel width of the crosshair. Defaults to 1 for numeric
    * or datetime axes, and for one category width for category axes.
    */
  var width: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts) The Z index of the crosshair. Higher Z indices allow drawing
    * the crosshair on top of the series or behind the grid lines.
    */
  var zIndex: js.UndefOr[Double] = js.undefined
}

object ChartParallelAxesCrosshairOptions {
  @scala.inline
  def apply(
    className: String = null,
    color: ColorString | GradientColorObject | PatternObject = null,
    dashStyle: DashStyleValue = null,
    label: ChartParallelAxesCrosshairLabelOptions = null,
    snap: js.UndefOr[Boolean] = js.undefined,
    width: Int | Double = null,
    zIndex: Int | Double = null
  ): ChartParallelAxesCrosshairOptions = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (dashStyle != null) __obj.updateDynamic("dashStyle")(dashStyle.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (!js.isUndefined(snap)) __obj.updateDynamic("snap")(snap.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartParallelAxesCrosshairOptions]
  }
}

