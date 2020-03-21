package typingsJapgolly.chaiSubset.mod._Global_.Chai

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Assertion extends js.Object {
  def containSubset(expected: js.Any): Assertion
}

object Assertion {
  @scala.inline
  def apply(containSubset: js.Any => CallbackTo[Assertion]): Assertion = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("containSubset")(js.Any.fromFunction1((t0: js.Any) => containSubset(t0).runNow()))
    __obj.asInstanceOf[Assertion]
  }
}

