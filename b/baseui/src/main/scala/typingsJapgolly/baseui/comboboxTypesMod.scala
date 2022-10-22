package typingsJapgolly.baseui

import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.baseui.anon.CloseListbox
import typingsJapgolly.baseui.anon.IsSelectedOption
import typingsJapgolly.baseui.baseuiStrings.compact
import typingsJapgolly.baseui.baseuiStrings.default_
import typingsJapgolly.baseui.baseuiStrings.large_
import typingsJapgolly.baseui.baseuiStrings.mini
import typingsJapgolly.baseui.helpersOverridesMod.Override
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.Ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object comboboxTypesMod {
  
  trait ComboboxOverrides extends StObject {
    
    var Input: js.UndefOr[Override[Any]] = js.undefined
    
    var InputContainer: js.UndefOr[Override[Any]] = js.undefined
    
    var ListBox: js.UndefOr[Override[Any]] = js.undefined
    
    var ListItem: js.UndefOr[Override[Any]] = js.undefined
    
    var Popover: js.UndefOr[Override[Any]] = js.undefined
    
    var Root: js.UndefOr[Override[Any]] = js.undefined
  }
  object ComboboxOverrides {
    
    inline def apply(): ComboboxOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ComboboxOverrides]
    }
    
    extension [Self <: ComboboxOverrides](x: Self) {
      
      inline def setInput(value: Override[Any]): Self = StObject.set(x, "Input", value.asInstanceOf[js.Any])
      
      inline def setInputContainer(value: Override[Any]): Self = StObject.set(x, "InputContainer", value.asInstanceOf[js.Any])
      
      inline def setInputContainerUndefined: Self = StObject.set(x, "InputContainer", js.undefined)
      
      inline def setInputUndefined: Self = StObject.set(x, "Input", js.undefined)
      
      inline def setListBox(value: Override[Any]): Self = StObject.set(x, "ListBox", value.asInstanceOf[js.Any])
      
      inline def setListBoxUndefined: Self = StObject.set(x, "ListBox", js.undefined)
      
      inline def setListItem(value: Override[Any]): Self = StObject.set(x, "ListItem", value.asInstanceOf[js.Any])
      
      inline def setListItemUndefined: Self = StObject.set(x, "ListItem", js.undefined)
      
      inline def setPopover(value: Override[Any]): Self = StObject.set(x, "Popover", value.asInstanceOf[js.Any])
      
      inline def setPopoverUndefined: Self = StObject.set(x, "Popover", js.undefined)
      
      inline def setRoot(value: Override[Any]): Self = StObject.set(x, "Root", value.asInstanceOf[js.Any])
      
      inline def setRootUndefined: Self = StObject.set(x, "Root", js.undefined)
    }
  }
  
  @js.native
  trait ComboboxProps[Option] extends StObject {
    
    var autocomplete: js.UndefOr[Boolean] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var error: js.UndefOr[Boolean] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var inputRef: js.UndefOr[Ref[HTMLElement]] = js.native
    
    var listBoxLabel: js.UndefOr[String] = js.native
    
    var mapOptionToNode: js.UndefOr[ComponentType[IsSelectedOption[Option]]] = js.native
    
    def mapOptionToString(a: Option): String = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var onBlur: js.UndefOr[js.Function1[/* a */ ReactEventFrom[HTMLInputElement], Any]] = js.native
    
    def onChange(b: String): Any = js.native
    def onChange(b: String, a: Option): Any = js.native
    
    var onFocus: js.UndefOr[js.Function1[/* a */ ReactEventFrom[HTMLInputElement], Any]] = js.native
    
    var onSubmit: js.UndefOr[js.Function1[/* a */ CloseListbox, Any]] = js.native
    
    var options: js.Array[Option] = js.native
    
    var overrides: js.UndefOr[ComboboxOverrides] = js.native
    
    var positive: js.UndefOr[Boolean] = js.native
    
    var size: js.UndefOr[mini | default_ | compact | large_] = js.native
    
    var value: String = js.native
  }
}
