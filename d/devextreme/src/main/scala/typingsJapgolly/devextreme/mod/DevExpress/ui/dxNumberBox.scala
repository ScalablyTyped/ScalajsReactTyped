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

object dxNumberBox {
  
  type ChangeEvent = NativeEventInfo[dxNumberBox, Event]
  
  type ContentReadyEvent = EventInfo[dxNumberBox]
  
  type CopyEvent = NativeEventInfo[dxNumberBox, ClipboardEvent]
  
  type CutEvent = NativeEventInfo[dxNumberBox, ClipboardEvent]
  
  type DisposingEvent = EventInfo[dxNumberBox]
  
  type EnterKeyEvent = NativeEventInfo[dxNumberBox, KeyboardEvent]
  
  type FocusInEvent = NativeEventInfo[dxNumberBox, FocusEvent]
  
  type FocusOutEvent = NativeEventInfo[dxNumberBox, FocusEvent]
  
  type InitializedEvent = InitializedEventInfo[dxNumberBox]
  
  type InputEvent = NativeEventInfo[dxNumberBox, UIEventtargetHTMLInputEle]
  
  type KeyDownEvent = NativeEventInfo[dxNumberBox, KeyboardEvent]
  
  type KeyPressEvent = NativeEventInfo[dxNumberBox, KeyboardEvent]
  
  type KeyUpEvent = NativeEventInfo[dxNumberBox, KeyboardEvent]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.devextreme.devextremeStrings.clear
    - typingsJapgolly.devextreme.devextremeStrings.spins
  */
  trait NumberBoxPredefinedButton extends StObject
  object NumberBoxPredefinedButton {
    
    inline def clear: typingsJapgolly.devextreme.devextremeStrings.clear = "clear".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.clear]
    
    inline def spins: typingsJapgolly.devextreme.devextremeStrings.spins = "spins".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.spins]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.devextreme.devextremeStrings.number
    - typingsJapgolly.devextreme.devextremeStrings.text
    - typingsJapgolly.devextreme.devextremeStrings.tel
  */
  trait NumberBoxType extends StObject
  object NumberBoxType {
    
    inline def number: typingsJapgolly.devextreme.devextremeStrings.number = "number".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.number]
    
    inline def tel: typingsJapgolly.devextreme.devextremeStrings.tel = "tel".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.tel]
    
    inline def text: typingsJapgolly.devextreme.devextremeStrings.text = "text".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.text]
  }
  
  trait OptionChangedEvent
    extends StObject
       with EventInfo[dxNumberBox]
       with ChangedOptionInfo
  object OptionChangedEvent {
    
    inline def apply(component: dxNumberBox, element: DxElement_[HTMLElement], fullName: String, name: String): OptionChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionChangedEvent]
    }
  }
  
  type PasteEvent = NativeEventInfo[dxNumberBox, ClipboardEvent]
  
  type Properties = dxNumberBoxOptions
  
  trait ValueChangedEvent
    extends StObject
       with NativeEventInfo[dxNumberBox, KeyboardEvent | MouseEvent | PointerEvent | TouchEvent | Event]
       with ValueChangedInfo
  object ValueChangedEvent {
    
    inline def apply(component: dxNumberBox, element: DxElement_[HTMLElement]): ValueChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValueChangedEvent]
    }
  }
}
