package typingsJapgolly.orientjs.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OLogger extends js.Object {
  def debug(args: js.Any*): Unit
  def error(args: js.Any*): Unit
  def log(args: js.Any*): Unit
}

object OLogger {
  @scala.inline
  def apply(
    debug: /* repeated */ js.Any => Callback,
    error: /* repeated */ js.Any => Callback,
    log: /* repeated */ js.Any => Callback
  ): OLogger = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("debug")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => debug(t0).runNow()))
    __obj.updateDynamic("error")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => error(t0).runNow()))
    __obj.updateDynamic("log")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => log(t0).runNow()))
    __obj.asInstanceOf[OLogger]
  }
}

