package typingsJapgolly.devextreme.mod.DevExpress.viz

import org.scalajs.dom.HTMLElement
import typingsJapgolly.devextreme.mod.DevExpress.core.DxElement_
import typingsJapgolly.devextreme.mod.DevExpress.data.DataSource
import typingsJapgolly.devextreme.mod.DevExpress.events.ChangedOptionInfo
import typingsJapgolly.devextreme.mod.DevExpress.events.EventInfo
import typingsJapgolly.devextreme.mod.DevExpress.events.InitializedEventInfo
import typingsJapgolly.devextreme.mod.DevExpress.viz.BaseWidget.ExportInfo
import typingsJapgolly.devextreme.mod.DevExpress.viz.BaseWidget.FileSavingEventInfo
import typingsJapgolly.devextreme.mod.DevExpress.viz.BaseWidget.IncidentInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxSparkline
  extends StObject
     with BaseSparkline[dxSparklineOptions]
     with _VizWidget {
  
  def getDataSource(): DataSource[Any, Any] = js.native
}
object dxSparkline {
  
  type DisposingEvent = EventInfo[dxSparkline]
  
  type DrawnEvent = EventInfo[dxSparkline]
  
  type ExportedEvent = EventInfo[dxSparkline]
  
  trait ExportingEvent
    extends StObject
       with EventInfo[dxSparkline]
       with ExportInfo
  object ExportingEvent {
    
    inline def apply(component: dxSparkline, element: DxElement_[HTMLElement], fileName: String, format: String): ExportingEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExportingEvent]
    }
  }
  
  type FileSavingEvent = FileSavingEventInfo[dxSparkline]
  
  trait IncidentOccurredEvent
    extends StObject
       with EventInfo[dxSparkline]
       with IncidentInfo
  object IncidentOccurredEvent {
    
    inline def apply(component: dxSparkline, element: DxElement_[HTMLElement], target: Any): IncidentOccurredEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[IncidentOccurredEvent]
    }
  }
  
  type InitializedEvent = InitializedEventInfo[dxSparkline]
  
  trait OptionChangedEvent
    extends StObject
       with EventInfo[dxSparkline]
       with ChangedOptionInfo
  object OptionChangedEvent {
    
    inline def apply(component: dxSparkline, element: DxElement_[HTMLElement], fullName: String, name: String): OptionChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionChangedEvent]
    }
  }
  
  type Properties = dxSparklineOptions
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.devextreme.devextremeStrings.area
    - typingsJapgolly.devextreme.devextremeStrings.bar
    - typingsJapgolly.devextreme.devextremeStrings.line
    - typingsJapgolly.devextreme.devextremeStrings.spline
    - typingsJapgolly.devextreme.devextremeStrings.splinearea
    - typingsJapgolly.devextreme.devextremeStrings.steparea
    - typingsJapgolly.devextreme.devextremeStrings.stepline
    - typingsJapgolly.devextreme.devextremeStrings.winloss
  */
  trait SparklineType extends StObject
  object SparklineType {
    
    inline def area: typingsJapgolly.devextreme.devextremeStrings.area = "area".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.area]
    
    inline def bar: typingsJapgolly.devextreme.devextremeStrings.bar = "bar".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.bar]
    
    inline def line: typingsJapgolly.devextreme.devextremeStrings.line = "line".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.line]
    
    inline def spline: typingsJapgolly.devextreme.devextremeStrings.spline = "spline".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.spline]
    
    inline def splinearea: typingsJapgolly.devextreme.devextremeStrings.splinearea = "splinearea".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.splinearea]
    
    inline def steparea: typingsJapgolly.devextreme.devextremeStrings.steparea = "steparea".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.steparea]
    
    inline def stepline: typingsJapgolly.devextreme.devextremeStrings.stepline = "stepline".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.stepline]
    
    inline def winloss: typingsJapgolly.devextreme.devextremeStrings.winloss = "winloss".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.winloss]
  }
  
  type TooltipHiddenEvent = EventInfo[dxSparkline]
  
  type TooltipShownEvent = EventInfo[dxSparkline]
}
