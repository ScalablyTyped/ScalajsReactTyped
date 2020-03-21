package typingsJapgolly.reReselect

import typingsJapgolly.reReselect.mod.ParametricKeySelector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonKeySelector[D, C, S, P] extends js.Object {
  var inputSelectors: D = js.native
  @JSName("keySelector")
  var keySelector_Original: ParametricKeySelector[S, P] = js.native
  var resultFunc: C = js.native
  def keySelector(state: S, props: P, args: js.Any*): js.Any = js.native
}

