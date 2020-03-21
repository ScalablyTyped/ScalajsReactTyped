package typingsJapgolly.logg

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Logger extends js.Object {
  def error(var_args: js.Any*): Unit
  def fine(var_args: js.Any*): Unit
  def getLogLevel(): Double
  def getParent(): Logger
  def getWatchers(): js.Array[js.Function]
  def info(var_args: js.Any*): Unit
  def isLoggable(level: Double): Boolean
  def log(level: Double, var_args: js.Any*): Unit
  def registerWatcher(watcher: js.Function1[/* logRecord */ String, Unit]): Unit
  def setLogLevel(level: Double): Unit
  def setParent(logger: Logger): Unit
  def warn(var_args: js.Any*): Unit
}

object Logger {
  @scala.inline
  def apply(
    error: /* repeated */ js.Any => Callback,
    fine: /* repeated */ js.Any => Callback,
    getLogLevel: CallbackTo[Double],
    getParent: CallbackTo[Logger],
    getWatchers: CallbackTo[js.Array[js.Function]],
    info: /* repeated */ js.Any => Callback,
    isLoggable: Double => CallbackTo[Boolean],
    log: (Double, /* repeated */ js.Any) => Callback,
    registerWatcher: js.Function1[/* logRecord */ String, Unit] => Callback,
    setLogLevel: Double => Callback,
    setParent: Logger => Callback,
    warn: /* repeated */ js.Any => Callback
  ): Logger = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("error")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => error(t0).runNow()))
    __obj.updateDynamic("fine")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => fine(t0).runNow()))
    __obj.updateDynamic("getLogLevel")(getLogLevel.toJsFn)
    __obj.updateDynamic("getParent")(getParent.toJsFn)
    __obj.updateDynamic("getWatchers")(getWatchers.toJsFn)
    __obj.updateDynamic("info")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => info(t0).runNow()))
    __obj.updateDynamic("isLoggable")(js.Any.fromFunction1((t0: scala.Double) => isLoggable(t0).runNow()))
    __obj.updateDynamic("log")(js.Any.fromFunction2((t0: scala.Double, t1: /* repeated */ js.Any) => log(t0, t1).runNow()))
    __obj.updateDynamic("registerWatcher")(js.Any.fromFunction1((t0: js.Function1[/* logRecord */ java.lang.String, scala.Unit]) => registerWatcher(t0).runNow()))
    __obj.updateDynamic("setLogLevel")(js.Any.fromFunction1((t0: scala.Double) => setLogLevel(t0).runNow()))
    __obj.updateDynamic("setParent")(js.Any.fromFunction1((t0: typingsJapgolly.logg.Logger) => setParent(t0).runNow()))
    __obj.updateDynamic("warn")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => warn(t0).runNow()))
    __obj.asInstanceOf[Logger]
  }
}

