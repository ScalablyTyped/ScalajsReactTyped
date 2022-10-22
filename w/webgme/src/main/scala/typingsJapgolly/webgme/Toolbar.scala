package typingsJapgolly.webgme

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Toolbar {
  
  type ClickFn = js.Function0[Unit]
  
  trait Toolbar extends StObject {
    
    def add(item: ToolbarItem): ToolbarButton
    
    def addButton(params: ToolbarParams): ToolbarButton
    
    def addCheckBox(): ToolbarCheckBox
    
    def addColorPicker(params: ToolbarParams): ToolbarColorPicker
    
    def addDropDownButton(params: ToolbarParams): ToolbarDropDownButton
    
    def addLabel(): ToolbarLabel
    
    def addRadioButtonGroup(clickFn: ClickFn): ToolbarRadioButtonGroup
    
    def addSeparator(): ToolbarSeparator
    
    def addTextBox(params: ToolbarParams): ToolbarTextBox
    
    def addToggleButton(params: ToolbarParams): ToolbarToggleButton
    
    def refresh(): Unit
  }
  object Toolbar {
    
    inline def apply(
      add: ToolbarItem => ToolbarButton,
      addButton: ToolbarParams => ToolbarButton,
      addCheckBox: CallbackTo[ToolbarCheckBox],
      addColorPicker: ToolbarParams => ToolbarColorPicker,
      addDropDownButton: ToolbarParams => ToolbarDropDownButton,
      addLabel: CallbackTo[ToolbarLabel],
      addRadioButtonGroup: ClickFn => ToolbarRadioButtonGroup,
      addSeparator: CallbackTo[ToolbarSeparator],
      addTextBox: ToolbarParams => ToolbarTextBox,
      addToggleButton: ToolbarParams => ToolbarToggleButton,
      refresh: Callback
    ): typingsJapgolly.webgme.Toolbar.Toolbar = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), addButton = js.Any.fromFunction1(addButton), addCheckBox = addCheckBox.toJsFn, addColorPicker = js.Any.fromFunction1(addColorPicker), addDropDownButton = js.Any.fromFunction1(addDropDownButton), addLabel = addLabel.toJsFn, addRadioButtonGroup = js.Any.fromFunction1(addRadioButtonGroup), addSeparator = addSeparator.toJsFn, addTextBox = js.Any.fromFunction1(addTextBox), addToggleButton = js.Any.fromFunction1(addToggleButton), refresh = refresh.toJsFn)
      __obj.asInstanceOf[typingsJapgolly.webgme.Toolbar.Toolbar]
    }
    
    extension [Self <: typingsJapgolly.webgme.Toolbar.Toolbar](x: Self) {
      
      inline def setAdd(value: ToolbarItem => ToolbarButton): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
      
      inline def setAddButton(value: ToolbarParams => ToolbarButton): Self = StObject.set(x, "addButton", js.Any.fromFunction1(value))
      
      inline def setAddCheckBox(value: CallbackTo[ToolbarCheckBox]): Self = StObject.set(x, "addCheckBox", value.toJsFn)
      
      inline def setAddColorPicker(value: ToolbarParams => ToolbarColorPicker): Self = StObject.set(x, "addColorPicker", js.Any.fromFunction1(value))
      
      inline def setAddDropDownButton(value: ToolbarParams => ToolbarDropDownButton): Self = StObject.set(x, "addDropDownButton", js.Any.fromFunction1(value))
      
      inline def setAddLabel(value: CallbackTo[ToolbarLabel]): Self = StObject.set(x, "addLabel", value.toJsFn)
      
      inline def setAddRadioButtonGroup(value: ClickFn => ToolbarRadioButtonGroup): Self = StObject.set(x, "addRadioButtonGroup", js.Any.fromFunction1(value))
      
      inline def setAddSeparator(value: CallbackTo[ToolbarSeparator]): Self = StObject.set(x, "addSeparator", value.toJsFn)
      
      inline def setAddTextBox(value: ToolbarParams => ToolbarTextBox): Self = StObject.set(x, "addTextBox", js.Any.fromFunction1(value))
      
      inline def setAddToggleButton(value: ToolbarParams => ToolbarToggleButton): Self = StObject.set(x, "addToggleButton", js.Any.fromFunction1(value))
      
      inline def setRefresh(value: Callback): Self = StObject.set(x, "refresh", value.toJsFn)
    }
  }
  
  type ToolbarButton = ToolbarItem
  
  type ToolbarCheckBox = ToolbarItem
  
  type ToolbarColorPicker = ToolbarItem
  
  trait ToolbarDropDownButton
    extends StObject
       with ToolbarItem {
    
    def addButton(params: ToolbarParams): ToolbarButton
  }
  object ToolbarDropDownButton {
    
    inline def apply(
      addButton: ToolbarParams => ToolbarButton,
      destroy: Callback,
      enabled: Boolean => Callback,
      hide: Callback,
      show: Callback
    ): ToolbarDropDownButton = {
      val __obj = js.Dynamic.literal(addButton = js.Any.fromFunction1(addButton), destroy = destroy.toJsFn, enabled = js.Any.fromFunction1((t0: Boolean) => enabled(t0).runNow()), hide = hide.toJsFn, show = show.toJsFn)
      __obj.asInstanceOf[ToolbarDropDownButton]
    }
    
    extension [Self <: ToolbarDropDownButton](x: Self) {
      
      inline def setAddButton(value: ToolbarParams => ToolbarButton): Self = StObject.set(x, "addButton", js.Any.fromFunction1(value))
    }
  }
  
  trait ToolbarItem extends StObject {
    
    def destroy(): Unit
    
    def enabled(value: Boolean): Unit
    
    def hide(): Unit
    
    def show(): Unit
  }
  object ToolbarItem {
    
    inline def apply(destroy: Callback, enabled: Boolean => Callback, hide: Callback, show: Callback): ToolbarItem = {
      val __obj = js.Dynamic.literal(destroy = destroy.toJsFn, enabled = js.Any.fromFunction1((t0: Boolean) => enabled(t0).runNow()), hide = hide.toJsFn, show = show.toJsFn)
      __obj.asInstanceOf[ToolbarItem]
    }
    
    extension [Self <: ToolbarItem](x: Self) {
      
      inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
      
      inline def setEnabled(value: Boolean => Callback): Self = StObject.set(x, "enabled", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
      
      inline def setHide(value: Callback): Self = StObject.set(x, "hide", value.toJsFn)
      
      inline def setShow(value: Callback): Self = StObject.set(x, "show", value.toJsFn)
    }
  }
  
  type ToolbarLabel = ToolbarItem
  
  trait ToolbarParams extends StObject
  
  type ToolbarRadioButtonGroup = ToolbarButton
  
  type ToolbarSeparator = ToolbarItem
  
  type ToolbarTextBox = ToolbarItem
  
  type ToolbarToggleButton = ToolbarButton
}
