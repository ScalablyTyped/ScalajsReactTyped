package typingsJapgolly.iobroker.mod._Global_.ioBroker

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Logger extends js.Object {
  /** Verbosity of the log output */
  var level: LogLevel
  /** log message with debug level */
  def debug(message: String): Unit
  /** log message with error severity */
  def error(message: String): Unit
  /** log message with info level (default output level for all adapters) */
  def info(message: String): Unit
  /** log message with silly level */
  def silly(message: String): Unit
  /** log message with warning severity */
  def warn(message: String): Unit
}

object Logger {
  @scala.inline
  def apply(
    debug: String => Callback,
    error: String => Callback,
    info: String => Callback,
    level: LogLevel,
    silly: String => Callback,
    warn: String => Callback
  ): Logger = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("debug")(js.Any.fromFunction1((t0: java.lang.String) => debug(t0).runNow()))
    __obj.updateDynamic("error")(js.Any.fromFunction1((t0: java.lang.String) => error(t0).runNow()))
    __obj.updateDynamic("info")(js.Any.fromFunction1((t0: java.lang.String) => info(t0).runNow()))
    __obj.updateDynamic("silly")(js.Any.fromFunction1((t0: java.lang.String) => silly(t0).runNow()))
    __obj.updateDynamic("warn")(js.Any.fromFunction1((t0: java.lang.String) => warn(t0).runNow()))
    __obj.asInstanceOf[Logger]
  }
}

