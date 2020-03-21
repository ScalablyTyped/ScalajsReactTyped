package typingsJapgolly.ckeditorCkeditor5Engine

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonError extends js.Object {
  def error(arg: js.Any*): String
  def log(arg: js.Any*): String
}

object AnonError {
  @scala.inline
  def apply(
    error: /* repeated */ js.Any => CallbackTo[String],
    log: /* repeated */ js.Any => CallbackTo[String]
  ): AnonError = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("error")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => error(t0).runNow()))
    __obj.updateDynamic("log")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => log(t0).runNow()))
    __obj.asInstanceOf[AnonError]
  }
}

