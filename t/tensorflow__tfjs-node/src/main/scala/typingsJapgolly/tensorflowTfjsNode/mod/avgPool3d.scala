package typingsJapgolly.tensorflowTfjsNode.mod

import typingsJapgolly.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsJapgolly.tensorflowTfjsCore.tensorMod.Tensor4D
import typingsJapgolly.tensorflowTfjsCore.tensorMod.Tensor5D
import typingsJapgolly.tensorflowTfjsNode.tensorflowTfjsNodeStrings.NCDHW
import typingsJapgolly.tensorflowTfjsNode.tensorflowTfjsNodeStrings.NDHWC
import typingsJapgolly.tensorflowTfjsNode.tensorflowTfjsNodeStrings.same
import typingsJapgolly.tensorflowTfjsNode.tensorflowTfjsNodeStrings.valid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", "avgPool3d")
@js.native
object avgPool3d extends js.Object {
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
    dimRoundingMode: typingsJapgolly.tensorflowTfjsNode.tensorflowTfjsNodeStrings.floor | typingsJapgolly.tensorflowTfjsNode.tensorflowTfjsNodeStrings.round | typingsJapgolly.tensorflowTfjsNode.tensorflowTfjsNodeStrings.ceil
  ): T = js.native
  def apply[T /* <: Tensor4D | Tensor5D */](
    x: T | TensorLike,
    filterSize: (js.Tuple3[Double, Double, Double]) | Double,
    strides: (js.Tuple3[Double, Double, Double]) | Double,
    pad: valid | same | Double,
    dimRoundingMode: typingsJapgolly.tensorflowTfjsNode.tensorflowTfjsNodeStrings.floor | typingsJapgolly.tensorflowTfjsNode.tensorflowTfjsNodeStrings.round | typingsJapgolly.tensorflowTfjsNode.tensorflowTfjsNodeStrings.ceil,
    dataFormat: NDHWC | NCDHW
  ): T = js.native
  def apply[T /* <: Tensor4D | Tensor5D */](
    x: T | TensorLike,
    filterSize: (js.Tuple3[Double, Double, Double]) | Double,
    strides: (js.Tuple3[Double, Double, Double]) | Double,
    pad: valid | same | Double,
    dimRoundingMode: typingsJapgolly.tensorflowTfjsNode.tensorflowTfjsNodeStrings.floor | typingsJapgolly.tensorflowTfjsNode.tensorflowTfjsNodeStrings.round | typingsJapgolly.tensorflowTfjsNode.tensorflowTfjsNodeStrings.ceil,
    dataFormat: NDHWC | NCDHW,
    dilations: (js.Tuple3[Double, Double, Double]) | Double
  ): T = js.native
}

