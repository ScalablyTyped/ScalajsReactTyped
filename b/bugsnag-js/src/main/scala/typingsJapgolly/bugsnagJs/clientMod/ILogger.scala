package typingsJapgolly.bugsnagJs.clientMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILogger extends js.Object {
  def debug(args: js.Any*): Unit
  def error(args: js.Any*): Unit
  def info(args: js.Any*): Unit
  def warn(args: js.Any*): Unit
}

object ILogger {
  @scala.inline
  def apply(
    debug: /* repeated */ js.Any => Callback,
    error: /* repeated */ js.Any => Callback,
    info: /* repeated */ js.Any => Callback,
    warn: /* repeated */ js.Any => Callback
  ): ILogger = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("debug")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => debug(t0).runNow()))
    __obj.updateDynamic("error")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => error(t0).runNow()))
    __obj.updateDynamic("info")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => info(t0).runNow()))
    __obj.updateDynamic("warn")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => warn(t0).runNow()))
    __obj.asInstanceOf[ILogger]
  }
}

