package typingsJapgolly.i18nAbide

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonError extends js.Object {
  def error(msg: String): Unit
  def warn(msg: String): Unit
}

object AnonError {
  @scala.inline
  def apply(error: String => Callback, warn: String => Callback): AnonError = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("error")(js.Any.fromFunction1((t0: java.lang.String) => error(t0).runNow()))
    __obj.updateDynamic("warn")(js.Any.fromFunction1((t0: java.lang.String) => warn(t0).runNow()))
    __obj.asInstanceOf[AnonError]
  }
}

