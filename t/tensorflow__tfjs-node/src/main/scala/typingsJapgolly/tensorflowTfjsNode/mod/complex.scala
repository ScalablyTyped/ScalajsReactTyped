package typingsJapgolly.tensorflowTfjsNode.mod

import typingsJapgolly.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsJapgolly.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", "complex")
@js.native
object complex extends js.Object {
  def apply[T /* <: Tensor[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank] */](real: T, imag: T): T = js.native
  def apply[T /* <: Tensor[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank] */](real: T, imag: TensorLike): T = js.native
  def apply[T /* <: Tensor[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank] */](real: TensorLike, imag: T): T = js.native
  def apply[T /* <: Tensor[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank] */](real: TensorLike, imag: TensorLike): T = js.native
}

