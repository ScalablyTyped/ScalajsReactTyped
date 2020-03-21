package typingsJapgolly.tensorflowTfjsNode.mod

import typingsJapgolly.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsJapgolly.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", "stack")
@js.native
object stack extends js.Object {
  def apply[T /* <: Tensor[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank] */](tensors: js.Array[T | TensorLike]): Tensor[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank] = js.native
  def apply[T /* <: Tensor[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank] */](tensors: js.Array[T | TensorLike], axis: Double): Tensor[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank] = js.native
}

