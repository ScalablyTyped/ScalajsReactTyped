package typingsJapgolly.ajv.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomLogger extends js.Object {
  def error(args: js.Any*): js.Any
  def log(args: js.Any*): js.Any
  def warn(args: js.Any*): js.Any
}

object CustomLogger {
  @scala.inline
  def apply(
    error: /* repeated */ js.Any => CallbackTo[js.Any],
    log: /* repeated */ js.Any => CallbackTo[js.Any],
    warn: /* repeated */ js.Any => CallbackTo[js.Any]
  ): CustomLogger = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("error")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => error(t0).runNow()))
    __obj.updateDynamic("log")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => log(t0).runNow()))
    __obj.updateDynamic("warn")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => warn(t0).runNow()))
    __obj.asInstanceOf[CustomLogger]
  }
}

