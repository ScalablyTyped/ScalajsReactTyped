package typingsJapgolly.tensorflowTfjsCore

import typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsJapgolly.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/softmax", JSImport.Namespace)
@js.native
object softmaxMod extends js.Object {
  @js.native
  object logSoftmax extends js.Object {
    def apply[T /* <: Tensor[Rank] */](logits: T): T = js.native
    def apply[T /* <: Tensor[Rank] */](logits: T, axis: Double): T = js.native
    def apply[T /* <: Tensor[Rank] */](logits: TensorLike): T = js.native
    def apply[T /* <: Tensor[Rank] */](logits: TensorLike, axis: Double): T = js.native
  }
  
  @js.native
  object softmax extends js.Object {
    def apply[T /* <: Tensor[Rank] */](logits: T): T = js.native
    def apply[T /* <: Tensor[Rank] */](logits: T, dim: Double): T = js.native
    def apply[T /* <: Tensor[Rank] */](logits: TensorLike): T = js.native
    def apply[T /* <: Tensor[Rank] */](logits: TensorLike, dim: Double): T = js.native
  }
  
}

