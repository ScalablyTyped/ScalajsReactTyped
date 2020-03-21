package typingsJapgolly.dagreD3.mod

import typingsJapgolly.dagre.mod.EdgeConfig
import typingsJapgolly.dagre.mod.GraphLabel
import typingsJapgolly.dagre.mod.NodeConfig
import typingsJapgolly.dagre.mod.graphlib.Graph
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dagre-d3", "layout")
@js.native
object layout extends js.Object {
  def apply(graph: Graph): Unit = js.native
  def apply(graph: Graph, layout: GraphLabel with NodeConfig with EdgeConfig): Unit = js.native
}

