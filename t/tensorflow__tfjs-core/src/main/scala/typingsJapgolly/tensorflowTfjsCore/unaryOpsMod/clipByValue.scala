package typingsJapgolly.tensorflowTfjsCore.unaryOpsMod

import typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsJapgolly.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/unary_ops", "clipByValue")
@js.native
object clipByValue extends js.Object {
  def apply[T /* <: Tensor[Rank] */](x: T, clipValueMin: Double, clipValueMax: Double): T = js.native
  def apply[T /* <: Tensor[Rank] */](x: TensorLike, clipValueMin: Double, clipValueMax: Double): T = js.native
}

