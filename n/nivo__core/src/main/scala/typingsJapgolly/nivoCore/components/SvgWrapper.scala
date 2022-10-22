package typingsJapgolly.nivoCore.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.nivoCore.anon.PropsWithChildrenwidthnum
import typingsJapgolly.nivoCore.mod.Margin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SvgWrapper {
  
  inline def apply(height: Double, margin: Margin, width: Double): Builder = {
    val __props = js.Dynamic.literal(height = height.asInstanceOf[js.Any], margin = margin.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[/* props */ PropsWithChildrenwidthnum]))
  }
  
  @JSImport("@nivo/core", "SvgWrapper")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def ariaDescribedBy(value: String): this.type = set("ariaDescribedBy", value.asInstanceOf[js.Any])
    
    inline def ariaLabel(value: String): this.type = set("ariaLabel", value.asInstanceOf[js.Any])
    
    inline def ariaLabelledBy(value: String): this.type = set("ariaLabelledBy", value.asInstanceOf[js.Any])
    
    inline def defs(value: Any): this.type = set("defs", value.asInstanceOf[js.Any])
    
    inline def isFocusable(value: Boolean): this.type = set("isFocusable", value.asInstanceOf[js.Any])
    
    inline def role(value: String): this.type = set("role", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: /* props */ PropsWithChildrenwidthnum): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
