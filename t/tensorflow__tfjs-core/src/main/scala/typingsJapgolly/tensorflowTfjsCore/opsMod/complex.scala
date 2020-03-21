package typingsJapgolly.tensorflowTfjsCore.opsMod

import typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsJapgolly.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/ops", "complex")
@js.native
object complex extends js.Object {
  def apply[T /* <: Tensor[Rank] */](real: T, imag: T): T = js.native
  def apply[T /* <: Tensor[Rank] */](real: T, imag: TensorLike): T = js.native
  def apply[T /* <: Tensor[Rank] */](real: TensorLike, imag: T): T = js.native
  def apply[T /* <: Tensor[Rank] */](real: TensorLike, imag: TensorLike): T = js.native
}

