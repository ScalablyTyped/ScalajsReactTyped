package typingsJapgolly.reachDropdown.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reachDropdown.mod.DropdownItemProps
import typingsJapgolly.reachDropdown.reachDropdownStrings.div
import typingsJapgolly.reachPolymorphic.anon.As
import typingsJapgolly.reachPolymorphic.mod.Merge
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DropdownItem {
  
  inline def apply(onSelect: Callback): Builder = {
    val __props = js.Dynamic.literal(onSelect = onSelect.toJsFn)
    new Builder(js.Array(this.component, __props.asInstanceOf[Merge[
    /* import warning: importer.ImportType#apply Failed type conversion: IntrinsicElementString extends react.react.ElementType<any> ? react.react.ComponentPropsWithRef<IntrinsicElementString> : never */ js.Any, 
    DropdownItemProps & As[div]
  ]]))
  }
  
  @JSImport("@reach/dropdown", "DropdownItem")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def as(value: div): this.type = set("as", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def index(value: Double): this.type = set("index", value.asInstanceOf[js.Any])
    
    inline def isLink(value: Boolean): this.type = set("isLink", value.asInstanceOf[js.Any])
    
    inline def valueText(value: String): this.type = set("valueText", value.asInstanceOf[js.Any])
  }
  
  def withProps(
    p: Merge[
      /* import warning: importer.ImportType#apply Failed type conversion: IntrinsicElementString extends react.react.ElementType<any> ? react.react.ComponentPropsWithRef<IntrinsicElementString> : never */ js.Any, 
      DropdownItemProps & As[div]
    ]
  ): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
