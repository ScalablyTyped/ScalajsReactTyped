package typingsJapgolly.tensorflowTfjsCore.opsMod

import typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsJapgolly.tensorflowTfjsCore.tensorMod.Tensor
import typingsJapgolly.tensorflowTfjsCore.tensorMod.Tensor1D
import typingsJapgolly.tensorflowTfjsCore.tensorMod.Tensor2D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/ops", "linalg")
@js.native
object linalg extends js.Object {
  val gramSchmidt: js.Function1[/* xs */ js.Array[Tensor1D] | Tensor2D, js.Array[Tensor1D] | Tensor2D] = js.native
  val qr: js.Function2[
    /* x */ Tensor[Rank], 
    /* fullMatrices */ js.UndefOr[Boolean], 
    js.Tuple2[Tensor[Rank], Tensor[Rank]]
  ] = js.native
  @js.native
  object bandPart extends js.Object {
    def apply[T /* <: Tensor[Rank] */](a: T, numLower: Double, numUpper: Double): T = js.native
    def apply[T /* <: Tensor[Rank] */](a: TensorLike, numLower: Double, numUpper: Double): T = js.native
  }
  
}

