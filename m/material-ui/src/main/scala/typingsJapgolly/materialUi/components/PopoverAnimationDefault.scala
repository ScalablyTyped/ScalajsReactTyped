package typingsJapgolly.materialUi.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.materialUi.MaterialUI.Popover.PopoverAnimationDefaultProps
import typingsJapgolly.materialUi.MaterialUI.propTypes.origin
import typingsJapgolly.materialUi.popoverPopoverAnimationDefaultMod.default
import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PopoverAnimationDefault {
  
  inline def apply(open: Boolean): Builder = {
    val __props = js.Dynamic.literal(open = open.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[PopoverAnimationDefaultProps]))
  }
  
  @JSImport("material-ui/Popover/PopoverAnimationDefault", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def targetOrigin(value: origin): this.type = set("targetOrigin", value.asInstanceOf[js.Any])
    
    inline def zDepth(value: Double): this.type = set("zDepth", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PopoverAnimationDefaultProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
