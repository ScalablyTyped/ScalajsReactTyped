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

object dxTextBox {
  
  type ChangeEvent = NativeEventInfo[dxTextBox[Properties], Event]
  
  type ContentReadyEvent = EventInfo[dxTextBox[Properties]]
  
  type CopyEvent = NativeEventInfo[dxTextBox[Properties], ClipboardEvent]
  
  type CutEvent = NativeEventInfo[dxTextBox[Properties], ClipboardEvent]
  
  type DisposingEvent = EventInfo[dxTextBox[Properties]]
  
  type EnterKeyEvent = NativeEventInfo[dxTextBox[Properties], KeyboardEvent]
  
  type FocusInEvent = NativeEventInfo[dxTextBox[Properties], FocusEvent]
  
  type FocusOutEvent = NativeEventInfo[dxTextBox[Properties], FocusEvent]
  
  type InitializedEvent = InitializedEventInfo[dxTextBox[Properties]]
  
  type InputEvent = NativeEventInfo[dxTextBox[Properties], UIEventtargetHTMLInputEle]
  
  type KeyDownEvent = NativeEventInfo[dxTextBox[Properties], KeyboardEvent]
  
  type KeyPressEvent = NativeEventInfo[dxTextBox[Properties], KeyboardEvent]
  
  type KeyUpEvent = NativeEventInfo[dxTextBox[Properties], KeyboardEvent]
  
  trait OptionChangedEvent
    extends StObject
       with EventInfo[dxTextBox[Properties]]
       with ChangedOptionInfo
  object OptionChangedEvent {
    
    inline def apply(component: dxTextBox[Properties], element: DxElement_[HTMLElement], fullName: String, name: String): OptionChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionChangedEvent]
    }
  }
  
  type PasteEvent = NativeEventInfo[dxTextBox[Properties], ClipboardEvent]
  
  type Properties = dxTextBoxOptions[TextBoxInstance]
  
  /**
    * @deprecated Attention! This type is for internal purposes only. If you used it previously, please submit a ticket to our {@link https://supportcenter.devexpress.com/ticket/create Support Center}. We will check if there is an alternative solution.
    */
  @js.native
  trait TextBoxInstance
    extends StObject
       with dxTextEditor[Properties]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.devextreme.devextremeStrings.email
    - typingsJapgolly.devextreme.devextremeStrings.password
    - typingsJapgolly.devextreme.devextremeStrings.search
    - typingsJapgolly.devextreme.devextremeStrings.tel
    - typingsJapgolly.devextreme.devextremeStrings.text
    - typingsJapgolly.devextreme.devextremeStrings.url
  */
  trait TextBoxType extends StObject
  object TextBoxType {
    
    inline def email: typingsJapgolly.devextreme.devextremeStrings.email = "email".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.email]
    
    inline def password: typingsJapgolly.devextreme.devextremeStrings.password = "password".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.password]
    
    inline def search: typingsJapgolly.devextreme.devextremeStrings.search = "search".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.search]
    
    inline def tel: typingsJapgolly.devextreme.devextremeStrings.tel = "tel".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.tel]
    
    inline def text: typingsJapgolly.devextreme.devextremeStrings.text = "text".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.text]
    
    inline def url: typingsJapgolly.devextreme.devextremeStrings.url = "url".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.url]
  }
  
  trait ValueChangedEvent
    extends StObject
       with NativeEventInfo[
          dxTextBox[Properties], 
          KeyboardEvent | MouseEvent | PointerEvent | TouchEvent | Event
        ]
       with ValueChangedInfo
  object ValueChangedEvent {
    
    inline def apply(component: dxTextBox[Properties], element: DxElement_[HTMLElement]): ValueChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValueChangedEvent]
    }
  }
}
