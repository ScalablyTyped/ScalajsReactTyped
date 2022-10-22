package typingsJapgolly.devextreme.mod.DevExpress.viz

import org.scalajs.dom.HTMLElement
import org.scalajs.dom.MouseEvent
import org.scalajs.dom.PointerEvent
import org.scalajs.dom.TouchEvent
import typingsJapgolly.devextreme.mod.DevExpress.common.charts.ZoomPanAction
import typingsJapgolly.devextreme.mod.DevExpress.core.DxElement_
import typingsJapgolly.devextreme.mod.DevExpress.events.Cancelable
import typingsJapgolly.devextreme.mod.DevExpress.events.ChangedOptionInfo
import typingsJapgolly.devextreme.mod.DevExpress.events.EventInfo
import typingsJapgolly.devextreme.mod.DevExpress.events.InitializedEventInfo
import typingsJapgolly.devextreme.mod.DevExpress.events.NativeEventInfo
import typingsJapgolly.devextreme.mod.DevExpress.viz.BaseChart.PointInteractionInfo
import typingsJapgolly.devextreme.mod.DevExpress.viz.BaseChart.TooltipInfo
import typingsJapgolly.devextreme.mod.DevExpress.viz.BaseWidget.ExportInfo
import typingsJapgolly.devextreme.mod.DevExpress.viz.BaseWidget.FileSavingEventInfo
import typingsJapgolly.devextreme.mod.DevExpress.viz.BaseWidget.IncidentInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxChart
  extends StObject
     with BaseChart[dxChartOptions]
     with _VizWidget {
  
  /**
    * Gets the argument axis.
    */
  def getArgumentAxis(): chartAxisObject = js.native
  
  /**
    * Gets a value axis.
    */
  def getValueAxis(): chartAxisObject = js.native
  /**
    * Gets a value axis with the specified name.
    */
  def getValueAxis(name: String): chartAxisObject = js.native
  
  /**
    * Resets the visual ranges of both axes to the data range or to the whole range if it is within the data range.
    */
  def resetVisualRange(): Unit = js.native
  
  def zoomArgument(startValue: String, endValue: String): Unit = js.native
  def zoomArgument(startValue: String, endValue: js.Date): Unit = js.native
  def zoomArgument(startValue: String, endValue: Double): Unit = js.native
  def zoomArgument(startValue: js.Date, endValue: String): Unit = js.native
  def zoomArgument(startValue: js.Date, endValue: js.Date): Unit = js.native
  def zoomArgument(startValue: js.Date, endValue: Double): Unit = js.native
  def zoomArgument(startValue: Double, endValue: String): Unit = js.native
  def zoomArgument(startValue: Double, endValue: js.Date): Unit = js.native
  /**
    * Sets the argument axis&apos; start and end values.
    */
  def zoomArgument(startValue: Double, endValue: Double): Unit = js.native
}
object dxChart {
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.devextreme.devextremeStrings.betweenTicks
    - typingsJapgolly.devextreme.devextremeStrings.crossTicks
  */
  trait AggregatedPointsPosition extends StObject
  object AggregatedPointsPosition {
    
    inline def betweenTicks: typingsJapgolly.devextreme.devextremeStrings.betweenTicks = "betweenTicks".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.betweenTicks]
    
