package typingsJapgolly.forceGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ForceGraph {
  type ForceFn = js.Function1[/* node */ typingsJapgolly.forceGraph.AnonX, scala.Double]
  type LinkAccessorFn[T] = js.Function1[/* link */ typingsJapgolly.forceGraph.mod.ForceGraph.GraphLinkObject, T]
  type LinkCanvasCallbackFn = js.Function3[
    /* link */ typingsJapgolly.forceGraph.mod.ForceGraph.GraphLinkObject, 
    /* canvasContext */ org.scalajs.dom.raw.CanvasRenderingContext2D, 
    /* globalScale */ scala.Double, 
    scala.Unit
  ]
  type LinkEventCallback = js.Function1[/* link */ typingsJapgolly.forceGraph.mod.ForceGraph.GraphLinkObject, scala.Unit]
  /**
    * Types
    */
  type NodeAccessorFn[T] = js.Function1[/* node */ typingsJapgolly.forceGraph.mod.ForceGraph.GraphNodeObject, T]
  type NodeCanvasCallbackFn = js.Function3[
    /* node */ typingsJapgolly.forceGraph.mod.ForceGraph.GraphNodeObject, 
    /* canvasContext */ org.scalajs.dom.raw.CanvasRenderingContext2D, 
    /* globalScale */ scala.Double, 
    scala.Unit
  ]
  type NodeEventCallback = js.Function1[/* node */ typingsJapgolly.forceGraph.mod.ForceGraph.GraphNodeObject, scala.Unit]
}
