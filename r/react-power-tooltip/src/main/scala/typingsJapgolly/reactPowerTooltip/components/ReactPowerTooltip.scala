package typingsJapgolly.reactPowerTooltip.components

import typingsJapgolly.reactPowerTooltip.mod.default
import typingsJapgolly.reactPowerTooltip.toolTipMod.TooltipProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactPowerTooltip {
  
  inline def apply(show: Boolean): SharedBuilder_TooltipProps1758251742[default] = {
    val __props = js.Dynamic.literal(show = show.asInstanceOf[js.Any])
    new SharedBuilder_TooltipProps1758251742[default](js.Array(this.component, __props.asInstanceOf[TooltipProps]))
  }
  
  @JSImport("react-power-tooltip", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: TooltipProps): SharedBuilder_TooltipProps1758251742[default] = new SharedBuilder_TooltipProps1758251742[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
