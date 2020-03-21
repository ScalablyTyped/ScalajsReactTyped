package typingsJapgolly.tensorflowTfjsNode.mod

import typingsJapgolly.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsJapgolly.tensorflowTfjsCore.tensorMod.Tensor3D
import typingsJapgolly.tensorflowTfjsCore.tensorMod.Tensor4D
import typingsJapgolly.tensorflowTfjsNode.tensorflowTfjsNodeStrings.avg
import typingsJapgolly.tensorflowTfjsNode.tensorflowTfjsNodeStrings.same
import typingsJapgolly.tensorflowTfjsNode.tensorflowTfjsNodeStrings.valid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", "pool")
@js.native
object pool extends js.Object {
  def apply[T /* <: Tensor3D | Tensor4D */](
    input: T | TensorLike,
    windowShape: (js.Tuple2[Double, Double]) | Double,
    poolingType: avg | typingsJapgolly.tensorflowTfjsNode.tensorflowTfjsNodeStrings.max,
    pad: valid | same | Double
  ): T = js.native
  def apply[T /* <: Tensor3D | Tensor4D */](
    input: T | TensorLike,
    windowShape: (js.Tuple2[Double, Double]) | Double,
    poolingType: avg | typingsJapgolly.tensorflowTfjsNode.tensorflowTfjsNodeStrings.max,
    pad: valid | same | Double,
    dilations: (js.Tuple2[Double, Double]) | Double
  ): T = js.native
  def apply[T /* <: Tensor3D | Tensor4D */](
    input: T | TensorLike,
    windowShape: (js.Tuple2[Double, Double]) | Double,
    poolingType: avg | typingsJapgolly.tensorflowTfjsNode.tensorflowTfjsNodeStrings.max,
    pad: valid | same | Double,
    dilations: (js.Tuple2[Double, Double]) | Double,
    strides: (js.Tuple2[Double, Double]) | Double
  ): T = js.native
}

