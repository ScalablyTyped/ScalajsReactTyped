package typingsJapgolly.reachCombobox.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reachCombobox.mod.ComboboxInputProps
import typingsJapgolly.reachCombobox.mod.ComboboxValue
import typingsJapgolly.reachCombobox.reachComboboxStrings.input
import typingsJapgolly.reachPolymorphic.anon.As
import typingsJapgolly.reachPolymorphic.mod.Merge
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ComboboxInput {
  
  @JSImport("@reach/combobox", "ComboboxInput")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def as(value: input): this.type = set("as", value.asInstanceOf[js.Any])
    
    inline def autocomplete(value: Boolean): this.type = set("autocomplete", value.asInstanceOf[js.Any])
    
    inline def selectOnClick(value: Boolean): this.type = set("selectOnClick", value.asInstanceOf[js.Any])
    
    inline def value(value: ComboboxValue): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ComboboxInput.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(
    p: Merge[
      /* import warning: importer.ImportType#apply Failed type conversion: IntrinsicElementString extends react.react.ElementType<any> ? react.react.ComponentPropsWithRef<IntrinsicElementString> : never */ js.Any, 
      ComboboxInputProps & As[input]
    ]
  ): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
