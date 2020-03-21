package typingsJapgolly.tensorflowTfjsCore

import typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank
import typingsJapgolly.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/diag", JSImport.Namespace)
@js.native
object diagMod extends js.Object {
  val diag: js.Function1[/* x */ Tensor[Rank], Tensor[Rank]] = js.native
}

