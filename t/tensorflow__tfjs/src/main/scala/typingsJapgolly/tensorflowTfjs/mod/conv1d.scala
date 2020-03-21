package typingsJapgolly.tensorflowTfjs.mod

import typingsJapgolly.tensorflowTfjs.tensorflowTfjsStrings.NCW
import typingsJapgolly.tensorflowTfjs.tensorflowTfjsStrings.NWC
import typingsJapgolly.tensorflowTfjs.tensorflowTfjsStrings.same
import typingsJapgolly.tensorflowTfjs.tensorflowTfjsStrings.valid
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsJapgolly.tensorflowTfjsCore.tensorMod.Tensor2D
import typingsJapgolly.tensorflowTfjsCore.tensorMod.Tensor3D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs", "conv1d")
@js.native
object conv1d extends js.Object {
  def apply[T /* <: Tensor2D | Tensor3D */](x: T, filter: TensorLike, stride: Double, pad: Double): T = js.native
  def apply[T /* <: Tensor2D | Tensor3D */](x: T, filter: TensorLike, stride: Double, pad: same): T = js.native
  def apply[T /* <: Tensor2D | Tensor3D */](x: T, filter: TensorLike, stride: Double, pad: valid): T = js.native
  def apply[T /* <: Tensor2D | Tensor3D */](x: T, filter: Tensor3D, stride: Double, pad: Double): T = js.native
  def apply[T /* <: Tensor2D | Tensor3D */](x: T, filter: Tensor3D, stride: Double, pad: same): T = js.native
  def apply[T /* <: Tensor2D | Tensor3D */](x: T, filter: Tensor3D, stride: Double, pad: valid): T = js.native
  def apply[T /* <: Tensor2D | Tensor3D */](
    x: T | TensorLike,
    filter: Tensor3D | TensorLike,
    stride: Double,
    pad: valid | same | Double,
    dataFormat: NWC | NCW
  ): T = js.native
  def apply[T /* <: Tensor2D | Tensor3D */](
    x: T | TensorLike,
    filter: Tensor3D | TensorLike,
    stride: Double,
    pad: valid | same | Double,
    dataFormat: NWC | NCW,
    dilation: Double
  ): T = js.native
  def apply[T /* <: Tensor2D | Tensor3D */](
    x: T | TensorLike,
    filter: Tensor3D | TensorLike,
    stride: Double,
    pad: valid | same | Double,
    dataFormat: NWC | NCW,
    dilation: Double,
    dimRoundingMode: typingsJapgolly.tensorflowTfjs.tensorflowTfjsStrings.floor | typingsJapgolly.tensorflowTfjs.tensorflowTfjsStrings.round | typingsJapgolly.tensorflowTfjs.tensorflowTfjsStrings.ceil
  ): T = js.native
  def apply[T /* <: Tensor2D | Tensor3D */](x: TensorLike, filter: TensorLike, stride: Double, pad: Double): T = js.native
  def apply[T /* <: Tensor2D | Tensor3D */](x: TensorLike, filter: TensorLike, stride: Double, pad: same): T = js.native
  def apply[T /* <: Tensor2D | Tensor3D */](x: TensorLike, filter: TensorLike, stride: Double, pad: valid): T = js.native
  def apply[T /* <: Tensor2D | Tensor3D */](x: TensorLike, filter: Tensor3D, stride: Double, pad: Double): T = js.native
  def apply[T /* <: Tensor2D | Tensor3D */](x: TensorLike, filter: Tensor3D, stride: Double, pad: same): T = js.native
  def apply[T /* <: Tensor2D | Tensor3D */](x: TensorLike, filter: Tensor3D, stride: Double, pad: valid): T = js.native
}

