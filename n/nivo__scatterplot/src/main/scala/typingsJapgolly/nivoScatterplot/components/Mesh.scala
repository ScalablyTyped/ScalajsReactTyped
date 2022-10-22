package typingsJapgolly.nivoScatterplot.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.nivoScatterplot.distTypesMeshMod.MeshProps
import typingsJapgolly.nivoScatterplot.distTypesTypesMod.ScatterPlotDatum
import typingsJapgolly.nivoScatterplot.distTypesTypesMod.ScatterPlotNodeData
import typingsJapgolly.nivoScatterplot.distTypesTypesMod.ScatterPlotTooltip
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Mesh {
  
  inline def apply[RawDatum /* <: ScatterPlotDatum */](
    debug: Boolean,
    height: Double,
    nodes: js.Array[ScatterPlotNodeData[RawDatum]],
    tooltip: ScatterPlotTooltip[RawDatum],
    width: Double
  ): Builder[RawDatum] = {
    val __props = js.Dynamic.literal(debug = debug.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    new Builder[RawDatum](js.Array(this.component, __props.asInstanceOf[MeshProps[RawDatum]]))
  }
  
  @JSImport("@nivo/scatterplot/dist/types/Mesh", "Mesh")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[RawDatum /* <: ScatterPlotDatum */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def onClick(
      value: (/* node */ ScatterPlotNodeData[RawDatum], /* event */ ReactMouseEventFrom[Any & Element]) => Callback
    ): this.type = set("onClick", js.Any.fromFunction2((t0: /* node */ ScatterPlotNodeData[RawDatum], t1: /* event */ ReactMouseEventFrom[Any & Element]) => (value(t0, t1)).runNow()))
    
    inline def onMouseEnter(
      value: (/* node */ ScatterPlotNodeData[RawDatum], /* event */ ReactMouseEventFrom[Any & Element]) => Callback
    ): this.type = set("onMouseEnter", js.Any.fromFunction2((t0: /* node */ ScatterPlotNodeData[RawDatum], t1: /* event */ ReactMouseEventFrom[Any & Element]) => (value(t0, t1)).runNow()))
    
    inline def onMouseLeave(
      value: (/* node */ ScatterPlotNodeData[RawDatum], /* event */ ReactMouseEventFrom[Any & Element]) => Callback
    ): this.type = set("onMouseLeave", js.Any.fromFunction2((t0: /* node */ ScatterPlotNodeData[RawDatum], t1: /* event */ ReactMouseEventFrom[Any & Element]) => (value(t0, t1)).runNow()))
    
    inline def onMouseMove(
      value: (/* node */ ScatterPlotNodeData[RawDatum], /* event */ ReactMouseEventFrom[Any & Element]) => Callback
    ): this.type = set("onMouseMove", js.Any.fromFunction2((t0: /* node */ ScatterPlotNodeData[RawDatum], t1: /* event */ ReactMouseEventFrom[Any & Element]) => (value(t0, t1)).runNow()))
  }
  
  def withProps[RawDatum /* <: ScatterPlotDatum */](p: MeshProps[RawDatum]): Builder[RawDatum] = new Builder[RawDatum](js.Array(this.component, p.asInstanceOf[js.Any]))
}
