package typingsJapgolly.nivoTooltip.components

import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.nivoTooltip.distTypesTooltipProviderMod.TooltipProviderProps
import typingsJapgolly.react.mod.MutableRefObject
import typingsJapgolly.react.mod.PropsWithChildren
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TooltipProvider {
  
  inline def apply(container: MutableRefObject[HTMLDivElement]): Default[js.Object] = {
    val __props = js.Dynamic.literal(container = container.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[PropsWithChildren[TooltipProviderProps]]))
  }
  
  @JSImport("@nivo/tooltip", "TooltipProvider")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: PropsWithChildren[TooltipProviderProps]): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
