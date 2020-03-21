package typingsJapgolly.vegaUtil.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoggerInterface extends js.Object {
  def debug(args: js.Any*): LoggerInterface
  def error(args: js.Any*): LoggerInterface
  def info(args: js.Any*): LoggerInterface
  def level(_underscore: Double): Double | LoggerInterface
  def warn(args: js.Any*): LoggerInterface
}

object LoggerInterface {
  @scala.inline
  def apply(
    debug: /* repeated */ js.Any => CallbackTo[LoggerInterface],
    error: /* repeated */ js.Any => CallbackTo[LoggerInterface],
    info: /* repeated */ js.Any => CallbackTo[LoggerInterface],
    level: Double => CallbackTo[Double | LoggerInterface],
    warn: /* repeated */ js.Any => CallbackTo[LoggerInterface]
  ): LoggerInterface = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("debug")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => debug(t0).runNow()))
    __obj.updateDynamic("error")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => error(t0).runNow()))
    __obj.updateDynamic("info")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => info(t0).runNow()))
    __obj.updateDynamic("level")(js.Any.fromFunction1((t0: scala.Double) => level(t0).runNow()))
    __obj.updateDynamic("warn")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => warn(t0).runNow()))
    __obj.asInstanceOf[LoggerInterface]
  }
}

