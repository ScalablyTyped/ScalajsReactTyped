package typingsJapgolly.oracleOraclejet.ojchartMod

import org.scalajs.dom.raw.CustomEvent
import org.scalajs.dom.raw.Element
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
import typingsJapgolly.oracleOraclejet.mod.JetElementCustomEvent
import typingsJapgolly.oracleOraclejet.ojchartMod.ojChart.AxisTitleContext
import typingsJapgolly.oracleOraclejet.ojchartMod.ojChart.DataLabelContext
import typingsJapgolly.oracleOraclejet.ojchartMod.ojChart.GroupContext
import typingsJapgolly.oracleOraclejet.ojchartMod.ojChart.ItemContext
import typingsJapgolly.oracleOraclejet.ojchartMod.ojChart.LegendItemContext
import typingsJapgolly.oracleOraclejet.ojchartMod.ojChart.PieCenterLabelContext
import typingsJapgolly.oracleOraclejet.ojchartMod.ojChart.ReferenceObject
import typingsJapgolly.oracleOraclejet.ojchartMod.ojChart.SeriesContext
import typingsJapgolly.oracleOraclejet.ojdataproviderMod.DataProvider
import typingsJapgolly.oracleOraclejet.ojdvtBaseMod.dvtBaseComponent
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.`type`
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.all
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.alphaFade
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.animationOnDataChange
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.animationOnDataChangeChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.animationOnDisplay
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.animationOnDisplayChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.any
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.area
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.as
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.asChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.ascending
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.auto
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.bar
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.boxPlot
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.bubble
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.cartesian
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.circle
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.combo
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.coordinateSystem
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.coordinateSystemChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.data
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.dataChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.dataCursor
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.dataCursorBehavior
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.dataCursorBehaviorChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.dataCursorChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.dataCursorPosition
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.dataCursorPositionChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.dataLabelChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.delayed
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.delayedScrollOnly
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.descending
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.dim
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.disabled
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.dnd
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.dndChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.dragMode
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.dragModeChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.drilling
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.drillingChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.enabled
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.first
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.funnel
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.groupComparator
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.groupComparatorChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.groupsOnly
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.hiddenCategories
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.hiddenCategoriesChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.hideAndShowBehavior
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.hideAndShowBehaviorChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.highlightMatch
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.highlightMatchChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.highlightedCategories
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.highlightedCategoriesChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.horizontal
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.hoverBehavior
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.hoverBehaviorChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.initialZooming
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.initialZoomingChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.last
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.legend
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.legendChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.line
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.lineWithArea
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.live
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.liveScrollOnly
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.mixedFrequency
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.multiple
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.none
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.off
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.ojDrill
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.ojSelectInput
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.ojViewportChange
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.ojViewportChangeInput
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.on
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.orientation
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.orientationChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.otherThreshold
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.otherThresholdChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.overview
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.overviewChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.pan
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.pie
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.pieCenter
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.pieCenterChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.plotArea
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.plotAreaChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.polar
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.polarGridShape
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.polarGridShapeChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.polygon
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.pyramid
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.scatter
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.select
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.selection
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.selectionChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.selectionMode
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.selectionModeChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.seriesComparator
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.seriesComparatorChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.seriesOnly
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.single
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.skipGaps
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.slideToLeft
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.slideToRight
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.smooth
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.snap
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.sorting
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.sortingChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.splitDualY
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.splitDualYChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.splitterPosition
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.splitterPositionChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.stack
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.stackChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.stackLabel
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.stackLabelChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.stock
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.styleDefaults
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.styleDefaultsChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.timeAxisType
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.timeAxisTypeChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.tooltip
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.tooltipChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.touchResponse
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.touchResponseChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.touchStart
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.translations
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.typeChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.user
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.valueFormats
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.valueFormatsChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.vertical
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.withRescale
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.withoutRescale
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.x
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.xAxis
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.xAxisChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.y
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.y2Axis
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.y2AxisChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.yAxis
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.yAxisChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.zoom
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.zoomAndScroll
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.zoomAndScrollChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.zoomDirection
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.zoomDirectionChanged
import typingsJapgolly.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojChart_[K, D] extends dvtBaseComponent[ojChartSettableProperties[K, D]] {
  var animationOnDataChange: auto | slideToLeft | slideToRight | none = js.native
  var animationOnDisplay: auto | alphaFade | zoom | none = js.native
  var as: String = js.native
  var coordinateSystem: polar | cartesian = js.native
  var data: (DataProvider[K, D]) | Null = js.native
  var dataCursor: off | on | auto = js.native
  var dataCursorBehavior: smooth | snap | auto = js.native
  var dataCursorPosition: AnonX = js.native
  var dnd: AnonDrag = js.native
  var dragMode: pan | zoom | select | off | user = js.native
  var drilling: on | seriesOnly | groupsOnly | off = js.native
  var groupComparator: (js.Function2[/* param0 */ js.Object, /* param1 */ js.Object, Double]) | Null = js.native
  var hiddenCategories: js.Array[String] = js.native
  var hideAndShowBehavior: withRescale | withoutRescale | none = js.native
  var highlightMatch: any | all = js.native
  var highlightedCategories: js.Array[String] = js.native
  var hoverBehavior: dim | none = js.native
  var initialZooming: first | last | none = js.native
  var legend: AnonBackgroundColor = js.native
  var onAnimationOnDataChangeChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onAnimationOnDisplayChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onAsChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onCoordinateSystemChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onDataChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onDataCursorBehaviorChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onDataCursorChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onDataCursorPositionChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onDataLabelChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onDndChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onDragModeChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onDrillingChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onGroupComparatorChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onHiddenCategoriesChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onHideAndShowBehaviorChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onHighlightMatchChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onHighlightedCategoriesChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onHoverBehaviorChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onInitialZoomingChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onLegendChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOjDrill: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOjSelectInput: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOjViewportChange: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOjViewportChangeInput: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOrientationChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOtherThresholdChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOverviewChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onPieCenterChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onPlotAreaChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onPolarGridShapeChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onSelectionChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onSelectionModeChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onSeriesComparatorChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onSortingChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onSplitDualYChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onSplitterPositionChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onStackChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onStackLabelChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onStyleDefaultsChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onTimeAxisTypeChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onTooltipChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onTouchResponseChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onTypeChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onValueFormatsChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onXAxisChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onY2AxisChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onYAxisChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onZoomAndScrollChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onZoomDirectionChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var orientation: horizontal | vertical = js.native
  var otherThreshold: Double = js.native
  var overview: AnonContent = js.native
  var pieCenter: AnonConverter = js.native
  var plotArea: AnonBorderWidth = js.native
  var polarGridShape: polygon | circle = js.native
  var selection: js.Array[K] = js.native
  var selectionMode: single | multiple | none = js.native
  var seriesComparator: (js.Function2[/* param0 */ js.Object, /* param1 */ js.Object, Double]) | Null = js.native
  var sorting: ascending | descending | off = js.native
  var splitDualY: on | off | auto = js.native
  var splitterPosition: Double = js.native
  var stack: on | off = js.native
  var stackLabel: on | off = js.native
  var styleDefaults: AnonAnimationDownColor = js.native
  var timeAxisType: enabled | mixedFrequency | skipGaps | disabled | auto = js.native
  var tooltip: AnonRenderer = js.native
  var touchResponse: touchStart | auto = js.native
  @JSName("translations")
  var translations_ojChart_ : AnonComponentName = js.native
  var `type`: line | area | lineWithArea | stock | boxPlot | combo | pie | scatter | bubble | funnel | pyramid | bar = js.native
  var valueFormats: AnonClose = js.native
  var xAxis: AnonAxisLine = js.native
  var y2Axis: AnonAlignTickMarks = js.native
  var yAxis: AnonBaselineScaling = js.native
  var zoomAndScroll: delayedScrollOnly | liveScrollOnly | delayed | live | off = js.native
  var zoomDirection: x | y | auto = js.native
  def addEventListener(
    `type`: animationOnDataChangeChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[auto | slideToLeft | slideToRight | none], 
      _
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: animationOnDataChangeChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[auto | slideToLeft | slideToRight | none], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: animationOnDisplayChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[auto | alphaFade | zoom | none], 
      _
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: animationOnDisplayChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[auto | alphaFade | zoom | none], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: coordinateSystemChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[polar | cartesian], _]
  ): Unit = js.native
  def addEventListener(
    `type`: coordinateSystemChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[polar | cartesian], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: dataCursorBehaviorChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[smooth | snap | auto], _]
  ): Unit = js.native
  def addEventListener(
    `type`: dataCursorBehaviorChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[smooth | snap | auto], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: dataCursorChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[off | on | auto], _]
  ): Unit = js.native
  def addEventListener(
    `type`: dataCursorChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[off | on | auto], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: dragModeChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[pan | zoom | select | off | user], 
      _
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: dragModeChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[pan | zoom | select | off | user], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: drillingChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[on | seriesOnly | groupsOnly | off], 
      _
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: drillingChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[on | seriesOnly | groupsOnly | off], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: hideAndShowBehaviorChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[withRescale | withoutRescale | none], 
      _
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: hideAndShowBehaviorChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[withRescale | withoutRescale | none], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: highlightMatchChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[any | all], _]
  ): Unit = js.native
  def addEventListener(
    `type`: highlightMatchChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[any | all], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: hoverBehaviorChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[dim | none], _]
  ): Unit = js.native
  def addEventListener(
    `type`: hoverBehaviorChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[dim | none], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: initialZoomingChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[first | last | none], _]
  ): Unit = js.native
  def addEventListener(
    `type`: initialZoomingChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[first | last | none], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: orientationChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[horizontal | vertical], _]
  ): Unit = js.native
  def addEventListener(
    `type`: orientationChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[horizontal | vertical], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: polarGridShapeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[polygon | circle], _]
  ): Unit = js.native
  def addEventListener(
    `type`: polarGridShapeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[polygon | circle], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: selectionModeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[single | multiple | none], _]
  ): Unit = js.native
  def addEventListener(
    `type`: selectionModeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[single | multiple | none], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: sortingChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[ascending | descending | off], 
      _
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: sortingChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[ascending | descending | off], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: splitDualYChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[on | off | auto], _]
  ): Unit = js.native
  def addEventListener(
    `type`: splitDualYChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[on | off | auto], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: stackChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[on | off], _]
  ): Unit = js.native
  def addEventListener(
    `type`: stackChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[on | off], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: stackLabelChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[on | off], _]
  ): Unit = js.native
  def addEventListener(
    `type`: stackLabelChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[on | off], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: timeAxisTypeChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[enabled | mixedFrequency | skipGaps | disabled | auto], 
      _
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: timeAxisTypeChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[enabled | mixedFrequency | skipGaps | disabled | auto], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: touchResponseChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[touchStart | auto], _]
  ): Unit = js.native
  def addEventListener(
    `type`: touchResponseChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[touchStart | auto], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: typeChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[
        line | area | lineWithArea | stock | boxPlot | combo | pie | scatter | bubble | funnel | pyramid | bar
      ], 
      _
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: typeChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[
        line | area | lineWithArea | stock | boxPlot | combo | pie | scatter | bubble | funnel | pyramid | bar
      ], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: zoomAndScrollChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[delayedScrollOnly | liveScrollOnly | delayed | live | off], 
      _
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: zoomAndScrollChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[delayedScrollOnly | liveScrollOnly | delayed | live | off], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: zoomDirectionChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[x | y | auto], _]
  ): Unit = js.native
  def addEventListener(
    `type`: zoomDirectionChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[x | y | auto], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_asChanged(
    `type`: asChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_asChanged(
    `type`: asChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dataChanged(
    `type`: dataChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dataChanged(
    `type`: dataChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dataCursorPositionChanged(
    `type`: dataCursorPositionChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dataCursorPositionChanged(
    `type`: dataCursorPositionChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dataLabelChanged(
    `type`: dataLabelChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dataLabelChanged(
    `type`: dataLabelChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dndChanged(
    `type`: dndChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dndChanged(
    `type`: dndChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_groupComparatorChanged(
    `type`: groupComparatorChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_groupComparatorChanged(
    `type`: groupComparatorChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_hiddenCategoriesChanged(
    `type`: hiddenCategoriesChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_hiddenCategoriesChanged(
    `type`: hiddenCategoriesChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_highlightedCategoriesChanged(
    `type`: highlightedCategoriesChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_highlightedCategoriesChanged(
    `type`: highlightedCategoriesChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_legendChanged(
    `type`: legendChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_legendChanged(
    `type`: legendChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojDrill(
    `type`: ojDrill,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojDrill(
    `type`: ojDrill,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojSelectInput(
    `type`: ojSelectInput,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojSelectInput(
    `type`: ojSelectInput,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojViewportChange(
    `type`: ojViewportChange,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojViewportChange(
    `type`: ojViewportChange,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojViewportChangeInput(
    `type`: ojViewportChangeInput,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojViewportChangeInput(
    `type`: ojViewportChangeInput,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_otherThresholdChanged(
    `type`: otherThresholdChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_otherThresholdChanged(
    `type`: otherThresholdChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_overviewChanged(
    `type`: overviewChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_overviewChanged(
    `type`: overviewChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pieCenterChanged(
    `type`: pieCenterChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pieCenterChanged(
    `type`: pieCenterChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_plotAreaChanged(
    `type`: plotAreaChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_plotAreaChanged(
    `type`: plotAreaChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionChanged(
    `type`: selectionChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionChanged(
    `type`: selectionChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_seriesComparatorChanged(
    `type`: seriesComparatorChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_seriesComparatorChanged(
    `type`: seriesComparatorChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_splitterPositionChanged(
    `type`: splitterPositionChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_splitterPositionChanged(
    `type`: splitterPositionChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_styleDefaultsChanged(
    `type`: styleDefaultsChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_styleDefaultsChanged(
    `type`: styleDefaultsChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_tooltipChanged(
    `type`: tooltipChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_tooltipChanged(
    `type`: tooltipChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_valueFormatsChanged(
    `type`: valueFormatsChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_valueFormatsChanged(
    `type`: valueFormatsChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_xAxisChanged(
    `type`: xAxisChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_xAxisChanged(
    `type`: xAxisChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_y2AxisChanged(
    `type`: y2AxisChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_y2AxisChanged(
    `type`: y2AxisChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_yAxisChanged(
    `type`: yAxisChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_yAxisChanged(
    `type`: yAxisChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  def dataLabel(context: DataLabelContext): AnonInsert | AnonPreventDefault = js.native
  def getContextByNode(node: Element): PieCenterLabelContext | LegendItemContext | ReferenceObject | GroupContext | AxisTitleContext | ItemContext | SeriesContext = js.native
  def getDataItem(seriesIndex: Double, groupIndex: Double): js.Object | Null = js.native
  def getGroup(groupIndex: String): String = js.native
  def getGroupCount(): Double = js.native
  def getLegend(): js.Object = js.native
  def getPlotArea(): js.Object = js.native
  @JSName("getProperty")
  def getProperty_animationOnDataChange(property: animationOnDataChange): auto | slideToLeft | slideToRight | none = js.native
  @JSName("getProperty")
  def getProperty_animationOnDisplay(property: animationOnDisplay): auto | alphaFade | zoom | none = js.native
  @JSName("getProperty")
  def getProperty_as(property: as): String = js.native
  @JSName("getProperty")
  def getProperty_coordinateSystem(property: coordinateSystem): polar | cartesian = js.native
  @JSName("getProperty")
  def getProperty_data(property: data): (DataProvider[K, D]) | Null = js.native
  @JSName("getProperty")
  def getProperty_dataCursor(property: dataCursor): off | on | auto = js.native
  @JSName("getProperty")
  def getProperty_dataCursorBehavior(property: dataCursorBehavior): smooth | snap | auto = js.native
  @JSName("getProperty")
  def getProperty_dataCursorPosition(property: dataCursorPosition): AnonX = js.native
  @JSName("getProperty")
  def getProperty_dnd(property: dnd): AnonDrag = js.native
  @JSName("getProperty")
  def getProperty_dragMode(property: dragMode): pan | zoom | select | off | user = js.native
  @JSName("getProperty")
  def getProperty_drilling(property: drilling): on | seriesOnly | groupsOnly | off = js.native
  @JSName("getProperty")
  def getProperty_groupComparator(property: groupComparator): (js.Function2[/* param0 */ js.Object, /* param1 */ js.Object, Double]) | Null = js.native
  @JSName("getProperty")
  def getProperty_hiddenCategories(property: hiddenCategories): js.Array[String] = js.native
  @JSName("getProperty")
  def getProperty_hideAndShowBehavior(property: hideAndShowBehavior): withRescale | withoutRescale | none = js.native
  @JSName("getProperty")
  def getProperty_highlightMatch(property: highlightMatch): any | all = js.native
  @JSName("getProperty")
  def getProperty_highlightedCategories(property: highlightedCategories): js.Array[String] = js.native
  @JSName("getProperty")
  def getProperty_hoverBehavior(property: hoverBehavior): dim | none = js.native
  @JSName("getProperty")
  def getProperty_initialZooming(property: initialZooming): first | last | none = js.native
  @JSName("getProperty")
  def getProperty_legend(property: legend): AnonBackgroundColor = js.native
  @JSName("getProperty")
  def getProperty_orientation(property: orientation): horizontal | vertical = js.native
  @JSName("getProperty")
  def getProperty_otherThreshold(property: otherThreshold): Double = js.native
  @JSName("getProperty")
  def getProperty_overview(property: overview): AnonContent = js.native
  @JSName("getProperty")
  def getProperty_pieCenter(property: pieCenter): AnonConverter = js.native
  @JSName("getProperty")
  def getProperty_plotArea(property: plotArea): AnonBorderWidth = js.native
  @JSName("getProperty")
  def getProperty_polarGridShape(property: polarGridShape): polygon | circle = js.native
  @JSName("getProperty")
  def getProperty_selection(property: selection): js.Array[K] = js.native
  @JSName("getProperty")
  def getProperty_selectionMode(property: selectionMode): single | multiple | none = js.native
  @JSName("getProperty")
  def getProperty_seriesComparator(property: seriesComparator): (js.Function2[/* param0 */ js.Object, /* param1 */ js.Object, Double]) | Null = js.native
  @JSName("getProperty")
  def getProperty_sorting(property: sorting): ascending | descending | off = js.native
  @JSName("getProperty")
  def getProperty_splitDualY(property: splitDualY): on | off | auto = js.native
  @JSName("getProperty")
  def getProperty_splitterPosition(property: splitterPosition): Double = js.native
  @JSName("getProperty")
  def getProperty_stack(property: stack): on | off = js.native
  @JSName("getProperty")
  def getProperty_stackLabel(property: stackLabel): on | off = js.native
  @JSName("getProperty")
  def getProperty_styleDefaults(property: styleDefaults): AnonAnimationDownColor = js.native
  @JSName("getProperty")
  def getProperty_timeAxisType(property: timeAxisType): enabled | mixedFrequency | skipGaps | disabled | auto = js.native
  @JSName("getProperty")
  def getProperty_tooltip(property: tooltip): AnonRenderer = js.native
  @JSName("getProperty")
  def getProperty_touchResponse(property: touchResponse): touchStart | auto = js.native
  @JSName("getProperty")
  def getProperty_type(property: `type`): line | area | lineWithArea | stock | boxPlot | combo | pie | scatter | bubble | funnel | pyramid | bar = js.native
  @JSName("getProperty")
  def getProperty_valueFormats(property: valueFormats): AnonClose = js.native
  @JSName("getProperty")
  def getProperty_xAxis(property: xAxis): AnonAxisLine = js.native
  @JSName("getProperty")
  def getProperty_y2Axis(property: y2Axis): AnonAlignTickMarks = js.native
  @JSName("getProperty")
  def getProperty_yAxis(property: yAxis): AnonBaselineScaling = js.native
  @JSName("getProperty")
  def getProperty_zoomAndScroll(property: zoomAndScroll): delayedScrollOnly | liveScrollOnly | delayed | live | off = js.native
  @JSName("getProperty")
  def getProperty_zoomDirection(property: zoomDirection): x | y | auto = js.native
  def getSeries(seriesIndex: String): String = js.native
  def getSeriesCount(): Double = js.native
  def getValuesAt(x: Double, y: Double): js.Object = js.native
  def getXAxis(): js.Object = js.native
  def getY2Axis(): js.Object = js.native
  def getYAxis(): js.Object = js.native
  def setProperties(properties: ojChartSettablePropertiesLenient[K, D]): Unit = js.native
  def setProperty(
    property: `type`,
    value: line | area | lineWithArea | stock | boxPlot | combo | pie | scatter | bubble | funnel | pyramid | bar
  ): Unit = js.native
  def setProperty(property: animationOnDataChange, value: auto): Unit = js.native
  def setProperty(property: animationOnDataChange, value: none): Unit = js.native
  def setProperty(property: animationOnDataChange, value: slideToLeft): Unit = js.native
  def setProperty(property: animationOnDataChange, value: slideToRight): Unit = js.native
  def setProperty(property: animationOnDisplay, value: alphaFade): Unit = js.native
  def setProperty(property: animationOnDisplay, value: auto): Unit = js.native
  def setProperty(property: animationOnDisplay, value: none): Unit = js.native
  def setProperty(property: animationOnDisplay, value: zoom): Unit = js.native
  def setProperty(property: coordinateSystem, value: cartesian): Unit = js.native
  def setProperty(property: coordinateSystem, value: polar): Unit = js.native
  def setProperty(property: dataCursorBehavior, value: auto): Unit = js.native
  def setProperty(property: dataCursorBehavior, value: smooth): Unit = js.native
  def setProperty(property: dataCursorBehavior, value: snap): Unit = js.native
  def setProperty(property: dataCursor, value: auto): Unit = js.native
  def setProperty(property: dataCursor, value: off): Unit = js.native
  def setProperty(property: dataCursor, value: on): Unit = js.native
  def setProperty(property: dragMode, value: off): Unit = js.native
  def setProperty(property: dragMode, value: pan): Unit = js.native
  def setProperty(property: dragMode, value: select): Unit = js.native
  def setProperty(property: dragMode, value: user): Unit = js.native
  def setProperty(property: dragMode, value: zoom): Unit = js.native
  def setProperty(property: drilling, value: groupsOnly): Unit = js.native
  def setProperty(property: drilling, value: off): Unit = js.native
  def setProperty(property: drilling, value: on): Unit = js.native
  def setProperty(property: drilling, value: seriesOnly): Unit = js.native
  def setProperty(property: hideAndShowBehavior, value: none): Unit = js.native
  def setProperty(property: hideAndShowBehavior, value: withRescale): Unit = js.native
  def setProperty(property: hideAndShowBehavior, value: withoutRescale): Unit = js.native
  def setProperty(property: highlightMatch, value: all): Unit = js.native
  def setProperty(property: highlightMatch, value: any): Unit = js.native
  def setProperty(property: hoverBehavior, value: dim): Unit = js.native
  def setProperty(property: hoverBehavior, value: none): Unit = js.native
  def setProperty(property: initialZooming, value: first): Unit = js.native
  def setProperty(property: initialZooming, value: last): Unit = js.native
  def setProperty(property: initialZooming, value: none): Unit = js.native
  def setProperty(property: orientation, value: horizontal): Unit = js.native
  def setProperty(property: orientation, value: vertical): Unit = js.native
  def setProperty(property: polarGridShape, value: circle): Unit = js.native
  def setProperty(property: polarGridShape, value: polygon): Unit = js.native
  def setProperty(property: selectionMode, value: multiple): Unit = js.native
  def setProperty(property: selectionMode, value: none): Unit = js.native
  def setProperty(property: selectionMode, value: single): Unit = js.native
  def setProperty(property: sorting, value: ascending): Unit = js.native
  def setProperty(property: sorting, value: descending): Unit = js.native
  def setProperty(property: sorting, value: off): Unit = js.native
  def setProperty(property: splitDualY, value: auto): Unit = js.native
  def setProperty(property: splitDualY, value: off): Unit = js.native
  def setProperty(property: splitDualY, value: on): Unit = js.native
  def setProperty(property: stackLabel, value: off): Unit = js.native
  def setProperty(property: stackLabel, value: on): Unit = js.native
  def setProperty(property: stack, value: off): Unit = js.native
  def setProperty(property: stack, value: on): Unit = js.native
  def setProperty(property: timeAxisType, value: auto): Unit = js.native
  def setProperty(property: timeAxisType, value: disabled): Unit = js.native
  def setProperty(property: timeAxisType, value: enabled): Unit = js.native
  def setProperty(property: timeAxisType, value: mixedFrequency): Unit = js.native
  def setProperty(property: timeAxisType, value: skipGaps): Unit = js.native
  def setProperty(property: touchResponse, value: auto): Unit = js.native
  def setProperty(property: touchResponse, value: touchStart): Unit = js.native
  def setProperty(property: zoomAndScroll, value: delayed): Unit = js.native
  def setProperty(property: zoomAndScroll, value: delayedScrollOnly): Unit = js.native
  def setProperty(property: zoomAndScroll, value: live): Unit = js.native
  def setProperty(property: zoomAndScroll, value: liveScrollOnly): Unit = js.native
  def setProperty(property: zoomAndScroll, value: off): Unit = js.native
  def setProperty(property: zoomDirection, value: auto): Unit = js.native
  def setProperty(property: zoomDirection, value: x): Unit = js.native
  def setProperty(property: zoomDirection, value: y): Unit = js.native
  @JSName("setProperty")
  def setProperty_as(property: as, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_data(property: data): Unit = js.native
  @JSName("setProperty")
  def setProperty_data(property: data, value: DataProvider[K, D]): Unit = js.native
  @JSName("setProperty")
  def setProperty_dataCursorPosition(property: dataCursorPosition, value: AnonX): Unit = js.native
  @JSName("setProperty")
  def setProperty_dnd(property: dnd, value: AnonDrag): Unit = js.native
  @JSName("setProperty")
  def setProperty_groupComparator(property: groupComparator): Unit = js.native
  @JSName("setProperty")
  def setProperty_groupComparator(
    property: groupComparator,
    value: js.Function2[/* param0 */ js.Object, /* param1 */ js.Object, Double]
  ): Unit = js.native
  @JSName("setProperty")
  def setProperty_hiddenCategories(property: hiddenCategories, value: js.Array[String]): Unit = js.native
  @JSName("setProperty")
  def setProperty_highlightedCategories(property: highlightedCategories, value: js.Array[String]): Unit = js.native
  @JSName("setProperty")
  def setProperty_legend(property: legend, value: AnonBackgroundColor): Unit = js.native
  @JSName("setProperty")
  def setProperty_otherThreshold(property: otherThreshold, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_overview(property: overview, value: AnonContent): Unit = js.native
  @JSName("setProperty")
  def setProperty_pieCenter(property: pieCenter, value: AnonConverter): Unit = js.native
  @JSName("setProperty")
  def setProperty_plotArea(property: plotArea, value: AnonBorderWidth): Unit = js.native
  @JSName("setProperty")
  def setProperty_selection(property: selection, value: js.Array[K]): Unit = js.native
  @JSName("setProperty")
  def setProperty_seriesComparator(property: seriesComparator): Unit = js.native
  @JSName("setProperty")
  def setProperty_seriesComparator(
    property: seriesComparator,
    value: js.Function2[/* param0 */ js.Object, /* param1 */ js.Object, Double]
  ): Unit = js.native
  @JSName("setProperty")
  def setProperty_splitterPosition(property: splitterPosition, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_styleDefaults(property: styleDefaults, value: AnonAnimationDownColor): Unit = js.native
  @JSName("setProperty")
  def setProperty_tooltip(property: tooltip, value: AnonRenderer): Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(property: translations, value: AnonComponentName): Unit = js.native
  @JSName("setProperty")
  def setProperty_valueFormats(property: valueFormats, value: AnonClose): Unit = js.native
  @JSName("setProperty")
  def setProperty_xAxis(property: xAxis, value: AnonAxisLine): Unit = js.native
  @JSName("setProperty")
  def setProperty_y2Axis(property: y2Axis, value: AnonAlignTickMarks): Unit = js.native
  @JSName("setProperty")
  def setProperty_yAxis(property: yAxis, value: AnonBaselineScaling): Unit = js.native
}

