package typingsJapgolly.semanticRelease

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonError extends js.Object {
  def error(message: String, vars: js.Any*): Unit
  def log(message: String, vars: js.Any*): Unit
}

object AnonError {
  @scala.inline
  def apply(
    error: (String, /* repeated */ js.Any) => Callback,
    log: (String, /* repeated */ js.Any) => Callback
  ): AnonError = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("error")(js.Any.fromFunction2((t0: java.lang.String, t1: /* repeated */ js.Any) => error(t0, t1).runNow()))
    __obj.updateDynamic("log")(js.Any.fromFunction2((t0: java.lang.String, t1: /* repeated */ js.Any) => log(t0, t1).runNow()))
    __obj.asInstanceOf[AnonError]
  }
}

