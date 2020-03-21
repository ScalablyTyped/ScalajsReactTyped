package typingsJapgolly.tensorflowTfjsCore.binaryOpsMod

import typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsJapgolly.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/binary_ops", "addN")
@js.native
object addN extends js.Object {
  def apply[T /* <: Tensor[Rank] */](tensors: js.Array[T | TensorLike]): T = js.native
}

