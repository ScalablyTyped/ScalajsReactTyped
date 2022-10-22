package typingsJapgolly.fundamentalReact.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.fundamentalReact.libInlineHelpInlineHelpMod.InlineHelpPlacement
import typingsJapgolly.fundamentalReact.libInlineHelpInlineHelpMod.InlineHelpProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object InlineHelp {
  
  inline def apply(placement: InlineHelpPlacement): Builder = {
    val __props = js.Dynamic.literal(placement = placement.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[InlineHelpProps]))
  }
  
  @JSImport("fundamental-react", "InlineHelp")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def contentClassName(value: String): this.type = set("contentClassName", value.asInstanceOf[js.Any])
    
    inline def disableStyles(value: Boolean): this.type = set("disableStyles", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: InlineHelpProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
