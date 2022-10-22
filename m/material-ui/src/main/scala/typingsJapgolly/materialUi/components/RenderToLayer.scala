package typingsJapgolly.materialUi.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.materialUi.internalRenderToLayerMod.RenderToLayerProps
import typingsJapgolly.materialUi.internalRenderToLayerMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RenderToLayer {
  
  inline def apply(open: Boolean, render: js.Function): Builder = {
    val __props = js.Dynamic.literal(open = open.asInstanceOf[js.Any], render = render.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[RenderToLayerProps]))
  }
  
  @JSImport("material-ui/internal/RenderToLayer", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def componentClickAway(value: js.Function): this.type = set("componentClickAway", value.asInstanceOf[js.Any])
    
    inline def useLayerForClickAway(value: Boolean): this.type = set("useLayerForClickAway", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: RenderToLayerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
