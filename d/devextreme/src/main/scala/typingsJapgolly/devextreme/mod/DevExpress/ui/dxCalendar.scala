package typingsJapgolly.devextreme.mod.DevExpress.ui

import org.scalajs.dom.Event
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.MouseEvent
import org.scalajs.dom.PointerEvent
import org.scalajs.dom.TouchEvent
import typingsJapgolly.devextreme.mod.DevExpress.core.DxElement_
import typingsJapgolly.devextreme.mod.DevExpress.events.ChangedOptionInfo
import typingsJapgolly.devextreme.mod.DevExpress.events.EventInfo
import typingsJapgolly.devextreme.mod.DevExpress.events.InitializedEventInfo
import typingsJapgolly.devextreme.mod.DevExpress.events.NativeEventInfo
import typingsJapgolly.devextreme.mod.DevExpress.ui.Editor.ValueChangedInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dxCalendar {
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.devextreme.devextremeStrings.century
    - typingsJapgolly.devextreme.devextremeStrings.decade
    - typingsJapgolly.devextreme.devextremeStrings.month
    - typingsJapgolly.devextreme.devextremeStrings.year
  */
  trait CalendarZoomLevel extends StObject
  object CalendarZoomLevel {
    
    inline def century: typingsJapgolly.devextreme.devextremeStrings.century = "century".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.century]
    
    inline def decade: typingsJapgolly.devextreme.devextremeStrings.decade = "decade".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.decade]
    
    inline def month: typingsJapgolly.devextreme.devextremeStrings.month = "month".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.month]
    
    inline def year: typingsJapgolly.devextreme.devextremeStrings.year = "year".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.year]
  }
  
  trait CellTemplateData extends StObject {
    
    val date: js.Date
    
    val text: js.UndefOr[String] = js.undefined
    
    val view: String
  }
  object CellTemplateData {
    
    inline def apply(date: js.Date, view: String): CellTemplateData = {
      val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
      __obj.asInstanceOf[CellTemplateData]
    }
    
    extension [Self <: CellTemplateData](x: Self) {
      
      inline def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setView(value: String): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    }
  }
  
  trait ComponentDisabledDate[T] extends StObject {
    
    var component: T
    
    val date: js.Date
    
    val view: String
  }
  object ComponentDisabledDate {
    
    inline def apply[T](component: T, date: js.Date, view: String): ComponentDisabledDate[T] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComponentDisabledDate[T]]
    }
    
    extension [Self <: ComponentDisabledDate[?], T](x: Self & ComponentDisabledDate[T]) {
      
      inline def setComponent(value: T): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setView(value: String): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    }
  }
  
  type ContentReadyEvent = EventInfo[dxCalendar]
  
  type DisabledDate = ComponentDisabledDate[dxCalendar]
  
  type DisposingEvent = EventInfo[dxCalendar]
  
  type InitializedEvent = InitializedEventInfo[dxCalendar]
  
  trait OptionChangedEvent
    extends StObject
       with EventInfo[dxCalendar]
       with ChangedOptionInfo
  object OptionChangedEvent {
    
    inline def apply(component: dxCalendar, element: DxElement_[HTMLElement], fullName: String, name: String): OptionChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionChangedEvent]
    }
  }
  
  type Properties = dxCalendarOptions
  
  trait ValueChangedEvent
    extends StObject
       with NativeEventInfo[dxCalendar, KeyboardEvent | MouseEvent | PointerEvent | TouchEvent | Event]
       with ValueChangedInfo
  object ValueChangedEvent {
    
    inline def apply(component: dxCalendar, element: DxElement_[HTMLElement]): ValueChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValueChangedEvent]
    }
  }
}
