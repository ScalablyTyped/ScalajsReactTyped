package typingsJapgolly.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotPolygonDragDropGuideBoxDefaultOptions extends js.Object {
  /**
    * (Highcharts, Highstock) CSS class name of the guide box in this state.
    * Defaults to `highcharts-drag-box-default`.
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts, Highstock) Guide box fill color.
    */
  var color: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  /**
    * (Highcharts, Highstock) Guide box cursor.
    */
  var cursor: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts, Highstock) Color of the border around the guide box.
    */
  var lineColor: js.UndefOr[ColorString] = js.undefined
  /**
    * (Highcharts, Highstock) Width of the line around the guide box.
    */
  var lineWidth: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock) Guide box zIndex.
    */
  var zIndex: js.UndefOr[Double] = js.undefined
}

object PlotPolygonDragDropGuideBoxDefaultOptions {
  @scala.inline
  def apply(
    className: String = null,
    color: ColorString | GradientColorObject | PatternObject = null,
    cursor: String = null,
    lineColor: ColorString = null,
    lineWidth: Int | Double = null,
    zIndex: Int | Double = null
  ): PlotPolygonDragDropGuideBoxDefaultOptions = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (cursor != null) __obj.updateDynamic("cursor")(cursor.asInstanceOf[js.Any])
    if (lineColor != null) __obj.updateDynamic("lineColor")(lineColor.asInstanceOf[js.Any])
    if (lineWidth != null) __obj.updateDynamic("lineWidth")(lineWidth.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotPolygonDragDropGuideBoxDefaultOptions]
  }
}

