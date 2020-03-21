package typingsJapgolly.browserSync

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFn extends js.Object {
  var fn: js.UndefOr[js.Function2[/* snippet */ String, /* match */ String, _]] = js.undefined
  var `match`: js.UndefOr[js.RegExp] = js.undefined
}

object AnonFn {
  @scala.inline
  def apply(
    fn: (/* snippet */ String, /* match */ String) => CallbackTo[js.Any] = null,
    `match`: js.RegExp = null
  ): AnonFn = {
    val __obj = js.Dynamic.literal()
    if (fn != null) __obj.updateDynamic("fn")(js.Any.fromFunction2((t0: /* snippet */ java.lang.String, t1: /* match */ java.lang.String) => fn(t0, t1).runNow()))
    if (`match` != null) __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFn]
  }
}

