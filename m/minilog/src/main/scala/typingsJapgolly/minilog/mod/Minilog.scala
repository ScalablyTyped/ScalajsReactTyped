package typingsJapgolly.minilog.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Minilog extends js.Object {
  def debug(msg: js.Any*): Minilog
  def error(msg: js.Any*): Minilog
  def info(msg: js.Any*): Minilog
  def log(msg: js.Any*): Minilog
  def warn(msg: js.Any*): Minilog
}

object Minilog {
  @scala.inline
  def apply(
    debug: /* repeated */ js.Any => CallbackTo[Minilog],
    error: /* repeated */ js.Any => CallbackTo[Minilog],
    info: /* repeated */ js.Any => CallbackTo[Minilog],
    log: /* repeated */ js.Any => CallbackTo[Minilog],
    warn: /* repeated */ js.Any => CallbackTo[Minilog]
  ): Minilog = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("debug")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => debug(t0).runNow()))
    __obj.updateDynamic("error")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => error(t0).runNow()))
    __obj.updateDynamic("info")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => info(t0).runNow()))
    __obj.updateDynamic("log")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => log(t0).runNow()))
    __obj.updateDynamic("warn")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => warn(t0).runNow()))
    __obj.asInstanceOf[Minilog]
  }
}

