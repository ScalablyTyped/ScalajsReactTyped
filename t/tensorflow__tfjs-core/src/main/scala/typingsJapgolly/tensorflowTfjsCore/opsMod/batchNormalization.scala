package typingsJapgolly.tensorflowTfjsCore.opsMod

import typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsJapgolly.tensorflowTfjsCore.tensorMod.Tensor
import typingsJapgolly.tensorflowTfjsCore.tensorMod.Tensor1D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/ops", "batchNormalization")
@js.native
object batchNormalization extends js.Object {
  def apply[R /* <: Rank */](
    x: Tensor[R] | TensorLike,
    mean: Tensor[R] | Tensor1D | TensorLike,
    variance: Tensor[R] | Tensor1D | TensorLike
  ): Tensor[R] = js.native
  def apply[R /* <: Rank */](
    x: Tensor[R] | TensorLike,
    mean: Tensor[R] | Tensor1D | TensorLike,
    variance: Tensor[R] | Tensor1D | TensorLike,
    varianceEpsilon: Double
  ): Tensor[R] = js.native
  def apply[R /* <: Rank */](
    x: Tensor[R] | TensorLike,
    mean: Tensor[R] | Tensor1D | TensorLike,
    variance: Tensor[R] | Tensor1D | TensorLike,
    varianceEpsilon: Double,
    scale: Tensor[R] | Tensor1D | TensorLike
  ): Tensor[R] = js.native
  def apply[R /* <: Rank */](
    x: Tensor[R] | TensorLike,
    mean: Tensor[R] | Tensor1D | TensorLike,
    variance: Tensor[R] | Tensor1D | TensorLike,
    varianceEpsilon: Double,
    scale: Tensor[R] | Tensor1D | TensorLike,
    offset: Tensor[R] | Tensor1D | TensorLike
  ): Tensor[R] = js.native
}

