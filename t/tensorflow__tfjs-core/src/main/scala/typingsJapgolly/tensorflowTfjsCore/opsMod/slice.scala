package typingsJapgolly.tensorflowTfjsCore.opsMod

import typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsJapgolly.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/ops", "slice")
@js.native
object slice extends js.Object {
  def apply[R /* <: Rank */, T /* <: Tensor[R] */](x: T, begin: js.Array[Double]): T = js.native
  def apply[R /* <: Rank */, T /* <: Tensor[R] */](x: T, begin: js.Array[Double], size: js.Array[Double]): T = js.native
  def apply[R /* <: Rank */, T /* <: Tensor[R] */](x: T, begin: js.Array[Double], size: Double): T = js.native
  def apply[R /* <: Rank */, T /* <: Tensor[R] */](x: T, begin: Double): T = js.native
  def apply[R /* <: Rank */, T /* <: Tensor[R] */](x: T, begin: Double, size: js.Array[Double]): T = js.native
  def apply[R /* <: Rank */, T /* <: Tensor[R] */](x: T, begin: Double, size: Double): T = js.native
  def apply[R /* <: Rank */, T /* <: Tensor[R] */](x: TensorLike, begin: js.Array[Double]): T = js.native
  def apply[R /* <: Rank */, T /* <: Tensor[R] */](x: TensorLike, begin: js.Array[Double], size: js.Array[Double]): T = js.native
  def apply[R /* <: Rank */, T /* <: Tensor[R] */](x: TensorLike, begin: js.Array[Double], size: Double): T = js.native
  def apply[R /* <: Rank */, T /* <: Tensor[R] */](x: TensorLike, begin: Double): T = js.native
  def apply[R /* <: Rank */, T /* <: Tensor[R] */](x: TensorLike, begin: Double, size: js.Array[Double]): T = js.native
  def apply[R /* <: Rank */, T /* <: Tensor[R] */](x: TensorLike, begin: Double, size: Double): T = js.native
}

