package typingsJapgolly.ramda

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOr extends js.Object {
  var or: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
}

object AnonOr {
  @scala.inline
  def apply(or: /* repeated */ js.Any => CallbackTo[js.Any] = null): AnonOr = {
    val __obj = js.Dynamic.literal()
    if (or != null) __obj.updateDynamic("or")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => or(t0).runNow()))
    __obj.asInstanceOf[AnonOr]
  }
}

