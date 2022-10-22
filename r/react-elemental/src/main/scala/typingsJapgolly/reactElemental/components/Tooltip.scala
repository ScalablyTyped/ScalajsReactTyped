package typingsJapgolly.reactElemental.components

import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactElemental.mod.TooltipProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Tooltip {
  
  inline def apply(contents: VdomElement): Builder = {
    val __props = js.Dynamic.literal(contents = contents.rawElement.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[TooltipProps]))
  }
  
  @JSImport("react-elemental", "Tooltip")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactElemental.mod.Tooltip] {
    
    inline def bottom(value: Boolean): this.type = set("bottom", value.asInstanceOf[js.Any])
    
    inline def offset(value: Double): this.type = set("offset", value.asInstanceOf[js.Any])
    
    inline def persistent(value: Boolean): this.type = set("persistent", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def top(value: Boolean): this.type = set("top", value.asInstanceOf[js.Any])
    
    inline def width(value: Double | String): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TooltipProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
