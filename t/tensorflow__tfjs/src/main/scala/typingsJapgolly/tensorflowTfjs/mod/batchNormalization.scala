package typingsJapgolly.tensorflowTfjs.mod

import typingsJapgolly.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsJapgolly.tensorflowTfjsCore.tensorMod.Tensor
import typingsJapgolly.tensorflowTfjsCore.tensorMod.Tensor1D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs", "batchNormalization")
@js.native
object batchNormalization extends js.Object {
  def apply[R /* <: typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank */](
    x: Tensor[R] | TensorLike,
    mean: Tensor[R] | Tensor1D | TensorLike,
    variance: Tensor[R] | Tensor1D | TensorLike,
    varianceEpsilon: Double,
    scale: Tensor[R] | Tensor1D | TensorLike
  ): Tensor[R] = js.native
  def apply[R /* <: typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank */](
    x: Tensor[R] | TensorLike,
    mean: Tensor[R] | Tensor1D | TensorLike,
    variance: Tensor[R] | Tensor1D | TensorLike,
    varianceEpsilon: Double,
    scale: Tensor[R] | Tensor1D | TensorLike,
    offset: Tensor[R] | Tensor1D | TensorLike
  ): Tensor[R] = js.native
  def apply[R /* <: typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank */](
    x: TensorLike,
    mean: Tensor[R] | Tensor1D | TensorLike,
    variance: Tensor[R] | Tensor1D | TensorLike
  ): Tensor[R] = js.native
  def apply[R /* <: typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank */](
    x: TensorLike,
    mean: Tensor[R] | Tensor1D | TensorLike,
    variance: Tensor[R] | Tensor1D | TensorLike,
    varianceEpsilon: Double
  ): Tensor[R] = js.native
  def apply[R /* <: typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank */](x: Tensor[R], mean: Tensor[R] | Tensor1D | TensorLike, variance: Tensor[R] | Tensor1D | TensorLike): Tensor[R] = js.native
  def apply[R /* <: typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank */](
    x: Tensor[R],
    mean: Tensor[R] | Tensor1D | TensorLike,
    variance: Tensor[R] | Tensor1D | TensorLike,
    varianceEpsilon: Double
  ): Tensor[R] = js.native
}

