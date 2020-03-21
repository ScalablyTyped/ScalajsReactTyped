package typingsJapgolly.cypress.sinonMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimplifiedSet extends js.Object {
  def has(el: js.Any): Boolean
}

object SimplifiedSet {
  @scala.inline
  def apply(has: js.Any => CallbackTo[Boolean]): SimplifiedSet = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("has")(js.Any.fromFunction1((t0: js.Any) => has(t0).runNow()))
    __obj.asInstanceOf[SimplifiedSet]
  }
}

