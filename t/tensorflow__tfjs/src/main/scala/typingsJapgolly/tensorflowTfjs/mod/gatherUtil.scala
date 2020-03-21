package typingsJapgolly.tensorflowTfjs.mod

import typingsJapgolly.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs", "gather_util")
@js.native
object gatherUtil extends js.Object {
  def prepareAndValidate(
    tensor: Tensor[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank],
    indices: Tensor[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank]
  ): js.Tuple4[js.Array[Double], Double, Double, js.Array[Double]] = js.native
}