    inline def crossTicks: typingsJapgolly.devextreme.devextremeStrings.crossTicks = "crossTicks".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.crossTicks]
  }
  
  trait ArgumentAxisClickEvent
    extends StObject
       with NativeEventInfo[dxChart, MouseEvent | PointerEvent] {
    
    val argument: js.Date | Double | String
  }
  object ArgumentAxisClickEvent {
    
    inline def apply(argument: js.Date | Double | String, component: dxChart, element: DxElement_[HTMLElement]): ArgumentAxisClickEvent = {
      val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[ArgumentAxisClickEvent]
    }
    
    extension [Self <: ArgumentAxisClickEvent](x: Self) {
      
      inline def setArgument(value: js.Date | Double | String): Self = StObject.set(x, "argument", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.devextreme.devextremeStrings.avg
    - typingsJapgolly.devextreme.devextremeStrings.custom
  */
  trait ChartBubbleSeriesAggregationMethod extends StObject
  object ChartBubbleSeriesAggregationMethod {
    
    inline def avg: typingsJapgolly.devextreme.devextremeStrings.avg = "avg".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.avg]
    
    inline def custom: typingsJapgolly.devextreme.devextremeStrings.custom = "custom".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.custom]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.devextreme.devextremeStrings.ohlc
    - typingsJapgolly.devextreme.devextremeStrings.custom
  */
  trait ChartFinancialSeriesAggregationMethod extends StObject
  object ChartFinancialSeriesAggregationMethod {
    
    inline def custom: typingsJapgolly.devextreme.devextremeStrings.custom = "custom".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.custom]
    
    inline def ohlc: typingsJapgolly.devextreme.devextremeStrings.ohlc = "ohlc".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.ohlc]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.devextreme.devextremeStrings.rotate
    - typingsJapgolly.devextreme.devextremeStrings.stagger
    - typingsJapgolly.devextreme.devextremeStrings.standard
  */
  trait ChartLabelDisplayMode extends StObject
  object ChartLabelDisplayMode {
    
    inline def rotate: typingsJapgolly.devextreme.devextremeStrings.rotate = "rotate".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.rotate]
    
    inline def stagger: typingsJapgolly.devextreme.devextremeStrings.stagger = "stagger".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.stagger]
    
    inline def standard: typingsJapgolly.devextreme.devextremeStrings.standard = "standard".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.standard]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.devextreme.devextremeStrings.range
    - typingsJapgolly.devextreme.devextremeStrings.custom
  */
  trait ChartRangeSeriesAggregationMethod extends StObject
  object ChartRangeSeriesAggregationMethod {
    
    inline def custom: typingsJapgolly.devextreme.devextremeStrings.custom = "custom".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.custom]
    
    inline def range: typingsJapgolly.devextreme.devextremeStrings.range = "range".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.range]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.devextreme.devextremeStrings.avg
    - typingsJapgolly.devextreme.devextremeStrings.count
    - typingsJapgolly.devextreme.devextremeStrings.max
    - typingsJapgolly.devextreme.devextremeStrings.min
    - typingsJapgolly.devextreme.devextremeStrings.ohlc
    - typingsJapgolly.devextreme.devextremeStrings.range
    - typingsJapgolly.devextreme.devextremeStrings.sum
    - typingsJapgolly.devextreme.devextremeStrings.custom
  */
  trait ChartSeriesAggregationMethod extends StObject
  object ChartSeriesAggregationMethod {
    
    inline def avg: typingsJapgolly.devextreme.devextremeStrings.avg = "avg".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.avg]
    
    inline def count: typingsJapgolly.devextreme.devextremeStrings.count = "count".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.count]
    
    inline def custom: typingsJapgolly.devextreme.devextremeStrings.custom = "custom".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.custom]
    
    inline def max: typingsJapgolly.devextreme.devextremeStrings.max = "max".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.max]
    
    inline def min: typingsJapgolly.devextreme.devextremeStrings.min = "min".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.min]
    
    inline def ohlc: typingsJapgolly.devextreme.devextremeStrings.ohlc = "ohlc".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.ohlc]
    
    inline def range: typingsJapgolly.devextreme.devextremeStrings.range = "range".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.range]
    
    inline def sum: typingsJapgolly.devextreme.devextremeStrings.sum = "sum".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.sum]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.devextreme.devextremeStrings.avg
    - typingsJapgolly.devextreme.devextremeStrings.count
    - typingsJapgolly.devextreme.devextremeStrings.max
    - typingsJapgolly.devextreme.devextremeStrings.min
    - typingsJapgolly.devextreme.devextremeStrings.sum
    - typingsJapgolly.devextreme.devextremeStrings.custom
  */
  trait ChartSingleValueSeriesAggregationMethod extends StObject
  object ChartSingleValueSeriesAggregationMethod {
    
    inline def avg: typingsJapgolly.devextreme.devextremeStrings.avg = "avg".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.avg]
    
    inline def count: typingsJapgolly.devextreme.devextremeStrings.count = "count".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.count]
    
    inline def custom: typingsJapgolly.devextreme.devextremeStrings.custom = "custom".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.custom]
    
    inline def max: typingsJapgolly.devextreme.devextremeStrings.max = "max".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.max]
    
    inline def min: typingsJapgolly.devextreme.devextremeStrings.min = "min".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.min]
    
    inline def sum: typingsJapgolly.devextreme.devextremeStrings.sum = "sum".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.sum]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.devextreme.devextremeStrings.center
    - typingsJapgolly.devextreme.devextremeStrings.edge
  */
  trait ChartTooltipLocation extends StObject
  object ChartTooltipLocation {
    
    inline def center: typingsJapgolly.devextreme.devextremeStrings.center = "center".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.center]
    
    inline def edge: typingsJapgolly.devextreme.devextremeStrings.edge = "edge".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.edge]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.devextreme.devextremeStrings.both
    - typingsJapgolly.devextreme.devextremeStrings.none
    - typingsJapgolly.devextreme.devextremeStrings.pan
    - typingsJapgolly.devextreme.devextremeStrings.zoom
  */
  trait ChartZoomAndPanMode extends StObject
  object ChartZoomAndPanMode {
    
    inline def both: typingsJapgolly.devextreme.devextremeStrings.both = "both".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.both]
    
    inline def none: typingsJapgolly.devextreme.devextremeStrings.none = "none".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.none]
    
    inline def pan: typingsJapgolly.devextreme.devextremeStrings.pan = "pan".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.pan]
    
    inline def zoom: typingsJapgolly.devextreme.devextremeStrings.zoom = "zoom".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.zoom]
  }
  
  type DisposingEvent = EventInfo[dxChart]
  
  type DoneEvent = EventInfo[dxChart]
  
  type DrawnEvent = EventInfo[dxChart]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.devextreme.devextremeStrings.alt
    - typingsJapgolly.devextreme.devextremeStrings.ctrl
    - typingsJapgolly.devextreme.devextremeStrings.meta
    - typingsJapgolly.devextreme.devextremeStrings.shift
  */
  trait EventKeyModifier extends StObject
  object EventKeyModifier {
    
    inline def alt: typingsJapgolly.devextreme.devextremeStrings.alt = "alt".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.alt]
    
    inline def ctrl: typingsJapgolly.devextreme.devextremeStrings.ctrl = "ctrl".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.ctrl]
    
    inline def meta: typingsJapgolly.devextreme.devextremeStrings.meta = "meta".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.meta]
    
    inline def shift: typingsJapgolly.devextreme.devextremeStrings.shift = "shift".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.shift]
  }
  
  type ExportedEvent = EventInfo[dxChart]
  
  trait ExportingEvent
    extends StObject
       with EventInfo[dxChart]
       with ExportInfo
  object ExportingEvent {
    
    inline def apply(component: dxChart, element: DxElement_[HTMLElement], fileName: String, format: String): ExportingEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExportingEvent]
    }
  }
  
  type FileSavingEvent = FileSavingEventInfo[dxChart]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.devextreme.devextremeStrings.close
    - typingsJapgolly.devextreme.devextremeStrings.high
    - typingsJapgolly.devextreme.devextremeStrings.low
    - typingsJapgolly.devextreme.devextremeStrings.open
  */
  trait FinancialChartReductionLevel extends StObject
  object FinancialChartReductionLevel {
    
    inline def close: typingsJapgolly.devextreme.devextremeStrings.close = "close".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.close]
    
    inline def high: typingsJapgolly.devextreme.devextremeStrings.high = "high".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.high]
    
    inline def low: typingsJapgolly.devextreme.devextremeStrings.low = "low".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.low]
    
    inline def open: typingsJapgolly.devextreme.devextremeStrings.open = "open".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.open]
  }
  
  trait IncidentOccurredEvent
    extends StObject
       with EventInfo[dxChart]
       with IncidentInfo
  object IncidentOccurredEvent {
    
    inline def apply(component: dxChart, element: DxElement_[HTMLElement], target: Any): IncidentOccurredEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[IncidentOccurredEvent]
    }
  }
  
  type InitializedEvent = InitializedEventInfo[dxChart]
  
  trait LegendClickEvent
    extends StObject
       with Cancelable
       with NativeEventInfo[dxChart, MouseEvent | PointerEvent] {
    
    val target: chartSeriesObject
  }
  object LegendClickEvent {
    
    inline def apply(component: dxChart, element: DxElement_[HTMLElement], target: chartSeriesObject): LegendClickEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[LegendClickEvent]
    }
    
    extension [Self <: LegendClickEvent](x: Self) {
      
      inline def setTarget(value: chartSeriesObject): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  trait OptionChangedEvent
    extends StObject
       with EventInfo[dxChart]
       with ChangedOptionInfo
  object OptionChangedEvent {
    
    inline def apply(component: dxChart, element: DxElement_[HTMLElement], fullName: String, name: String): OptionChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionChangedEvent]
    }
  }
  
  trait PointClickEvent
    extends StObject
       with Cancelable
       with NativeEventInfo[dxChart, MouseEvent | PointerEvent]
       with PointInteractionInfo
  object PointClickEvent {
    
    inline def apply(component: dxChart, element: DxElement_[HTMLElement], target: basePointObject): PointClickEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[PointClickEvent]
    }
  }
  
  trait PointHoverChangedEvent
    extends StObject
       with EventInfo[dxChart]
       with PointInteractionInfo
  object PointHoverChangedEvent {
    
    inline def apply(component: dxChart, element: DxElement_[HTMLElement], target: basePointObject): PointHoverChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[PointHoverChangedEvent]
    }
  }
  
  trait PointSelectionChangedEvent
    extends StObject
       with EventInfo[dxChart]
       with PointInteractionInfo
  object PointSelectionChangedEvent {
    
    inline def apply(component: dxChart, element: DxElement_[HTMLElement], target: basePointObject): PointSelectionChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[PointSelectionChangedEvent]
    }
  }
  
  type Properties = dxChartOptions
  
  trait SeriesClickEvent
    extends StObject
       with NativeEventInfo[dxChart, MouseEvent | PointerEvent] {
    
    val target: chartSeriesObject
  }
  object SeriesClickEvent {
    
    inline def apply(component: dxChart, element: DxElement_[HTMLElement], target: chartSeriesObject): SeriesClickEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[SeriesClickEvent]
    }
    
    extension [Self <: SeriesClickEvent](x: Self) {
      
      inline def setTarget(value: chartSeriesObject): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  trait SeriesHoverChangedEvent
    extends StObject
       with EventInfo[dxChart]
       with SeriesInteractionInfo
  object SeriesHoverChangedEvent {
    
    inline def apply(component: dxChart, element: DxElement_[HTMLElement], target: chartSeriesObject): SeriesHoverChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[SeriesHoverChangedEvent]
    }
  }
  
  /**
    * @deprecated Attention! This type is for internal purposes only. If you used it previously, please submit a ticket to our {@link https://supportcenter.devexpress.com/ticket/create Support Center}. We will check if there is an alternative solution.
    */
  trait SeriesInteractionInfo extends StObject {
    
    var target: chartSeriesObject
  }
  object SeriesInteractionInfo {
    
    inline def apply(target: chartSeriesObject): SeriesInteractionInfo = {
      val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[SeriesInteractionInfo]
    }
    
    extension [Self <: SeriesInteractionInfo](x: Self) {
      
      inline def setTarget(value: chartSeriesObject): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  trait SeriesSelectionChangedEvent
    extends StObject
       with EventInfo[dxChart]
       with SeriesInteractionInfo
  object SeriesSelectionChangedEvent {
    
    inline def apply(component: dxChart, element: DxElement_[HTMLElement], target: chartSeriesObject): SeriesSelectionChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[SeriesSelectionChangedEvent]
    }
  }
  
  trait TooltipHiddenEvent
    extends StObject
       with EventInfo[dxChart]
       with TooltipInfo
  object TooltipHiddenEvent {
    
    inline def apply(component: dxChart, element: DxElement_[HTMLElement]): TooltipHiddenEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[TooltipHiddenEvent]
    }
  }
  
  trait TooltipShownEvent
    extends StObject
       with EventInfo[dxChart]
       with TooltipInfo
  object TooltipShownEvent {
    
    inline def apply(component: dxChart, element: DxElement_[HTMLElement]): TooltipShownEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[TooltipShownEvent]
    }
  }
  
  trait ZoomEndEvent
    extends StObject
       with Cancelable
       with NativeEventInfo[dxChart, MouseEvent | TouchEvent] {
    
    val actionType: ZoomPanAction
    
    val axis: chartAxisObject
    
    val previousRange: VizRange
    
    val range: VizRange
    
    val rangeEnd: js.Date | Double
    
    val rangeStart: js.Date | Double
    
    val shift: Double
    
    val zoomFactor: Double
  }
  object ZoomEndEvent {
    
    inline def apply(
      actionType: ZoomPanAction,
      axis: chartAxisObject,
      component: dxChart,
      element: DxElement_[HTMLElement],
      previousRange: VizRange,
      range: VizRange,
      rangeEnd: js.Date | Double,
      rangeStart: js.Date | Double,
      shift: Double,
      zoomFactor: Double
    ): ZoomEndEvent = {
      val __obj = js.Dynamic.literal(actionType = actionType.asInstanceOf[js.Any], axis = axis.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], previousRange = previousRange.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], rangeEnd = rangeEnd.asInstanceOf[js.Any], rangeStart = rangeStart.asInstanceOf[js.Any], shift = shift.asInstanceOf[js.Any], zoomFactor = zoomFactor.asInstanceOf[js.Any])
      __obj.asInstanceOf[ZoomEndEvent]
    }
    
    extension [Self <: ZoomEndEvent](x: Self) {
      
      inline def setActionType(value: ZoomPanAction): Self = StObject.set(x, "actionType", value.asInstanceOf[js.Any])
      
      inline def setAxis(value: chartAxisObject): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
      
      inline def setPreviousRange(value: VizRange): Self = StObject.set(x, "previousRange", value.asInstanceOf[js.Any])
      
      inline def setRange(value: VizRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      inline def setRangeEnd(value: js.Date | Double): Self = StObject.set(x, "rangeEnd", value.asInstanceOf[js.Any])
      
      inline def setRangeStart(value: js.Date | Double): Self = StObject.set(x, "rangeStart", value.asInstanceOf[js.Any])
      
      inline def setShift(value: Double): Self = StObject.set(x, "shift", value.asInstanceOf[js.Any])
      
      inline def setZoomFactor(value: Double): Self = StObject.set(x, "zoomFactor", value.asInstanceOf[js.Any])
    }
  }
  
  trait ZoomStartEvent
    extends StObject
       with Cancelable
       with NativeEventInfo[dxChart, MouseEvent | TouchEvent] {
    
    val actionType: js.UndefOr[ZoomPanAction] = js.undefined
    
    val axis: chartAxisObject
    
    val range: VizRange
  }
  object ZoomStartEvent {
    
    inline def apply(axis: chartAxisObject, component: dxChart, element: DxElement_[HTMLElement], range: VizRange): ZoomStartEvent = {
      val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
      __obj.asInstanceOf[ZoomStartEvent]
    }
    
    extension [Self <: ZoomStartEvent](x: Self) {
      
      inline def setActionType(value: ZoomPanAction): Self = StObject.set(x, "actionType", value.asInstanceOf[js.Any])
      
      inline def setActionTypeUndefined: Self = StObject.set(x, "actionType", js.undefined)
      
      inline def setAxis(value: chartAxisObject): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
      
      inline def setRange(value: VizRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    }
  }
}
