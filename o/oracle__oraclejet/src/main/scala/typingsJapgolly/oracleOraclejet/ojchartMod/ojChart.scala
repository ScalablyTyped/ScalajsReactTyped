package typingsJapgolly.oracleOraclejet.ojchartMod

import org.scalajs.dom.CustomEvent
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ojChart[K, D]
  extends StObject
     with dvtBaseComponent[ojChartSettableProperties[K, D]] {
  
  def addEventListener(
    `type`: animationOnDataChangeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]
  ): Unit = js.native
  def addEventListener(
    `type`: animationOnDataChangeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: animationOnDisplayChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]
  ): Unit = js.native
  def addEventListener(
    `type`: animationOnDisplayChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: coordinateSystemChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]
  ): Unit = js.native
  def addEventListener(
    `type`: coordinateSystemChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: dataCursorBehaviorChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]
  ): Unit = js.native
  def addEventListener(
    `type`: dataCursorBehaviorChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(`type`: dataCursorChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
  def addEventListener(
    `type`: dataCursorChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(`type`: dragModeChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
  def addEventListener(
    `type`: dragModeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(`type`: drillingChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
  def addEventListener(
    `type`: drillingChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: hideAndShowBehaviorChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]
  ): Unit = js.native
  def addEventListener(
    `type`: hideAndShowBehaviorChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: highlightMatchChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]
  ): Unit = js.native
  def addEventListener(
    `type`: highlightMatchChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(`type`: hoverBehaviorChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
  def addEventListener(
    `type`: hoverBehaviorChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: initialZoomingChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]
  ): Unit = js.native
  def addEventListener(
    `type`: initialZoomingChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(`type`: orientationChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
  def addEventListener(
    `type`: orientationChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: polarGridShapeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]
  ): Unit = js.native
  def addEventListener(
    `type`: polarGridShapeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(`type`: selectionModeChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
  def addEventListener(
    `type`: selectionModeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(`type`: sortingChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
  def addEventListener(
    `type`: sortingChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(`type`: splitDualYChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
  def addEventListener(
    `type`: splitDualYChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(`type`: stackChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
  def addEventListener(
    `type`: stackChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(`type`: stackLabelChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
  def addEventListener(
    `type`: stackLabelChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(`type`: timeAxisTypeChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
  def addEventListener(
    `type`: timeAxisTypeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(`type`: touchResponseChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
  def addEventListener(
    `type`: touchResponseChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(`type`: typeChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
  def addEventListener(
    `type`: typeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(`type`: zoomAndScrollChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
  def addEventListener(
    `type`: zoomAndScrollChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(`type`: zoomDirectionChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
  def addEventListener(
    `type`: zoomDirectionChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_asChanged(`type`: asChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_asChanged(
    `type`: asChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dataChanged(`type`: dataChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dataChanged(
    `type`: dataChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dataCursorPositionChanged(
    `type`: dataCursorPositionChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dataCursorPositionChanged(
    `type`: dataCursorPositionChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dataLabelChanged(`type`: dataLabelChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dataLabelChanged(
    `type`: dataLabelChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dndChanged(`type`: dndChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dndChanged(
    `type`: dndChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_groupComparatorChanged(
    `type`: groupComparatorChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_groupComparatorChanged(
    `type`: groupComparatorChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_hiddenCategoriesChanged(
    `type`: hiddenCategoriesChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_hiddenCategoriesChanged(
    `type`: hiddenCategoriesChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_highlightedCategoriesChanged(
    `type`: highlightedCategoriesChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_highlightedCategoriesChanged(
    `type`: highlightedCategoriesChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_legendChanged(`type`: legendChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_legendChanged(
    `type`: legendChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojDrill(`type`: ojDrill, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojDrill(
    `type`: ojDrill,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojSelectInput(`type`: ojSelectInput, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojSelectInput(
    `type`: ojSelectInput,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojViewportChange(`type`: ojViewportChange, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojViewportChange(
    `type`: ojViewportChange,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojViewportChangeInput(
    `type`: ojViewportChangeInput,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojViewportChangeInput(
    `type`: ojViewportChangeInput,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_otherThresholdChanged(
    `type`: otherThresholdChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_otherThresholdChanged(
    `type`: otherThresholdChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_overviewChanged(`type`: overviewChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_overviewChanged(
    `type`: overviewChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pieCenterChanged(`type`: pieCenterChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pieCenterChanged(
    `type`: pieCenterChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_plotAreaChanged(`type`: plotAreaChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_plotAreaChanged(
    `type`: plotAreaChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionChanged(`type`: selectionChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionChanged(
    `type`: selectionChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_seriesComparatorChanged(
    `type`: seriesComparatorChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_seriesComparatorChanged(
    `type`: seriesComparatorChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_splitterPositionChanged(
    `type`: splitterPositionChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_splitterPositionChanged(
    `type`: splitterPositionChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_styleDefaultsChanged(`type`: styleDefaultsChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_styleDefaultsChanged(
    `type`: styleDefaultsChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_tooltipChanged(`type`: tooltipChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_tooltipChanged(
    `type`: tooltipChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_valueFormatsChanged(`type`: valueFormatsChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_valueFormatsChanged(
    `type`: valueFormatsChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_xAxisChanged(`type`: xAxisChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_xAxisChanged(
    `type`: xAxisChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_y2AxisChanged(`type`: y2AxisChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_y2AxisChanged(
    `type`: y2AxisChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_yAxisChanged(`type`: yAxisChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_yAxisChanged(
    `type`: yAxisChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  
  var animationOnDataChange: auto | slideToLeft | slideToRight | none = js.native
  
  var animationOnDisplay: auto | alphaFade | zoom | none = js.native
  
  var as: String = js.native
  
  var coordinateSystem: polar | cartesian = js.native
  
  var data: (DataProvider[K, D]) | Null = js.native
  
  var dataCursor: off | on | auto = js.native
  
  var dataCursorBehavior: smooth | snap | auto = js.native
  
  var dataCursorPosition: X = js.native
  
  def dataLabel(context: DataLabelContext): Insert | PreventDefault = js.native
  
  var dnd: Drag = js.native
  
  var dragMode: pan | zoom | select | off | user = js.native
  
  var drilling: on | seriesOnly | groupsOnly | off = js.native
  
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
  def getProperty_dataCursorPosition(property: dataCursorPosition): X = js.native
  @JSName("getProperty")
  def getProperty_dnd(property: dnd): Drag = js.native
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
  def getProperty_legend(property: legend): BackgroundColor = js.native
  @JSName("getProperty")
  def getProperty_orientation(property: orientation): horizontal | vertical = js.native
  @JSName("getProperty")
  def getProperty_otherThreshold(property: otherThreshold): Double = js.native
  @JSName("getProperty")
  def getProperty_overview(property: overview): Content = js.native
  @JSName("getProperty")
  def getProperty_pieCenter(property: pieCenter): Converter = js.native
  @JSName("getProperty")
  def getProperty_plotArea(property: plotArea): BorderWidth = js.native
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
  def getProperty_styleDefaults(property: styleDefaults): AnimationDownColor = js.native
  @JSName("getProperty")
  def getProperty_timeAxisType(property: timeAxisType): enabled | mixedFrequency | skipGaps | disabled | auto = js.native
  @JSName("getProperty")
  def getProperty_tooltip(property: tooltip): Renderer = js.native
  @JSName("getProperty")
  def getProperty_touchResponse(property: touchResponse): touchStart | auto = js.native
  @JSName("getProperty")
  def getProperty_type(property: `type`): line | area | lineWithArea | stock | boxPlot | combo | pie | scatter | bubble | funnel | pyramid | bar = js.native
  @JSName("getProperty")
  def getProperty_valueFormats(property: valueFormats): Close = js.native
  @JSName("getProperty")
  def getProperty_xAxis(property: xAxis): AxisLine = js.native
  @JSName("getProperty")
  def getProperty_y2Axis(property: y2Axis): AlignTickMarks = js.native
  @JSName("getProperty")
  def getProperty_yAxis(property: yAxis): BaselineScaling = js.native
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
  
  var groupComparator: (js.Function2[/* param0 */ js.Object, /* param1 */ js.Object, Double]) | Null = js.native
  
  var hiddenCategories: js.Array[String] = js.native
  
  var hideAndShowBehavior: withRescale | withoutRescale | none = js.native
  
  var highlightMatch: any | all = js.native
  
  var highlightedCategories: js.Array[String] = js.native
  
  var hoverBehavior: dim | none = js.native
  
  var initialZooming: first | last | none = js.native
  
  var legend: BackgroundColor = js.native
  
  var onAnimationOnDataChangeChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onAnimationOnDisplayChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onAsChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onCoordinateSystemChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onDataChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onDataCursorBehaviorChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onDataCursorChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onDataCursorPositionChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onDataLabelChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onDndChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onDragModeChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onDrillingChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onGroupComparatorChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onHiddenCategoriesChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onHideAndShowBehaviorChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onHighlightMatchChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onHighlightedCategoriesChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onHoverBehaviorChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onInitialZoomingChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onLegendChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onOjDrill: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onOjSelectInput: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onOjViewportChange: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onOjViewportChangeInput: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onOrientationChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onOtherThresholdChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onOverviewChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onPieCenterChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onPlotAreaChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onPolarGridShapeChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onSelectionChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onSelectionModeChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onSeriesComparatorChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onSortingChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onSplitDualYChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onSplitterPositionChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onStackChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onStackLabelChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onStyleDefaultsChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onTimeAxisTypeChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onTooltipChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onTouchResponseChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onTypeChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onValueFormatsChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onXAxisChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onY2AxisChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onYAxisChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onZoomAndScrollChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onZoomDirectionChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var orientation: horizontal | vertical = js.native
  
  var otherThreshold: Double = js.native
  
  var overview: Content = js.native
  
  var pieCenter: Converter = js.native
  
  var plotArea: BorderWidth = js.native
  
  var polarGridShape: polygon | circle = js.native
  
  var selection: js.Array[K] = js.native
  
  var selectionMode: single | multiple | none = js.native
  
  var seriesComparator: (js.Function2[/* param0 */ js.Object, /* param1 */ js.Object, Double]) | Null = js.native
  
  def setProperties(properties: ojChartSettablePropertiesLenient[K, D]): Unit = js.native
  
  def setProperty(
    property: `type`,
    value: line | area | lineWithArea | stock | boxPlot | combo | pie | scatter | bubble | funnel | pyramid | bar
  ): Unit = js.native
  def setProperty(property: animationOnDataChange, value: auto | slideToLeft | slideToRight | none): Unit = js.native
  def setProperty(property: animationOnDisplay, value: auto | alphaFade | zoom | none): Unit = js.native
  def setProperty(property: coordinateSystem, value: polar | cartesian): Unit = js.native
  def setProperty(property: dataCursorBehavior, value: smooth | snap | auto): Unit = js.native
  def setProperty(property: dataCursor, value: off | on | auto): Unit = js.native
  def setProperty(property: dragMode, value: pan | zoom | select | off | user): Unit = js.native
  def setProperty(property: drilling, value: on | seriesOnly | groupsOnly | off): Unit = js.native
  def setProperty(property: hideAndShowBehavior, value: withRescale | withoutRescale | none): Unit = js.native
  def setProperty(property: highlightMatch, value: any | all): Unit = js.native
  def setProperty(property: hoverBehavior, value: dim | none): Unit = js.native
  def setProperty(property: initialZooming, value: first | last | none): Unit = js.native
  def setProperty(property: orientation, value: horizontal | vertical): Unit = js.native
  def setProperty(property: polarGridShape, value: polygon | circle): Unit = js.native
  def setProperty(property: selectionMode, value: single | multiple | none): Unit = js.native
  def setProperty(property: sorting, value: ascending | descending | off): Unit = js.native
  def setProperty(property: splitDualY, value: on | off | auto): Unit = js.native
  def setProperty(property: stackLabel, value: on | off): Unit = js.native
  def setProperty(property: stack, value: on | off): Unit = js.native
  def setProperty(property: timeAxisType, value: enabled | mixedFrequency | skipGaps | disabled | auto): Unit = js.native
  def setProperty(property: touchResponse, value: touchStart | auto): Unit = js.native
  def setProperty(property: zoomAndScroll, value: delayedScrollOnly | liveScrollOnly | delayed | live | off): Unit = js.native
  def setProperty(property: zoomDirection, value: x | y | auto): Unit = js.native
  @JSName("setProperty")
  def setProperty_as(property: as, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_data(property: data): Unit = js.native
  @JSName("setProperty")
  def setProperty_data(property: data, value: DataProvider[K, D]): Unit = js.native
  @JSName("setProperty")
  def setProperty_dataCursorPosition(property: dataCursorPosition, value: X): Unit = js.native
  @JSName("setProperty")
  def setProperty_dnd(property: dnd, value: Drag): Unit = js.native
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
  def setProperty_legend(property: legend, value: BackgroundColor): Unit = js.native
  @JSName("setProperty")
  def setProperty_otherThreshold(property: otherThreshold, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_overview(property: overview, value: Content): Unit = js.native
  @JSName("setProperty")
  def setProperty_pieCenter(property: pieCenter, value: Converter): Unit = js.native
  @JSName("setProperty")
  def setProperty_plotArea(property: plotArea, value: BorderWidth): Unit = js.native
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
  def setProperty_styleDefaults(property: styleDefaults, value: AnimationDownColor): Unit = js.native
  @JSName("setProperty")
  def setProperty_tooltip(property: tooltip, value: Renderer): Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(property: translations, value: ComponentName): Unit = js.native
  @JSName("setProperty")
  def setProperty_valueFormats(property: valueFormats, value: Close): Unit = js.native
  @JSName("setProperty")
  def setProperty_xAxis(property: xAxis, value: AxisLine): Unit = js.native
  @JSName("setProperty")
  def setProperty_y2Axis(property: y2Axis, value: AlignTickMarks): Unit = js.native
  @JSName("setProperty")
  def setProperty_yAxis(property: yAxis, value: BaselineScaling): Unit = js.native
  
  var sorting: ascending | descending | off = js.native
  
  var splitDualY: on | off | auto = js.native
  
  var splitterPosition: Double = js.native
  
  var stack: on | off = js.native
  
  var stackLabel: on | off = js.native
  
  var styleDefaults: AnimationDownColor = js.native
  
  var timeAxisType: enabled | mixedFrequency | skipGaps | disabled | auto = js.native
  
  var tooltip: Renderer = js.native
  
  var touchResponse: touchStart | auto = js.native
  
  @JSName("translations")
  var translations_ojChart: ComponentName = js.native
  
  var `type`: line | area | lineWithArea | stock | boxPlot | combo | pie | scatter | bubble | funnel | pyramid | bar = js.native
  
  var valueFormats: Close = js.native
  
  var xAxis: AxisLine = js.native
  
  var y2Axis: AlignTickMarks = js.native
  
  var yAxis: BaselineScaling = js.native
  
  var zoomAndScroll: delayedScrollOnly | liveScrollOnly | delayed | live | off = js.native
  
  var zoomDirection: x | y | auto = js.native
}
object ojChart {
  
  // tslint:disable-next-line interface-over-type-literal
  trait AxisTitleContext extends StObject {
    
    var axis: xAxis | yAxis | y2Axis
    
    var subId: String
  }
  object AxisTitleContext {
    
    inline def apply(axis: xAxis | yAxis | y2Axis, subId: String): AxisTitleContext = {
      val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], subId = subId.asInstanceOf[js.Any])
      __obj.asInstanceOf[AxisTitleContext]
    }
    
    extension [Self <: AxisTitleContext](x: Self) {
      
      inline def setAxis(value: xAxis | yAxis | y2Axis): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
      
      inline def setSubId(value: String): Self = StObject.set(x, "subId", value.asInstanceOf[js.Any])
    }
  }
  
  // tslint:disable-next-line interface-over-type-literal
  trait DataLabelContext extends StObject {
    
    var close: Double
    
    var componentElement: Element
    
    var data: js.Object | Null
    
    var group: String | js.Array[String]
    
    var groupData: js.Object | Null
    
    var high: Double
    
    var id: Any
    
    var itemData: js.Object | Null
    
    var label: String
    
    var low: Double
    
    var open: Double
    
    var series: String
    
    var seriesData: js.Object | Null
    
    var targetValue: Double
    
    var totalValue: Double
    
    var value: Double
    
    var volume: Double
    
    var x: Double | String
    
    var y: Double
    
    var z: Double
  }
  object DataLabelContext {
    
    inline def apply(
      close: Double,
      componentElement: Element,
      group: String | js.Array[String],
      high: Double,
      id: Any,
      label: String,
      low: Double,
      open: Double,
      series: String,
      targetValue: Double,
      totalValue: Double,
      value: Double,
      volume: Double,
      x: Double | String,
      y: Double,
      z: Double
    ): DataLabelContext = {
      val __obj = js.Dynamic.literal(close = close.asInstanceOf[js.Any], componentElement = componentElement.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], high = high.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], low = low.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any], series = series.asInstanceOf[js.Any], targetValue = targetValue.asInstanceOf[js.Any], totalValue = totalValue.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], volume = volume.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any], data = null, groupData = null, itemData = null, seriesData = null)
      __obj.asInstanceOf[DataLabelContext]
    }
    
    extension [Self <: DataLabelContext](x: Self) {
      
      inline def setClose(value: Double): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
      
      inline def setComponentElement(value: Element): Self = StObject.set(x, "componentElement", value.asInstanceOf[js.Any])
      
      inline def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataNull: Self = StObject.set(x, "data", null)
      
      inline def setGroup(value: String | js.Array[String]): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      inline def setGroupData(value: js.Object): Self = StObject.set(x, "groupData", value.asInstanceOf[js.Any])
      
      inline def setGroupDataNull: Self = StObject.set(x, "groupData", null)
      
      inline def setGroupVarargs(value: String*): Self = StObject.set(x, "group", js.Array(value*))
      
      inline def setHigh(value: Double): Self = StObject.set(x, "high", value.asInstanceOf[js.Any])
      
      inline def setId(value: Any): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setItemData(value: js.Object): Self = StObject.set(x, "itemData", value.asInstanceOf[js.Any])
      
      inline def setItemDataNull: Self = StObject.set(x, "itemData", null)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLow(value: Double): Self = StObject.set(x, "low", value.asInstanceOf[js.Any])
      
      inline def setOpen(value: Double): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setSeries(value: String): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
      
      inline def setSeriesData(value: js.Object): Self = StObject.set(x, "seriesData", value.asInstanceOf[js.Any])
      
      inline def setSeriesDataNull: Self = StObject.set(x, "seriesData", null)
      
      inline def setTargetValue(value: Double): Self = StObject.set(x, "targetValue", value.asInstanceOf[js.Any])
      
      inline def setTotalValue(value: Double): Self = StObject.set(x, "totalValue", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setVolume(value: Double): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double | String): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
    }
  }
  
  // tslint:disable-next-line interface-over-type-literal
  trait GroupContext extends StObject {
    
    var indexPath: js.Array[Any]
    
    var subId: String
  }
  object GroupContext {
    
    inline def apply(indexPath: js.Array[Any], subId: String): GroupContext = {
      val __obj = js.Dynamic.literal(indexPath = indexPath.asInstanceOf[js.Any], subId = subId.asInstanceOf[js.Any])
      __obj.asInstanceOf[GroupContext]
    }
    
    extension [Self <: GroupContext](x: Self) {
      
      inline def setIndexPath(value: js.Array[Any]): Self = StObject.set(x, "indexPath", value.asInstanceOf[js.Any])
      
      inline def setIndexPathVarargs(value: Any*): Self = StObject.set(x, "indexPath", js.Array(value*))
      
      inline def setSubId(value: String): Self = StObject.set(x, "subId", value.asInstanceOf[js.Any])
    }
  }
  
  // tslint:disable-next-line interface-over-type-literal
  trait ItemContext extends StObject {
    
    var itemIndex: Double
    
    var seriesIndex: Double
    
    var subId: String
  }
  object ItemContext {
    
    inline def apply(itemIndex: Double, seriesIndex: Double, subId: String): ItemContext = {
      val __obj = js.Dynamic.literal(itemIndex = itemIndex.asInstanceOf[js.Any], seriesIndex = seriesIndex.asInstanceOf[js.Any], subId = subId.asInstanceOf[js.Any])
      __obj.asInstanceOf[ItemContext]
    }
    
    extension [Self <: ItemContext](x: Self) {
      
      inline def setItemIndex(value: Double): Self = StObject.set(x, "itemIndex", value.asInstanceOf[js.Any])
      
      inline def setSeriesIndex(value: Double): Self = StObject.set(x, "seriesIndex", value.asInstanceOf[js.Any])
      
      inline def setSubId(value: String): Self = StObject.set(x, "subId", value.asInstanceOf[js.Any])
    }
  }
  
  // tslint:disable-next-line interface-over-type-literal
  trait LegendItemContext extends StObject {
    
    var itemIndex: Double
    
    var sectionIndexPath: js.Array[Any]
    
    var subId: String
  }
  object LegendItemContext {
    
    inline def apply(itemIndex: Double, sectionIndexPath: js.Array[Any], subId: String): LegendItemContext = {
      val __obj = js.Dynamic.literal(itemIndex = itemIndex.asInstanceOf[js.Any], sectionIndexPath = sectionIndexPath.asInstanceOf[js.Any], subId = subId.asInstanceOf[js.Any])
      __obj.asInstanceOf[LegendItemContext]
    }
    
    extension [Self <: LegendItemContext](x: Self) {
      
      inline def setItemIndex(value: Double): Self = StObject.set(x, "itemIndex", value.asInstanceOf[js.Any])
      
      inline def setSectionIndexPath(value: js.Array[Any]): Self = StObject.set(x, "sectionIndexPath", value.asInstanceOf[js.Any])
      
      inline def setSectionIndexPathVarargs(value: Any*): Self = StObject.set(x, "sectionIndexPath", js.Array(value*))
      
      inline def setSubId(value: String): Self = StObject.set(x, "subId", value.asInstanceOf[js.Any])
    }
  }
  
  // tslint:disable-next-line interface-over-type-literal
  trait PieCenterContext extends StObject {
    
    var componentElement: Element
    
    var innerBounds: js.Object
    
    var label: String
    
    var outerBounds: js.Object
  }
  object PieCenterContext {
    
    inline def apply(componentElement: Element, innerBounds: js.Object, label: String, outerBounds: js.Object): PieCenterContext = {
      val __obj = js.Dynamic.literal(componentElement = componentElement.asInstanceOf[js.Any], innerBounds = innerBounds.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], outerBounds = outerBounds.asInstanceOf[js.Any])
      __obj.asInstanceOf[PieCenterContext]
    }
    
    extension [Self <: PieCenterContext](x: Self) {
      
      inline def setComponentElement(value: Element): Self = StObject.set(x, "componentElement", value.asInstanceOf[js.Any])
      
      inline def setInnerBounds(value: js.Object): Self = StObject.set(x, "innerBounds", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setOuterBounds(value: js.Object): Self = StObject.set(x, "outerBounds", value.asInstanceOf[js.Any])
    }
  }
  
  // tslint:disable-next-line interface-over-type-literal
  trait PieCenterLabelContext extends StObject {
    
    var subId: String
  }
  object PieCenterLabelContext {
    
    inline def apply(subId: String): PieCenterLabelContext = {
      val __obj = js.Dynamic.literal(subId = subId.asInstanceOf[js.Any])
      __obj.asInstanceOf[PieCenterLabelContext]
    }
    
    extension [Self <: PieCenterLabelContext](x: Self) {
      
      inline def setSubId(value: String): Self = StObject.set(x, "subId", value.asInstanceOf[js.Any])
    }
  }
  
  // tslint:disable-next-line interface-over-type-literal
  trait ReferenceObject extends StObject {
    
    var axis: xAxis | yAxis | y2Axis
    
    var index: Double
    
    var subId: String
  }
  object ReferenceObject {
    
    inline def apply(axis: xAxis | yAxis | y2Axis, index: Double, subId: String): ReferenceObject = {
      val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], subId = subId.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReferenceObject]
    }
    
    extension [Self <: ReferenceObject](x: Self) {
      
      inline def setAxis(value: xAxis | yAxis | y2Axis): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setSubId(value: String): Self = StObject.set(x, "subId", value.asInstanceOf[js.Any])
    }
  }
  
  // tslint:disable-next-line interface-over-type-literal
  trait SeriesContext extends StObject {
    
    var itemIndex: Double
    
    var subId: String
  }
  object SeriesContext {
    
    inline def apply(itemIndex: Double, subId: String): SeriesContext = {
      val __obj = js.Dynamic.literal(itemIndex = itemIndex.asInstanceOf[js.Any], subId = subId.asInstanceOf[js.Any])
      __obj.asInstanceOf[SeriesContext]
    }
    
    extension [Self <: SeriesContext](x: Self) {
      
      inline def setItemIndex(value: Double): Self = StObject.set(x, "itemIndex", value.asInstanceOf[js.Any])
      
      inline def setSubId(value: String): Self = StObject.set(x, "subId", value.asInstanceOf[js.Any])
    }
  }
  
  // tslint:disable-next-line interface-over-type-literal
  trait TooltipContext extends StObject {
    
    var close: Double
    
    var color: String
    
    var componentElement: Element
    
    var data: js.Object | Null
    
    var group: String | js.Array[String]
    
    var groupData: js.Object | Null
    
    var high: Double
    
    var id: Any
    
    var itemData: js.Object | Null
    
    var label: String
    
    var low: Double
    
    var open: Double
    
    var parentElement: Element
    
    var series: String
    
    var seriesData: js.Object | Null
    
    var targetValue: Double
    
    var value: Double
    
    var volume: Double
    
    var x: Double | String
    
    var y: Double
    
    var z: Double
  }
  object TooltipContext {
    
    inline def apply(
      close: Double,
      color: String,
      componentElement: Element,
      group: String | js.Array[String],
      high: Double,
      id: Any,
      label: String,
      low: Double,
      open: Double,
      parentElement: Element,
      series: String,
      targetValue: Double,
      value: Double,
      volume: Double,
      x: Double | String,
      y: Double,
      z: Double
    ): TooltipContext = {
      val __obj = js.Dynamic.literal(close = close.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], componentElement = componentElement.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], high = high.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], low = low.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any], parentElement = parentElement.asInstanceOf[js.Any], series = series.asInstanceOf[js.Any], targetValue = targetValue.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], volume = volume.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any], data = null, groupData = null, itemData = null, seriesData = null)
      __obj.asInstanceOf[TooltipContext]
    }
    
    extension [Self <: TooltipContext](x: Self) {
      
      inline def setClose(value: Double): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setComponentElement(value: Element): Self = StObject.set(x, "componentElement", value.asInstanceOf[js.Any])
      
      inline def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataNull: Self = StObject.set(x, "data", null)
      
      inline def setGroup(value: String | js.Array[String]): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      inline def setGroupData(value: js.Object): Self = StObject.set(x, "groupData", value.asInstanceOf[js.Any])
      
      inline def setGroupDataNull: Self = StObject.set(x, "groupData", null)
      
      inline def setGroupVarargs(value: String*): Self = StObject.set(x, "group", js.Array(value*))
      
      inline def setHigh(value: Double): Self = StObject.set(x, "high", value.asInstanceOf[js.Any])
      
      inline def setId(value: Any): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setItemData(value: js.Object): Self = StObject.set(x, "itemData", value.asInstanceOf[js.Any])
      
      inline def setItemDataNull: Self = StObject.set(x, "itemData", null)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLow(value: Double): Self = StObject.set(x, "low", value.asInstanceOf[js.Any])
      
      inline def setOpen(value: Double): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setParentElement(value: Element): Self = StObject.set(x, "parentElement", value.asInstanceOf[js.Any])
      
      inline def setSeries(value: String): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
      
      inline def setSeriesData(value: js.Object): Self = StObject.set(x, "seriesData", value.asInstanceOf[js.Any])
      
      inline def setSeriesDataNull: Self = StObject.set(x, "seriesData", null)
      
      inline def setTargetValue(value: Double): Self = StObject.set(x, "targetValue", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setVolume(value: Double): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double | String): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
    }
  }
  
  type ojDrill = CustomEvent
  
  type ojSelectInput = CustomEvent
  
  type ojViewportChange = CustomEvent
  
  type ojViewportChangeInput = CustomEvent
}
