package typingsJapgolly.tensorflowTfjsCore.opsMod

import typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsJapgolly.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/ops", "prelu")
@js.native
object prelu extends js.Object {
  def apply[T /* <: Tensor[Rank] */](x: T, alpha: T): T = js.native
  def apply[T /* <: Tensor[Rank] */](x: T, alpha: TensorLike): T = js.native
  def apply[T /* <: Tensor[Rank] */](x: TensorLike, alpha: T): T = js.native
  def apply[T /* <: Tensor[Rank] */](x: TensorLike, alpha: TensorLike): T = js.native
}

