package typingsJapgolly.tensorflowTfjs.mod

import typingsJapgolly.tensorflowTfjsCore.tensorMod.Tensor
import typingsJapgolly.tensorflowTfjsCore.tensorTypesMod.TensorContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs", "tensor_util")
@js.native
object tensorUtil extends js.Object {
  def assertTypesMatch(
    a: Tensor[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank],
    b: Tensor[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank]
  ): Unit = js.native
  def getTensorsInContainer(result: TensorContainer): js.Array[Tensor[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank]] = js.native
  def isTensorInList(
    tensor: Tensor[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank],
    tensorList: js.Array[Tensor[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank]]
  ): Boolean = js.native
  def makeTypesMatch[T /* <: Tensor[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank] */](a: T, b: T): js.Tuple2[T, T] = js.native
}

