package typingsJapgolly.devextreme.mod.DevExpress.ui

import org.scalajs.dom.ClipboardEvent
import org.scalajs.dom.Event
import org.scalajs.dom.FocusEvent
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.MouseEvent
import org.scalajs.dom.PointerEvent
import typingsJapgolly.devextreme.anon.UIEventtargetHTMLInputEle
import typingsJapgolly.devextreme.mod.DevExpress.core.DxElement_
import typingsJapgolly.devextreme.mod.DevExpress.events.ChangedOptionInfo
import typingsJapgolly.devextreme.mod.DevExpress.events.EventInfo
import typingsJapgolly.devextreme.mod.DevExpress.events.InitializedEventInfo
import typingsJapgolly.devextreme.mod.DevExpress.events.NativeEventInfo
import typingsJapgolly.devextreme.mod.DevExpress.ui.Editor.ValueChangedInfo
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxCalendar.ComponentDisabledDate
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxDropDownEditor.DropDownButtonTemplateDataModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxDateBox
  extends StObject
     with dxDropDownEditor[dxDateBoxOptions]
object dxDateBox {
  
  type ChangeEvent = NativeEventInfo[dxDateBox, Event]
  
  type ClosedEvent = EventInfo[dxDateBox]
  
  type ContentReadyEvent = EventInfo[dxDateBox]
  
  type CopyEvent = NativeEventInfo[dxDateBox, ClipboardEvent]
  
  type CutEvent = NativeEventInfo[dxDateBox, ClipboardEvent]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.devextreme.devextremeStrings.calendar
    - typingsJapgolly.devextreme.devextremeStrings.list
    - typingsJapgolly.devextreme.devextremeStrings.native
    - typingsJapgolly.devextreme.devextremeStrings.rollers
  */
  trait DatePickerType extends StObject
  object DatePickerType {
    
    inline def calendar: typingsJapgolly.devextreme.devextremeStrings.calendar = "calendar".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.calendar]
    
    inline def list: typingsJapgolly.devextreme.devextremeStrings.list = "list".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.list]
    
    inline def native: typingsJapgolly.devextreme.devextremeStrings.native = "native".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.native]
    
    inline def rollers: typingsJapgolly.devextreme.devextremeStrings.rollers = "rollers".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.rollers]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.devextreme.devextremeStrings.date
    - typingsJapgolly.devextreme.devextremeStrings.datetime
    - typingsJapgolly.devextreme.devextremeStrings.time
  */
  trait DateType extends StObject
  object DateType {
    
    inline def date: typingsJapgolly.devextreme.devextremeStrings.date = "date".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.date]
    
    inline def datetime: typingsJapgolly.devextreme.devextremeStrings.datetime = "datetime".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.datetime]
    
    inline def time: typingsJapgolly.devextreme.devextremeStrings.time = "time".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.time]
  }
  
  type DisabledDate = ComponentDisabledDate[dxDateBox]
  
  type DisposingEvent = EventInfo[dxDateBox]
  
  type DropDownButtonTemplateData = DropDownButtonTemplateDataModel
  
  type EnterKeyEvent = NativeEventInfo[dxDateBox, KeyboardEvent]
  
  type FocusInEvent = NativeEventInfo[dxDateBox, FocusEvent]
  
  type FocusOutEvent = NativeEventInfo[dxDateBox, FocusEvent]
  
  type InitializedEvent = InitializedEventInfo[dxDateBox]
  
  type InputEvent = NativeEventInfo[dxDateBox, UIEventtargetHTMLInputEle]
  
  type KeyDownEvent = NativeEventInfo[dxDateBox, KeyboardEvent]
  
  type KeyPressEvent = NativeEventInfo[dxDateBox, KeyboardEvent]
  
  type KeyUpEvent = NativeEventInfo[dxDateBox, KeyboardEvent]
  
  type OpenedEvent = EventInfo[dxDateBox]
  
  trait OptionChangedEvent
    extends StObject
       with EventInfo[dxDateBox]
       with ChangedOptionInfo
  object OptionChangedEvent {
    
    inline def apply(component: dxDateBox, element: DxElement_[HTMLElement], fullName: String, name: String): OptionChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionChangedEvent]
    }
  }
  
  type PasteEvent = NativeEventInfo[dxDateBox, ClipboardEvent]
  
  type Properties = dxDateBoxOptions
  
  trait ValueChangedEvent
    extends StObject
       with NativeEventInfo[dxDateBox, KeyboardEvent | MouseEvent | PointerEvent | Event]
       with ValueChangedInfo
  object ValueChangedEvent {
    
    inline def apply(component: dxDateBox, element: DxElement_[HTMLElement]): ValueChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValueChangedEvent]
    }
  }
}
