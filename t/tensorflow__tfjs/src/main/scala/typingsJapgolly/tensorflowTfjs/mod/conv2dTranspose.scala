package typingsJapgolly.tensorflowTfjs.mod

import typingsJapgolly.tensorflowTfjs.tensorflowTfjsStrings.same
import typingsJapgolly.tensorflowTfjs.tensorflowTfjsStrings.valid
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsJapgolly.tensorflowTfjsCore.tensorMod.Tensor3D
import typingsJapgolly.tensorflowTfjsCore.tensorMod.Tensor4D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs", "conv2dTranspose")
@js.native
object conv2dTranspose extends js.Object {
  def apply[T /* <: Tensor3D | Tensor4D */](
    x: T | TensorLike,
    filter: Tensor4D | TensorLike,
    outputShape: (js.Tuple4[Double, Double, Double, Double]) | (js.Tuple3[Double, Double, Double]),
    strides: (js.Tuple2[Double, Double]) | Double,
    pad: valid | same | Double
  ): T = js.native
  def apply[T /* <: Tensor3D | Tensor4D */](
    x: T | TensorLike,
    filter: Tensor4D | TensorLike,
    outputShape: (js.Tuple4[Double, Double, Double, Double]) | (js.Tuple3[Double, Double, Double]),
    strides: (js.Tuple2[Double, Double]) | Double,
    pad: valid | same | Double,
    dimRoundingMode: typingsJapgolly.tensorflowTfjs.tensorflowTfjsStrings.floor | typingsJapgolly.tensorflowTfjs.tensorflowTfjsStrings.round | typingsJapgolly.tensorflowTfjs.tensorflowTfjsStrings.ceil
  ): T = js.native
}

