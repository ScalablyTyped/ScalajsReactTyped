package typingsJapgolly.cypress.sinonMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimplifiedMap extends SimplifiedSet {
  def get(key: js.Any): js.Any
}

object SimplifiedMap {
  @scala.inline
  def apply(get: js.Any => CallbackTo[js.Any], has: js.Any => CallbackTo[Boolean]): SimplifiedMap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: js.Any) => get(t0).runNow()))
    __obj.updateDynamic("has")(js.Any.fromFunction1((t0: js.Any) => has(t0).runNow()))
    __obj.asInstanceOf[SimplifiedMap]
  }
}

