package typingsJapgolly.semanticUiReact.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.semanticUiReact.distCommonjsElementsFlagFlagMod.FlagNameValues
import typingsJapgolly.semanticUiReact.distCommonjsElementsFlagFlagMod.FlagProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Flag {
  
  inline def apply(name: FlagNameValues): Builder = {
    val __props = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[FlagProps]))
  }
  
  @JSImport("semantic-ui-react", "Flag")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.semanticUiReact.mod.Flag] {
    
    inline def as(value: Any): this.type = set("as", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: FlagProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
