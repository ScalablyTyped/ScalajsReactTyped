package typingsJapgolly.nivoSankey.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.nivoSankey.distTypesSankeyLinkTooltipMod.SankeyLinkTooltipProps
import typingsJapgolly.nivoSankey.distTypesTypesMod.DefaultLink
import typingsJapgolly.nivoSankey.distTypesTypesMod.DefaultNode
import typingsJapgolly.nivoSankey.distTypesTypesMod.SankeyLinkDatum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SankeyLinkTooltip {
  
  inline def apply[N /* <: DefaultNode */, L /* <: DefaultLink */](link: SankeyLinkDatum[N, L]): Builder[N, L] = {
    val __props = js.Dynamic.literal(link = link.asInstanceOf[js.Any])
    new Builder[N, L](js.Array(this.component, __props.asInstanceOf[SankeyLinkTooltipProps[N, L]]))
  }
  
  @JSImport("@nivo/sankey/dist/types/SankeyLinkTooltip", "SankeyLinkTooltip")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[N /* <: DefaultNode */, L /* <: DefaultLink */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object]
  
  def withProps[N /* <: DefaultNode */, L /* <: DefaultLink */](p: SankeyLinkTooltipProps[N, L]): Builder[N, L] = new Builder[N, L](js.Array(this.component, p.asInstanceOf[js.Any]))
}
