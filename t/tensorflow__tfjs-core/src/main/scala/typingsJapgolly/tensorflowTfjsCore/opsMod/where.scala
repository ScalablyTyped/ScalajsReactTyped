package typingsJapgolly.tensorflowTfjsCore.opsMod

import typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsJapgolly.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/ops", "where")
@js.native
object where extends js.Object {
  def apply[T /* <: Tensor[Rank] */](condition: TensorLike, a: T, b: T): T = js.native
  def apply[T /* <: Tensor[Rank] */](condition: TensorLike, a: T, b: TensorLike): T = js.native
  def apply[T /* <: Tensor[Rank] */](condition: TensorLike, a: TensorLike, b: T): T = js.native
  def apply[T /* <: Tensor[Rank] */](condition: TensorLike, a: TensorLike, b: TensorLike): T = js.native
  def apply[T /* <: Tensor[Rank] */](condition: Tensor[Rank], a: T, b: T): T = js.native
  def apply[T /* <: Tensor[Rank] */](condition: Tensor[Rank], a: T, b: TensorLike): T = js.native
  def apply[T /* <: Tensor[Rank] */](condition: Tensor[Rank], a: TensorLike, b: T): T = js.native
  def apply[T /* <: Tensor[Rank] */](condition: Tensor[Rank], a: TensorLike, b: TensorLike): T = js.native
}

