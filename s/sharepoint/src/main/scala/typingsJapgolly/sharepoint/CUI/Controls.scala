package typingsJapgolly.sharepoint.CUI

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.Event
import org.scalajs.dom.FocusEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Controls {
  
  trait Button
    extends StObject
       with Control
       with ISelectableControl {
    
    def createComponentForDisplayModeInternal(displayMode: String): Any
    
    def createDOMElementForDisplayMode(displayMode: String): Any
    
    def deselect(): scala.Unit
    
    def focusOnDisplayedComponent(): scala.Unit
    
    def getCommandValueId(): String
    
    def getDropDownDOMElementForDisplayMode(displayMode: String): scala.Unit
    
    def getLabel(): String
    
    def getMenuItemId(): String
    
    def getTextValue(): String
    
    def handleMouseBlur(e: FocusEvent): Any
    
    def handleMouseFocus(e: FocusEvent): Any
    
    def handleTabBlur(e: FocusEvent): Any
    
    def handleTabFocus(e: FocusEvent): Any
    
    def onClick(e: Event): scala.Unit
    
    def onEnabledChanged(enabled: Boolean): Any
    
    def onMenuClosed(): scala.Unit
    
    def receiveFocus(): scala.Unit
  }
  object Button {
    
    inline def apply(
      createComponentForDisplayMode: String => Any,
      createComponentForDisplayModeInternal: String => Any,
      createDOMElementForDisplayMode: String => Any,
      deselect: Callback,
      dispose: Callback,
      focusOnDisplayedComponent: Callback,
      getCommandValueId: CallbackTo[String],
      getDropDownDOMElementForDisplayMode: String => Callback,
      getLabel: CallbackTo[String],
      getMenuItemId: CallbackTo[String],
      getTextValue: CallbackTo[String],
      get_enabled: CallbackTo[Boolean],
      get_id: CallbackTo[String],
      get_root: CallbackTo[Root],
      handleMouseBlur: FocusEvent => Any,
      handleMouseFocus: FocusEvent => Any,
      handleTabBlur: FocusEvent => Any,
      handleTabFocus: FocusEvent => Any,
      onClick: Event => Callback,
      onEnabledChanged: Boolean => Any,
      onMenuClosed: Callback,
      receiveFocus: Callback,
      set_enabled: Boolean => Boolean
    ): Button = {
      val __obj = js.Dynamic.literal(createComponentForDisplayMode = js.Any.fromFunction1(createComponentForDisplayMode), createComponentForDisplayModeInternal = js.Any.fromFunction1(createComponentForDisplayModeInternal), createDOMElementForDisplayMode = js.Any.fromFunction1(createDOMElementForDisplayMode), deselect = deselect.toJsFn, dispose = dispose.toJsFn, focusOnDisplayedComponent = focusOnDisplayedComponent.toJsFn, getCommandValueId = getCommandValueId.toJsFn, getDropDownDOMElementForDisplayMode = js.Any.fromFunction1((t0: String) => getDropDownDOMElementForDisplayMode(t0).runNow()), getLabel = getLabel.toJsFn, getMenuItemId = getMenuItemId.toJsFn, getTextValue = getTextValue.toJsFn, get_enabled = get_enabled.toJsFn, get_id = get_id.toJsFn, get_root = get_root.toJsFn, handleMouseBlur = js.Any.fromFunction1(handleMouseBlur), handleMouseFocus = js.Any.fromFunction1(handleMouseFocus), handleTabBlur = js.Any.fromFunction1(handleTabBlur), handleTabFocus = js.Any.fromFunction1(handleTabFocus), onClick = js.Any.fromFunction1((t0: Event) => onClick(t0).runNow()), onEnabledChanged = js.Any.fromFunction1(onEnabledChanged), onMenuClosed = onMenuClosed.toJsFn, receiveFocus = receiveFocus.toJsFn, set_enabled = js.Any.fromFunction1(set_enabled))
      __obj.asInstanceOf[Button]
    }
    
    extension [Self <: Button](x: Self) {
      
      inline def setCreateComponentForDisplayModeInternal(value: String => Any): Self = StObject.set(x, "createComponentForDisplayModeInternal", js.Any.fromFunction1(value))
      
      inline def setCreateDOMElementForDisplayMode(value: String => Any): Self = StObject.set(x, "createDOMElementForDisplayMode", js.Any.fromFunction1(value))
      
      inline def setDeselect(value: Callback): Self = StObject.set(x, "deselect", value.toJsFn)
      
      inline def setFocusOnDisplayedComponent(value: Callback): Self = StObject.set(x, "focusOnDisplayedComponent", value.toJsFn)
      
      inline def setGetCommandValueId(value: CallbackTo[String]): Self = StObject.set(x, "getCommandValueId", value.toJsFn)
      
      inline def setGetDropDownDOMElementForDisplayMode(value: String => Callback): Self = StObject.set(x, "getDropDownDOMElementForDisplayMode", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setGetLabel(value: CallbackTo[String]): Self = StObject.set(x, "getLabel", value.toJsFn)
      
      inline def setGetMenuItemId(value: CallbackTo[String]): Self = StObject.set(x, "getMenuItemId", value.toJsFn)
      
      inline def setGetTextValue(value: CallbackTo[String]): Self = StObject.set(x, "getTextValue", value.toJsFn)
      
      inline def setHandleMouseBlur(value: FocusEvent => Any): Self = StObject.set(x, "handleMouseBlur", js.Any.fromFunction1(value))
      
      inline def setHandleMouseFocus(value: FocusEvent => Any): Self = StObject.set(x, "handleMouseFocus", js.Any.fromFunction1(value))
      
      inline def setHandleTabBlur(value: FocusEvent => Any): Self = StObject.set(x, "handleTabBlur", js.Any.fromFunction1(value))
      
      inline def setHandleTabFocus(value: FocusEvent => Any): Self = StObject.set(x, "handleTabFocus", js.Any.fromFunction1(value))
      
      inline def setOnClick(value: Event => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: Event) => value(t0).runNow()))
      
      inline def setOnEnabledChanged(value: Boolean => Any): Self = StObject.set(x, "onEnabledChanged", js.Any.fromFunction1(value))
      
      inline def setOnMenuClosed(value: Callback): Self = StObject.set(x, "onMenuClosed", value.toJsFn)
      
      inline def setReceiveFocus(value: Callback): Self = StObject.set(x, "receiveFocus", value.toJsFn)
    }
  }
  
  type CheckBox = ToggleButton
  
  trait CheckBoxCommandProperties extends StObject
  
  trait ColorPicker
    extends StObject
       with Control
  object ColorPicker {
    
    inline def apply(
      createComponentForDisplayMode: String => Any,
      dispose: Callback,
      get_enabled: CallbackTo[Boolean],
      get_id: CallbackTo[String],
      get_root: CallbackTo[Root],
      set_enabled: Boolean => Boolean
    ): ColorPicker = {
      val __obj = js.Dynamic.literal(createComponentForDisplayMode = js.Any.fromFunction1(createComponentForDisplayMode), dispose = dispose.toJsFn, get_enabled = get_enabled.toJsFn, get_id = get_id.toJsFn, get_root = get_root.toJsFn, set_enabled = js.Any.fromFunction1(set_enabled))
      __obj.asInstanceOf[ColorPicker]
    }
  }
  
  trait ColorPickerCommandProperties extends StObject
  
  type ComboBox = DropDown
  
  type ContextMenuControlProperties = MenuLauncherControlProperties
  
  type DropDown = MenuLauncher
  
  trait DropDownCommandProperties extends StObject {
    
    var SelectedItemId: String
    
    var Value: String
  }
  object DropDownCommandProperties {
    
    inline def apply(SelectedItemId: String, Value: String): DropDownCommandProperties = {
      val __obj = js.Dynamic.literal(SelectedItemId = SelectedItemId.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
      __obj.asInstanceOf[DropDownCommandProperties]
    }
    
    extension [Self <: DropDownCommandProperties](x: Self) {
      
      inline def setSelectedItemId(value: String): Self = StObject.set(x, "SelectedItemId", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    }
  }
  
  type FlyoutAnchor = MenuLauncher
  
  trait GalleryButton
    extends StObject
       with Control
       with ISelectableControl
  object GalleryButton {
    
    inline def apply(
      createComponentForDisplayMode: String => Any,
      dispose: Callback,
      get_enabled: CallbackTo[Boolean],
      get_id: CallbackTo[String],
      get_root: CallbackTo[Root],
      set_enabled: Boolean => Boolean
    ): GalleryButton = {
      val __obj = js.Dynamic.literal(createComponentForDisplayMode = js.Any.fromFunction1(createComponentForDisplayMode), dispose = dispose.toJsFn, get_enabled = get_enabled.toJsFn, get_id = get_id.toJsFn, get_root = get_root.toJsFn, set_enabled = js.Any.fromFunction1(set_enabled))
      __obj.asInstanceOf[GalleryButton]
    }
  }
  
  trait GalleryButtonCommandProperties extends StObject
  
  type InsertTable = Control
  
  trait InsertTableCommandProperties extends StObject
  
  type JewelMenuLauncher = MenuLauncher
  
  type Label = Control
  
  trait LabelCommandProperties extends StObject
  
  type MRUSplitButton = DropDown
  
  type Separator = Control
  
  type Spinner = Control
  
  trait SpinnerCommandProperties extends StObject
  
  type SplitButton = MenuLauncher
  
  type TextBox = Control
  
  trait TextBoxCommandProperties extends StObject
  
  trait ToggleButton
    extends StObject
       with Control
       with ISelectableControl
  object ToggleButton {
    
    inline def apply(
      createComponentForDisplayMode: String => Any,
      dispose: Callback,
      get_enabled: CallbackTo[Boolean],
      get_id: CallbackTo[String],
      get_root: CallbackTo[Root],
      set_enabled: Boolean => Boolean
    ): ToggleButton = {
      val __obj = js.Dynamic.literal(createComponentForDisplayMode = js.Any.fromFunction1(createComponentForDisplayMode), dispose = dispose.toJsFn, get_enabled = get_enabled.toJsFn, get_id = get_id.toJsFn, get_root = get_root.toJsFn, set_enabled = js.Any.fromFunction1(set_enabled))
      __obj.asInstanceOf[ToggleButton]
    }
  }
  
  trait ToggleButtonCommandProperties extends StObject
}
