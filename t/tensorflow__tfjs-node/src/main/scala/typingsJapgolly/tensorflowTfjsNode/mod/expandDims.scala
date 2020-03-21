package typingsJapgolly.tensorflowTfjsNode.mod

import typingsJapgolly.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsJapgolly.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", "expandDims")
@js.native
object expandDims extends js.Object {
  def apply[R2 /* <: typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank */](x: TensorLike): Tensor[R2] = js.native
  def apply[R2 /* <: typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank */](x: TensorLike, axis: Double): Tensor[R2] = js.native
  def apply[R2 /* <: typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank */](x: Tensor[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank]): Tensor[R2] = js.native
  def apply[R2 /* <: typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank */](x: Tensor[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank], axis: Double): Tensor[R2] = js.native
}

