package typingsJapgolly.devextreme.mod.DevExpress.ui

import org.scalajs.dom.Event
import org.scalajs.dom.FocusEvent
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.MouseEvent
import org.scalajs.dom.PointerEvent
import typingsJapgolly.devextreme.anon.UIEventtargetHTMLInputEle
import typingsJapgolly.devextreme.mod.DevExpress.core.DxElement_
import typingsJapgolly.devextreme.mod.DevExpress.events.Cancelable
import typingsJapgolly.devextreme.mod.DevExpress.events.ChangedOptionInfo
import typingsJapgolly.devextreme.mod.DevExpress.events.EventInfo
import typingsJapgolly.devextreme.mod.DevExpress.events.InitializedEventInfo
import typingsJapgolly.devextreme.mod.DevExpress.events.ItemInfo
import typingsJapgolly.devextreme.mod.DevExpress.events.NativeEventInfo
import typingsJapgolly.devextreme.mod.DevExpress.ui.CollectionWidget.SelectionChangedInfo
import typingsJapgolly.devextreme.mod.DevExpress.ui.Editor.ValueChangedInfo
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxDropDownEditor.DropDownButtonTemplateDataModel
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxSelectBox.CustomItemCreatingInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dxTagBox {
  
  type ChangeEvent = NativeEventInfo[dxTagBox, Event]
  
  type ClosedEvent = EventInfo[dxTagBox]
  
  type ContentReadyEvent = EventInfo[dxTagBox]
  
  trait CustomItemCreatingEvent
    extends StObject
       with EventInfo[dxTagBox]
       with CustomItemCreatingInfo
  object CustomItemCreatingEvent {
    
    inline def apply(component: dxTagBox, element: DxElement_[HTMLElement]): CustomItemCreatingEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomItemCreatingEvent]
    }
  }
  
  type DisposingEvent = EventInfo[dxTagBox]
  
  type DropDownButtonTemplateData = DropDownButtonTemplateDataModel
  
  type EnterKeyEvent = NativeEventInfo[dxTagBox, KeyboardEvent]
  
  type FocusInEvent = NativeEventInfo[dxTagBox, FocusEvent]
  
  type FocusOutEvent = NativeEventInfo[dxTagBox, FocusEvent]
  
  type InitializedEvent = InitializedEventInfo[dxTagBox]
  
  type InputEvent = NativeEventInfo[dxTagBox, UIEventtargetHTMLInputEle]
  
  trait ItemClickEvent
    extends StObject
       with NativeEventInfo[dxTagBox, Event]
       with ItemInfo[Any]
  object ItemClickEvent {
    
    inline def apply(
      component: dxTagBox,
      element: DxElement_[HTMLElement],
      itemElement: DxElement_[HTMLElement],
      itemIndex: Double
    ): ItemClickEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], itemElement = itemElement.asInstanceOf[js.Any], itemIndex = itemIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[ItemClickEvent]
    }
  }
  
  type KeyDownEvent = NativeEventInfo[dxTagBox, KeyboardEvent]
  
  type KeyPressEvent = NativeEventInfo[dxTagBox, KeyboardEvent]
  
  type KeyUpEvent = NativeEventInfo[dxTagBox, KeyboardEvent]
  
  trait MultiTagPreparingEvent
    extends StObject
       with Cancelable
       with EventInfo[dxTagBox] {
    
    val multiTagElement: DxElement_[HTMLElement]
    
    val selectedItems: js.UndefOr[js.Array[String | Double | Any]] = js.undefined
    
    var text: js.UndefOr[String] = js.undefined
  }
  object MultiTagPreparingEvent {
    
    inline def apply(component: dxTagBox, element: DxElement_[HTMLElement], multiTagElement: DxElement_[HTMLElement]): MultiTagPreparingEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], multiTagElement = multiTagElement.asInstanceOf[js.Any])
      __obj.asInstanceOf[MultiTagPreparingEvent]
    }
    
    extension [Self <: MultiTagPreparingEvent](x: Self) {
      
      inline def setMultiTagElement(value: DxElement_[HTMLElement]): Self = StObject.set(x, "multiTagElement", value.asInstanceOf[js.Any])
      
      inline def setSelectedItems(value: js.Array[String | Double | Any]): Self = StObject.set(x, "selectedItems", value.asInstanceOf[js.Any])
      
      inline def setSelectedItemsUndefined: Self = StObject.set(x, "selectedItems", js.undefined)
      
      inline def setSelectedItemsVarargs(value: (String | Double | Any)*): Self = StObject.set(x, "selectedItems", js.Array(value*))
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  type OpenedEvent = EventInfo[dxTagBox]
  
  trait OptionChangedEvent
    extends StObject
       with EventInfo[dxTagBox]
       with ChangedOptionInfo
  object OptionChangedEvent {
    
    inline def apply(component: dxTagBox, element: DxElement_[HTMLElement], fullName: String, name: String): OptionChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionChangedEvent]
    }
  }
  
  type Properties = dxTagBoxOptions
  
  trait SelectAllValueChangedEvent
    extends StObject
       with EventInfo[dxTagBox] {
    
    val value: Boolean
  }
  object SelectAllValueChangedEvent {
    
    inline def apply(component: dxTagBox, element: DxElement_[HTMLElement], value: Boolean): SelectAllValueChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectAllValueChangedEvent]
    }
    
    extension [Self <: SelectAllValueChangedEvent](x: Self) {
      
      inline def setValue(value: Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait SelectionChangedEvent
    extends StObject
       with EventInfo[dxTagBox]
       with SelectionChangedInfo[String | Double | Any]
  object SelectionChangedEvent {
    
    inline def apply(
      addedItems: js.Array[String | Double | Any],
      component: dxTagBox,
      element: DxElement_[HTMLElement],
      removedItems: js.Array[String | Double | Any]
    ): SelectionChangedEvent = {
      val __obj = js.Dynamic.literal(addedItems = addedItems.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], removedItems = removedItems.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectionChangedEvent]
    }
  }
  
  trait ValueChangedEvent
    extends StObject
       with NativeEventInfo[dxTagBox, KeyboardEvent | MouseEvent | PointerEvent | Event]
       with ValueChangedInfo
  object ValueChangedEvent {
    
    inline def apply(component: dxTagBox, element: DxElement_[HTMLElement]): ValueChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValueChangedEvent]
    }
  }
}
