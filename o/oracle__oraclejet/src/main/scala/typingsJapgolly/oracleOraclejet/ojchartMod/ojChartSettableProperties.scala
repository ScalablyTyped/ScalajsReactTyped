package typingsJapgolly.oracleOraclejet.ojchartMod

import typingsJapgolly.oracleOraclejet.anon.AlignTickMarks
import typingsJapgolly.oracleOraclejet.anon.AnimationDownColor
import typingsJapgolly.oracleOraclejet.anon.AxisLine
import typingsJapgolly.oracleOraclejet.anon.BackgroundColor
import typingsJapgolly.oracleOraclejet.anon.BaselineScaling
import typingsJapgolly.oracleOraclejet.anon.BorderWidth
import typingsJapgolly.oracleOraclejet.anon.Close
import typingsJapgolly.oracleOraclejet.anon.ComponentName
import typingsJapgolly.oracleOraclejet.anon.Content
import typingsJapgolly.oracleOraclejet.anon.Converter
import typingsJapgolly.oracleOraclejet.anon.Drag
import typingsJapgolly.oracleOraclejet.anon.Insert
import typingsJapgolly.oracleOraclejet.anon.PreventDefault
import typingsJapgolly.oracleOraclejet.anon.Renderer
import typingsJapgolly.oracleOraclejet.anon.X
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ojChartSettableProperties[K, D]
  extends StObject
     with dvtBaseComponentSettableProperties {
  
  var animationOnDataChange: auto | slideToLeft | slideToRight | none
  
  var animationOnDisplay: auto | alphaFade | zoom | none
  
  var as: String
  
  var coordinateSystem: polar | cartesian
  
  var data: (DataProvider[K, D]) | Null
  
  var dataCursor: off | on | auto
  
  var dataCursorBehavior: smooth | snap | auto
  
  var dataCursorPosition: X
  
  def dataLabel(context: DataLabelContext): Insert | PreventDefault
  
  var dnd: Drag
  
  var dragMode: pan | zoom | select | off | user
  
  var drilling: on | seriesOnly | groupsOnly | off
  
  var groupComparator: (js.Function2[/* param0 */ js.Object, /* param1 */ js.Object, Double]) | Null
  
  var hiddenCategories: js.Array[String]
  
  var hideAndShowBehavior: withRescale | withoutRescale | none
  
  var highlightMatch: any | all
  
  var highlightedCategories: js.Array[String]
  
  var hoverBehavior: dim | none
  
  var initialZooming: first | last | none
  
  var legend: BackgroundColor
  
  var orientation: horizontal | vertical
  
  var otherThreshold: Double
  
  var overview: Content
  
  var pieCenter: Converter
  
  var plotArea: BorderWidth
  
  var polarGridShape: polygon | circle
  
  var selection: js.Array[K]
  
  var selectionMode: single | multiple | none
  
  var seriesComparator: (js.Function2[/* param0 */ js.Object, /* param1 */ js.Object, Double]) | Null
  
  var sorting: ascending | descending | off
  
  var splitDualY: on | off | auto
  
  var splitterPosition: Double
  
  var stack: on | off
  
  var stackLabel: on | off
  
  var styleDefaults: AnimationDownColor
  
  var timeAxisType: enabled | mixedFrequency | skipGaps | disabled | auto
  
  var tooltip: Renderer
  
  var touchResponse: touchStart | auto
  
  @JSName("translations")
  var translations_ojChartSettableProperties: ComponentName
  
  var `type`: line | area | lineWithArea | stock | boxPlot | combo | pie | scatter | bubble | funnel | pyramid | bar
  
  var valueFormats: Close
  
  var xAxis: AxisLine
  
  var y2Axis: AlignTickMarks
  
  var yAxis: BaselineScaling
  
  var zoomAndScroll: delayedScrollOnly | liveScrollOnly | delayed | live | off
  
  var zoomDirection: x | y | auto
}
object ojChartSettableProperties {
  
