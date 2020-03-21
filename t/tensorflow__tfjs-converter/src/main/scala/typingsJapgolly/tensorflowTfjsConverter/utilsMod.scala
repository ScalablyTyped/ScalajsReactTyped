package typingsJapgolly.tensorflowTfjsConverter

import typingsJapgolly.tensorflowTfjsConverter.executionContextMod.ExecutionContext
import typingsJapgolly.tensorflowTfjsConverter.operationsTypesMod.Node
import typingsJapgolly.tensorflowTfjsConverter.operationsTypesMod.ValueType
import typingsJapgolly.tensorflowTfjsConverter.typesMod.NamedTensorsMap
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank
import typingsJapgolly.tensorflowTfjsCore.mod.Tensor_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-converter/dist/src/operations/executors/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  def getNodeNameAndIndex(inputName: String): js.Tuple2[String, Double] = js.native
  def getNodeNameAndIndex(inputName: String, context: ExecutionContext): js.Tuple2[String, Double] = js.native
  def getParamValue(paramName: String, node: Node, tensorMap: NamedTensorsMap, context: ExecutionContext): ValueType = js.native
  def getTensor(name: String, tensorsMap: NamedTensorsMap, context: ExecutionContext): Tensor_[Rank] = js.native
  def getTensorsForCurrentContenxt(name: String, tensorsMap: NamedTensorsMap, context: ExecutionContext): js.Array[Tensor_[Rank]] = js.native
  def parseNodeName(name: String): js.Tuple2[String, Double] = js.native
  def split(arr: js.Array[Double], size: Double): js.Array[js.Array[Double]] = js.native
}

