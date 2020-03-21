package typingsJapgolly.zipkinTransportHttp.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorLogger extends js.Object {
  def error(args: js.Any*): Unit
}

object ErrorLogger {
  @scala.inline
  def apply(error: /* repeated */ js.Any => Callback): ErrorLogger = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("error")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => error(t0).runNow()))
    __obj.asInstanceOf[ErrorLogger]
  }
}

