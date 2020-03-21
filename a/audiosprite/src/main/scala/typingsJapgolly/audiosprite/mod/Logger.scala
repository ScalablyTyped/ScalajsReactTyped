package typingsJapgolly.audiosprite.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Logger extends js.Object {
  var debug: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.undefined
  var info: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.undefined
  var log: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.undefined
}

object Logger {
  @scala.inline
  def apply(
    debug: /* repeated */ js.Any => Callback = null,
    info: /* repeated */ js.Any => Callback = null,
    log: /* repeated */ js.Any => Callback = null
  ): Logger = {
    val __obj = js.Dynamic.literal()
    if (debug != null) __obj.updateDynamic("debug")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => debug(t0).runNow()))
    if (info != null) __obj.updateDynamic("info")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => info(t0).runNow()))
    if (log != null) __obj.updateDynamic("log")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => log(t0).runNow()))
    __obj.asInstanceOf[Logger]
  }
}

