package typingsJapgolly.jqueryMockjax

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MockJaxStandardLogger extends js.Object {
  var debug: js.UndefOr[MockJaxLoggingFunction] = js.undefined
  var error: js.UndefOr[MockJaxLoggingFunction] = js.undefined
  var info: js.UndefOr[MockJaxLoggingFunction] = js.undefined
  var log: js.UndefOr[MockJaxLoggingFunction] = js.undefined
  var warn: js.UndefOr[MockJaxLoggingFunction] = js.undefined
}

object MockJaxStandardLogger {
  @scala.inline
  def apply(
    debug: (/* message */ js.UndefOr[js.Any], /* repeated */ js.Any) => Callback = null,
    error: (/* message */ js.UndefOr[js.Any], /* repeated */ js.Any) => Callback = null,
    info: (/* message */ js.UndefOr[js.Any], /* repeated */ js.Any) => Callback = null,
    log: (/* message */ js.UndefOr[js.Any], /* repeated */ js.Any) => Callback = null,
    warn: (/* message */ js.UndefOr[js.Any], /* repeated */ js.Any) => Callback = null
  ): MockJaxStandardLogger = {
    val __obj = js.Dynamic.literal()
    if (debug != null) __obj.updateDynamic("debug")(js.Any.fromFunction2((t0: /* message */ js.UndefOr[js.Any], t1: /* repeated */ js.Any) => debug(t0, t1).runNow()))
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction2((t0: /* message */ js.UndefOr[js.Any], t1: /* repeated */ js.Any) => error(t0, t1).runNow()))
    if (info != null) __obj.updateDynamic("info")(js.Any.fromFunction2((t0: /* message */ js.UndefOr[js.Any], t1: /* repeated */ js.Any) => info(t0, t1).runNow()))
    if (log != null) __obj.updateDynamic("log")(js.Any.fromFunction2((t0: /* message */ js.UndefOr[js.Any], t1: /* repeated */ js.Any) => log(t0, t1).runNow()))
    if (warn != null) __obj.updateDynamic("warn")(js.Any.fromFunction2((t0: /* message */ js.UndefOr[js.Any], t1: /* repeated */ js.Any) => warn(t0, t1).runNow()))
    __obj.asInstanceOf[MockJaxStandardLogger]
  }
}

