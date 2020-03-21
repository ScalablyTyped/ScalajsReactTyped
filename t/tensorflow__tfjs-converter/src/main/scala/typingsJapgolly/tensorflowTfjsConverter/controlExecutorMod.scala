package typingsJapgolly.tensorflowTfjsConverter

import typingsJapgolly.tensorflowTfjsConverter.executionContextMod.ExecutionContext
import typingsJapgolly.tensorflowTfjsConverter.operationsTypesMod.Node
import typingsJapgolly.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.control
import typingsJapgolly.tensorflowTfjsConverter.typesMod.NamedTensorsMap
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank
import typingsJapgolly.tensorflowTfjsCore.mod.Tensor_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-converter/dist/src/operations/executors/control_executor", JSImport.Namespace)
@js.native
object controlExecutorMod extends js.Object {
  val CATEGORY: control = js.native
  def executeOp(node: Node, tensorMap: NamedTensorsMap, context: ExecutionContext): js.Promise[js.Array[Tensor_[Rank]]] = js.native
}

