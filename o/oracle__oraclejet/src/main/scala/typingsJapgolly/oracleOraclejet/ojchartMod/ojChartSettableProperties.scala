package typingsJapgolly.oracleOraclejet.ojchartMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.oracleOraclejet.AnonAlignTickMarks
import typingsJapgolly.oracleOraclejet.AnonAnimationDownColor
import typingsJapgolly.oracleOraclejet.AnonAxisLine
import typingsJapgolly.oracleOraclejet.AnonBackgroundColor
import typingsJapgolly.oracleOraclejet.AnonBaselineScaling
import typingsJapgolly.oracleOraclejet.AnonBorderWidth
import typingsJapgolly.oracleOraclejet.AnonClose
import typingsJapgolly.oracleOraclejet.AnonComponentName
import typingsJapgolly.oracleOraclejet.AnonContent
import typingsJapgolly.oracleOraclejet.AnonConverter
import typingsJapgolly.oracleOraclejet.AnonDrag
import typingsJapgolly.oracleOraclejet.AnonInsert
import typingsJapgolly.oracleOraclejet.AnonPreventDefault
import typingsJapgolly.oracleOraclejet.AnonRenderer
import typingsJapgolly.oracleOraclejet.AnonX
import typingsJapgolly.oracleOraclejet.ojchartMod.ojChart.DataLabelContext
import typingsJapgolly.oracleOraclejet.ojdataproviderMod.DataProvider
import typingsJapgolly.oracleOraclejet.ojdvtBaseMod.dvtBaseComponentSettableProperties
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.all
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.alphaFade
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.any
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.area
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.ascending
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.auto
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.bar
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.boxPlot
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.bubble
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.cartesian
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.circle
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.combo
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.delayed
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.delayedScrollOnly
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.descending
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.dim
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.disabled
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.enabled
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.first
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.funnel
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.groupsOnly
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.horizontal
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.last
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.line
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.lineWithArea
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.live
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.liveScrollOnly
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.mixedFrequency
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.multiple
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.none
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.off
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.on
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.pan
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.pie
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.polar
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.polygon
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.pyramid
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.scatter
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.select
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.seriesOnly
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.single
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.skipGaps
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.slideToLeft
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.slideToRight
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.smooth
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.snap
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.stock
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.touchStart
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.user
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.vertical
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.withRescale
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.withoutRescale
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.x
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.y
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.zoom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojChartSettableProperties[K, D] extends dvtBaseComponentSettableProperties {
  var animationOnDataChange: auto | slideToLeft | slideToRight | none
  var animationOnDisplay: auto | alphaFade | zoom | none
  var as: String
  var coordinateSystem: polar | cartesian
  var data: (DataProvider[K, D]) | Null
  var dataCursor: off | on | auto
  var dataCursorBehavior: smooth | snap | auto
  var dataCursorPosition: AnonX
  var dnd: AnonDrag
  var dragMode: pan | zoom | select | off | user
  var drilling: on | seriesOnly | groupsOnly | off
  var groupComparator: (js.Function2[/* param0 */ js.Object, /* param1 */ js.Object, Double]) | Null
  var hiddenCategories: js.Array[String]
  var hideAndShowBehavior: withRescale | withoutRescale | none
  var highlightMatch: any | all
  var highlightedCategories: js.Array[String]
  var hoverBehavior: dim | none
  var initialZooming: first | last | none
  var legend: AnonBackgroundColor
  var orientation: horizontal | vertical
  var otherThreshold: Double
  var overview: AnonContent
  var pieCenter: AnonConverter
  var plotArea: AnonBorderWidth
  var polarGridShape: polygon | circle
  var selection: js.Array[K]
  var selectionMode: single | multiple | none
  var seriesComparator: (js.Function2[/* param0 */ js.Object, /* param1 */ js.Object, Double]) | Null
  var sorting: ascending | descending | off
  var splitDualY: on | off | auto
  var splitterPosition: Double
  var stack: on | off
  var stackLabel: on | off
  var styleDefaults: AnonAnimationDownColor
  var timeAxisType: enabled | mixedFrequency | skipGaps | disabled | auto
  var tooltip: AnonRenderer
  var touchResponse: touchStart | auto
  @JSName("translations")
  var translations_ojChartSettableProperties: AnonComponentName
  var `type`: line | area | lineWithArea | stock | boxPlot | combo | pie | scatter | bubble | funnel | pyramid | bar
  var valueFormats: AnonClose
  var xAxis: AnonAxisLine
  var y2Axis: AnonAlignTickMarks
  var yAxis: AnonBaselineScaling
  var zoomAndScroll: delayedScrollOnly | liveScrollOnly | delayed | live | off
  var zoomDirection: x | y | auto
  def dataLabel(context: DataLabelContext): AnonInsert | AnonPreventDefault
}

