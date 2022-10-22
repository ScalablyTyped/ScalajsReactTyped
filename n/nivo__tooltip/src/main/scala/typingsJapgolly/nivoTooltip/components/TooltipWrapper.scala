package typingsJapgolly.nivoTooltip.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.nivoTooltip.distTypesTooltipWrapperMod.TooltipWrapperProps
import typingsJapgolly.nivoTooltip.distTypesTypesMod.TooltipAnchor
import typingsJapgolly.react.mod.PropsWithChildren
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TooltipWrapper {
  
  inline def apply(anchor: TooltipAnchor, position: js.Tuple2[Double, Double]): Default[js.Object] = {
    val __props = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[PropsWithChildren[TooltipWrapperProps]]))
  }
  
  @JSImport("@nivo/tooltip", "TooltipWrapper")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: PropsWithChildren[TooltipWrapperProps]): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
