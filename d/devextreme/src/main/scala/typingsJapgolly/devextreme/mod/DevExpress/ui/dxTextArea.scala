package typingsJapgolly.devextreme.mod.DevExpress.ui

import org.scalajs.dom.ClipboardEvent
import org.scalajs.dom.Event
import org.scalajs.dom.FocusEvent
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.MouseEvent
import org.scalajs.dom.PointerEvent
import org.scalajs.dom.TouchEvent
import typingsJapgolly.devextreme.anon.UIEventtargetHTMLInputEle
import typingsJapgolly.devextreme.mod.DevExpress.core.DxElement_
import typingsJapgolly.devextreme.mod.DevExpress.events.ChangedOptionInfo
import typingsJapgolly.devextreme.mod.DevExpress.events.EventInfo
import typingsJapgolly.devextreme.mod.DevExpress.events.InitializedEventInfo
import typingsJapgolly.devextreme.mod.DevExpress.events.NativeEventInfo
import typingsJapgolly.devextreme.mod.DevExpress.ui.Editor.ValueChangedInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dxTextArea {
  
  type ChangeEvent = NativeEventInfo[dxTextArea, Event]
  
  type ContentReadyEvent = EventInfo[dxTextArea]
  
  type CopyEvent = NativeEventInfo[dxTextArea, ClipboardEvent]
  
  type CutEvent = NativeEventInfo[dxTextArea, ClipboardEvent]
  
  type DisposingEvent = EventInfo[dxTextArea]
  
  type EnterKeyEvent = NativeEventInfo[dxTextArea, KeyboardEvent]
  
  type FocusInEvent = NativeEventInfo[dxTextArea, FocusEvent]
  
  type FocusOutEvent = NativeEventInfo[dxTextArea, FocusEvent]
  
  type InitializedEvent = InitializedEventInfo[dxTextArea]
  
  type InputEvent = NativeEventInfo[dxTextArea, UIEventtargetHTMLInputEle]
  
  type KeyDownEvent = NativeEventInfo[dxTextArea, KeyboardEvent]
  
  type KeyPressEvent = NativeEventInfo[dxTextArea, KeyboardEvent]
  
  type KeyUpEvent = NativeEventInfo[dxTextArea, KeyboardEvent]
  
  trait OptionChangedEvent
    extends StObject
       with EventInfo[dxTextArea]
       with ChangedOptionInfo
  object OptionChangedEvent {
    
    inline def apply(component: dxTextArea, element: DxElement_[HTMLElement], fullName: String, name: String): OptionChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionChangedEvent]
    }
  }
  
  type PasteEvent = NativeEventInfo[dxTextArea, ClipboardEvent]
  
  type Properties = dxTextAreaOptions
  
  trait ValueChangedEvent
    extends StObject
       with NativeEventInfo[dxTextArea, KeyboardEvent | MouseEvent | PointerEvent | TouchEvent | Event]
       with ValueChangedInfo
  object ValueChangedEvent {
    
    inline def apply(component: dxTextArea, element: DxElement_[HTMLElement]): ValueChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValueChangedEvent]
    }
  }
}
