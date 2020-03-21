package typingsJapgolly.dc.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Logger extends js.Object {
  var enableDebugLog: Boolean
  def annotate(fn: js.Function, msg: String): Logger
  def debug(msg: String): Logger
  def deprecate(fn: js.Function, msg: String): Unit
  def warn(msg: String): Logger
  def warnOnce(msg: String): Logger
}

object Logger {
  @scala.inline
  def apply(
    annotate: (js.Function, String) => CallbackTo[Logger],
    debug: String => CallbackTo[Logger],
    deprecate: (js.Function, String) => Callback,
    enableDebugLog: Boolean,
    warn: String => CallbackTo[Logger],
    warnOnce: String => CallbackTo[Logger]
  ): Logger = {
    val __obj = js.Dynamic.literal(enableDebugLog = enableDebugLog.asInstanceOf[js.Any])
    __obj.updateDynamic("annotate")(js.Any.fromFunction2((t0: js.Function, t1: java.lang.String) => annotate(t0, t1).runNow()))
    __obj.updateDynamic("debug")(js.Any.fromFunction1((t0: java.lang.String) => debug(t0).runNow()))
    __obj.updateDynamic("deprecate")(js.Any.fromFunction2((t0: js.Function, t1: java.lang.String) => deprecate(t0, t1).runNow()))
    __obj.updateDynamic("warn")(js.Any.fromFunction1((t0: java.lang.String) => warn(t0).runNow()))
    __obj.updateDynamic("warnOnce")(js.Any.fromFunction1((t0: java.lang.String) => warnOnce(t0).runNow()))
    __obj.asInstanceOf[Logger]
  }
}