object ojChartSettableProperties {
  @scala.inline
  def apply[K, D](
    animationOnDataChange: auto | slideToLeft | slideToRight | none,
    animationOnDisplay: auto | alphaFade | zoom | none,
    as: String,
    coordinateSystem: polar | cartesian,
    dataCursor: off | on | auto,
    dataCursorBehavior: smooth | snap | auto,
    dataCursorPosition: AnonX,
    dataLabel: DataLabelContext => CallbackTo[AnonInsert | AnonPreventDefault],
    dnd: AnonDrag,
    dragMode: pan | zoom | select | off | user,
    drilling: on | seriesOnly | groupsOnly | off,
    hiddenCategories: js.Array[String],
    hideAndShowBehavior: withRescale | withoutRescale | none,
    highlightMatch: any | all,
    highlightedCategories: js.Array[String],
    hoverBehavior: dim | none,
    initialZooming: first | last | none,
    legend: AnonBackgroundColor,
    orientation: horizontal | vertical,
    otherThreshold: Double,
    overview: AnonContent,
    pieCenter: AnonConverter,
    plotArea: AnonBorderWidth,
    polarGridShape: polygon | circle,
    selection: js.Array[K],
    selectionMode: single | multiple | none,
    sorting: ascending | descending | off,
    splitDualY: on | off | auto,
    splitterPosition: Double,
    stack: on | off,
    stackLabel: on | off,
    styleDefaults: AnonAnimationDownColor,
    timeAxisType: enabled | mixedFrequency | skipGaps | disabled | auto,
    tooltip: AnonRenderer,
    touchResponse: touchStart | auto,
    trackResize: on | off,
    translations: AnonComponentName,
    `type`: line | area | lineWithArea | stock | boxPlot | combo | pie | scatter | bubble | funnel | pyramid | bar,
    valueFormats: AnonClose,
    xAxis: AnonAxisLine,
    y2Axis: AnonAlignTickMarks,
    yAxis: AnonBaselineScaling,
    zoomAndScroll: delayedScrollOnly | liveScrollOnly | delayed | live | off,
    zoomDirection: x | y | auto,
    data: DataProvider[K, D] = null,
    groupComparator: (/* param0 */ js.Object, /* param1 */ js.Object) => CallbackTo[Double] = null,
    seriesComparator: (/* param0 */ js.Object, /* param1 */ js.Object) => CallbackTo[Double] = null
  ): ojChartSettableProperties[K, D] = {
    val __obj = js.Dynamic.literal(animationOnDataChange = animationOnDataChange.asInstanceOf[js.Any], animationOnDisplay = animationOnDisplay.asInstanceOf[js.Any], as = as.asInstanceOf[js.Any], coordinateSystem = coordinateSystem.asInstanceOf[js.Any], dataCursor = dataCursor.asInstanceOf[js.Any], dataCursorBehavior = dataCursorBehavior.asInstanceOf[js.Any], dataCursorPosition = dataCursorPosition.asInstanceOf[js.Any], dnd = dnd.asInstanceOf[js.Any], dragMode = dragMode.asInstanceOf[js.Any], drilling = drilling.asInstanceOf[js.Any], hiddenCategories = hiddenCategories.asInstanceOf[js.Any], hideAndShowBehavior = hideAndShowBehavior.asInstanceOf[js.Any], highlightMatch = highlightMatch.asInstanceOf[js.Any], highlightedCategories = highlightedCategories.asInstanceOf[js.Any], hoverBehavior = hoverBehavior.asInstanceOf[js.Any], initialZooming = initialZooming.asInstanceOf[js.Any], legend = legend.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], otherThreshold = otherThreshold.asInstanceOf[js.Any], overview = overview.asInstanceOf[js.Any], pieCenter = pieCenter.asInstanceOf[js.Any], plotArea = plotArea.asInstanceOf[js.Any], polarGridShape = polarGridShape.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any], selectionMode = selectionMode.asInstanceOf[js.Any], sorting = sorting.asInstanceOf[js.Any], splitDualY = splitDualY.asInstanceOf[js.Any], splitterPosition = splitterPosition.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any], stackLabel = stackLabel.asInstanceOf[js.Any], styleDefaults = styleDefaults.asInstanceOf[js.Any], timeAxisType = timeAxisType.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any], touchResponse = touchResponse.asInstanceOf[js.Any], trackResize = trackResize.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any], valueFormats = valueFormats.asInstanceOf[js.Any], xAxis = xAxis.asInstanceOf[js.Any], y2Axis = y2Axis.asInstanceOf[js.Any], yAxis = yAxis.asInstanceOf[js.Any], zoomAndScroll = zoomAndScroll.asInstanceOf[js.Any], zoomDirection = zoomDirection.asInstanceOf[js.Any])
    __obj.updateDynamic("dataLabel")(js.Any.fromFunction1((t0: typingsJapgolly.oracleOraclejet.ojchartMod.ojChart.DataLabelContext) => dataLabel(t0).runNow()))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (groupComparator != null) __obj.updateDynamic("groupComparator")(js.Any.fromFunction2((t0: /* param0 */ js.Object, t1: /* param1 */ js.Object) => groupComparator(t0, t1).runNow()))
    if (seriesComparator != null) __obj.updateDynamic("seriesComparator")(js.Any.fromFunction2((t0: /* param0 */ js.Object, t1: /* param1 */ js.Object) => seriesComparator(t0, t1).runNow()))
    __obj.asInstanceOf[ojChartSettableProperties[K, D]]
  }
}

