package typingsJapgolly.awsSdkTypes.loggerMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Logger extends js.Object {
  def error(content: String): Unit
  def info(content: String): Unit
  def log(content: String): Unit
  def warn(content: String): Unit
}

object Logger {
  @scala.inline
  def apply(
    error: String => Callback,
    info: String => Callback,
    log: String => Callback,
    warn: String => Callback
  ): Logger = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("error")(js.Any.fromFunction1((t0: java.lang.String) => error(t0).runNow()))
    __obj.updateDynamic("info")(js.Any.fromFunction1((t0: java.lang.String) => info(t0).runNow()))
    __obj.updateDynamic("log")(js.Any.fromFunction1((t0: java.lang.String) => log(t0).runNow()))
    __obj.updateDynamic("warn")(js.Any.fromFunction1((t0: java.lang.String) => warn(t0).runNow()))
    __obj.asInstanceOf[Logger]
  }
}

