package typingsJapgolly.nivoSankey.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.nivoSankey.distTypesSankeyLinkGradientMod.SankeyLinkGradientProps
import typingsJapgolly.nivoSankey.nivoSankeyStrings.horizontal
import typingsJapgolly.nivoSankey.nivoSankeyStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SankeyLinkGradient {
  
  inline def apply(endColor: String, id: String, layout: horizontal | vertical, startColor: String): Default[js.Object] = {
    val __props = js.Dynamic.literal(endColor = endColor.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], startColor = startColor.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[SankeyLinkGradientProps]))
  }
  
  @JSImport("@nivo/sankey/dist/types/SankeyLinkGradient", "SankeyLinkGradient")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: SankeyLinkGradientProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
