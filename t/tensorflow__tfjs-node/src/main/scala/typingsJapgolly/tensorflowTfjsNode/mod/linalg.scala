package typingsJapgolly.tensorflowTfjsNode.mod

import typingsJapgolly.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsJapgolly.tensorflowTfjsCore.tensorMod.Tensor
import typingsJapgolly.tensorflowTfjsCore.tensorMod.Tensor1D
import typingsJapgolly.tensorflowTfjsCore.tensorMod.Tensor2D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", "linalg")
@js.native
object linalg extends js.Object {
  val gramSchmidt: js.Function1[/* xs */ js.Array[Tensor1D] | Tensor2D, js.Array[Tensor1D] | Tensor2D] = js.native
  val qr: js.Function2[
    /* x */ Tensor[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank], 
    /* fullMatrices */ js.UndefOr[Boolean], 
    js.Tuple2[
      Tensor[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank], 
      Tensor[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank]
    ]
  ] = js.native
  @js.native
  object bandPart extends js.Object {
    def apply[T /* <: Tensor[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank] */](a: T, numLower: Double, numUpper: Double): T = js.native
    def apply[T /* <: Tensor[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank] */](a: TensorLike, numLower: Double, numUpper: Double): T = js.native
  }
  
}

