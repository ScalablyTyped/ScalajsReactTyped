package typingsJapgolly.dagreD3.mod

import typingsJapgolly.dagre.AnonCompound
import typingsJapgolly.dagre.mod.EdgeFn
import typingsJapgolly.dagre.mod.WeightFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dagre-d3", "graphlib")
@js.native
object graphlib extends js.Object {
  @js.native
  class Graph ()
    extends typingsJapgolly.dagre.mod.graphlib.Graph {
    def this(opt: AnonCompound) = this()
  }
  
  @js.native
  object alg extends js.Object {
    def components(graph: typingsJapgolly.dagre.mod.graphlib.Graph): js.Array[js.Array[String]] = js.native
    def dijkstra(graph: typingsJapgolly.dagre.mod.graphlib.Graph, source: String): js.Any = js.native
    def dijkstra(graph: typingsJapgolly.dagre.mod.graphlib.Graph, source: String, weightFn: WeightFn): js.Any = js.native
    def dijkstra(
      graph: typingsJapgolly.dagre.mod.graphlib.Graph,
      source: String,
      weightFn: WeightFn,
      edgeFn: EdgeFn
    ): js.Any = js.native
    def dijkstraAll(graph: typingsJapgolly.dagre.mod.graphlib.Graph): js.Any = js.native
    def dijkstraAll(graph: typingsJapgolly.dagre.mod.graphlib.Graph, weightFn: WeightFn): js.Any = js.native
    def dijkstraAll(graph: typingsJapgolly.dagre.mod.graphlib.Graph, weightFn: WeightFn, edgeFn: EdgeFn): js.Any = js.native
    def findCycles(graph: typingsJapgolly.dagre.mod.graphlib.Graph): js.Array[js.Array[String]] = js.native
    def floydWarchall(graph: typingsJapgolly.dagre.mod.graphlib.Graph): js.Any = js.native
    def floydWarchall(graph: typingsJapgolly.dagre.mod.graphlib.Graph, weightFn: WeightFn): js.Any = js.native
    def floydWarchall(graph: typingsJapgolly.dagre.mod.graphlib.Graph, weightFn: WeightFn, edgeFn: EdgeFn): js.Any = js.native
    def isAcyclic(graph: typingsJapgolly.dagre.mod.graphlib.Graph): Boolean = js.native
    def postorder(graph: typingsJapgolly.dagre.mod.graphlib.Graph, nodeNames: String): js.Array[String] = js.native
    def postorder(graph: typingsJapgolly.dagre.mod.graphlib.Graph, nodeNames: js.Array[String]): js.Array[String] = js.native
    def preorder(graph: typingsJapgolly.dagre.mod.graphlib.Graph, nodeNames: String): js.Array[String] = js.native
    def preorder(graph: typingsJapgolly.dagre.mod.graphlib.Graph, nodeNames: js.Array[String]): js.Array[String] = js.native
    def prim(graph: typingsJapgolly.dagre.mod.graphlib.Graph): typingsJapgolly.dagre.mod.graphlib.Graph = js.native
    def prim(graph: typingsJapgolly.dagre.mod.graphlib.Graph, weightFn: WeightFn): typingsJapgolly.dagre.mod.graphlib.Graph = js.native
    def tarjam(graph: typingsJapgolly.dagre.mod.graphlib.Graph): js.Array[js.Array[String]] = js.native
    def topsort(graph: typingsJapgolly.dagre.mod.graphlib.Graph): js.Array[String] = js.native
  }
  
  @js.native
  object json extends js.Object {
    def read(graph: js.Any): typingsJapgolly.dagre.mod.graphlib.Graph = js.native
    def write(graph: typingsJapgolly.dagre.mod.graphlib.Graph): js.Any = js.native
  }
  
}

