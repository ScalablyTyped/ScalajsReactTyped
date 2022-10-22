package typingsJapgolly.nivoSankey.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.nivoSankey.anon.Node
import typingsJapgolly.nivoSankey.distTypesSankeyNodesItemMod.SankeyNodesItemProps
import typingsJapgolly.nivoSankey.distTypesTypesMod.DefaultLink
import typingsJapgolly.nivoSankey.distTypesTypesMod.DefaultNode
import typingsJapgolly.nivoSankey.distTypesTypesMod.SankeyLinkDatum
import typingsJapgolly.nivoSankey.distTypesTypesMod.SankeyNodeDatum
import typingsJapgolly.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SankeyNodesItem {
  
  inline def apply[N /* <: DefaultNode */, L /* <: DefaultLink */](
    borderColor: String,
    borderRadius: Double,
    borderWidth: Double,
    color: String,
    height: Double,
    isInteractive: Boolean,
    node: SankeyNodeDatum[N, L],
    opacity: Double,
    setCurrent: js.UndefOr[SankeyNodeDatum[N, L]] => Callback,
    tooltip: FunctionComponent[Node[N, L]],
    width: Double,
    x: Double,
    y: Double
  ): Builder[N, L] = {
    val __props = js.Dynamic.literal(borderColor = borderColor.asInstanceOf[js.Any], borderRadius = borderRadius.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], isInteractive = isInteractive.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], setCurrent = js.Any.fromFunction1((t0: js.UndefOr[SankeyNodeDatum[N, L]]) => setCurrent(t0).runNow()), tooltip = tooltip.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    new Builder[N, L](js.Array(this.component, __props.asInstanceOf[SankeyNodesItemProps[N, L]]))
  }
  
  @JSImport("@nivo/sankey/dist/types/SankeyNodesItem", "SankeyNodesItem")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[N /* <: DefaultNode */, L /* <: DefaultLink */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def onClick(
      value: (/* data */ (SankeyNodeDatum[DefaultNode, DefaultLink]) | (SankeyLinkDatum[DefaultNode, DefaultLink]), /* event */ ReactMouseEventFrom[Element]) => Callback
    ): this.type = set("onClick", js.Any.fromFunction2((t0: /* data */ (SankeyNodeDatum[DefaultNode, DefaultLink]) | (SankeyLinkDatum[DefaultNode, DefaultLink]), t1: /* event */ ReactMouseEventFrom[Element]) => (value(t0, t1)).runNow()))
  }
  
  def withProps[N /* <: DefaultNode */, L /* <: DefaultLink */](p: SankeyNodesItemProps[N, L]): Builder[N, L] = new Builder[N, L](js.Array(this.component, p.asInstanceOf[js.Any]))
}
