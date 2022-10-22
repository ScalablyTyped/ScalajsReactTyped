package typingsJapgolly.nivoSankey.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.nivoSankey.anon.Node
import typingsJapgolly.nivoSankey.distTypesSankeyNodesMod.SankeyNodesProps
import typingsJapgolly.nivoSankey.distTypesTypesMod.DefaultLink
import typingsJapgolly.nivoSankey.distTypesTypesMod.DefaultNode
import typingsJapgolly.nivoSankey.distTypesTypesMod.SankeyLinkDatum
import typingsJapgolly.nivoSankey.distTypesTypesMod.SankeyNodeDatum
import typingsJapgolly.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SankeyNodes {
  
  inline def apply[N /* <: DefaultNode */, L /* <: DefaultLink */](
    borderRadius: Double,
    borderWidth: Double,
    getBorderColor: SankeyNodeDatum[N, L] => String,
    isCurrentNode: SankeyNodeDatum[N, L] => Boolean,
    isInteractive: Boolean,
    nodeHoverOpacity: Double,
    nodeHoverOthersOpacity: Double,
    nodeOpacity: Double,
    nodes: js.Array[SankeyNodeDatum[N, L]],
    setCurrentNode: js.UndefOr[SankeyNodeDatum[N, L]] => Callback,
    tooltip: FunctionComponent[Node[N, L]]
  ): Builder[N, L] = {
    val __props = js.Dynamic.literal(borderRadius = borderRadius.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], getBorderColor = js.Any.fromFunction1(getBorderColor), isCurrentNode = js.Any.fromFunction1(isCurrentNode), isInteractive = isInteractive.asInstanceOf[js.Any], nodeHoverOpacity = nodeHoverOpacity.asInstanceOf[js.Any], nodeHoverOthersOpacity = nodeHoverOthersOpacity.asInstanceOf[js.Any], nodeOpacity = nodeOpacity.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], setCurrentNode = js.Any.fromFunction1((t0: js.UndefOr[SankeyNodeDatum[N, L]]) => setCurrentNode(t0).runNow()), tooltip = tooltip.asInstanceOf[js.Any])
    new Builder[N, L](js.Array(this.component, __props.asInstanceOf[SankeyNodesProps[N, L]]))
  }
  
  @JSImport("@nivo/sankey/dist/types/SankeyNodes", "SankeyNodes")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[N /* <: DefaultNode */, L /* <: DefaultLink */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def currentLink(value: SankeyLinkDatum[N, L]): this.type = set("currentLink", value.asInstanceOf[js.Any])
    
    inline def currentLinkNull: this.type = set("currentLink", null)
    
    inline def currentNode(value: SankeyNodeDatum[N, L]): this.type = set("currentNode", value.asInstanceOf[js.Any])
    
    inline def currentNodeNull: this.type = set("currentNode", null)
    
    inline def onClick(
      value: (/* data */ (SankeyNodeDatum[DefaultNode, DefaultLink]) | (SankeyLinkDatum[DefaultNode, DefaultLink]), /* event */ ReactMouseEventFrom[Element]) => Callback
    ): this.type = set("onClick", js.Any.fromFunction2((t0: /* data */ (SankeyNodeDatum[DefaultNode, DefaultLink]) | (SankeyLinkDatum[DefaultNode, DefaultLink]), t1: /* event */ ReactMouseEventFrom[Element]) => (value(t0, t1)).runNow()))
  }
  
  def withProps[N /* <: DefaultNode */, L /* <: DefaultLink */](p: SankeyNodesProps[N, L]): Builder[N, L] = new Builder[N, L](js.Array(this.component, p.asInstanceOf[js.Any]))
}
