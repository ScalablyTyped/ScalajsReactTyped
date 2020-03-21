package typingsJapgolly.morrisJs.morris

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILineOptions extends IGridChartOptions {
  /** Define how null and undefined values are handled (see documentation). */
  var continuousLine: js.UndefOr[Boolean] = js.undefined
  /** A function that accepts millisecond timestamps and formats them for display as chart labels. */
  var dateFormat: js.UndefOr[js.Function1[/* timestamp */ Double, String]] = js.undefined
  /** Array of color values to use for the event line colors. If you list fewer colors here than you have lines in events, then the values will be cycled. */
  var eventLineColors: js.UndefOr[js.Array[String]] = js.undefined
  /** Width, in pixels, of the event lines. */
  var eventStrokeWidth: js.UndefOr[Double] = js.undefined
  /** A list of x-values to draw as vertical 'event' lines on the chart. */
  var events: js.UndefOr[js.Array[String]] = js.undefined
  /** Change the opacity of the area fill colour. Accepts values between 0.0 (for completely transparent) and 1.0 (for completely opaque). */
  var fillOpacity: js.UndefOr[Double] = js.undefined
  /** Array of color values to use for the goal line colors. If you list fewer colors here than you have lines in goals, then the values will be cycled. */
  var goalLineColors: js.UndefOr[js.Array[String]] = js.undefined
  /** Width, in pixels, of the goal lines. */
  var goalStrokeWidth: js.UndefOr[Double] = js.undefined
  /** A list of y-values to draw as horizontal 'goal' lines on the chart. */
  var goals: js.UndefOr[js.Array[Double]] = js.undefined
  /** Provide a function on this option to generate custom hover legends. */
  var hoverCallback: js.UndefOr[
    js.Function4[
      /* index */ Double, 
      /* options */ ILineOptions, 
      /* content */ String, 
      /* row */ js.Any, 
      String
    ]
  ] = js.undefined
  /** Array containing colors for the series lines/points. */
  var lineColors: js.UndefOr[js.Array[String]] = js.undefined
  /** Width of the series lines, in pixels. */
  var lineWidth: js.UndefOr[Double] = js.undefined
  /** Set to false to skip time/date parsing for X values, instead treating them as an equally-spaced series. */
  var parseTime: js.UndefOr[Boolean] = js.undefined
  /** Colors for the series points. By default uses the same values as lineColors */
  var pointFillColors: js.UndefOr[js.Array[String]] = js.undefined
  /** Diameter of the series points, in pixels. */
  var pointSize: js.UndefOr[Double] = js.undefined
  /** Colors for the outlines of the series points. (#ffffff by default). */
  var pointStrokeColors: js.UndefOr[js.Array[String]] = js.undefined
  /** Set to a string value (eg: '%') to add a label suffix all y-labels. */
  var postUnits: js.UndefOr[String] = js.undefined
  /** Set to a string value (eg: '$') to add a label prefix all y-labels. */
  var preUnits: js.UndefOr[String] = js.undefined
  /** Set to false to disable line smoothing. */
  var smooth: js.UndefOr[Boolean] = js.undefined
  /** The angle in degrees from horizontal to draw x-axis labels. */
  var xLabelAngle: js.UndefOr[Double] = js.undefined
  /** A function that accepts Date objects and formats them for display as x-axis labels. Overrides the default formatter chosen by the automatic labeller or the xLabels option. */
  var xLabelFormat: js.UndefOr[js.Function1[/* date */ js.Date, String]] = js.undefined
  /** Sets the x axis labelling interval. By default the interval will be automatically computed. */
  var xLabels: js.UndefOr[Interval] = js.undefined
  /** A function that accepts y-values and formats them for display as y-axis labels. */
  var yLabelFormat: js.UndefOr[js.Function1[/* val */ js.Any, String]] = js.undefined
  /** Max. bound for Y-values. Alternatively, set this to 'auto' to compute automatically, or 'auto [num]' to automatically compute and ensure that the max y-value is at least [num]. */
  var ymax: js.UndefOr[Double | String] = js.undefined
  /** Min. bound for Y-values. Alternatively, set this to 'auto' to compute automatically, or 'auto [num]' to automatically compute and ensure that the min y-value is at most [num]. */
  var ymin: js.UndefOr[Double | String] = js.undefined
}

