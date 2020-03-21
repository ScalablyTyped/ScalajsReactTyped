package typingsJapgolly.ramda

import typingsJapgolly.ramda.toolsMod.Pred
import typingsJapgolly.ramda.toolsMod.SafePred
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ramda/src/cond", JSImport.Namespace)
@js.native
object condMod extends js.Object {
  def default(fns: js.Array[js.Tuple2[Pred, js.Function1[/* repeated */ _, _]]]): js.Function1[/* repeated */ js.Any, _] = js.native
  @JSName("default")
  def default_AB[A, B](fns: js.Array[js.Tuple2[SafePred[A], js.Function1[/* repeated */ A, B]]]): js.Function1[/* repeated */ A, B] = js.native
}

