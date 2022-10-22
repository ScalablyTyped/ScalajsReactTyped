package typingsJapgolly.nivoTooltip.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.nivoTooltip.distTypesChipMod.ChipProps
import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Chip {
  
  inline def apply(color: String): Builder = {
    val __props = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ChipProps]))
  }
  
  @JSImport("@nivo/tooltip", "Chip")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def size(value: Double): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ChipProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
