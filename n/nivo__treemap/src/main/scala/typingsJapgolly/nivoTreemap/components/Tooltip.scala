package typingsJapgolly.nivoTreemap.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.nivoTreemap.distTypesTypesMod.ComputedNode
import typingsJapgolly.nivoTreemap.distTypesTypesMod.DefaultTreeMapDatum
import typingsJapgolly.nivoTreemap.distTypesTypesMod.TooltipProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Tooltip {
  
  inline def apply(node: ComputedNode[DefaultTreeMapDatum]): Default[js.Object] = {
    val __props = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[TooltipProps[DefaultTreeMapDatum]]))
  }
  
  @JSImport("@nivo/treemap", "htmlDefaultProps.tooltip")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: TooltipProps[DefaultTreeMapDatum]): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
