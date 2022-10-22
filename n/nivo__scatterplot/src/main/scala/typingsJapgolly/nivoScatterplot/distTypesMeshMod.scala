package typingsJapgolly.nivoScatterplot

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import typingsJapgolly.nivoScatterplot.distTypesTypesMod.ScatterPlotDatum
import typingsJapgolly.nivoScatterplot.distTypesTypesMod.ScatterPlotMouseHandler
import typingsJapgolly.nivoScatterplot.distTypesTypesMod.ScatterPlotNodeData
import typingsJapgolly.nivoScatterplot.distTypesTypesMod.ScatterPlotTooltip
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesMeshMod {
  
  @JSImport("@nivo/scatterplot/dist/types/Mesh", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Mesh[RawDatum /* <: ScatterPlotDatum */](hasNodesWidthHeightOnMouseEnterOnMouseMoveOnMouseLeaveOnClickTooltipDebug: MeshProps[RawDatum]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Mesh")(hasNodesWidthHeightOnMouseEnterOnMouseMoveOnMouseLeaveOnClickTooltipDebug.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait MeshProps[RawDatum /* <: ScatterPlotDatum */] extends StObject {
    
    var debug: Boolean
    
    var height: Double
    
    var nodes: js.Array[ScatterPlotNodeData[RawDatum]]
    
    var onClick: js.UndefOr[ScatterPlotMouseHandler[RawDatum]] = js.undefined
    
    var onMouseEnter: js.UndefOr[ScatterPlotMouseHandler[RawDatum]] = js.undefined
    
    var onMouseLeave: js.UndefOr[ScatterPlotMouseHandler[RawDatum]] = js.undefined
    
    var onMouseMove: js.UndefOr[ScatterPlotMouseHandler[RawDatum]] = js.undefined
    
    var tooltip: ScatterPlotTooltip[RawDatum]
    
    var width: Double
  }
  object MeshProps {
    
    inline def apply[RawDatum /* <: ScatterPlotDatum */](
      debug: Boolean,
      height: Double,
      nodes: js.Array[ScatterPlotNodeData[RawDatum]],
      tooltip: ScatterPlotTooltip[RawDatum],
      width: Double
    ): MeshProps[RawDatum] = {
      val __obj = js.Dynamic.literal(debug = debug.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[MeshProps[RawDatum]]
    }
    
    extension [Self <: MeshProps[?], RawDatum /* <: ScatterPlotDatum */](x: Self & MeshProps[RawDatum]) {
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setNodes(value: js.Array[ScatterPlotNodeData[RawDatum]]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
      
      inline def setNodesVarargs(value: ScatterPlotNodeData[RawDatum]*): Self = StObject.set(x, "nodes", js.Array(value*))
      
      inline def setOnClick(
        value: (/* node */ ScatterPlotNodeData[RawDatum], /* event */ ReactMouseEventFrom[Any & org.scalajs.dom.Element]) => Callback
      ): Self = StObject.set(x, "onClick", js.Any.fromFunction2((t0: /* node */ ScatterPlotNodeData[RawDatum], t1: /* event */ ReactMouseEventFrom[Any & org.scalajs.dom.Element]) => (value(t0, t1)).runNow()))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnMouseEnter(
        value: (/* node */ ScatterPlotNodeData[RawDatum], /* event */ ReactMouseEventFrom[Any & org.scalajs.dom.Element]) => Callback
      ): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction2((t0: /* node */ ScatterPlotNodeData[RawDatum], t1: /* event */ ReactMouseEventFrom[Any & org.scalajs.dom.Element]) => (value(t0, t1)).runNow()))
      
      inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      inline def setOnMouseLeave(
        value: (/* node */ ScatterPlotNodeData[RawDatum], /* event */ ReactMouseEventFrom[Any & org.scalajs.dom.Element]) => Callback
      ): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction2((t0: /* node */ ScatterPlotNodeData[RawDatum], t1: /* event */ ReactMouseEventFrom[Any & org.scalajs.dom.Element]) => (value(t0, t1)).runNow()))
      
      inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      inline def setOnMouseMove(
        value: (/* node */ ScatterPlotNodeData[RawDatum], /* event */ ReactMouseEventFrom[Any & org.scalajs.dom.Element]) => Callback
      ): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction2((t0: /* node */ ScatterPlotNodeData[RawDatum], t1: /* event */ ReactMouseEventFrom[Any & org.scalajs.dom.Element]) => (value(t0, t1)).runNow()))
      
      inline def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
      
      inline def setTooltip(value: ScatterPlotTooltip[RawDatum]): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
