package typingsJapgolly.reachCombobox.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reachCombobox.mod.ComboboxButtonProps
import typingsJapgolly.reachCombobox.reachComboboxStrings.button
import typingsJapgolly.reachPolymorphic.anon.As
import typingsJapgolly.reachPolymorphic.mod.Merge
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ComboboxButton {
  
  @JSImport("@reach/combobox", "ComboboxButton")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def as(value: button): this.type = set("as", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ComboboxButton.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(
    p: Merge[
      /* import warning: importer.ImportType#apply Failed type conversion: IntrinsicElementString extends react.react.ElementType<any> ? react.react.ComponentPropsWithRef<IntrinsicElementString> : never */ js.Any, 
      ComboboxButtonProps & As[button]
    ]
  ): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
