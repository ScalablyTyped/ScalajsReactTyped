package typingsJapgolly.nivoTreemap.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.nivoTreemap.distTypesTypesMod.ComputedNode
import typingsJapgolly.nivoTreemap.distTypesTypesMod.TooltipProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TreeMapNodeTooltip {
  
  inline def apply[Datum /* <: js.Object */](node: ComputedNode[Datum]): Builder[Datum] = {
    val __props = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
    new Builder[Datum](js.Array(this.component, __props.asInstanceOf[TooltipProps[Datum]]))
  }
  
  @JSImport("@nivo/treemap/dist/types/TreeMapNodeTooltip", "TreeMapNodeTooltip")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[Datum /* <: js.Object */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object]
  
  def withProps[Datum /* <: js.Object */](p: TooltipProps[Datum]): Builder[Datum] = new Builder[Datum](js.Array(this.component, p.asInstanceOf[js.Any]))
}
