package typingsJapgolly.nodemailer.sharedMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Logger extends js.Object {
  def debug(params: js.Any*): Unit
  def error(params: js.Any*): Unit
  def fatal(params: js.Any*): Unit
  def info(params: js.Any*): Unit
  def level(level: LoggerLevel): Unit
  def trace(params: js.Any*): Unit
  def warn(params: js.Any*): Unit
}

object Logger {
  @scala.inline
  def apply(
    debug: /* repeated */ js.Any => Callback,
    error: /* repeated */ js.Any => Callback,
    fatal: /* repeated */ js.Any => Callback,
    info: /* repeated */ js.Any => Callback,
    level: LoggerLevel => Callback,
    trace: /* repeated */ js.Any => Callback,
    warn: /* repeated */ js.Any => Callback
  ): Logger = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("debug")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => debug(t0).runNow()))
    __obj.updateDynamic("error")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => error(t0).runNow()))
    __obj.updateDynamic("fatal")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => fatal(t0).runNow()))
    __obj.updateDynamic("info")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => info(t0).runNow()))
    __obj.updateDynamic("level")(js.Any.fromFunction1((t0: typingsJapgolly.nodemailer.sharedMod.LoggerLevel) => level(t0).runNow()))
    __obj.updateDynamic("trace")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => trace(t0).runNow()))
    __obj.updateDynamic("warn")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => warn(t0).runNow()))
    __obj.asInstanceOf[Logger]
  }
}

