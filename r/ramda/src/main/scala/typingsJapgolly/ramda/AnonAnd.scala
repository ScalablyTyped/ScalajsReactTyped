package typingsJapgolly.ramda

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAnd extends js.Object {
  var and: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
}

object AnonAnd {
  @scala.inline
  def apply(and: /* repeated */ js.Any => CallbackTo[js.Any] = null): AnonAnd = {
    val __obj = js.Dynamic.literal()
    if (and != null) __obj.updateDynamic("and")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => and(t0).runNow()))
    __obj.asInstanceOf[AnonAnd]
  }
}

