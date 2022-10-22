package typingsJapgolly.reactPortalTooltip.components

import japgolly.scalajs.react.facade.React.RefHandle
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactPortalTooltip.libToolTipMod.TooltipProps
import typingsJapgolly.reactPortalTooltip.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactPortalTooltip {
  
  inline def apply(parent: String | Element | RefHandle[Any]): SharedBuilder_TooltipProps603247757[default] = {
    val __props = js.Dynamic.literal(parent = parent.asInstanceOf[js.Any])
    new SharedBuilder_TooltipProps603247757[default](js.Array(this.component, __props.asInstanceOf[TooltipProps]))
  }
  
  @JSImport("react-portal-tooltip", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: TooltipProps): SharedBuilder_TooltipProps603247757[default] = new SharedBuilder_TooltipProps603247757[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
