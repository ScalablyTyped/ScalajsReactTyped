package typingsJapgolly.nodeRal.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RalLogger extends js.Object {
  def debug(param: js.Any*): Unit
  def fatal(param: js.Any*): Unit
  def notice(param: js.Any*): Unit
  def trace(param: js.Any*): Unit
  def warning(param: js.Any*): Unit
}

object RalLogger {
  @scala.inline
  def apply(
    debug: /* repeated */ js.Any => Callback,
    fatal: /* repeated */ js.Any => Callback,
    notice: /* repeated */ js.Any => Callback,
    trace: /* repeated */ js.Any => Callback,
    warning: /* repeated */ js.Any => Callback
  ): RalLogger = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("debug")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => debug(t0).runNow()))
    __obj.updateDynamic("fatal")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => fatal(t0).runNow()))
    __obj.updateDynamic("notice")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => notice(t0).runNow()))
    __obj.updateDynamic("trace")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => trace(t0).runNow()))
    __obj.updateDynamic("warning")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => warning(t0).runNow()))
    __obj.asInstanceOf[RalLogger]
  }
}

