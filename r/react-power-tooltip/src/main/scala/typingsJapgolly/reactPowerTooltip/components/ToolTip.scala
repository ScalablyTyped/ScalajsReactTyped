package typingsJapgolly.reactPowerTooltip.components

import typingsJapgolly.reactPowerTooltip.toolTipMod.TooltipProps
import typingsJapgolly.reactPowerTooltip.toolTipMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ToolTip {
  
  inline def apply(show: Boolean): SharedBuilder_TooltipProps1758251742[default] = {
    val __props = js.Dynamic.literal(show = show.asInstanceOf[js.Any])
    new SharedBuilder_TooltipProps1758251742[default](js.Array(this.component, __props.asInstanceOf[TooltipProps]))
  }
  
  @JSImport("react-power-tooltip/ToolTip", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: TooltipProps): SharedBuilder_TooltipProps1758251742[default] = new SharedBuilder_TooltipProps1758251742[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
