package typingsJapgolly.tensorflowTfjsConverter.modelAnalysisMod

import typingsJapgolly.tensorflowTfjsConverter.operationsTypesMod.Graph
import typingsJapgolly.tensorflowTfjsConverter.operationsTypesMod.Node
import typingsJapgolly.tensorflowTfjsConverter.typesMod.NamedTensorsMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-converter/dist/src/executor/model_analysis", "getNodesInTopologicalOrder")
@js.native
object getNodesInTopologicalOrder extends js.Object {
  def apply(graph: Graph, weightMap: NamedTensorsMap, executionInfo: ExecutionInfo): js.Array[Node] = js.native
}

