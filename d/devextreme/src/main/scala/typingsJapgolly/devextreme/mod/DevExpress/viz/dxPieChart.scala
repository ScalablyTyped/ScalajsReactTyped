package typingsJapgolly.devextreme.mod.DevExpress.viz

import org.scalajs.dom.HTMLElement
import org.scalajs.dom.MouseEvent
import org.scalajs.dom.PointerEvent
import typingsJapgolly.devextreme.mod.DevExpress.core.DxElement_
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
trait dxPieChart
  extends StObject
     with BaseChart[dxPieChartOptions]
     with _VizWidget {
  
  /**
    * Gets the radius of the doughnut hole in pixels. Applies only when the type is &apos;doughnut&apos; or &apos;donut&apos;.
    */
  def getInnerRadius(): Double = js.native
}
object dxPieChart {
  
  type DisposingEvent = EventInfo[dxPieChart]
  
  type DoneEvent = EventInfo[dxPieChart]
  
  type DrawnEvent = EventInfo[dxPieChart]
  
  type ExportedEvent = EventInfo[dxPieChart]
  
  trait ExportingEvent
    extends StObject
       with EventInfo[dxPieChart]
       with ExportInfo
  object ExportingEvent {
    
    inline def apply(component: dxPieChart, element: DxElement_[HTMLElement], fileName: String, format: String): ExportingEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExportingEvent]
    }
  }
  
  type FileSavingEvent = FileSavingEventInfo[dxPieChart]
  
  trait IncidentOccurredEvent
    extends StObject
       with EventInfo[dxPieChart]
       with IncidentInfo
  object IncidentOccurredEvent {
    
    inline def apply(component: dxPieChart, element: DxElement_[HTMLElement], target: Any): IncidentOccurredEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[IncidentOccurredEvent]
    }
  }
  
  type InitializedEvent = InitializedEventInfo[dxPieChart]
  
  trait LegendClickEvent
    extends StObject
       with NativeEventInfo[dxPieChart, MouseEvent | PointerEvent] {
    
    val points: js.Array[piePointObject]
    
    val target: String | Double
  }
  object LegendClickEvent {
    
    inline def apply(
      component: dxPieChart,
      element: DxElement_[HTMLElement],
      points: js.Array[piePointObject],
      target: String | Double
    ): LegendClickEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[LegendClickEvent]
    }
    
    extension [Self <: LegendClickEvent](x: Self) {
      
      inline def setPoints(value: js.Array[piePointObject]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
      
      inline def setPointsVarargs(value: piePointObject*): Self = StObject.set(x, "points", js.Array(value*))
      
      inline def setTarget(value: String | Double): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  type LegendItem = PieChartLegendItem
  
  trait OptionChangedEvent
    extends StObject
       with EventInfo[dxPieChart]
       with ChangedOptionInfo
  object OptionChangedEvent {
    
    inline def apply(component: dxPieChart, element: DxElement_[HTMLElement], fullName: String, name: String): OptionChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionChangedEvent]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.devextreme.devextremeStrings.center
    - typingsJapgolly.devextreme.devextremeStrings.edge
  */
  trait PieChartAnnotationLocation extends StObject
  object PieChartAnnotationLocation {
    
    inline def center: typingsJapgolly.devextreme.devextremeStrings.center = "center".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.center]
    
    inline def edge: typingsJapgolly.devextreme.devextremeStrings.edge = "edge".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.edge]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.devextreme.devextremeStrings.hide
    - typingsJapgolly.devextreme.devextremeStrings.none
    - typingsJapgolly.devextreme.devextremeStrings.shift
  */
  trait PieChartLabelOverlap extends StObject
  object PieChartLabelOverlap {
    
    inline def hide: typingsJapgolly.devextreme.devextremeStrings.hide = "hide".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.hide]
    
    inline def none: typingsJapgolly.devextreme.devextremeStrings.none = "none".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.none]
    
    inline def shift: typingsJapgolly.devextreme.devextremeStrings.shift = "shift".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.shift]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.devextreme.devextremeStrings.none
    - typingsJapgolly.devextreme.devextremeStrings.allArgumentPoints
  */
  trait PieChartLegendHoverMode extends StObject
  object PieChartLegendHoverMode {
    
    inline def allArgumentPoints: typingsJapgolly.devextreme.devextremeStrings.allArgumentPoints = "allArgumentPoints".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.allArgumentPoints]
    
    inline def none: typingsJapgolly.devextreme.devextremeStrings.none = "none".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.none]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.devextreme.devextremeStrings.anticlockwise
    - typingsJapgolly.devextreme.devextremeStrings.clockwise
  */
  trait PieChartSegmentDirection extends StObject
  object PieChartSegmentDirection {
    
    inline def anticlockwise: typingsJapgolly.devextreme.devextremeStrings.anticlockwise = "anticlockwise".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.anticlockwise]
    
    inline def clockwise: typingsJapgolly.devextreme.devextremeStrings.clockwise = "clockwise".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.clockwise]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.devextreme.devextremeStrings.none
    - typingsJapgolly.devextreme.devextremeStrings.onlyPoint
  */
  trait PieChartSeriesInteractionMode extends StObject
  object PieChartSeriesInteractionMode {
    
    inline def none: typingsJapgolly.devextreme.devextremeStrings.none = "none".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.none]
    
    inline def onlyPoint: typingsJapgolly.devextreme.devextremeStrings.onlyPoint = "onlyPoint".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.onlyPoint]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.devextreme.devextremeStrings.donut
    - typingsJapgolly.devextreme.devextremeStrings.doughnut
    - typingsJapgolly.devextreme.devextremeStrings.pie
  */
  trait PieChartType extends StObject
  object PieChartType {
    
    inline def donut: typingsJapgolly.devextreme.devextremeStrings.donut = "donut".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.donut]
    
    inline def doughnut: typingsJapgolly.devextreme.devextremeStrings.doughnut = "doughnut".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.doughnut]
    
    inline def pie: typingsJapgolly.devextreme.devextremeStrings.pie = "pie".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.pie]
  }
  
  trait PointClickEvent
    extends StObject
       with NativeEventInfo[dxPieChart, MouseEvent | PointerEvent]
       with PointInteractionInfo
  object PointClickEvent {
    
    inline def apply(component: dxPieChart, element: DxElement_[HTMLElement], target: basePointObject): PointClickEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[PointClickEvent]
    }
  }
  
  trait PointHoverChangedEvent
    extends StObject
       with EventInfo[dxPieChart]
       with PointInteractionInfo
  object PointHoverChangedEvent {
    
    inline def apply(component: dxPieChart, element: DxElement_[HTMLElement], target: basePointObject): PointHoverChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[PointHoverChangedEvent]
    }
  }
  
  trait PointSelectionChangedEvent
    extends StObject
       with EventInfo[dxPieChart]
       with PointInteractionInfo
  object PointSelectionChangedEvent {
    
    inline def apply(component: dxPieChart, element: DxElement_[HTMLElement], target: basePointObject): PointSelectionChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[PointSelectionChangedEvent]
    }
  }
  
  type Properties = dxPieChartOptions
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.devextreme.devextremeStrings.none
    - typingsJapgolly.devextreme.devextremeStrings.smallValueThreshold
    - typingsJapgolly.devextreme.devextremeStrings.topN
  */
  trait SmallValuesGroupingMode extends StObject
  object SmallValuesGroupingMode {
    
    inline def none: typingsJapgolly.devextreme.devextremeStrings.none = "none".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.none]
    
    inline def smallValueThreshold: typingsJapgolly.devextreme.devextremeStrings.smallValueThreshold = "smallValueThreshold".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.smallValueThreshold]
    
    inline def topN: typingsJapgolly.devextreme.devextremeStrings.topN = "topN".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.topN]
  }
  
  trait TooltipHiddenEvent
    extends StObject
       with EventInfo[dxPieChart]
       with TooltipInfo
  object TooltipHiddenEvent {
    
    inline def apply(component: dxPieChart, element: DxElement_[HTMLElement]): TooltipHiddenEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[TooltipHiddenEvent]
    }
  }
  
  trait TooltipShownEvent
    extends StObject
       with EventInfo[dxPieChart]
       with TooltipInfo
  object TooltipShownEvent {
    
    inline def apply(component: dxPieChart, element: DxElement_[HTMLElement]): TooltipShownEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[TooltipShownEvent]
    }
  }
}
