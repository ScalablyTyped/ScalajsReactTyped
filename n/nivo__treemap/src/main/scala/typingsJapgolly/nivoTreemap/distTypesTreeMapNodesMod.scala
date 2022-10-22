package typingsJapgolly.nivoTreemap

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import typingsJapgolly.nivoTreemap.distTypesTypesMod.ComputedNode
import typingsJapgolly.nivoTreemap.distTypesTypesMod.NodeComponent
import typingsJapgolly.nivoTreemap.distTypesTypesMod.NodeMouseEventHandler
import typingsJapgolly.nivoTreemap.distTypesTypesMod.TooltipComponent
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTreeMapNodesMod {
  
  @JSImport("@nivo/treemap/dist/types/TreeMapNodes", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def TreeMapNodes[Datum /* <: js.Object */](
    hasNodesNodeComponentBorderWidthEnableLabelLabelSkipSizeEnableParentLabelIsInteractiveOnMouseEnterOnMouseMoveOnMouseLeaveOnClickTooltip: TreeMapNodesProps[Datum]
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("TreeMapNodes")(hasNodesNodeComponentBorderWidthEnableLabelLabelSkipSizeEnableParentLabelIsInteractiveOnMouseEnterOnMouseMoveOnMouseLeaveOnClickTooltip.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait TreeMapNodesProps[Datum /* <: js.Object */] extends StObject {
    
    var borderWidth: Double
    
    var enableLabel: Boolean
    
    var enableParentLabel: Boolean
    
    var isInteractive: Boolean
    
    var labelSkipSize: Double
    
    var nodeComponent: NodeComponent[Datum]
    
    var nodes: js.Array[ComputedNode[Datum]]
    
    var onClick: js.UndefOr[NodeMouseEventHandler[Datum]] = js.undefined
    
    var onMouseEnter: js.UndefOr[NodeMouseEventHandler[Datum]] = js.undefined
    
    var onMouseLeave: js.UndefOr[NodeMouseEventHandler[Datum]] = js.undefined
    
    var onMouseMove: js.UndefOr[NodeMouseEventHandler[Datum]] = js.undefined
    
    var tooltip: TooltipComponent[Datum]
  }
  object TreeMapNodesProps {
    
    inline def apply[Datum /* <: js.Object */](
      borderWidth: Double,
      enableLabel: Boolean,
      enableParentLabel: Boolean,
      isInteractive: Boolean,
      labelSkipSize: Double,
      nodeComponent: NodeComponent[Datum],
      nodes: js.Array[ComputedNode[Datum]],
      tooltip: TooltipComponent[Datum]
    ): TreeMapNodesProps[Datum] = {
      val __obj = js.Dynamic.literal(borderWidth = borderWidth.asInstanceOf[js.Any], enableLabel = enableLabel.asInstanceOf[js.Any], enableParentLabel = enableParentLabel.asInstanceOf[js.Any], isInteractive = isInteractive.asInstanceOf[js.Any], labelSkipSize = labelSkipSize.asInstanceOf[js.Any], nodeComponent = nodeComponent.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any])
      __obj.asInstanceOf[TreeMapNodesProps[Datum]]
    }
    
    extension [Self <: TreeMapNodesProps[?], Datum /* <: js.Object */](x: Self & TreeMapNodesProps[Datum]) {
      
      inline def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
      
      inline def setEnableLabel(value: Boolean): Self = StObject.set(x, "enableLabel", value.asInstanceOf[js.Any])
      
      inline def setEnableParentLabel(value: Boolean): Self = StObject.set(x, "enableParentLabel", value.asInstanceOf[js.Any])
      
      inline def setIsInteractive(value: Boolean): Self = StObject.set(x, "isInteractive", value.asInstanceOf[js.Any])
      
      inline def setLabelSkipSize(value: Double): Self = StObject.set(x, "labelSkipSize", value.asInstanceOf[js.Any])
      
      inline def setNodeComponent(value: NodeComponent[Datum]): Self = StObject.set(x, "nodeComponent", value.asInstanceOf[js.Any])
      
      inline def setNodes(value: js.Array[ComputedNode[Datum]]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
      
      inline def setNodesVarargs(value: ComputedNode[Datum]*): Self = StObject.set(x, "nodes", js.Array(value*))
      
      inline def setOnClick(
        value: (/* node */ ComputedNode[Datum], /* event */ ReactMouseEventFrom[org.scalajs.dom.Element]) => Callback
      ): Self = StObject.set(x, "onClick", js.Any.fromFunction2((t0: /* node */ ComputedNode[Datum], t1: /* event */ ReactMouseEventFrom[org.scalajs.dom.Element]) => (value(t0, t1)).runNow()))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnMouseEnter(
        value: (/* node */ ComputedNode[Datum], /* event */ ReactMouseEventFrom[org.scalajs.dom.Element]) => Callback
      ): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction2((t0: /* node */ ComputedNode[Datum], t1: /* event */ ReactMouseEventFrom[org.scalajs.dom.Element]) => (value(t0, t1)).runNow()))
      
      inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      inline def setOnMouseLeave(
        value: (/* node */ ComputedNode[Datum], /* event */ ReactMouseEventFrom[org.scalajs.dom.Element]) => Callback
      ): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction2((t0: /* node */ ComputedNode[Datum], t1: /* event */ ReactMouseEventFrom[org.scalajs.dom.Element]) => (value(t0, t1)).runNow()))
      
      inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      inline def setOnMouseMove(
        value: (/* node */ ComputedNode[Datum], /* event */ ReactMouseEventFrom[org.scalajs.dom.Element]) => Callback
      ): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction2((t0: /* node */ ComputedNode[Datum], t1: /* event */ ReactMouseEventFrom[org.scalajs.dom.Element]) => (value(t0, t1)).runNow()))
      
      inline def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
      
      inline def setTooltip(value: TooltipComponent[Datum]): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    }
  }
}
