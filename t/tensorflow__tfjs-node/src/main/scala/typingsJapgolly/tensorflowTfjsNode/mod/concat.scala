package typingsJapgolly.tensorflowTfjsNode.mod

import typingsJapgolly.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsJapgolly.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", "concat")
@js.native
object concat extends js.Object {
  def apply[T /* <: Tensor[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank] */](tensors: js.Array[T | TensorLike]): T = js.native
  def apply[T /* <: Tensor[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank] */](tensors: js.Array[T | TensorLike], axis: Double): T = js.native
}

