package typingsJapgolly.nivoTreemap.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.nivoTreemap.distTypesTreeMapNodesMod.TreeMapNodesProps
import typingsJapgolly.nivoTreemap.distTypesTypesMod.ComputedNode
import typingsJapgolly.nivoTreemap.distTypesTypesMod.NodeComponent
import typingsJapgolly.nivoTreemap.distTypesTypesMod.TooltipComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TreeMapNodes {
  
  inline def apply[Datum /* <: js.Object */](
    borderWidth: Double,
    enableLabel: Boolean,
    enableParentLabel: Boolean,
    isInteractive: Boolean,
    labelSkipSize: Double,
    nodeComponent: NodeComponent[Datum],
    nodes: js.Array[ComputedNode[Datum]],
    tooltip: TooltipComponent[Datum]
  ): Builder[Datum] = {
    val __props = js.Dynamic.literal(borderWidth = borderWidth.asInstanceOf[js.Any], enableLabel = enableLabel.asInstanceOf[js.Any], enableParentLabel = enableParentLabel.asInstanceOf[js.Any], isInteractive = isInteractive.asInstanceOf[js.Any], labelSkipSize = labelSkipSize.asInstanceOf[js.Any], nodeComponent = nodeComponent.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any])
    new Builder[Datum](js.Array(this.component, __props.asInstanceOf[TreeMapNodesProps[Datum]]))
  }
  
  @JSImport("@nivo/treemap/dist/types/TreeMapNodes", "TreeMapNodes")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[Datum /* <: js.Object */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def onClick(value: (/* node */ ComputedNode[Datum], /* event */ ReactMouseEventFrom[Element]) => Callback): this.type = set("onClick", js.Any.fromFunction2((t0: /* node */ ComputedNode[Datum], t1: /* event */ ReactMouseEventFrom[Element]) => (value(t0, t1)).runNow()))
    
    inline def onMouseEnter(value: (/* node */ ComputedNode[Datum], /* event */ ReactMouseEventFrom[Element]) => Callback): this.type = set("onMouseEnter", js.Any.fromFunction2((t0: /* node */ ComputedNode[Datum], t1: /* event */ ReactMouseEventFrom[Element]) => (value(t0, t1)).runNow()))
    
    inline def onMouseLeave(value: (/* node */ ComputedNode[Datum], /* event */ ReactMouseEventFrom[Element]) => Callback): this.type = set("onMouseLeave", js.Any.fromFunction2((t0: /* node */ ComputedNode[Datum], t1: /* event */ ReactMouseEventFrom[Element]) => (value(t0, t1)).runNow()))
    
    inline def onMouseMove(value: (/* node */ ComputedNode[Datum], /* event */ ReactMouseEventFrom[Element]) => Callback): this.type = set("onMouseMove", js.Any.fromFunction2((t0: /* node */ ComputedNode[Datum], t1: /* event */ ReactMouseEventFrom[Element]) => (value(t0, t1)).runNow()))
  }
  
  def withProps[Datum /* <: js.Object */](p: TreeMapNodesProps[Datum]): Builder[Datum] = new Builder[Datum](js.Array(this.component, p.asInstanceOf[js.Any]))
}
