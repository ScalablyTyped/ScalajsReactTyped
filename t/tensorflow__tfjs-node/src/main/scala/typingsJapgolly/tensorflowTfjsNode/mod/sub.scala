package typingsJapgolly.tensorflowTfjsNode.mod

import typingsJapgolly.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsJapgolly.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", "sub")
@js.native
object sub extends js.Object {
  def apply[T /* <: Tensor[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank] */](a: TensorLike, b: TensorLike): T = js.native
  def apply[T /* <: Tensor[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank] */](a: TensorLike, b: Tensor[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank]): T = js.native
  def apply[T /* <: Tensor[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank] */](a: Tensor[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank], b: TensorLike): T = js.native
  def apply[T /* <: Tensor[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank] */](
    a: Tensor[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank],
    b: Tensor[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank]
  ): T = js.native
}

