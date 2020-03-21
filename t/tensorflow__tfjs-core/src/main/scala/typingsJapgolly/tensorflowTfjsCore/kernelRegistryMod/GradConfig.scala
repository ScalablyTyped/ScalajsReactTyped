package typingsJapgolly.tensorflowTfjsCore.kernelRegistryMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank
import typingsJapgolly.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GradConfig extends js.Object {
  @JSName("gradFunc")
  var gradFunc_Original: GradFunc = js.native
  var kernelName: String = js.native
  def gradFunc(dy: js.Array[Tensor[Rank]], saved: js.Array[Tensor[Rank]]): StringDictionary[js.Function0[Tensor[Rank]]] = js.native
  def gradFunc(dy: Tensor[Rank], saved: js.Array[Tensor[Rank]]): StringDictionary[js.Function0[Tensor[Rank]]] = js.native
}

