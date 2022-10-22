package typingsJapgolly.reactQuery.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactQuery.typesDevtoolsExplorerMod.ExpanderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Expander {
  
  inline def apply(expanded: Boolean): Builder = {
    val __props = js.Dynamic.literal(expanded = expanded.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ExpanderProps]))
  }
  
  @JSImport("react-query/types/devtools/Explorer", "Expander")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ExpanderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
