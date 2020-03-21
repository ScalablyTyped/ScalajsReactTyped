package typingsJapgolly.tensorflowTfjsCore.opsMod

import typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsJapgolly.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/ops", "pow")
@js.native
object pow extends js.Object {
  def apply[T /* <: Tensor[Rank] */](base: T, exp: TensorLike): T = js.native
  def apply[T /* <: Tensor[Rank] */](base: T, exp: Tensor[Rank]): T = js.native
  def apply[T /* <: Tensor[Rank] */](base: TensorLike, exp: TensorLike): T = js.native
  def apply[T /* <: Tensor[Rank] */](base: TensorLike, exp: Tensor[Rank]): T = js.native
}

