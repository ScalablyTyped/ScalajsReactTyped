package typingsJapgolly.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesSplineDataMarkerOptions extends js.Object {
  /**
    * (Highcharts, Highstock) Enable or disable the point marker. If
    * `undefined`, the markers are hidden when the data is dense, and shown for
    * more widespread data points.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts, Highstock) The threshold for how dense the point markers
    * should be before they are hidden, given that `enabled` is not defined.
    * The number indicates the horizontal distance between the two closest
    * points in the series, as multiples of the `marker.radius`. In other
    * words, the default value of 2 means points are hidden if overlapping
    * horizontally.
    */
  var enabledThreshold: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock) The fill color of the point marker. When
    * `undefined`, the series' or point's color is used.
    */
  var fillColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  /**
    * (Highcharts, Highstock) Image markers only. Set the image width
    * explicitly. When using this option, a `width` must also be set.
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock) The color of the point marker's outline. When
    * `undefined`, the series' or point's color is used.
    */
  var lineColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  /**
    * (Highcharts, Highstock) The width of the point marker's outline.
    */
  var lineWidth: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock) The radius of the point marker.
    */
  var radius: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock) States for a single point marker.
    */
  var states: js.UndefOr[SeriesSplineDataMarkerStatesOptions] = js.undefined
  /**
    * (Highcharts, Highstock) A predefined shape or symbol for the marker. When
    * undefined, the symbol is pulled from options.symbols. Other possible
    * values are "circle", "square", "diamond", "triangle" and "triangle-down".
    *
    * Additionally, the URL to a graphic can be given on this form:
    * "url(graphic.png)". Note that for the image to be applied to exported
    * charts, its URL needs to be accessible by the export server.
    *
    * Custom callbacks for symbol path generation can also be added to
    * `Highcharts.SVGRenderer.prototype.symbols`. The callback is then used by
    * its method name, as shown in the demo.
    */
  var symbol: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts, Highstock) Image markers only. Set the image width
    * explicitly. When using this option, a `height` must also be set.
    */
  var width: js.UndefOr[Double] = js.undefined
}

object SeriesSplineDataMarkerOptions {
  @scala.inline
  def apply(
    enabled: js.UndefOr[Boolean] = js.undefined,
    enabledThreshold: Int | Double = null,
    fillColor: ColorString | GradientColorObject | PatternObject = null,
    height: Int | Double = null,
    lineColor: ColorString | GradientColorObject | PatternObject = null,
    lineWidth: Int | Double = null,
    radius: Int | Double = null,
    states: SeriesSplineDataMarkerStatesOptions = null,
    symbol: String = null,
    width: Int | Double = null
  ): SeriesSplineDataMarkerOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (enabledThreshold != null) __obj.updateDynamic("enabledThreshold")(enabledThreshold.asInstanceOf[js.Any])
    if (fillColor != null) __obj.updateDynamic("fillColor")(fillColor.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (lineColor != null) __obj.updateDynamic("lineColor")(lineColor.asInstanceOf[js.Any])
    if (lineWidth != null) __obj.updateDynamic("lineWidth")(lineWidth.asInstanceOf[js.Any])
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (states != null) __obj.updateDynamic("states")(states.asInstanceOf[js.Any])
    if (symbol != null) __obj.updateDynamic("symbol")(symbol.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesSplineDataMarkerOptions]
  }
}

