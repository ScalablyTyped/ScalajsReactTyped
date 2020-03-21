package typingsJapgolly.tensorflowTfjs.mod

import typingsJapgolly.tensorflowTfjs.tensorflowTfjsStrings.avg
import typingsJapgolly.tensorflowTfjs.tensorflowTfjsStrings.same
import typingsJapgolly.tensorflowTfjs.tensorflowTfjsStrings.valid
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsJapgolly.tensorflowTfjsCore.tensorMod.Tensor3D
import typingsJapgolly.tensorflowTfjsCore.tensorMod.Tensor4D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs", "pool")
@js.native
object pool extends js.Object {
  def apply[T /* <: Tensor3D | Tensor4D */](
    input: T | TensorLike,
    windowShape: (js.Tuple2[Double, Double]) | Double,
    poolingType: avg | typingsJapgolly.tensorflowTfjs.tensorflowTfjsStrings.max,
    pad: valid | same | Double
  ): T = js.native
  def apply[T /* <: Tensor3D | Tensor4D */](
    input: T | TensorLike,
    windowShape: (js.Tuple2[Double, Double]) | Double,
    poolingType: avg | typingsJapgolly.tensorflowTfjs.tensorflowTfjsStrings.max,
    pad: valid | same | Double,
    dilations: (js.Tuple2[Double, Double]) | Double
  ): T = js.native
  def apply[T /* <: Tensor3D | Tensor4D */](
    input: T | TensorLike,
    windowShape: (js.Tuple2[Double, Double]) | Double,
    poolingType: avg | typingsJapgolly.tensorflowTfjs.tensorflowTfjsStrings.max,
    pad: valid | same | Double,
    dilations: (js.Tuple2[Double, Double]) | Double,
    strides: (js.Tuple2[Double, Double]) | Double
  ): T = js.native
}

