package typingsJapgolly.tensorflowTfjsCore.opsMod

import typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsJapgolly.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/ops", "transpose")
@js.native
object transpose extends js.Object {
  def apply[T /* <: Tensor[Rank] */](x: T): T = js.native
  def apply[T /* <: Tensor[Rank] */](x: T, perm: js.Array[Double]): T = js.native
  def apply[T /* <: Tensor[Rank] */](x: TensorLike): T = js.native
  def apply[T /* <: Tensor[Rank] */](x: TensorLike, perm: js.Array[Double]): T = js.native
}

