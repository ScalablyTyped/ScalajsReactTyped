package typingsJapgolly.tensorflowTfjs.mod

import typingsJapgolly.tensorflowTfjs.tensorflowTfjsStrings.NCDHW
import typingsJapgolly.tensorflowTfjs.tensorflowTfjsStrings.NDHWC
import typingsJapgolly.tensorflowTfjs.tensorflowTfjsStrings.same
import typingsJapgolly.tensorflowTfjs.tensorflowTfjsStrings.valid
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsJapgolly.tensorflowTfjsCore.tensorMod.Tensor4D
import typingsJapgolly.tensorflowTfjsCore.tensorMod.Tensor5D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs", "maxPool3d")
@js.native
object maxPool3d extends js.Object {
  def apply[T /* <: Tensor4D | Tensor5D */](
    x: T | TensorLike,
    filterSize: (js.Tuple3[Double, Double, Double]) | Double,
    strides: (js.Tuple3[Double, Double, Double]) | Double,
    pad: valid | same | Double
  ): T = js.native
  def apply[T /* <: Tensor4D | Tensor5D */](
    x: T | TensorLike,
    filterSize: (js.Tuple3[Double, Double, Double]) | Double,
    strides: (js.Tuple3[Double, Double, Double]) | Double,
    pad: valid | same | Double,
    dimRoundingMode: typingsJapgolly.tensorflowTfjs.tensorflowTfjsStrings.floor | typingsJapgolly.tensorflowTfjs.tensorflowTfjsStrings.round | typingsJapgolly.tensorflowTfjs.tensorflowTfjsStrings.ceil
  ): T = js.native
  def apply[T /* <: Tensor4D | Tensor5D */](
    x: T | TensorLike,
    filterSize: (js.Tuple3[Double, Double, Double]) | Double,
    strides: (js.Tuple3[Double, Double, Double]) | Double,
    pad: valid | same | Double,
    dimRoundingMode: typingsJapgolly.tensorflowTfjs.tensorflowTfjsStrings.floor | typingsJapgolly.tensorflowTfjs.tensorflowTfjsStrings.round | typingsJapgolly.tensorflowTfjs.tensorflowTfjsStrings.ceil,
    dataFormat: NDHWC | NCDHW
  ): T = js.native
  def apply[T /* <: Tensor4D | Tensor5D */](
    x: T | TensorLike,
    filterSize: (js.Tuple3[Double, Double, Double]) | Double,
    strides: (js.Tuple3[Double, Double, Double]) | Double,
    pad: valid | same | Double,
    dimRoundingMode: typingsJapgolly.tensorflowTfjs.tensorflowTfjsStrings.floor | typingsJapgolly.tensorflowTfjs.tensorflowTfjsStrings.round | typingsJapgolly.tensorflowTfjs.tensorflowTfjsStrings.ceil,
    dataFormat: NDHWC | NCDHW,
    dilations: (js.Tuple3[Double, Double, Double]) | Double
  ): T = js.native
}

