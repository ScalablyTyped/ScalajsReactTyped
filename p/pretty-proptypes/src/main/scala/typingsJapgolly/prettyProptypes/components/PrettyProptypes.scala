package typingsJapgolly.prettyProptypes.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.prettyProptypes.anon.Component
import typingsJapgolly.prettyProptypes.anon.PartialComponents
import typingsJapgolly.prettyProptypes.mod.DynamicPropsProps
import typingsJapgolly.prettyProptypes.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PrettyProptypes {
  
  inline def apply(props: Component): Builder = {
    val __props = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[DynamicPropsProps]))
  }
  
  @JSImport("pretty-proptypes", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def components(value: PartialComponents): this.type = set("components", value.asInstanceOf[js.Any])
    
    inline def heading(value: String): this.type = set("heading", value.asInstanceOf[js.Any])
    
    inline def shouldCollapseProps(value: Boolean): this.type = set("shouldCollapseProps", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: DynamicPropsProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
