package typingsJapgolly.tensorflowTfjsCore.opsMod

import typingsJapgolly.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsJapgolly.tensorflowTfjsCore.tensorMod.Tensor4D
import typingsJapgolly.tensorflowTfjsCore.tensorMod.Tensor5D
import typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.NCDHW
import typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.NDHWC
import typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.same_
import typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.valid_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/ops", "conv3d")
@js.native
object conv3d extends js.Object {
  def apply[T /* <: Tensor4D | Tensor5D */](
    x: T | TensorLike,
    filter: Tensor5D | TensorLike,
    strides: (js.Tuple3[Double, Double, Double]) | Double,
    pad: valid_ | same_
  ): T = js.native
  def apply[T /* <: Tensor4D | Tensor5D */](
    x: T | TensorLike,
    filter: Tensor5D | TensorLike,
    strides: (js.Tuple3[Double, Double, Double]) | Double,
    pad: valid_ | same_,
    dataFormat: NDHWC | NCDHW
  ): T = js.native
  def apply[T /* <: Tensor4D | Tensor5D */](
    x: T | TensorLike,
    filter: Tensor5D | TensorLike,
    strides: (js.Tuple3[Double, Double, Double]) | Double,
    pad: valid_ | same_,
    dataFormat: NDHWC | NCDHW,
    dilations: (js.Tuple3[Double, Double, Double]) | Double
  ): T = js.native
}

