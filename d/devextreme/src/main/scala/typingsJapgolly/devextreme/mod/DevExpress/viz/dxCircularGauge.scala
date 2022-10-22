package typingsJapgolly.devextreme.mod.DevExpress.viz

import org.scalajs.dom.HTMLElement
import typingsJapgolly.devextreme.mod.DevExpress.core.DxElement_
import typingsJapgolly.devextreme.mod.DevExpress.events.ChangedOptionInfo
import typingsJapgolly.devextreme.mod.DevExpress.events.EventInfo
import typingsJapgolly.devextreme.mod.DevExpress.events.InitializedEventInfo
import typingsJapgolly.devextreme.mod.DevExpress.viz.BaseGauge.TooltipInfo
import typingsJapgolly.devextreme.mod.DevExpress.viz.BaseWidget.ExportInfo
import typingsJapgolly.devextreme.mod.DevExpress.viz.BaseWidget.FileSavingEventInfo
import typingsJapgolly.devextreme.mod.DevExpress.viz.BaseWidget.IncidentInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dxCircularGauge {
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.devextreme.devextremeStrings.center
    - typingsJapgolly.devextreme.devextremeStrings.inside
    - typingsJapgolly.devextreme.devextremeStrings.outside
  */
  trait CircularGaugeElementOrientation extends StObject
  object CircularGaugeElementOrientation {
    
    inline def center: typingsJapgolly.devextreme.devextremeStrings.center = "center".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.center]
    
    inline def inside: typingsJapgolly.devextreme.devextremeStrings.inside = "inside".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.inside]
    
    inline def outside: typingsJapgolly.devextreme.devextremeStrings.outside = "outside".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.outside]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.devextreme.devextremeStrings.first
    - typingsJapgolly.devextreme.devextremeStrings.last
  */
  trait CircularGaugeLabelOverlap extends StObject
  object CircularGaugeLabelOverlap {
    
    inline def first: typingsJapgolly.devextreme.devextremeStrings.first = "first".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.first]
    
    inline def last: typingsJapgolly.devextreme.devextremeStrings.last = "last".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.last]
  }
  
  type DisposingEvent = EventInfo[dxCircularGauge]
  
  type DrawnEvent = EventInfo[dxCircularGauge]
  
  type ExportedEvent = EventInfo[dxCircularGauge]
  
  trait ExportingEvent
    extends StObject
       with EventInfo[dxCircularGauge]
       with ExportInfo
  object ExportingEvent {
    
    inline def apply(component: dxCircularGauge, element: DxElement_[HTMLElement], fileName: String, format: String): ExportingEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExportingEvent]
    }
  }
  
  type FileSavingEvent = FileSavingEventInfo[dxCircularGauge]
  
  trait IncidentOccurredEvent
    extends StObject
       with EventInfo[dxCircularGauge]
       with IncidentInfo
  object IncidentOccurredEvent {
    
    inline def apply(component: dxCircularGauge, element: DxElement_[HTMLElement], target: Any): IncidentOccurredEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[IncidentOccurredEvent]
    }
  }
  
  type InitializedEvent = InitializedEventInfo[dxCircularGauge]
  
  trait OptionChangedEvent
    extends StObject
       with EventInfo[dxCircularGauge]
       with ChangedOptionInfo
  object OptionChangedEvent {
    
    inline def apply(component: dxCircularGauge, element: DxElement_[HTMLElement], fullName: String, name: String): OptionChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionChangedEvent]
    }
  }
  
  type Properties = dxCircularGaugeOptions
  
  trait TooltipHiddenEvent
    extends StObject
       with EventInfo[dxCircularGauge]
       with TooltipInfo
  object TooltipHiddenEvent {
    
    inline def apply(component: dxCircularGauge, element: DxElement_[HTMLElement], target: Any): TooltipHiddenEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[TooltipHiddenEvent]
    }
  }
  
  trait TooltipShownEvent
    extends StObject
       with EventInfo[dxCircularGauge]
       with TooltipInfo
  object TooltipShownEvent {
    
    inline def apply(component: dxCircularGauge, element: DxElement_[HTMLElement], target: Any): TooltipShownEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[TooltipShownEvent]
    }
  }
}
