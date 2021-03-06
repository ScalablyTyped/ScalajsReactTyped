package typingsJapgolly.tensorflowTfjsCore

import typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsJapgolly.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/topk", JSImport.Namespace)
@js.native
object topkMod extends js.Object {
  @js.native
  object topk extends js.Object {
    def apply[T /* <: Tensor[Rank] */](x: T): AnonIndices[T] = js.native
    def apply[T /* <: Tensor[Rank] */](x: T, k: Double): AnonIndices[T] = js.native
    def apply[T /* <: Tensor[Rank] */](x: T, k: Double, sorted: Boolean): AnonIndices[T] = js.native
    def apply[T /* <: Tensor[Rank] */](x: TensorLike): AnonIndices[T] = js.native
    def apply[T /* <: Tensor[Rank] */](x: TensorLike, k: Double): AnonIndices[T] = js.native
    def apply[T /* <: Tensor[Rank] */](x: TensorLike, k: Double, sorted: Boolean): AnonIndices[T] = js.native
  }
  
}

