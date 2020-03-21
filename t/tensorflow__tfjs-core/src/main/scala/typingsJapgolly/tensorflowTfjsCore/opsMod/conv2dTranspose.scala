package typingsJapgolly.tensorflowTfjsCore.opsMod

import typingsJapgolly.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsJapgolly.tensorflowTfjsCore.tensorMod.Tensor3D
import typingsJapgolly.tensorflowTfjsCore.tensorMod.Tensor4D
import typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.same_
import typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.valid_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/ops", "conv2dTranspose")
@js.native
object conv2dTranspose extends js.Object {
  def apply[T /* <: Tensor3D | Tensor4D */](
    x: T | TensorLike,
    filter: Tensor4D | TensorLike,
    outputShape: (js.Tuple4[Double, Double, Double, Double]) | (js.Tuple3[Double, Double, Double]),
    strides: (js.Tuple2[Double, Double]) | Double,
    pad: valid_ | same_ | Double
  ): T = js.native
  def apply[T /* <: Tensor3D | Tensor4D */](
    x: T | TensorLike,
    filter: Tensor4D | TensorLike,
    outputShape: (js.Tuple4[Double, Double, Double, Double]) | (js.Tuple3[Double, Double, Double]),
    strides: (js.Tuple2[Double, Double]) | Double,
    pad: valid_ | same_ | Double,
    dimRoundingMode: typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.floor | typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.round | typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.ceil
  ): T = js.native
}

