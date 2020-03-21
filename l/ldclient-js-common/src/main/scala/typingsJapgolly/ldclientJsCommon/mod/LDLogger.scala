package typingsJapgolly.ldclientJsCommon.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LDLogger extends js.Object {
  def debug(message: String): Unit
  def error(message: String): Unit
  def info(message: String): Unit
  def warn(message: String): Unit
}

object LDLogger {
  @scala.inline
  def apply(
    debug: String => Callback,
    error: String => Callback,
    info: String => Callback,
    warn: String => Callback
  ): LDLogger = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("debug")(js.Any.fromFunction1((t0: java.lang.String) => debug(t0).runNow()))
    __obj.updateDynamic("error")(js.Any.fromFunction1((t0: java.lang.String) => error(t0).runNow()))
    __obj.updateDynamic("info")(js.Any.fromFunction1((t0: java.lang.String) => info(t0).runNow()))
    __obj.updateDynamic("warn")(js.Any.fromFunction1((t0: java.lang.String) => warn(t0).runNow()))
    __obj.asInstanceOf[LDLogger]
  }
}

