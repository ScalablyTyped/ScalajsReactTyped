package typingsJapgolly.tensorflowTfjsCore

import typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsJapgolly.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/dropout", JSImport.Namespace)
@js.native
object dropoutMod extends js.Object {
  val dropout: js.Function4[
    /* x */ Tensor[Rank] | TensorLike, 
    /* rate */ Double, 
    /* noiseShape */ js.UndefOr[js.Array[Double]], 
    /* seed */ js.UndefOr[Double | String], 
    Tensor[Rank]
  ] = js.native
}

