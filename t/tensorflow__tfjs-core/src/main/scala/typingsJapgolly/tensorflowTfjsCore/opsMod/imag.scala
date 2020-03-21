package typingsJapgolly.tensorflowTfjsCore.opsMod

import typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsJapgolly.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/ops", "imag")
@js.native
object imag extends js.Object {
  def apply[T /* <: Tensor[Rank] */](input: T): T = js.native
  def apply[T /* <: Tensor[Rank] */](input: TensorLike): T = js.native
}