object ILineOptions {
  @scala.inline
  def apply(
    data: js.Array[_],
    element: js.Any,
    labels: js.Array[String],
    xkey: String,
    ykeys: js.Array[String],
    axes: js.UndefOr[Boolean] = js.undefined,
    continuousLine: js.UndefOr[Boolean] = js.undefined,
    dateFormat: /* timestamp */ Double => CallbackTo[String] = null,
    eventLineColors: js.Array[String] = null,
    eventStrokeWidth: Int | Double = null,
    events: js.Array[String] = null,
    fillOpacity: Int | Double = null,
    goalLineColors: js.Array[String] = null,
    goalStrokeWidth: Int | Double = null,
    goals: js.Array[Double] = null,
    grid: js.UndefOr[Boolean] = js.undefined,
    gridLineColor: String = null,
    gridStrokeWidth: Int | Double = null,
    gridTextColor: String = null,
    gridTextFamily: String = null,
    gridTextSize: Int | Double = null,
    gridTextWeight: String = null,
    hideHover: Boolean | AutoAlways = null,
    hoverCallback: (/* index */ Double, /* options */ ILineOptions, /* content */ String, /* row */ js.Any) => CallbackTo[String] = null,
    lineColors: js.Array[String] = null,
    lineWidth: Int | Double = null,
    parseTime: js.UndefOr[Boolean] = js.undefined,
    pointFillColors: js.Array[String] = null,
    pointSize: Int | Double = null,
    pointStrokeColors: js.Array[String] = null,
    postUnits: String = null,
    preUnits: String = null,
    resize: js.UndefOr[Boolean] = js.undefined,
    smooth: js.UndefOr[Boolean] = js.undefined,
    xLabelAngle: Int | Double = null,
    xLabelFormat: /* date */ js.Date => CallbackTo[String] = null,
    xLabels: Interval = null,
    yLabelFormat: /* val */ js.Any => CallbackTo[String] = null,
    ymax: Double | String = null,
    ymin: Double | String = null
  ): ILineOptions = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], xkey = xkey.asInstanceOf[js.Any], ykeys = ykeys.asInstanceOf[js.Any])
    if (!js.isUndefined(axes)) __obj.updateDynamic("axes")(axes.asInstanceOf[js.Any])
    if (!js.isUndefined(continuousLine)) __obj.updateDynamic("continuousLine")(continuousLine.asInstanceOf[js.Any])
    if (dateFormat != null) __obj.updateDynamic("dateFormat")(js.Any.fromFunction1((t0: /* timestamp */ scala.Double) => dateFormat(t0).runNow()))
    if (eventLineColors != null) __obj.updateDynamic("eventLineColors")(eventLineColors.asInstanceOf[js.Any])
    if (eventStrokeWidth != null) __obj.updateDynamic("eventStrokeWidth")(eventStrokeWidth.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (fillOpacity != null) __obj.updateDynamic("fillOpacity")(fillOpacity.asInstanceOf[js.Any])
    if (goalLineColors != null) __obj.updateDynamic("goalLineColors")(goalLineColors.asInstanceOf[js.Any])
    if (goalStrokeWidth != null) __obj.updateDynamic("goalStrokeWidth")(goalStrokeWidth.asInstanceOf[js.Any])
    if (goals != null) __obj.updateDynamic("goals")(goals.asInstanceOf[js.Any])
    if (!js.isUndefined(grid)) __obj.updateDynamic("grid")(grid.asInstanceOf[js.Any])
    if (gridLineColor != null) __obj.updateDynamic("gridLineColor")(gridLineColor.asInstanceOf[js.Any])
    if (gridStrokeWidth != null) __obj.updateDynamic("gridStrokeWidth")(gridStrokeWidth.asInstanceOf[js.Any])
    if (gridTextColor != null) __obj.updateDynamic("gridTextColor")(gridTextColor.asInstanceOf[js.Any])
    if (gridTextFamily != null) __obj.updateDynamic("gridTextFamily")(gridTextFamily.asInstanceOf[js.Any])
    if (gridTextSize != null) __obj.updateDynamic("gridTextSize")(gridTextSize.asInstanceOf[js.Any])
    if (gridTextWeight != null) __obj.updateDynamic("gridTextWeight")(gridTextWeight.asInstanceOf[js.Any])
    if (hideHover != null) __obj.updateDynamic("hideHover")(hideHover.asInstanceOf[js.Any])
    if (hoverCallback != null) __obj.updateDynamic("hoverCallback")(js.Any.fromFunction4((t0: /* index */ scala.Double, t1: /* options */ typingsJapgolly.morrisJs.morris.ILineOptions, t2: /* content */ java.lang.String, t3: /* row */ js.Any) => hoverCallback(t0, t1, t2, t3).runNow()))
    if (lineColors != null) __obj.updateDynamic("lineColors")(lineColors.asInstanceOf[js.Any])
    if (lineWidth != null) __obj.updateDynamic("lineWidth")(lineWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(parseTime)) __obj.updateDynamic("parseTime")(parseTime.asInstanceOf[js.Any])
    if (pointFillColors != null) __obj.updateDynamic("pointFillColors")(pointFillColors.asInstanceOf[js.Any])
    if (pointSize != null) __obj.updateDynamic("pointSize")(pointSize.asInstanceOf[js.Any])
    if (pointStrokeColors != null) __obj.updateDynamic("pointStrokeColors")(pointStrokeColors.asInstanceOf[js.Any])
    if (postUnits != null) __obj.updateDynamic("postUnits")(postUnits.asInstanceOf[js.Any])
    if (preUnits != null) __obj.updateDynamic("preUnits")(preUnits.asInstanceOf[js.Any])
    if (!js.isUndefined(resize)) __obj.updateDynamic("resize")(resize.asInstanceOf[js.Any])
    if (!js.isUndefined(smooth)) __obj.updateDynamic("smooth")(smooth.asInstanceOf[js.Any])
    if (xLabelAngle != null) __obj.updateDynamic("xLabelAngle")(xLabelAngle.asInstanceOf[js.Any])
    if (xLabelFormat != null) __obj.updateDynamic("xLabelFormat")(js.Any.fromFunction1((t0: /* date */ js.Date) => xLabelFormat(t0).runNow()))
    if (xLabels != null) __obj.updateDynamic("xLabels")(xLabels.asInstanceOf[js.Any])
    if (yLabelFormat != null) __obj.updateDynamic("yLabelFormat")(js.Any.fromFunction1((t0: /* val */ js.Any) => yLabelFormat(t0).runNow()))
    if (ymax != null) __obj.updateDynamic("ymax")(ymax.asInstanceOf[js.Any])
    if (ymin != null) __obj.updateDynamic("ymin")(ymin.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILineOptions]
  }
}

