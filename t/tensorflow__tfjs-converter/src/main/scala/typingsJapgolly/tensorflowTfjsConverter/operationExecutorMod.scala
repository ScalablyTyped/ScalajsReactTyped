package typingsJapgolly.tensorflowTfjsConverter

import typingsJapgolly.tensorflowTfjsConverter.executionContextMod.ExecutionContext
import typingsJapgolly.tensorflowTfjsConverter.operationsTypesMod.Node
import typingsJapgolly.tensorflowTfjsConverter.typesMod.NamedTensorsMap
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank
import typingsJapgolly.tensorflowTfjsCore.mod.Tensor_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-converter/dist/src/operations/operation_executor", JSImport.Namespace)
@js.native
object operationExecutorMod extends js.Object {
  def executeOp(node: Node, tensorMap: NamedTensorsMap, context: ExecutionContext): js.Array[Tensor_[Rank]] | js.Promise[js.Array[Tensor_[Rank]]] = js.native
}

