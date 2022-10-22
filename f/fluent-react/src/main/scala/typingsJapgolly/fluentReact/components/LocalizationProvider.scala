package typingsJapgolly.fluentReact.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.fluent.mod.FluentBundle
import typingsJapgolly.fluentReact.mod.LocalizationProviderProps
import typingsJapgolly.fluentReact.mod.Node
import typingsJapgolly.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LocalizationProvider {
  
  inline def apply(bundles: IterableIterator[FluentBundle]): Builder = {
    val __props = js.Dynamic.literal(bundles = bundles.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[LocalizationProviderProps]))
  }
  
  @JSImport("fluent-react", "LocalizationProvider")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.fluentReact.mod.LocalizationProvider] {
    
    inline def parseMarkup(value: /* str */ String => js.Array[Node]): this.type = set("parseMarkup", js.Any.fromFunction1(value))
  }
  
  def withProps(p: LocalizationProviderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
