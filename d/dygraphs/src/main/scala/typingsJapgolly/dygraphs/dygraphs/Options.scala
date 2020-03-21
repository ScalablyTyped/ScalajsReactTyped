package typingsJapgolly.dygraphs.dygraphs

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.CanvasRenderingContext2D
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.MouseEvent
import typingsJapgolly.dygraphs.AnonLabel
import typingsJapgolly.dygraphs.AnonX
import typingsJapgolly.dygraphs.Dygraph
import typingsJapgolly.dygraphs.dygraphsStrings.always
import typingsJapgolly.dygraphs.dygraphsStrings.follow
import typingsJapgolly.dygraphs.dygraphsStrings.never
import typingsJapgolly.dygraphs.dygraphsStrings.onmouseover
import typingsJapgolly.dygraphs.dygraphsStrings.y1
import typingsJapgolly.dygraphs.dygraphsStrings.y2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options
  extends PerSeriesOptions
     with PerAxisOptions {
  /**
    * Set this option to animate the transition between zoom windows. Applies to programmatic
    * and interactive zooms. Note that if you also set a drawCallback, it will be called several
    * times on each zoom. If you set a zoomCallback, it will only be called after the animation
    * is complete.
    */
  var animatedZooms: js.UndefOr[Boolean] = js.undefined
  /**
    * If provided, this function is called whenever the user clicks on an annotation.
    */
  var annotationClickHandler: js.UndefOr[
    js.Function4[
      /* annotation */ Annotation, 
      /* point */ Point, 
      /* dygraph */ Dygraph, 
      /* event */ MouseEvent, 
      _
    ]
  ] = js.undefined
  /**
    * If provided, this function is called whenever the user double-clicks on an annotation.
    */
  var annotationDblClickHandler: js.UndefOr[
    js.Function4[
      /* annotation */ Annotation, 
      /* point */ Point, 
      /* dygraph */ Dygraph, 
      /* event */ MouseEvent, 
      _
    ]
  ] = js.undefined
  /**
    * If provided, this function is called whenever the user mouses out of an annotation.
    */
  var annotationMouseOutHandler: js.UndefOr[
    js.Function4[
      /* annotation */ Annotation, 
      /* point */ Point, 
      /* dygraph */ Dygraph, 
      /* event */ MouseEvent, 
      _
    ]
  ] = js.undefined
  /**
    * If provided, this function is called whenever the user mouses over an annotation.
    */
  var annotationMouseOverHandler: js.UndefOr[
    js.Function4[
      /* annotation */ Annotation, 
      /* point */ Point, 
      /* dygraph */ Dygraph, 
      /* event */ MouseEvent, 
      _
    ]
  ] = js.undefined
  /**
    * Defines per-axis options. Valid keys are 'x', 'y' and 'y2'. Only some options may be set
    * on a per-axis basis. If an option may be set in this way, it will be noted on this page.
    * See also documentation on <a href='http://dygraphs.com/per-axis.html'>per-series and
    * per-axis options</a>.
    */
  var axes: js.UndefOr[AnonX] = js.undefined
  /**
    * A function to call when the canvas is clicked.
    */
  var clickCallback: js.UndefOr[
    js.Function3[/* e */ MouseEvent, /* xval */ Double, /* points */ js.Array[Point], _]
  ] = js.undefined
  /**
    * If <strong>colors</strong> is not specified, saturation of the automatically-generated
    * data series colors. (0.0-1.0).
    */
  var colorSaturation: js.UndefOr[Double] = js.undefined
  /**
    * If colors is not specified, value of the data series colors, as in hue/saturation/value.
    * (0.0-1.0, default 0.5)
    */
  var colorValue: js.UndefOr[Double] = js.undefined
  /**
    * List of colors for the data series. These can be of the form "#AABBCC" or
    * "rgb(255,100,200)" or "yellow", etc. If not specified, equally-spaced points around a
    * color wheel are used. Overridden by the 'color' option.
    */
  var colors: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Usually, when Dygraphs encounters a missing value in a data series, it interprets this as
    * a gap and draws it as such. If, instead, the missing values represents an x-value for
    * which only a different series has data, then you'll want to connect the dots by setting
    * this to true. To explicitly include a gap with this option set, use a value of NaN.
    */
  var connectSeparatedPoints: js.UndefOr[Boolean] = js.undefined
  /**
    * When set, parse each CSV cell as "low;middle;high". Error bars will be drawn for each
    * point between low and high, with the series itself going through middle.
    */
  var customBars: js.UndefOr[Boolean] = js.undefined
  /**
    * Custom DataHandler. This is an advanced customization. See http://bit.ly/151E7Aq.
    */
  var dataHandler: js.UndefOr[js.Any] = js.undefined
  /**
    * Initially zoom in on a section of the graph. Is of the form [earliest, latest], where
    * earliest/latest are milliseconds since epoch. If the data for the x-axis is numeric, the
    * values in dateWindow must also be numbers.
    */
  var dateWindow: js.UndefOr[js.Array[Double]] = js.undefined
  /**
    * The delimiter to look for when separating fields of a CSV file. Setting this to a tab is
    * not usually necessary, since tab-delimited data is auto-detected.
    */
  var delimiter: js.UndefOr[String] = js.undefined
  /**
    * Unless it's run in scientific mode (see the <code>sigFigs</code> option), dygraphs
    * displays numbers with <code>digitsAfterDecimal</code> digits after the decimal point.
    * Trailing zeros are not displayed, so with a value of 2 you'll get '0', '0.1', '0.12',
    * '123.45' but not '123.456' (it will be rounded to '123.46'). Numbers with absolute value
    * less than 0.1^digitsAfterDecimal (i.e. those which would show up as '0.00') will be
    * displayed in scientific notation.
    */
  var digitsAfterDecimal: js.UndefOr[Double] = js.undefined
  /**
    * Only applies when Dygraphs is used as a GViz chart. Causes string columns following a data
    * series to be interpreted as annotations on points in that series. This is the same format
    * used by Google's AnnotatedTimeLine chart.
    */
  var displayAnnotations: js.UndefOr[Boolean] = js.undefined
  /**
    * When set, draw the X axis at the Y=0 position and the Y axis at the X=0 position if those
    * positions are inside the graph's visible area. Otherwise, draw the axes at the bottom or
    * left graph edge as usual.
    */
  var drawAxesAtZero: js.UndefOr[Boolean] = js.undefined
  /**
    * When set, this callback gets called every time the dygraph is drawn. This includes the
    * initial draw, after zooming and repeatedly while panning.
    */
  var drawCallback: js.UndefOr[js.Function2[/* dygraph */ Dygraph, /* is_initial */ Boolean, _]] = js.undefined
  /**
    * Draw points at the edges of gaps in the data. This improves visibility of small data
    * segments or other data irregularities.
    */
  var drawGapEdgePoints: js.UndefOr[Boolean] = js.undefined
  /**
    * Draw a custom item when a point is highlighted.    Default is a small dot matching the
    * series color. This method should constrain drawing to within pointSize pixels from (cx,
    * cy) Also see <a href='#drawPointCallback'>drawPointCallback</a>
    */
  var drawHighlightPointCallback: js.UndefOr[
    js.Function7[
      /* g */ Dygraph, 
      /* seriesName */ String, 
      /* canvasContext */ CanvasRenderingContext2D, 
      /* cx */ Double, 
      /* cy */ Double, 
      /* color */ String, 
      /* pointSize */ Double, 
      _
    ]
  ] = js.undefined
  /**
    * Draw a custom item when drawPoints is enabled. Default is a small dot matching the series
    * color. This method should constrain drawing to within pointSize pixels from (cx, cy).
    * Also see <a href='#drawHighlightPointCallback'>drawHighlightPointCallback</a>
    */
  var drawPointCallback: js.UndefOr[
    js.Function7[
      /* g */ Dygraph, 
      /* seriesName */ String, 
      /* canvasContext */ CanvasRenderingContext2D, 
      /* cx */ Double, 
      /* cy */ Double, 
      /* color */ String, 
      /* pointSize */ Double, 
      _
    ]
  ] = js.undefined
  /**
    * Does the data contain standard deviations? Setting this to true alters the input format.
    */
  var errorBars: js.UndefOr[Boolean] = js.undefined
  /**
    * Sets the data being displayed in the chart. This can only be set when calling
    * updateOptions; it cannot be set from the constructor. For a full description of valid data
    * formats, see the <a href='http://dygraphs.com/data.html'>Data Formats</a> page.
    */
  var file: js.UndefOr[Data] = js.undefined
  /**
    * When set, attempt to parse each cell in the CSV file as "a/b", where a and b are integers.
    * The ratio will be plotted. This allows computation of Wilson confidence intervals (see
    * below).
    */
  var fractions: js.UndefOr[Boolean] = js.undefined
  /**
    * Height, in pixels, of the chart. If the container div has been explicitly sized, this will
    * be ignored.
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    * Whether to hide the legend when the mouse leaves the chart area.
    */
  var hideOverlayOnMouseOut: js.UndefOr[Boolean] = js.undefined
  /**
    * When set, this callback gets called every time a new point is highlighted.
    */
  var highlightCallback: js.UndefOr[
    js.Function5[
      /* event */ MouseEvent, 
      /* xval */ Double, 
      /* points */ js.Array[Point], 
      /* row */ Double, 
      /* seriesName */ String, 
      _
    ]
  ] = js.undefined
  /**
    * Fade the background while highlighting series. 1=fully visible background (disable
    * fading), 0=hiddden background (show highlighted series only).
    */
  var highlightSeriesBackgroundAlpha: js.UndefOr[Double] = js.undefined
  /**
    * Sets the background color used to fade out the series in conjunction with 'highlightSeriesBackgroundAlpha'.
    * Default: rgb(255, 255, 255)
    */
  var highlightSeriesBackgroundColor: js.UndefOr[String] = js.undefined
  /**
    * When set, the options from this object are applied to the timeseries closest to the mouse
    * pointer for interactive highlighting. See also 'highlightCallback'. Example:
    * highlightSeriesOpts: { strokeWidth: 3 }.
    */
  var highlightSeriesOpts: js.UndefOr[PerSeriesOptions] = js.undefined
  /**
    * Usually, dygraphs will use the range of the data plus some padding to set the range of the
    * y-axis. If this option is set, the y-axis will always include zero, typically as the
    * lowest value. This can be used to avoid exaggerating the variance in the data
    */
  var includeZero: js.UndefOr[Boolean] = js.undefined
  var interactionModel: js.UndefOr[js.Any] = js.undefined
  /**
    * When this option is passed to updateOptions() along with either the
    * <code>dateWindow</code> or <code>valueRange</code> options, the zoom flags are not changed
    * to reflect a zoomed state. This is primarily useful for when the display area of a chart
    * is changed programmatically and also where manual zooming is allowed and use is made of
    * the <code>isZoomed</code> method to determine this.
    */
  var isZoomedIgnoreProgrammaticZoom: js.UndefOr[Boolean] = js.undefined
  /**
    * A name for each data series, including the independent (X) series. For CSV files and
    * DataTable objections, this is determined by context. For raw data, this must be specified.
    * If it is not, default values are supplied and a warning is logged.
    */
  var labels: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Show data labels in an external div, rather than on the graph.    This value can either be a
    * div element or a div id.
    */
  var labelsDiv: js.UndefOr[String | HTMLElement] = js.undefined
  /**
    * Additional styles to apply to the currently-highlighted points div. For example, {
    * 'fontWeight': 'bold' } will make the labels bold. In general, it is better to use CSS to
    * style the .dygraph-legend class than to use this property.
    */
  var labelsDivStyles: js.UndefOr[StringDictionary[String]] = js.undefined
  /**
    * Width (in pixels) of the div which shows information on the currently-highlighted points.
    */
  var labelsDivWidth: js.UndefOr[Double] = js.undefined
  /**
    * Put <code>&lt;br/&gt;</code> between lines in the label string. Often used in conjunction
    * with <strong>labelsDiv</strong>.
    */
  var labelsSeparateLines: js.UndefOr[Boolean] = js.undefined
  /**
    * Show zero value labels in the labelsDiv.
    */
  var labelsShowZeroValues: js.UndefOr[Boolean] = js.undefined
  /**
    * Show date/time labels according to UTC (instead of local time).
    */
  var labelsUTC: js.UndefOr[Boolean] = js.undefined
  /**
    * When to display the legend. By default, it only appears when a user mouses over the chart.
    * Set it to "always" to always display a legend of some sort. When set to "follow", legend
    * follows highlighted points. If set to 'never' then it will not appear at all.
    */
  var legend: js.UndefOr[always | follow | onmouseover | never] = js.undefined
  /**
    * for details see https://github.com/danvk/dygraphs/pull/683
    */
  var legendFormatter: js.UndefOr[js.Function1[/* legendData */ LegendData, String]] = js.undefined
  /**
    * A value representing the farthest a graph may be panned, in percent of the display. For
    * example, a value of 0.1 means that the graph can only be panned 10% pased the edges of the
    * displayed values. null means no bounds.
    */
  var panEdgeFraction: js.UndefOr[Double] = js.undefined
  /**
    * Defines per-graph plugins. Useful for per-graph customization
    */
  var plugins: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * A function to call when a data point is clicked. and the point that was clicked.
    */
  var pointClickCallback: js.UndefOr[js.Function2[/* e */ MouseEvent, /* point */ Point, _]] = js.undefined
  /**
    * Height, in pixels, of the range selector widget. This option can only be specified at
    * Dygraph creation time.
    */
  var rangeSelectorHeight: js.UndefOr[Double] = js.undefined
  /**
    * The range selector mini plot fill color. This can be of the form "#AABBCC" or
    * "rgb(255,100,200)" or "yellow". You can also specify null or "" to turn off fill.
    */
  var rangeSelectorPlotFillColor: js.UndefOr[String] = js.undefined
  /**
    * The range selector mini plot stroke color. This can be of the form "#AABBCC" or
    * "rgb(255,100,200)" or "yellow". You can also specify null or "" to turn off stroke.
    */
  var rangeSelectorPlotStrokeColor: js.UndefOr[String] = js.undefined
  /**
    * Number of pixels to leave blank at the right edge of the Dygraph. This makes it easier to
    * highlight the right-most data point.
    */
  var rightGap: js.UndefOr[Double] = js.undefined
  /**
    * Number of days over which to average data. Discussed extensively above.
    */
  var rollPeriod: js.UndefOr[Double] = js.undefined
  /**
    * Defines per-series options. Its keys match the y-axis label names, and the values are
    * dictionaries themselves that contain options specific to that series. When this option is
    * missing, it falls back on the old-style of per-series options comingled with global
    * options.
    */
  var series: js.UndefOr[StringDictionary[PerSeriesOptions]] = js.undefined
  /**
    * Whether to show the legend upon mouseover.
    */
  var showLabelsOnHighlight: js.UndefOr[Boolean] = js.undefined
  /**
    * Show or hide the range selector widget.
    */
  var showRangeSelector: js.UndefOr[Boolean] = js.undefined
  /**
    * If the rolling average period text box should be shown.
    */
  var showRoller: js.UndefOr[Boolean] = js.undefined
  /**
    * When errorBars is set, shade this many standard deviations above/below each point.
    */
  var sigma: js.UndefOr[Double] = js.undefined
  /**
    * If set, stack series on top of one another rather than drawing them independently. The
    * first series specified in the input data will wind up on top of the chart and the last
    * will be on bottom. NaN values are drawn as white areas without a line on top, see
    * stackedGraphNaNFill for details.
    */
  var stackedGraph: js.UndefOr[Boolean] = js.undefined
  /**
    * Controls handling of NaN values inside a stacked graph. NaN values are
    * interpolated/extended for stacking purposes, but the actual point value remains NaN in the
    * legend display. Valid option values are "all" (interpolate internally, repeat leftmost and
    * rightmost value as needed), "inside" (interpolate internally only, use zero outside
    * leftmost and rightmost value), and "none" (treat NaN as zero everywhere).
    */
  var stackedGraphNaNFill: js.UndefOr[String] = js.undefined
  /**
    * Text to display above the chart. You can supply any HTML for this value, not just text. If
    * you wish to style it using CSS, use the 'dygraph-label' or 'dygraph-title' classes.
    */
  var title: js.UndefOr[String] = js.undefined
  /**
    * Height of the chart title, in pixels. This also controls the default font size of the
    * title. If you style the title on your own, this controls how much space is set aside above
    * the chart for the title's div.
    */
  var titleHeight: js.UndefOr[Double] = js.undefined
  /**
    * When set, this callback gets called before the chart is drawn. It details on how to use
    * this.
    */
  var underlayCallback: js.UndefOr[
    js.Function3[/* context */ CanvasRenderingContext2D, /* area */ Area, /* dygraph */ Dygraph, _]
  ] = js.undefined
  /**
    * When set, this callback gets called every time the user stops highlighting any point by
    * mousing out of the graph.
    */
  var unhighlightCallback: js.UndefOr[js.Function1[/* event */ MouseEvent, _]] = js.undefined
  /**
    * Which series should initially be visible? Once the Dygraph has been constructed, you can
    * access and modify the visibility of each series using the <code>visibility</code> and
    * <code>setVisibility</code> methods.
    */
  var visibility: js.UndefOr[js.Array[Boolean]] = js.undefined
  /**
    * Width, in pixels, of the chart. If the container div has been explicitly sized, this will
    * be ignored.
    */
  var width: js.UndefOr[Double] = js.undefined
  /**
    * Use in conjunction with the "fractions" option. Instead of plotting +/- N standard
    * deviations, dygraphs will compute a Wilson confidence interval and plot that. This has
    * more reasonable behavior for ratios close to 0 or 1.
    */
  var wilsonInterval: js.UndefOr[Boolean] = js.undefined
  /**
    * Height, in pixels, of the x-axis. If not set explicitly, this is computed based on
    * axisLabelFontSize and axisTickSize.
    */
  var xAxisHeight: js.UndefOr[Double] = js.undefined
  /**
    * Height of the x-axis label, in pixels. This also controls the default font size of the
    * x-axis label. If you style the label on your own, this controls how much space is set
    * aside below the chart for the x-axis label's div.
    */
  var xLabelHeight: js.UndefOr[Double] = js.undefined
  /**
    * Add the specified amount of extra space (in pixels) around the X-axis value range to
    * ensure points at the edges remain visible.
    */
  var xRangePad: js.UndefOr[Double] = js.undefined
  /**
    * A function which parses x-values (i.e. the dependent series). Must return a number, even
    * when the values are dates. In this case, millis since epoch are used. This is used
    * primarily for parsing CSV data. *=Dygraphs is slightly more accepting in the dates which
    * it will parse. See code for details.
    */
  var xValueParser: js.UndefOr[js.Function1[/* val */ String, Double]] = js.undefined
  /**
    * Text to display below the chart's x-axis. You can supply any HTML for this value, not just
    * text. If you wish to style it using CSS, use the 'dygraph-label' or 'dygraph-xlabel'
    * classes.
    */
  var xlabel: js.UndefOr[String] = js.undefined
  /**
    * Text to display to the right of the chart's secondary y-axis. This label is only displayed
    * if a secondary y-axis is present. See <a
    * href='http://dygraphs.com/tests/two-axes.html'>this test</a> for an example of how to do
    * this. The comments for the 'ylabel' option generally apply here as well. This label gets a
    * 'dygraph-y2label' instead of a 'dygraph-ylabel' class.
    */
  var y2label: js.UndefOr[String] = js.undefined
  /**
    * Width of the div which contains the y-axis label. Since the y-axis label appears rotated
    * 90 degrees, this actually affects the height of its div.
    */
  var yLabelWidth: js.UndefOr[Double] = js.undefined
  /**
    * If set, add the specified amount of extra space (in pixels) around the Y-axis value range
    * to ensure points at the edges remain visible. If unset, use the traditional Y padding
    * algorithm.
    */
  var yRangePad: js.UndefOr[Double] = js.undefined
  /**
    * Text to display to the left of the chart's y-axis. You can supply any HTML for this value,
    * not just text. If you wish to style it using CSS, use the 'dygraph-label' or
    * 'dygraph-ylabel' classes. The text will be rotated 90 degrees by default, so CSS rules may
    * behave in unintuitive ways. No additional space is set aside for a y-axis label. If you
    * need more space, increase the width of the y-axis tick labels using the yAxisLabelWidth
    * option. If you need a wider div for the y-axis label, either style it that way with CSS
    * (but remember that it's rotated, so width is controlled by the 'height' property) or set
    * the yLabelWidth option.
    */
  var ylabel: js.UndefOr[String] = js.undefined
  /**
    * A function to call when the zoom window is changed (either by zooming in or out).
    */
  var zoomCallback: js.UndefOr[
    js.Function3[
      /* minDate */ Double, 
      /* maxDate */ Double, 
      /* yRanges */ js.Array[js.Tuple2[Double, Double]], 
      _
    ]
  ] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    animatedZooms: js.UndefOr[Boolean] = js.undefined,
    annotationClickHandler: (/* annotation */ Annotation, /* point */ Point, /* dygraph */ Dygraph, /* event */ MouseEvent) => CallbackTo[js.Any] = null,
    annotationDblClickHandler: (/* annotation */ Annotation, /* point */ Point, /* dygraph */ Dygraph, /* event */ MouseEvent) => CallbackTo[js.Any] = null,
    annotationMouseOutHandler: (/* annotation */ Annotation, /* point */ Point, /* dygraph */ Dygraph, /* event */ MouseEvent) => CallbackTo[js.Any] = null,
    annotationMouseOverHandler: (/* annotation */ Annotation, /* point */ Point, /* dygraph */ Dygraph, /* event */ MouseEvent) => CallbackTo[js.Any] = null,
    axes: AnonX = null,
    axis: y1 | y2 = null,
    axisLabelColor: String = null,
    axisLabelFontSize: Int | Double = null,
    axisLabelFormatter: (/* v */ Double | js.Date, /* granularity */ Double, /* opts */ js.Function1[/* name */ String, js.Any], /* dygraph */ Dygraph) => CallbackTo[js.Any] = null,
    axisLabelWidth: Int | Double = null,
    axisLineColor: String = null,
    axisLineWidth: Int | Double = null,
    axisTickSize: Int | Double = null,
    clickCallback: (/* e */ MouseEvent, /* xval */ Double, /* points */ js.Array[Point]) => CallbackTo[js.Any] = null,
    color: String = null,
    colorSaturation: Int | Double = null,
    colorValue: Int | Double = null,
    colors: js.Array[String] = null,
    connectSeparatedPoints: js.UndefOr[Boolean] = js.undefined,
    customBars: js.UndefOr[Boolean] = js.undefined,
    dataHandler: js.Any = null,
    dateWindow: js.Array[Double] = null,
    delimiter: String = null,
    digitsAfterDecimal: Int | Double = null,
    displayAnnotations: js.UndefOr[Boolean] = js.undefined,
    drawAxesAtZero: js.UndefOr[Boolean] = js.undefined,
    drawAxis: js.UndefOr[Boolean] = js.undefined,
    drawCallback: (/* dygraph */ Dygraph, /* is_initial */ Boolean) => CallbackTo[js.Any] = null,
    drawGapEdgePoints: js.UndefOr[Boolean] = js.undefined,
    drawGrid: js.UndefOr[Boolean] = js.undefined,
    drawHighlightPointCallback: (/* g */ Dygraph, /* seriesName */ String, /* canvasContext */ CanvasRenderingContext2D, /* cx */ Double, /* cy */ Double, /* color */ String, /* pointSize */ Double) => CallbackTo[js.Any] = null,
    drawPointCallback: (/* g */ Dygraph, /* seriesName */ String, /* canvasContext */ CanvasRenderingContext2D, /* cx */ Double, /* cy */ Double, /* color */ String, /* pointSize */ Double) => CallbackTo[js.Any] = null,
    drawPoints: js.UndefOr[Boolean] = js.undefined,
    errorBars: js.UndefOr[Boolean] = js.undefined,
    file: Data = null,
    fillAlpha: Int | Double = null,
    fillGraph: js.UndefOr[Boolean] = js.undefined,
    fractions: js.UndefOr[Boolean] = js.undefined,
    gridLineColor: String = null,
    gridLinePattern: js.Array[Double] = null,
    gridLineWidth: Int | Double = null,
    height: Int | Double = null,
    hideOverlayOnMouseOut: js.UndefOr[Boolean] = js.undefined,
    highlightCallback: (/* event */ MouseEvent, /* xval */ Double, /* points */ js.Array[Point], /* row */ Double, /* seriesName */ String) => CallbackTo[js.Any] = null,
    highlightCircleSize: Int | Double = null,
    highlightSeriesBackgroundAlpha: Int | Double = null,
    highlightSeriesBackgroundColor: String = null,
    highlightSeriesOpts: PerSeriesOptions = null,
    includeZero: js.UndefOr[Boolean] = js.undefined,
    independentTicks: js.UndefOr[Boolean] = js.undefined,
    interactionModel: js.Any = null,
    isZoomedIgnoreProgrammaticZoom: js.UndefOr[Boolean] = js.undefined,
    labels: js.Array[String] = null,
    labelsDiv: String | HTMLElement = null,
    labelsDivStyles: StringDictionary[String] = null,
    labelsDivWidth: Int | Double = null,
    labelsKMB: js.UndefOr[Boolean] = js.undefined,
    labelsKMG2: js.UndefOr[Boolean] = js.undefined,
    labelsSeparateLines: js.UndefOr[Boolean] = js.undefined,
    labelsShowZeroValues: js.UndefOr[Boolean] = js.undefined,
    labelsUTC: js.UndefOr[Boolean] = js.undefined,
    legend: always | follow | onmouseover | never = null,
    legendFormatter: /* legendData */ LegendData => CallbackTo[String] = null,
    logscale: js.UndefOr[Boolean] = js.undefined,
    maxNumberWidth: Int | Double = null,
    panEdgeFraction: Int | Double = null,
    pixelsPerLabel: Int | Double = null,
    plotter: js.Any = null,
    plugins: js.Array[_] = null,
    pointClickCallback: (/* e */ MouseEvent, /* point */ Point) => CallbackTo[js.Any] = null,
    pointSize: Int | Double = null,
    rangeSelectorHeight: Int | Double = null,
    rangeSelectorPlotFillColor: String = null,
    rangeSelectorPlotStrokeColor: String = null,
    rightGap: Int | Double = null,
    rollPeriod: Int | Double = null,
    series: StringDictionary[PerSeriesOptions] = null,
    showInRangeSelector: js.UndefOr[Boolean] = js.undefined,
    showLabelsOnHighlight: js.UndefOr[Boolean] = js.undefined,
    showRangeSelector: js.UndefOr[Boolean] = js.undefined,
    showRoller: js.UndefOr[Boolean] = js.undefined,
    sigFigs: Int | Double = null,
    sigma: Int | Double = null,
    stackedGraph: js.UndefOr[Boolean] = js.undefined,
    stackedGraphNaNFill: String = null,
    stepPlot: js.UndefOr[Boolean] = js.undefined,
    strokeBorderColor: String = null,
    strokeBorderWidth: Int | Double = null,
    strokePattern: js.Array[Double] = null,
    strokeWidth: Int | Double = null,
    ticker: (/* min */ Double, /* max */ Double, /* pixels */ Double, /* opts */ js.Function1[/* name */ String, js.Any], /* dygraph */ Dygraph, /* vals */ js.Array[Double]) => CallbackTo[js.Array[AnonLabel]] = null,
    title: String = null,
    titleHeight: Int | Double = null,
    underlayCallback: (/* context */ CanvasRenderingContext2D, /* area */ Area, /* dygraph */ Dygraph) => CallbackTo[js.Any] = null,
    unhighlightCallback: /* event */ MouseEvent => CallbackTo[js.Any] = null,
    valueFormatter: (/* v */ Double, /* opts */ js.Function1[/* name */ String, js.Any], /* seriesName */ String, /* dygraph */ Dygraph, /* row */ Double, /* col */ Double) => CallbackTo[js.Any] = null,
    valueRange: js.Array[Double] = null,
    visibility: js.Array[Boolean] = null,
    width: Int | Double = null,
    wilsonInterval: js.UndefOr[Boolean] = js.undefined,
    xAxisHeight: Int | Double = null,
    xLabelHeight: Int | Double = null,
    xRangePad: Int | Double = null,
    xValueParser: /* val */ String => CallbackTo[Double] = null,
    xlabel: String = null,
    y2label: String = null,
    yLabelWidth: Int | Double = null,
    yRangePad: Int | Double = null,
    ylabel: String = null,
    zoomCallback: (/* minDate */ Double, /* maxDate */ Double, /* yRanges */ js.Array[js.Tuple2[Double, Double]]) => CallbackTo[js.Any] = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animatedZooms)) __obj.updateDynamic("animatedZooms")(animatedZooms.asInstanceOf[js.Any])
    if (annotationClickHandler != null) __obj.updateDynamic("annotationClickHandler")(js.Any.fromFunction4((t0: /* annotation */ typingsJapgolly.dygraphs.dygraphs.Annotation, t1: /* point */ typingsJapgolly.dygraphs.dygraphs.Point, t2: /* dygraph */ typingsJapgolly.dygraphs.Dygraph, t3: /* event */ org.scalajs.dom.raw.MouseEvent) => annotationClickHandler(t0, t1, t2, t3).runNow()))
    if (annotationDblClickHandler != null) __obj.updateDynamic("annotationDblClickHandler")(js.Any.fromFunction4((t0: /* annotation */ typingsJapgolly.dygraphs.dygraphs.Annotation, t1: /* point */ typingsJapgolly.dygraphs.dygraphs.Point, t2: /* dygraph */ typingsJapgolly.dygraphs.Dygraph, t3: /* event */ org.scalajs.dom.raw.MouseEvent) => annotationDblClickHandler(t0, t1, t2, t3).runNow()))
    if (annotationMouseOutHandler != null) __obj.updateDynamic("annotationMouseOutHandler")(js.Any.fromFunction4((t0: /* annotation */ typingsJapgolly.dygraphs.dygraphs.Annotation, t1: /* point */ typingsJapgolly.dygraphs.dygraphs.Point, t2: /* dygraph */ typingsJapgolly.dygraphs.Dygraph, t3: /* event */ org.scalajs.dom.raw.MouseEvent) => annotationMouseOutHandler(t0, t1, t2, t3).runNow()))
    if (annotationMouseOverHandler != null) __obj.updateDynamic("annotationMouseOverHandler")(js.Any.fromFunction4((t0: /* annotation */ typingsJapgolly.dygraphs.dygraphs.Annotation, t1: /* point */ typingsJapgolly.dygraphs.dygraphs.Point, t2: /* dygraph */ typingsJapgolly.dygraphs.Dygraph, t3: /* event */ org.scalajs.dom.raw.MouseEvent) => annotationMouseOverHandler(t0, t1, t2, t3).runNow()))
    if (axes != null) __obj.updateDynamic("axes")(axes.asInstanceOf[js.Any])
    if (axis != null) __obj.updateDynamic("axis")(axis.asInstanceOf[js.Any])
    if (axisLabelColor != null) __obj.updateDynamic("axisLabelColor")(axisLabelColor.asInstanceOf[js.Any])
    if (axisLabelFontSize != null) __obj.updateDynamic("axisLabelFontSize")(axisLabelFontSize.asInstanceOf[js.Any])
    if (axisLabelFormatter != null) __obj.updateDynamic("axisLabelFormatter")(js.Any.fromFunction4((t0: /* v */ scala.Double | js.Date, t1: /* granularity */ scala.Double, t2: /* opts */ js.Function1[/* name */ java.lang.String, js.Any], t3: /* dygraph */ typingsJapgolly.dygraphs.Dygraph) => axisLabelFormatter(t0, t1, t2, t3).runNow()))
    if (axisLabelWidth != null) __obj.updateDynamic("axisLabelWidth")(axisLabelWidth.asInstanceOf[js.Any])
    if (axisLineColor != null) __obj.updateDynamic("axisLineColor")(axisLineColor.asInstanceOf[js.Any])
    if (axisLineWidth != null) __obj.updateDynamic("axisLineWidth")(axisLineWidth.asInstanceOf[js.Any])
    if (axisTickSize != null) __obj.updateDynamic("axisTickSize")(axisTickSize.asInstanceOf[js.Any])
    if (clickCallback != null) __obj.updateDynamic("clickCallback")(js.Any.fromFunction3((t0: /* e */ org.scalajs.dom.raw.MouseEvent, t1: /* xval */ scala.Double, t2: /* points */ js.Array[typingsJapgolly.dygraphs.dygraphs.Point]) => clickCallback(t0, t1, t2).runNow()))
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (colorSaturation != null) __obj.updateDynamic("colorSaturation")(colorSaturation.asInstanceOf[js.Any])
    if (colorValue != null) __obj.updateDynamic("colorValue")(colorValue.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (!js.isUndefined(connectSeparatedPoints)) __obj.updateDynamic("connectSeparatedPoints")(connectSeparatedPoints.asInstanceOf[js.Any])
    if (!js.isUndefined(customBars)) __obj.updateDynamic("customBars")(customBars.asInstanceOf[js.Any])
    if (dataHandler != null) __obj.updateDynamic("dataHandler")(dataHandler.asInstanceOf[js.Any])
    if (dateWindow != null) __obj.updateDynamic("dateWindow")(dateWindow.asInstanceOf[js.Any])
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter.asInstanceOf[js.Any])
    if (digitsAfterDecimal != null) __obj.updateDynamic("digitsAfterDecimal")(digitsAfterDecimal.asInstanceOf[js.Any])
    if (!js.isUndefined(displayAnnotations)) __obj.updateDynamic("displayAnnotations")(displayAnnotations.asInstanceOf[js.Any])
    if (!js.isUndefined(drawAxesAtZero)) __obj.updateDynamic("drawAxesAtZero")(drawAxesAtZero.asInstanceOf[js.Any])
    if (!js.isUndefined(drawAxis)) __obj.updateDynamic("drawAxis")(drawAxis.asInstanceOf[js.Any])
    if (drawCallback != null) __obj.updateDynamic("drawCallback")(js.Any.fromFunction2((t0: /* dygraph */ typingsJapgolly.dygraphs.Dygraph, t1: /* is_initial */ scala.Boolean) => drawCallback(t0, t1).runNow()))
    if (!js.isUndefined(drawGapEdgePoints)) __obj.updateDynamic("drawGapEdgePoints")(drawGapEdgePoints.asInstanceOf[js.Any])
    if (!js.isUndefined(drawGrid)) __obj.updateDynamic("drawGrid")(drawGrid.asInstanceOf[js.Any])
    if (drawHighlightPointCallback != null) __obj.updateDynamic("drawHighlightPointCallback")(js.Any.fromFunction7((t0: /* g */ typingsJapgolly.dygraphs.Dygraph, t1: /* seriesName */ java.lang.String, t2: /* canvasContext */ org.scalajs.dom.raw.CanvasRenderingContext2D, t3: /* cx */ scala.Double, t4: /* cy */ scala.Double, t5: /* color */ java.lang.String, t6: /* pointSize */ scala.Double) => drawHighlightPointCallback(t0, t1, t2, t3, t4, t5, t6).runNow()))
    if (drawPointCallback != null) __obj.updateDynamic("drawPointCallback")(js.Any.fromFunction7((t0: /* g */ typingsJapgolly.dygraphs.Dygraph, t1: /* seriesName */ java.lang.String, t2: /* canvasContext */ org.scalajs.dom.raw.CanvasRenderingContext2D, t3: /* cx */ scala.Double, t4: /* cy */ scala.Double, t5: /* color */ java.lang.String, t6: /* pointSize */ scala.Double) => drawPointCallback(t0, t1, t2, t3, t4, t5, t6).runNow()))
    if (!js.isUndefined(drawPoints)) __obj.updateDynamic("drawPoints")(drawPoints.asInstanceOf[js.Any])
    if (!js.isUndefined(errorBars)) __obj.updateDynamic("errorBars")(errorBars.asInstanceOf[js.Any])
    if (file != null) __obj.updateDynamic("file")(file.asInstanceOf[js.Any])
    if (fillAlpha != null) __obj.updateDynamic("fillAlpha")(fillAlpha.asInstanceOf[js.Any])
    if (!js.isUndefined(fillGraph)) __obj.updateDynamic("fillGraph")(fillGraph.asInstanceOf[js.Any])
    if (!js.isUndefined(fractions)) __obj.updateDynamic("fractions")(fractions.asInstanceOf[js.Any])
    if (gridLineColor != null) __obj.updateDynamic("gridLineColor")(gridLineColor.asInstanceOf[js.Any])
    if (gridLinePattern != null) __obj.updateDynamic("gridLinePattern")(gridLinePattern.asInstanceOf[js.Any])
    if (gridLineWidth != null) __obj.updateDynamic("gridLineWidth")(gridLineWidth.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(hideOverlayOnMouseOut)) __obj.updateDynamic("hideOverlayOnMouseOut")(hideOverlayOnMouseOut.asInstanceOf[js.Any])
    if (highlightCallback != null) __obj.updateDynamic("highlightCallback")(js.Any.fromFunction5((t0: /* event */ org.scalajs.dom.raw.MouseEvent, t1: /* xval */ scala.Double, t2: /* points */ js.Array[typingsJapgolly.dygraphs.dygraphs.Point], t3: /* row */ scala.Double, t4: /* seriesName */ java.lang.String) => highlightCallback(t0, t1, t2, t3, t4).runNow()))
    if (highlightCircleSize != null) __obj.updateDynamic("highlightCircleSize")(highlightCircleSize.asInstanceOf[js.Any])
    if (highlightSeriesBackgroundAlpha != null) __obj.updateDynamic("highlightSeriesBackgroundAlpha")(highlightSeriesBackgroundAlpha.asInstanceOf[js.Any])
    if (highlightSeriesBackgroundColor != null) __obj.updateDynamic("highlightSeriesBackgroundColor")(highlightSeriesBackgroundColor.asInstanceOf[js.Any])
    if (highlightSeriesOpts != null) __obj.updateDynamic("highlightSeriesOpts")(highlightSeriesOpts.asInstanceOf[js.Any])
    if (!js.isUndefined(includeZero)) __obj.updateDynamic("includeZero")(includeZero.asInstanceOf[js.Any])
    if (!js.isUndefined(independentTicks)) __obj.updateDynamic("independentTicks")(independentTicks.asInstanceOf[js.Any])
    if (interactionModel != null) __obj.updateDynamic("interactionModel")(interactionModel.asInstanceOf[js.Any])
    if (!js.isUndefined(isZoomedIgnoreProgrammaticZoom)) __obj.updateDynamic("isZoomedIgnoreProgrammaticZoom")(isZoomedIgnoreProgrammaticZoom.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (labelsDiv != null) __obj.updateDynamic("labelsDiv")(labelsDiv.asInstanceOf[js.Any])
    if (labelsDivStyles != null) __obj.updateDynamic("labelsDivStyles")(labelsDivStyles.asInstanceOf[js.Any])
    if (labelsDivWidth != null) __obj.updateDynamic("labelsDivWidth")(labelsDivWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(labelsKMB)) __obj.updateDynamic("labelsKMB")(labelsKMB.asInstanceOf[js.Any])
    if (!js.isUndefined(labelsKMG2)) __obj.updateDynamic("labelsKMG2")(labelsKMG2.asInstanceOf[js.Any])
    if (!js.isUndefined(labelsSeparateLines)) __obj.updateDynamic("labelsSeparateLines")(labelsSeparateLines.asInstanceOf[js.Any])
    if (!js.isUndefined(labelsShowZeroValues)) __obj.updateDynamic("labelsShowZeroValues")(labelsShowZeroValues.asInstanceOf[js.Any])
    if (!js.isUndefined(labelsUTC)) __obj.updateDynamic("labelsUTC")(labelsUTC.asInstanceOf[js.Any])
    if (legend != null) __obj.updateDynamic("legend")(legend.asInstanceOf[js.Any])
    if (legendFormatter != null) __obj.updateDynamic("legendFormatter")(js.Any.fromFunction1((t0: /* legendData */ typingsJapgolly.dygraphs.dygraphs.LegendData) => legendFormatter(t0).runNow()))
    if (!js.isUndefined(logscale)) __obj.updateDynamic("logscale")(logscale.asInstanceOf[js.Any])
    if (maxNumberWidth != null) __obj.updateDynamic("maxNumberWidth")(maxNumberWidth.asInstanceOf[js.Any])
    if (panEdgeFraction != null) __obj.updateDynamic("panEdgeFraction")(panEdgeFraction.asInstanceOf[js.Any])
    if (pixelsPerLabel != null) __obj.updateDynamic("pixelsPerLabel")(pixelsPerLabel.asInstanceOf[js.Any])
    if (plotter != null) __obj.updateDynamic("plotter")(plotter.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    if (pointClickCallback != null) __obj.updateDynamic("pointClickCallback")(js.Any.fromFunction2((t0: /* e */ org.scalajs.dom.raw.MouseEvent, t1: /* point */ typingsJapgolly.dygraphs.dygraphs.Point) => pointClickCallback(t0, t1).runNow()))
    if (pointSize != null) __obj.updateDynamic("pointSize")(pointSize.asInstanceOf[js.Any])
    if (rangeSelectorHeight != null) __obj.updateDynamic("rangeSelectorHeight")(rangeSelectorHeight.asInstanceOf[js.Any])
    if (rangeSelectorPlotFillColor != null) __obj.updateDynamic("rangeSelectorPlotFillColor")(rangeSelectorPlotFillColor.asInstanceOf[js.Any])
    if (rangeSelectorPlotStrokeColor != null) __obj.updateDynamic("rangeSelectorPlotStrokeColor")(rangeSelectorPlotStrokeColor.asInstanceOf[js.Any])
    if (rightGap != null) __obj.updateDynamic("rightGap")(rightGap.asInstanceOf[js.Any])
    if (rollPeriod != null) __obj.updateDynamic("rollPeriod")(rollPeriod.asInstanceOf[js.Any])
    if (series != null) __obj.updateDynamic("series")(series.asInstanceOf[js.Any])
    if (!js.isUndefined(showInRangeSelector)) __obj.updateDynamic("showInRangeSelector")(showInRangeSelector.asInstanceOf[js.Any])
    if (!js.isUndefined(showLabelsOnHighlight)) __obj.updateDynamic("showLabelsOnHighlight")(showLabelsOnHighlight.asInstanceOf[js.Any])
    if (!js.isUndefined(showRangeSelector)) __obj.updateDynamic("showRangeSelector")(showRangeSelector.asInstanceOf[js.Any])
    if (!js.isUndefined(showRoller)) __obj.updateDynamic("showRoller")(showRoller.asInstanceOf[js.Any])
    if (sigFigs != null) __obj.updateDynamic("sigFigs")(sigFigs.asInstanceOf[js.Any])
    if (sigma != null) __obj.updateDynamic("sigma")(sigma.asInstanceOf[js.Any])
    if (!js.isUndefined(stackedGraph)) __obj.updateDynamic("stackedGraph")(stackedGraph.asInstanceOf[js.Any])
    if (stackedGraphNaNFill != null) __obj.updateDynamic("stackedGraphNaNFill")(stackedGraphNaNFill.asInstanceOf[js.Any])
    if (!js.isUndefined(stepPlot)) __obj.updateDynamic("stepPlot")(stepPlot.asInstanceOf[js.Any])
    if (strokeBorderColor != null) __obj.updateDynamic("strokeBorderColor")(strokeBorderColor.asInstanceOf[js.Any])
    if (strokeBorderWidth != null) __obj.updateDynamic("strokeBorderWidth")(strokeBorderWidth.asInstanceOf[js.Any])
    if (strokePattern != null) __obj.updateDynamic("strokePattern")(strokePattern.asInstanceOf[js.Any])
    if (strokeWidth != null) __obj.updateDynamic("strokeWidth")(strokeWidth.asInstanceOf[js.Any])
    if (ticker != null) __obj.updateDynamic("ticker")(js.Any.fromFunction6((t0: /* min */ scala.Double, t1: /* max */ scala.Double, t2: /* pixels */ scala.Double, t3: /* opts */ js.Function1[/* name */ java.lang.String, js.Any], t4: /* dygraph */ typingsJapgolly.dygraphs.Dygraph, t5: /* vals */ js.Array[scala.Double]) => ticker(t0, t1, t2, t3, t4, t5).runNow()))
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (titleHeight != null) __obj.updateDynamic("titleHeight")(titleHeight.asInstanceOf[js.Any])
    if (underlayCallback != null) __obj.updateDynamic("underlayCallback")(js.Any.fromFunction3((t0: /* context */ org.scalajs.dom.raw.CanvasRenderingContext2D, t1: /* area */ typingsJapgolly.dygraphs.dygraphs.Area, t2: /* dygraph */ typingsJapgolly.dygraphs.Dygraph) => underlayCallback(t0, t1, t2).runNow()))
    if (unhighlightCallback != null) __obj.updateDynamic("unhighlightCallback")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.MouseEvent) => unhighlightCallback(t0).runNow()))
    if (valueFormatter != null) __obj.updateDynamic("valueFormatter")(js.Any.fromFunction6((t0: /* v */ scala.Double, t1: /* opts */ js.Function1[/* name */ java.lang.String, js.Any], t2: /* seriesName */ java.lang.String, t3: /* dygraph */ typingsJapgolly.dygraphs.Dygraph, t4: /* row */ scala.Double, t5: /* col */ scala.Double) => valueFormatter(t0, t1, t2, t3, t4, t5).runNow()))
    if (valueRange != null) __obj.updateDynamic("valueRange")(valueRange.asInstanceOf[js.Any])
    if (visibility != null) __obj.updateDynamic("visibility")(visibility.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (!js.isUndefined(wilsonInterval)) __obj.updateDynamic("wilsonInterval")(wilsonInterval.asInstanceOf[js.Any])
    if (xAxisHeight != null) __obj.updateDynamic("xAxisHeight")(xAxisHeight.asInstanceOf[js.Any])
    if (xLabelHeight != null) __obj.updateDynamic("xLabelHeight")(xLabelHeight.asInstanceOf[js.Any])
    if (xRangePad != null) __obj.updateDynamic("xRangePad")(xRangePad.asInstanceOf[js.Any])
    if (xValueParser != null) __obj.updateDynamic("xValueParser")(js.Any.fromFunction1((t0: /* val */ java.lang.String) => xValueParser(t0).runNow()))
    if (xlabel != null) __obj.updateDynamic("xlabel")(xlabel.asInstanceOf[js.Any])
    if (y2label != null) __obj.updateDynamic("y2label")(y2label.asInstanceOf[js.Any])
    if (yLabelWidth != null) __obj.updateDynamic("yLabelWidth")(yLabelWidth.asInstanceOf[js.Any])
    if (yRangePad != null) __obj.updateDynamic("yRangePad")(yRangePad.asInstanceOf[js.Any])
    if (ylabel != null) __obj.updateDynamic("ylabel")(ylabel.asInstanceOf[js.Any])
    if (zoomCallback != null) __obj.updateDynamic("zoomCallback")(js.Any.fromFunction3((t0: /* minDate */ scala.Double, t1: /* maxDate */ scala.Double, t2: /* yRanges */ js.Array[js.Tuple2[scala.Double, scala.Double]]) => zoomCallback(t0, t1, t2).runNow()))
    __obj.asInstanceOf[Options]
  }
}

