package typingsJapgolly.nivoSankey.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.nivoSankey.distTypesSankeyNodeTooltipMod.SankeyNodeTooltipProps
import typingsJapgolly.nivoSankey.distTypesTypesMod.DefaultLink
import typingsJapgolly.nivoSankey.distTypesTypesMod.DefaultNode
import typingsJapgolly.nivoSankey.distTypesTypesMod.SankeyNodeDatum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SankeyNodeTooltip {
  
  inline def apply[N /* <: DefaultNode */, L /* <: DefaultLink */](node: SankeyNodeDatum[N, L]): Builder[N, L] = {
    val __props = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
    new Builder[N, L](js.Array(this.component, __props.asInstanceOf[SankeyNodeTooltipProps[N, L]]))
  }
  
  @JSImport("@nivo/sankey/dist/types/SankeyNodeTooltip", "SankeyNodeTooltip")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[N /* <: DefaultNode */, L /* <: DefaultLink */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object]
  
  def withProps[N /* <: DefaultNode */, L /* <: DefaultLink */](p: SankeyNodeTooltipProps[N, L]): Builder[N, L] = new Builder[N, L](js.Array(this.component, p.asInstanceOf[js.Any]))
}
