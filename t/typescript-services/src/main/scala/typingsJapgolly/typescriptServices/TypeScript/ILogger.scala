package typingsJapgolly.typescriptServices.TypeScript

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILogger extends js.Object {
  def debug(): Boolean
  def error(): Boolean
  def fatal(): Boolean
  def information(): Boolean
  def log(s: String): Unit
  def warning(): Boolean
}

object ILogger {
  @scala.inline
  def apply(
    debug: CallbackTo[Boolean],
    error: CallbackTo[Boolean],
    fatal: CallbackTo[Boolean],
    information: CallbackTo[Boolean],
    log: String => Callback,
    warning: CallbackTo[Boolean]
  ): ILogger = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("debug")(debug.toJsFn)
    __obj.updateDynamic("error")(error.toJsFn)
    __obj.updateDynamic("fatal")(fatal.toJsFn)
    __obj.updateDynamic("information")(information.toJsFn)
    __obj.updateDynamic("log")(js.Any.fromFunction1((t0: java.lang.String) => log(t0).runNow()))
    __obj.updateDynamic("warning")(warning.toJsFn)
    __obj.asInstanceOf[ILogger]
  }
}

