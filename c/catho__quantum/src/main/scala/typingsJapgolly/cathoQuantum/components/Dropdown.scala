package typingsJapgolly.cathoQuantum.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.cathoQuantum.anon.BaseFontSize
import typingsJapgolly.cathoQuantum.cathoQuantumStrings.dark
import typingsJapgolly.cathoQuantum.dropdownMod.DropdownProps
import typingsJapgolly.cathoQuantum.dropdownMod.ItemPropType
import typingsJapgolly.cathoQuantum.dropdownMod.default
import typingsJapgolly.downshift.mod.ControllerStateAndHelpers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Dropdown {
  
  @JSImport("@catho/quantum/Dropdown", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def autocomplete(value: Boolean): this.type = set("autocomplete", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def error(value: String): this.type = set("error", value.asInstanceOf[js.Any])
    
    inline def helperText(value: String): this.type = set("helperText", value.asInstanceOf[js.Any])
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def ignoreSpecialChars(value: Boolean): this.type = set("ignoreSpecialChars", value.asInstanceOf[js.Any])
    
    inline def items(value: js.Array[ItemPropType]): this.type = set("items", value.asInstanceOf[js.Any])
    
    inline def itemsVarargs(value: ItemPropType*): this.type = set("items", js.Array(value*))
    
    inline def label(value: String): this.type = set("label", value.asInstanceOf[js.Any])
    
    inline def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    
    inline def onChange(
      value: (/* selectedItem */ ItemPropType | Null, /* stateAndHelpers */ ControllerStateAndHelpers[ItemPropType]) => Callback
    ): this.type = set("onChange", js.Any.fromFunction2((t0: /* selectedItem */ ItemPropType | Null, t1: /* stateAndHelpers */ ControllerStateAndHelpers[ItemPropType]) => (value(t0, t1)).runNow()))
    
    inline def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    
    inline def required(value: Boolean): this.type = set("required", value.asInstanceOf[js.Any])
    
    inline def selectedItem(value: ItemPropType): this.type = set("selectedItem", value.asInstanceOf[js.Any])
    
    inline def skin(value: typingsJapgolly.cathoQuantum.cathoQuantumStrings.default | dark): this.type = set("skin", value.asInstanceOf[js.Any])
    
    inline def theme(value: BaseFontSize): this.type = set("theme", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Dropdown.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: DropdownProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
