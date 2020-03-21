package typingsJapgolly.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonSeriesOptionsTrendline extends js.Object {
  /** Past trends of the current series.
    * @Default {0}
    */
  var backwardForecast: js.UndefOr[Double] = js.undefined
  /** Pattern of dashes and gaps used to stroke the trendline.
    */
  var dashArray: js.UndefOr[String] = js.undefined
  /** Fill color of the trendlines.
    * @Default {#0000FF}
    */
  var fill: js.UndefOr[String] = js.undefined
  /** Future trends of the current series.
    * @Default {0}
    */
  var forwardForecast: js.UndefOr[Double] = js.undefined
  /** Specifies the intercept value of the trendlines.
    * @Default {null}
    */
  var intercept: js.UndefOr[Double] = js.undefined
  /** Name for the trendlines that is to be displayed in the legend text.
    * @Default {trendline}
    */
  var name: js.UndefOr[String] = js.undefined
  /** Opacity of the trendline.
    * @Default {1}
    */
  var opacity: js.UndefOr[Double] = js.undefined
  /** Specifies the moving average starting period value.
    * @Default {2}
    */
  var period: js.UndefOr[Double] = js.undefined
  /** Specifies the order of the polynomial trendlines.
    * @Default {0}
    */
  var polynomialOrder: js.UndefOr[Double] = js.undefined
  /** Options for customizing the tooltip of the trendlines in the chart.
    */
  var tooltip: js.UndefOr[CommonSeriesOptionsTrendlinesTooltip] = js.undefined
  /** Specifies the type of the trendline for the series.
    * @Default {linear. See TrendlinesType}
    */
  var `type`: js.UndefOr[TrendlinesType | String] = js.undefined
  /** Show/hides the trendline.
    */
  var visibility: js.UndefOr[Boolean] = js.undefined
  /** Show/hides the trendline legend.
    * @Default {visible}
    */
  var visibleOnLegend: js.UndefOr[String] = js.undefined
  /** Width of the trendlines.
    * @Default {1}
    */
  var width: js.UndefOr[Double] = js.undefined
}

object CommonSeriesOptionsTrendline {
  @scala.inline
  def apply(
    backwardForecast: Int | Double = null,
    dashArray: String = null,
    fill: String = null,
    forwardForecast: Int | Double = null,
    intercept: Int | Double = null,
    name: String = null,
    opacity: Int | Double = null,
    period: Int | Double = null,
    polynomialOrder: Int | Double = null,
    tooltip: CommonSeriesOptionsTrendlinesTooltip = null,
    `type`: TrendlinesType | String = null,
    visibility: js.UndefOr[Boolean] = js.undefined,
    visibleOnLegend: String = null,
    width: Int | Double = null
  ): CommonSeriesOptionsTrendline = {
    val __obj = js.Dynamic.literal()
    if (backwardForecast != null) __obj.updateDynamic("backwardForecast")(backwardForecast.asInstanceOf[js.Any])
    if (dashArray != null) __obj.updateDynamic("dashArray")(dashArray.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (forwardForecast != null) __obj.updateDynamic("forwardForecast")(forwardForecast.asInstanceOf[js.Any])
    if (intercept != null) __obj.updateDynamic("intercept")(intercept.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (period != null) __obj.updateDynamic("period")(period.asInstanceOf[js.Any])
    if (polynomialOrder != null) __obj.updateDynamic("polynomialOrder")(polynomialOrder.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(visibility)) __obj.updateDynamic("visibility")(visibility.asInstanceOf[js.Any])
    if (visibleOnLegend != null) __obj.updateDynamic("visibleOnLegend")(visibleOnLegend.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonSeriesOptionsTrendline]
  }
}

