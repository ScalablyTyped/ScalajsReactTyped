package typingsJapgolly.i18next.mod

import typingsJapgolly.i18next.i18nextStrings.logger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Override the built-in console logger.
  * Do not need to be a prototype function.
  */
trait LoggerModule extends Module {
  @JSName("type")
  var type_LoggerModule: logger
  def error(args: js.Any*): Unit
  def log(args: js.Any*): Unit
  def warn(args: js.Any*): Unit
}

object LoggerModule {
  @scala.inline
  def apply(
    error: /* repeated */ js.Any => japgolly.scalajs.react.Callback,
    log: /* repeated */ js.Any => japgolly.scalajs.react.Callback,
    `type`: logger,
    warn: /* repeated */ js.Any => japgolly.scalajs.react.Callback
  ): LoggerModule = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("error")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => error(t0).runNow()))
    __obj.updateDynamic("log")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => log(t0).runNow()))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.updateDynamic("warn")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => warn(t0).runNow()))
    __obj.asInstanceOf[LoggerModule]
  }
}

