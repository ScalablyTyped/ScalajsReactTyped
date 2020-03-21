package typingsJapgolly.tensorflowTfjsCore.opsMod

import typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsJapgolly.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/ops", "softmax")
@js.native
object softmax extends js.Object {
  def apply[T /* <: Tensor[Rank] */](logits: T): T = js.native
  def apply[T /* <: Tensor[Rank] */](logits: T, dim: Double): T = js.native
  def apply[T /* <: Tensor[Rank] */](logits: TensorLike): T = js.native
  def apply[T /* <: Tensor[Rank] */](logits: TensorLike, dim: Double): T = js.native
}

