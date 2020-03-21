package typingsJapgolly.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotFlagsTooltipOptions extends js.Object {
  /**
    * (Highcharts, Highstock, Gantt) For series on a datetime axes, the date
    * format in the tooltip's header will by default be guessed based on the
    * closest data points. This member gives the default string representations
    * used for each unit. For an overview of the replacement codes, see
    * dateFormat.
    */
  var dateTimeLabelFormats: js.UndefOr[PlotFlagsTooltipDateTimeLabelFormatsOptions | Dictionary[String]] = js.undefined
  /**
    * (Highstock) Distance from point to tooltip in pixels.
    */
  var distance: js.UndefOr[Double] = js.undefined
  /**
    * (Highstock) Whether the tooltip should follow the mouse as it moves
    * across columns, pie slices and other point types with an extent. By
    * default it behaves this way for pie, polygon, map, sankey and wordcloud
    * series by override in the `plotOptions` for those series types.
    *
    * For touch moves to behave the same way, followTouchMove must be `true`
    * also.
    */
  var followPointer: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highstock) Whether the tooltip should update as the finger moves on a
    * touch device. If this is `true` and chart.panning is
    * set,`followTouchMove` will take over one-finger touches, so the user
    * needs to use two fingers for zooming and panning.
    *
    * Note the difference to followPointer that only defines the _position_ of
    * the tooltip. If `followPointer` is false in for example a column series,
    * the tooltip will show above or below the column, but as `followTouchMove`
    * is true, the tooltip will jump from column to column as the user swipes
    * across the plot area.
    */
  var followTouchMove: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highstock) A string to append to the tooltip format.
    */
  var footerFormat: js.UndefOr[String] = js.undefined
  /**
    * (Highstock) The HTML of the tooltip header line. Variables are enclosed
    * by curly brackets. Available variables are `point.key`, `series.name`,
    * `series.color` and other members from the `point` and `series` objects.
    * The `point.key` variable contains the category name, x value or datetime
    * string depending on the type of axis. For datetime axes, the `point.key`
    * date format can be set using `tooltip.xDateFormat`.
    */
  var headerFormat: js.UndefOr[String] = js.undefined
  /**
    * (Highstock) The HTML of the null point's line in the tooltip. Works
    * analogously to pointFormat.
    */
  var nullFormat: js.UndefOr[String] = js.undefined
  /**
    * (Highstock) Callback function to format the text of the tooltip for
    * visible null points. Works analogously to formatter.
    */
  var nullFormatter: js.UndefOr[TooltipFormatterCallbackFunction] = js.undefined
  /**
    * (Highstock) The HTML of the point's line in the tooltip. Variables are
    * enclosed by curly brackets. Available variables are point.x, point.y,
    * series. name and series.color and other properties on the same form.
    * Furthermore, `point.y` can be extended by the `tooltip.valuePrefix` and
    * `tooltip.valueSuffix` variables. This can also be overridden for each
    * series, which makes it a good hook for displaying units.
    *
    * In styled mode, the dot is colored by a class name rather than the point
    * color.
    */
  var pointFormat: js.UndefOr[String] = js.undefined
  /**
    * (Highstock) A callback function for formatting the HTML output for a
    * single point in the tooltip. Like the `pointFormat` string, but with more
    * flexibility.
    */
  var pointFormatter: js.UndefOr[FormatterCallbackFunction[Point]] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) The format for the date in the tooltip
    * header if the X axis is a datetime axis. The default is a best guess
    * based on the smallest distance between points in the chart.
    */
  var xDateFormat: js.UndefOr[String] = js.undefined
}

object PlotFlagsTooltipOptions {
  @scala.inline
  def apply(
    dateTimeLabelFormats: PlotFlagsTooltipDateTimeLabelFormatsOptions | Dictionary[String] = null,
    distance: Int | Double = null,
    followPointer: js.UndefOr[Boolean] = js.undefined,
    followTouchMove: js.UndefOr[Boolean] = js.undefined,
    footerFormat: String = null,
    headerFormat: String = null,
    nullFormat: String = null,
    nullFormatter: TooltipFormatterCallbackFunction = null,
    pointFormat: String = null,
    pointFormatter: FormatterCallbackFunction[Point] = null,
    xDateFormat: String = null
  ): PlotFlagsTooltipOptions = {
    val __obj = js.Dynamic.literal()
    if (dateTimeLabelFormats != null) __obj.updateDynamic("dateTimeLabelFormats")(dateTimeLabelFormats.asInstanceOf[js.Any])
    if (distance != null) __obj.updateDynamic("distance")(distance.asInstanceOf[js.Any])
    if (!js.isUndefined(followPointer)) __obj.updateDynamic("followPointer")(followPointer.asInstanceOf[js.Any])
    if (!js.isUndefined(followTouchMove)) __obj.updateDynamic("followTouchMove")(followTouchMove.asInstanceOf[js.Any])
    if (footerFormat != null) __obj.updateDynamic("footerFormat")(footerFormat.asInstanceOf[js.Any])
    if (headerFormat != null) __obj.updateDynamic("headerFormat")(headerFormat.asInstanceOf[js.Any])
    if (nullFormat != null) __obj.updateDynamic("nullFormat")(nullFormat.asInstanceOf[js.Any])
    if (nullFormatter != null) __obj.updateDynamic("nullFormatter")(nullFormatter.asInstanceOf[js.Any])
    if (pointFormat != null) __obj.updateDynamic("pointFormat")(pointFormat.asInstanceOf[js.Any])
    if (pointFormatter != null) __obj.updateDynamic("pointFormatter")(pointFormatter.asInstanceOf[js.Any])
    if (xDateFormat != null) __obj.updateDynamic("xDateFormat")(xDateFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotFlagsTooltipOptions]
  }
}

