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
import typingsJapgolly.devextreme.mod.DevExpress.events.ItemInfo
import typingsJapgolly.devextreme.mod.DevExpress.events.NativeEventInfo
import typingsJapgolly.devextreme.mod.DevExpress.ui.Editor.ValueChangedInfo
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxDropDownEditor.DropDownButtonTemplateDataModel
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxDropDownList.SelectionChangedInfo
import typingsJapgolly.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dxSelectBox {
  
  type ChangeEvent = NativeEventInfo[dxSelectBox[Properties], Event]
  
  type ClosedEvent = EventInfo[dxSelectBox[Properties]]
  
  type ContentReadyEvent = EventInfo[dxSelectBox[Properties]]
  
  type CopyEvent = NativeEventInfo[dxSelectBox[Properties], ClipboardEvent]
  
  trait CustomItemCreatingEvent
    extends StObject
       with EventInfo[dxSelectBox[Properties]]
       with CustomItemCreatingInfo
  object CustomItemCreatingEvent {
    
    inline def apply(component: dxSelectBox[Properties], element: DxElement_[HTMLElement]): CustomItemCreatingEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomItemCreatingEvent]
    }
  }
  
  trait CustomItemCreatingInfo extends StObject {
    
    var customItem: js.UndefOr[String | Any | PromiseLike[Any]] = js.undefined
    
    val text: js.UndefOr[String] = js.undefined
  }
  object CustomItemCreatingInfo {
    
    inline def apply(): CustomItemCreatingInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CustomItemCreatingInfo]
    }
    
    extension [Self <: CustomItemCreatingInfo](x: Self) {
      
      inline def setCustomItem(value: String | Any | PromiseLike[Any]): Self = StObject.set(x, "customItem", value.asInstanceOf[js.Any])
      
      inline def setCustomItemUndefined: Self = StObject.set(x, "customItem", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  type CutEvent = NativeEventInfo[dxSelectBox[Properties], ClipboardEvent]
  
  type DisposingEvent = EventInfo[dxSelectBox[Properties]]
  
  type DropDownButtonTemplateData = DropDownButtonTemplateDataModel
  
  type EnterKeyEvent = NativeEventInfo[dxSelectBox[Properties], KeyboardEvent]
  
  type FocusInEvent = NativeEventInfo[dxSelectBox[Properties], FocusEvent]
  
  type FocusOutEvent = NativeEventInfo[dxSelectBox[Properties], FocusEvent]
  
  type InitializedEvent = InitializedEventInfo[dxSelectBox[Properties]]
  
  type InputEvent = NativeEventInfo[dxSelectBox[Properties], UIEventtargetHTMLInputEle]
  
  trait ItemClickEvent
    extends StObject
       with NativeEventInfo[dxSelectBox[Properties], KeyboardEvent | MouseEvent | PointerEvent]
       with ItemInfo[Any]
  object ItemClickEvent {
    
    inline def apply(
      component: dxSelectBox[Properties],
      element: DxElement_[HTMLElement],
      itemElement: DxElement_[HTMLElement],
      itemIndex: Double
    ): ItemClickEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], itemElement = itemElement.asInstanceOf[js.Any], itemIndex = itemIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[ItemClickEvent]
    }
  }
  
  type KeyDownEvent = NativeEventInfo[dxSelectBox[Properties], KeyboardEvent]
  
  type KeyPressEvent = NativeEventInfo[dxSelectBox[Properties], KeyboardEvent]
  
  type KeyUpEvent = NativeEventInfo[dxSelectBox[Properties], KeyboardEvent]
  
  type OpenedEvent = EventInfo[dxSelectBox[Properties]]
  
  trait OptionChangedEvent
    extends StObject
       with EventInfo[dxSelectBox[Properties]]
       with ChangedOptionInfo
  object OptionChangedEvent {
    
    inline def apply(
      component: dxSelectBox[Properties],
      element: DxElement_[HTMLElement],
      fullName: String,
      name: String
    ): OptionChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionChangedEvent]
    }
  }
  
  type PasteEvent = NativeEventInfo[dxSelectBox[Properties], ClipboardEvent]
  
  type Properties = dxSelectBoxOptions[SelectBoxInstance]
  
  /**
    * @deprecated Attention! This type is for internal purposes only. If you used it previously, please submit a ticket to our {@link https://supportcenter.devexpress.com/ticket/create Support Center}. We will check if there is an alternative solution.
    */
  @js.native
  trait SelectBoxInstance
    extends StObject
       with dxDropDownList[Properties]
  
  trait SelectionChangedEvent
    extends StObject
       with EventInfo[dxSelectBox[Properties]]
       with SelectionChangedInfo[Any]
  object SelectionChangedEvent {
    
    inline def apply(component: dxSelectBox[Properties], element: DxElement_[HTMLElement], selectedItem: Any): SelectionChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], selectedItem = selectedItem.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectionChangedEvent]
    }
  }
  
  trait ValueChangedEvent
    extends StObject
       with NativeEventInfo[dxSelectBox[Properties], KeyboardEvent | MouseEvent | Event]
       with ValueChangedInfo
  object ValueChangedEvent {
    
    inline def apply(component: dxSelectBox[Properties], element: DxElement_[HTMLElement]): ValueChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValueChangedEvent]
    }
  }
}
