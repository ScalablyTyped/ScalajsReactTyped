package typingsJapgolly.tensorflowTfjsCore.opsMod

import typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsJapgolly.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/ops", "inTopKAsync")
@js.native
object inTopKAsync extends js.Object {
  def apply[T /* <: Tensor[Rank] */, U /* <: Tensor[Rank] */](predictions: T, targets: U): js.Promise[U] = js.native
  def apply[T /* <: Tensor[Rank] */, U /* <: Tensor[Rank] */](predictions: T, targets: U, k: Double): js.Promise[U] = js.native
  def apply[T /* <: Tensor[Rank] */, U /* <: Tensor[Rank] */](predictions: T, targets: TensorLike): js.Promise[U] = js.native
  def apply[T /* <: Tensor[Rank] */, U /* <: Tensor[Rank] */](predictions: T, targets: TensorLike, k: Double): js.Promise[U] = js.native
  def apply[T /* <: Tensor[Rank] */, U /* <: Tensor[Rank] */](predictions: TensorLike, targets: U): js.Promise[U] = js.native
  def apply[T /* <: Tensor[Rank] */, U /* <: Tensor[Rank] */](predictions: TensorLike, targets: U, k: Double): js.Promise[U] = js.native
  def apply[T /* <: Tensor[Rank] */, U /* <: Tensor[Rank] */](predictions: TensorLike, targets: TensorLike): js.Promise[U] = js.native
  def apply[T /* <: Tensor[Rank] */, U /* <: Tensor[Rank] */](predictions: TensorLike, targets: TensorLike, k: Double): js.Promise[U] = js.native
}

