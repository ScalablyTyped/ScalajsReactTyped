package typingsJapgolly.devextreme.mod.DevExpress.ui

import org.scalajs.dom.ClipboardEvent
import org.scalajs.dom.Event
import org.scalajs.dom.FocusEvent
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.MouseEvent
import org.scalajs.dom.PointerEvent
import org.scalajs.dom.UIEvent
import typingsJapgolly.devextreme.anon.UIEventtargetHTMLInputEle
import typingsJapgolly.devextreme.mod.DevExpress.core.DxElement_
import typingsJapgolly.devextreme.mod.DevExpress.events.ChangedOptionInfo
import typingsJapgolly.devextreme.mod.DevExpress.events.EventInfo
import typingsJapgolly.devextreme.mod.DevExpress.events.InitializedEventInfo
import typingsJapgolly.devextreme.mod.DevExpress.events.NativeEventInfo
import typingsJapgolly.devextreme.mod.DevExpress.ui.Editor.ValueChangedInfo
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxDropDownEditor.DropDownButtonTemplateDataModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dxColorBox {
  
  type ChangeEvent = NativeEventInfo[dxColorBox, Event]
  
  type ClosedEvent = EventInfo[dxColorBox]
  
  type CopyEvent = NativeEventInfo[dxColorBox, ClipboardEvent]
  
  type CutEvent = NativeEventInfo[dxColorBox, ClipboardEvent]
  
  type DisposingEvent = EventInfo[dxColorBox]
  
  type DropDownButtonTemplateData = DropDownButtonTemplateDataModel
  
  type EnterKeyEvent = NativeEventInfo[dxColorBox, KeyboardEvent]
  
  type FocusInEvent = NativeEventInfo[dxColorBox, FocusEvent]
  
  type FocusOutEvent = NativeEventInfo[dxColorBox, FocusEvent]
  
  type InitializedEvent = InitializedEventInfo[dxColorBox]
  
  type InputEvent = NativeEventInfo[dxColorBox, UIEventtargetHTMLInputEle]
  
  type KeyDownEvent = NativeEventInfo[dxColorBox, KeyboardEvent]
  
  type KeyPressEvent = NativeEventInfo[dxColorBox, KeyboardEvent]
  
  type KeyUpEvent = NativeEventInfo[dxColorBox, KeyboardEvent]
  
  type OpenedEvent = EventInfo[dxColorBox]
  
  trait OptionChangedEvent
    extends StObject
       with EventInfo[dxColorBox]
       with ChangedOptionInfo
  object OptionChangedEvent {
    
    inline def apply(component: dxColorBox, element: DxElement_[HTMLElement], fullName: String, name: String): OptionChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionChangedEvent]
    }
  }
  
  type PasteEvent = NativeEventInfo[dxColorBox, ClipboardEvent]
  
  type Properties = dxColorBoxOptions
  
  trait ValueChangedEvent
    extends StObject
       with NativeEventInfo[dxColorBox, KeyboardEvent | MouseEvent | PointerEvent | UIEvent | Event]
       with ValueChangedInfo
  object ValueChangedEvent {
    
    inline def apply(component: dxColorBox, element: DxElement_[HTMLElement]): ValueChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValueChangedEvent]
    }
  }
}
