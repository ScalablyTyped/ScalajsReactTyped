package typingsJapgolly.inkSelectInput.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Component
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.inkSelectInput.mod.ItemOfSelectInput
import typingsJapgolly.inkSelectInput.mod.SelectInputProps
import typingsJapgolly.inkSelectInput.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object InkSelectInput {
  
  @JSImport("ink-select-input", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def focus(value: Boolean): this.type = set("focus", value.asInstanceOf[js.Any])
    
    inline def indicatorComponent(value: Component[js.Object, js.Object]): this.type = set("indicatorComponent", value.asInstanceOf[js.Any])
    
    inline def initialIndex(value: Double): this.type = set("initialIndex", value.asInstanceOf[js.Any])
    
    inline def itemComponent(value: Component[js.Object, js.Object]): this.type = set("itemComponent", value.asInstanceOf[js.Any])
    
    inline def items(value: js.Array[ItemOfSelectInput]): this.type = set("items", value.asInstanceOf[js.Any])
    
    inline def itemsVarargs(value: ItemOfSelectInput*): this.type = set("items", js.Array(value*))
    
    inline def limit(value: Double): this.type = set("limit", value.asInstanceOf[js.Any])
    
    inline def onSelect(value: ItemOfSelectInput => Callback): this.type = set("onSelect", js.Any.fromFunction1((t0: ItemOfSelectInput) => value(t0).runNow()))
  }
  
  implicit def make(companion: InkSelectInput.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SelectInputProps[ItemOfSelectInput]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
