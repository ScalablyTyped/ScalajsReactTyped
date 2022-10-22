package typingsJapgolly.radium.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.radium.mod.Radium.StyleProps
import typingsJapgolly.radium.mod.Radium.StyleRules
import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Style {
  
  inline def apply(rules: CSSProperties | StyleRules): Builder = {
    val __props = js.Dynamic.literal(rules = rules.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[StyleProps]))
  }
  
  @JSImport("radium", "default.Style")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.radium.mod.default.Style] {
    
    inline def scopeSelector(value: String): this.type = set("scopeSelector", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: StyleProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
