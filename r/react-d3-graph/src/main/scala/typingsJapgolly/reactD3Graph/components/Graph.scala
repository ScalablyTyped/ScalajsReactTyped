package typingsJapgolly.reactD3Graph.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactD3Graph.mod.GraphConfiguration
import typingsJapgolly.reactD3Graph.mod.GraphData
import typingsJapgolly.reactD3Graph.mod.GraphLink
import typingsJapgolly.reactD3Graph.mod.GraphNode
import typingsJapgolly.reactD3Graph.mod.GraphProps
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Graph {
  
  inline def apply[N /* <: GraphNode */, L /* <: GraphLink */](id: String): Builder[N, L] = {
    val __props = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    new Builder[N, L](js.Array(this.component, __props.asInstanceOf[GraphProps[N, L]]))
  }
  
  @JSImport("react-d3-graph", "Graph")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[N /* <: GraphNode */, L /* <: GraphLink */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactD3Graph.mod.Graph[N, L]] {
    
    inline def config(value: Partial[GraphConfiguration[N, L]]): this.type = set("config", value.asInstanceOf[js.Any])
    
    inline def data(value: GraphData[N, L]): this.type = set("data", value.asInstanceOf[js.Any])
    
    inline def onClickGraph(value: /* event */ ReactMouseEventFrom[Element] => Callback): this.type = set("onClickGraph", js.Any.fromFunction1((t0: /* event */ ReactMouseEventFrom[Element]) => value(t0).runNow()))
    
    inline def onClickLink(value: (/* source */ String, /* target */ String) => Callback): this.type = set("onClickLink", js.Any.fromFunction2((t0: /* source */ String, t1: /* target */ String) => (value(t0, t1)).runNow()))
    
    inline def onClickNode(value: /* nodeId */ String => Callback): this.type = set("onClickNode", js.Any.fromFunction1((t0: /* nodeId */ String) => value(t0).runNow()))
    
    inline def onDoubleClickNode(value: /* nodeId */ String => Callback): this.type = set("onDoubleClickNode", js.Any.fromFunction1((t0: /* nodeId */ String) => value(t0).runNow()))
    
    inline def onMouseOutLink(value: (/* source */ String, /* target */ String) => Callback): this.type = set("onMouseOutLink", js.Any.fromFunction2((t0: /* source */ String, t1: /* target */ String) => (value(t0, t1)).runNow()))
    
    inline def onMouseOutNode(value: /* nodeId */ String => Callback): this.type = set("onMouseOutNode", js.Any.fromFunction1((t0: /* nodeId */ String) => value(t0).runNow()))
    
    inline def onMouseOverLink(value: (/* source */ String, /* target */ String) => Callback): this.type = set("onMouseOverLink", js.Any.fromFunction2((t0: /* source */ String, t1: /* target */ String) => (value(t0, t1)).runNow()))
    
    inline def onMouseOverNode(value: /* nodeId */ String => Callback): this.type = set("onMouseOverNode", js.Any.fromFunction1((t0: /* nodeId */ String) => value(t0).runNow()))
    
    inline def onNodePositionChange(value: (/* nodeId */ String, /* x */ Double, /* y */ Double) => Callback): this.type = set("onNodePositionChange", js.Any.fromFunction3((t0: /* nodeId */ String, t1: /* x */ Double, t2: /* y */ Double) => (value(t0, t1, t2)).runNow()))
    
    inline def onRightClickLink(
      value: (/* event */ ReactMouseEventFrom[Element], /* source */ String, /* target */ String) => Callback
    ): this.type = set("onRightClickLink", js.Any.fromFunction3((t0: /* event */ ReactMouseEventFrom[Element], t1: /* source */ String, t2: /* target */ String) => (value(t0, t1, t2)).runNow()))
    
    inline def onRightClickNode(value: (/* event */ ReactMouseEventFrom[Element], /* nodeId */ String) => Callback): this.type = set("onRightClickNode", js.Any.fromFunction2((t0: /* event */ ReactMouseEventFrom[Element], t1: /* nodeId */ String) => (value(t0, t1)).runNow()))
    
    inline def onZoomChange(value: (/* previousZoom */ Double, /* newZoom */ Double) => Callback): this.type = set("onZoomChange", js.Any.fromFunction2((t0: /* previousZoom */ Double, t1: /* newZoom */ Double) => (value(t0, t1)).runNow()))
  }
  
  def withProps[N /* <: GraphNode */, L /* <: GraphLink */](p: GraphProps[N, L]): Builder[N, L] = new Builder[N, L](js.Array(this.component, p.asInstanceOf[js.Any]))
}
