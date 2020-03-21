package typingsJapgolly.hlsJs.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomLoggerObject extends js.Object {
  var debug: js.UndefOr[CustomLogger] = js.undefined
  var error: js.UndefOr[CustomLogger] = js.undefined
  var info: js.UndefOr[CustomLogger] = js.undefined
  var log: js.UndefOr[CustomLogger] = js.undefined
  var warn: js.UndefOr[CustomLogger] = js.undefined
}

object CustomLoggerObject {
  @scala.inline
  def apply(
    debug: /* repeated */ js.Any => Callback = null,
    error: /* repeated */ js.Any => Callback = null,
    info: /* repeated */ js.Any => Callback = null,
    log: /* repeated */ js.Any => Callback = null,
    warn: /* repeated */ js.Any => Callback = null
  ): CustomLoggerObject = {
    val __obj = js.Dynamic.literal()
    if (debug != null) __obj.updateDynamic("debug")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => debug(t0).runNow()))
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => error(t0).runNow()))
    if (info != null) __obj.updateDynamic("info")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => info(t0).runNow()))
    if (log != null) __obj.updateDynamic("log")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => log(t0).runNow()))
    if (warn != null) __obj.updateDynamic("warn")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => warn(t0).runNow()))
    __obj.asInstanceOf[CustomLoggerObject]
  }
}

