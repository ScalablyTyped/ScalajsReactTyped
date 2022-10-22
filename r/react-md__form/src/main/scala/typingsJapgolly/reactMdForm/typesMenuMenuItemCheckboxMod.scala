package typingsJapgolly.reactMdForm

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.HTMLLIElement
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.reactMdForm.typesMenuMenuItemInputToggleMod.BaseMenuItemInputToggleProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMenuMenuItemCheckboxMod {
  
  @JSImport("@react-md/form/types/menu/MenuItemCheckbox", "MenuItemCheckbox")
  @js.native
  val MenuItemCheckbox: ForwardRefExoticComponent[MenuItemCheckboxProps & RefAttributes[HTMLLIElement]] = js.native
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsJapgolly.reactMdForm.typesToggleCheckboxMod.IndeterminateCheckboxProps because var conflicts: `aria-controls`. Inlined indeterminate */ trait MenuItemCheckboxProps
    extends StObject
       with BaseMenuItemInputToggleProps {
    
    /**
      * Boolean if the checkbox can have an indeterminate state. This is used when
      * there is a checkbox group where a single checkbox and select/deselect all
      * related checkboxes. This should be enabled when not all the related
      * checkboxes have been checked.
      */
    var indeterminate: js.UndefOr[Boolean] = js.undefined
  }
  object MenuItemCheckboxProps {
    
    inline def apply(
      checked: Boolean,
      id: String,
      onCheckedChange: (Boolean, ReactMouseEventFrom[HTMLLIElement]) => Callback
    ): MenuItemCheckboxProps = {
      val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], onCheckedChange = js.Any.fromFunction2((t0: Boolean, t1: ReactMouseEventFrom[HTMLLIElement]) => (onCheckedChange(t0, t1)).runNow()))
      __obj.asInstanceOf[MenuItemCheckboxProps]
    }
    
    extension [Self <: MenuItemCheckboxProps](x: Self) {
      
      inline def setIndeterminate(value: Boolean): Self = StObject.set(x, "indeterminate", value.asInstanceOf[js.Any])
      
      inline def setIndeterminateUndefined: Self = StObject.set(x, "indeterminate", js.undefined)
    }
  }
}