  inline def apply[K, D](
    animationOnDataChange: auto | slideToLeft | slideToRight | none,
    animationOnDisplay: auto | alphaFade | zoom | none,
    as: String,
    coordinateSystem: polar | cartesian,
    dataCursor: off | on | auto,
    dataCursorBehavior: smooth | snap | auto,
    dataCursorPosition: X,
    dataLabel: DataLabelContext => Insert | PreventDefault,
    dnd: Drag,
    dragMode: pan | zoom | select | off | user,
    drilling: on | seriesOnly | groupsOnly | off,
    hiddenCategories: js.Array[String],
    hideAndShowBehavior: withRescale | withoutRescale | none,
    highlightMatch: any | all,
    highlightedCategories: js.Array[String],
    hoverBehavior: dim | none,
    initialZooming: first | last | none,
    legend: BackgroundColor,
    orientation: horizontal | vertical,
    otherThreshold: Double,
    overview: Content,
    pieCenter: Converter,
    plotArea: BorderWidth,
    polarGridShape: polygon | circle,
    selection: js.Array[K],
    selectionMode: single | multiple | none,
    sorting: ascending | descending | off,
    splitDualY: on | off | auto,
    splitterPosition: Double,
    stack: on | off,
    stackLabel: on | off,
    styleDefaults: AnimationDownColor,
    timeAxisType: enabled | mixedFrequency | skipGaps | disabled | auto,
    tooltip: Renderer,
    touchResponse: touchStart | auto,
    trackResize: on | off,
    translations: ComponentName,
    `type`: line | area | lineWithArea | stock | boxPlot | combo | pie | scatter | bubble | funnel | pyramid | bar,
    valueFormats: Close,
    xAxis: AxisLine,
    y2Axis: AlignTickMarks,
    yAxis: BaselineScaling,
    zoomAndScroll: delayedScrollOnly | liveScrollOnly | delayed | live | off,
    zoomDirection: x | y | auto
  ): ojChartSettableProperties[K, D] = {
    val __obj = js.Dynamic.literal(animationOnDataChange = animationOnDataChange.asInstanceOf[js.Any], animationOnDisplay = animationOnDisplay.asInstanceOf[js.Any], as = as.asInstanceOf[js.Any], coordinateSystem = coordinateSystem.asInstanceOf[js.Any], dataCursor = dataCursor.asInstanceOf[js.Any], dataCursorBehavior = dataCursorBehavior.asInstanceOf[js.Any], dataCursorPosition = dataCursorPosition.asInstanceOf[js.Any], dataLabel = js.Any.fromFunction1(dataLabel), dnd = dnd.asInstanceOf[js.Any], dragMode = dragMode.asInstanceOf[js.Any], drilling = drilling.asInstanceOf[js.Any], hiddenCategories = hiddenCategories.asInstanceOf[js.Any], hideAndShowBehavior = hideAndShowBehavior.asInstanceOf[js.Any], highlightMatch = highlightMatch.asInstanceOf[js.Any], highlightedCategories = highlightedCategories.asInstanceOf[js.Any], hoverBehavior = hoverBehavior.asInstanceOf[js.Any], initialZooming = initialZooming.asInstanceOf[js.Any], legend = legend.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], otherThreshold = otherThreshold.asInstanceOf[js.Any], overview = overview.asInstanceOf[js.Any], pieCenter = pieCenter.asInstanceOf[js.Any], plotArea = plotArea.asInstanceOf[js.Any], polarGridShape = polarGridShape.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any], selectionMode = selectionMode.asInstanceOf[js.Any], sorting = sorting.asInstanceOf[js.Any], splitDualY = splitDualY.asInstanceOf[js.Any], splitterPosition = splitterPosition.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any], stackLabel = stackLabel.asInstanceOf[js.Any], styleDefaults = styleDefaults.asInstanceOf[js.Any], timeAxisType = timeAxisType.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any], touchResponse = touchResponse.asInstanceOf[js.Any], trackResize = trackResize.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any], valueFormats = valueFormats.asInstanceOf[js.Any], xAxis = xAxis.asInstanceOf[js.Any], y2Axis = y2Axis.asInstanceOf[js.Any], yAxis = yAxis.asInstanceOf[js.Any], zoomAndScroll = zoomAndScroll.asInstanceOf[js.Any], zoomDirection = zoomDirection.asInstanceOf[js.Any], data = null, groupComparator = null, seriesComparator = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojChartSettableProperties[K, D]]
  }
  
  extension [Self <: ojChartSettableProperties[?, ?], K, D](x: Self & (ojChartSettableProperties[K, D])) {
    
    inline def setAnimationOnDataChange(value: auto | slideToLeft | slideToRight | none): Self = StObject.set(x, "animationOnDataChange", value.asInstanceOf[js.Any])
    
    inline def setAnimationOnDisplay(value: auto | alphaFade | zoom | none): Self = StObject.set(x, "animationOnDisplay", value.asInstanceOf[js.Any])
    
    inline def setAs(value: String): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    inline def setCoordinateSystem(value: polar | cartesian): Self = StObject.set(x, "coordinateSystem", value.asInstanceOf[js.Any])
    
    inline def setData(value: DataProvider[K, D]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataCursor(value: off | on | auto): Self = StObject.set(x, "dataCursor", value.asInstanceOf[js.Any])
    
    inline def setDataCursorBehavior(value: smooth | snap | auto): Self = StObject.set(x, "dataCursorBehavior", value.asInstanceOf[js.Any])
    
    inline def setDataCursorPosition(value: X): Self = StObject.set(x, "dataCursorPosition", value.asInstanceOf[js.Any])
    
    inline def setDataLabel(value: DataLabelContext => Insert | PreventDefault): Self = StObject.set(x, "dataLabel", js.Any.fromFunction1(value))
    
    inline def setDataNull: Self = StObject.set(x, "data", null)
    
    inline def setDnd(value: Drag): Self = StObject.set(x, "dnd", value.asInstanceOf[js.Any])
    
    inline def setDragMode(value: pan | zoom | select | off | user): Self = StObject.set(x, "dragMode", value.asInstanceOf[js.Any])
    
    inline def setDrilling(value: on | seriesOnly | groupsOnly | off): Self = StObject.set(x, "drilling", value.asInstanceOf[js.Any])
    
    inline def setGroupComparator(value: (/* param0 */ js.Object, /* param1 */ js.Object) => Double): Self = StObject.set(x, "groupComparator", js.Any.fromFunction2(value))
    
    inline def setGroupComparatorNull: Self = StObject.set(x, "groupComparator", null)
    
    inline def setHiddenCategories(value: js.Array[String]): Self = StObject.set(x, "hiddenCategories", value.asInstanceOf[js.Any])
    
    inline def setHiddenCategoriesVarargs(value: String*): Self = StObject.set(x, "hiddenCategories", js.Array(value*))
    
    inline def setHideAndShowBehavior(value: withRescale | withoutRescale | none): Self = StObject.set(x, "hideAndShowBehavior", value.asInstanceOf[js.Any])
    
    inline def setHighlightMatch(value: any | all): Self = StObject.set(x, "highlightMatch", value.asInstanceOf[js.Any])
    
    inline def setHighlightedCategories(value: js.Array[String]): Self = StObject.set(x, "highlightedCategories", value.asInstanceOf[js.Any])
    
    inline def setHighlightedCategoriesVarargs(value: String*): Self = StObject.set(x, "highlightedCategories", js.Array(value*))
    
    inline def setHoverBehavior(value: dim | none): Self = StObject.set(x, "hoverBehavior", value.asInstanceOf[js.Any])
    
    inline def setInitialZooming(value: first | last | none): Self = StObject.set(x, "initialZooming", value.asInstanceOf[js.Any])
    
    inline def setLegend(value: BackgroundColor): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
    
    inline def setOrientation(value: horizontal | vertical): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOtherThreshold(value: Double): Self = StObject.set(x, "otherThreshold", value.asInstanceOf[js.Any])
    
    inline def setOverview(value: Content): Self = StObject.set(x, "overview", value.asInstanceOf[js.Any])
    
    inline def setPieCenter(value: Converter): Self = StObject.set(x, "pieCenter", value.asInstanceOf[js.Any])
    
    inline def setPlotArea(value: BorderWidth): Self = StObject.set(x, "plotArea", value.asInstanceOf[js.Any])
    
    inline def setPolarGridShape(value: polygon | circle): Self = StObject.set(x, "polarGridShape", value.asInstanceOf[js.Any])
    
    inline def setSelection(value: js.Array[K]): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
    
    inline def setSelectionMode(value: single | multiple | none): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
    
    inline def setSelectionVarargs(value: K*): Self = StObject.set(x, "selection", js.Array(value*))
    
    inline def setSeriesComparator(value: (/* param0 */ js.Object, /* param1 */ js.Object) => Double): Self = StObject.set(x, "seriesComparator", js.Any.fromFunction2(value))
    
    inline def setSeriesComparatorNull: Self = StObject.set(x, "seriesComparator", null)
    
    inline def setSorting(value: ascending | descending | off): Self = StObject.set(x, "sorting", value.asInstanceOf[js.Any])
    
    inline def setSplitDualY(value: on | off | auto): Self = StObject.set(x, "splitDualY", value.asInstanceOf[js.Any])
    
    inline def setSplitterPosition(value: Double): Self = StObject.set(x, "splitterPosition", value.asInstanceOf[js.Any])
    
    inline def setStack(value: on | off): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    
    inline def setStackLabel(value: on | off): Self = StObject.set(x, "stackLabel", value.asInstanceOf[js.Any])
    
    inline def setStyleDefaults(value: AnimationDownColor): Self = StObject.set(x, "styleDefaults", value.asInstanceOf[js.Any])
    
    inline def setTimeAxisType(value: enabled | mixedFrequency | skipGaps | disabled | auto): Self = StObject.set(x, "timeAxisType", value.asInstanceOf[js.Any])
    
    inline def setTooltip(value: Renderer): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    inline def setTouchResponse(value: touchStart | auto): Self = StObject.set(x, "touchResponse", value.asInstanceOf[js.Any])
    
    inline def setTranslations(value: ComponentName): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
    
    inline def setType(
      value: line | area | lineWithArea | stock | boxPlot | combo | pie | scatter | bubble | funnel | pyramid | bar
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValueFormats(value: Close): Self = StObject.set(x, "valueFormats", value.asInstanceOf[js.Any])
    
    inline def setXAxis(value: AxisLine): Self = StObject.set(x, "xAxis", value.asInstanceOf[js.Any])
    
    inline def setY2Axis(value: AlignTickMarks): Self = StObject.set(x, "y2Axis", value.asInstanceOf[js.Any])
    
    inline def setYAxis(value: BaselineScaling): Self = StObject.set(x, "yAxis", value.asInstanceOf[js.Any])
    
    inline def setZoomAndScroll(value: delayedScrollOnly | liveScrollOnly | delayed | live | off): Self = StObject.set(x, "zoomAndScroll", value.asInstanceOf[js.Any])
    
    inline def setZoomDirection(value: typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.x | y | auto): Self = StObject.set(x, "zoomDirection", value.asInstanceOf[js.Any])
  }
}
