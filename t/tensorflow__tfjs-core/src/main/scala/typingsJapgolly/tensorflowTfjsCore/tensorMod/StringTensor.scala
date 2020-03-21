package typingsJapgolly.tensorflowTfjsCore.tensorMod

import typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank
import typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StringTensor[R /* <: Rank */] extends Tensor[R] {
  @JSName("dtype")
  var dtype_StringTensor: string = js.native
}

