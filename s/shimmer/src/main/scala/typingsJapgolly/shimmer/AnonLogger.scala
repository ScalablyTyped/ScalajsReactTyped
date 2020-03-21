package typingsJapgolly.shimmer

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLogger extends js.Object {
  var logger: js.UndefOr[js.Function1[/* msg */ String, Unit]] = js.undefined
}

object AnonLogger {
  @scala.inline
  def apply(logger: /* msg */ String => Callback = null): AnonLogger = {
    val __obj = js.Dynamic.literal()
    if (logger != null) __obj.updateDynamic("logger")(js.Any.fromFunction1((t0: /* msg */ java.lang.String) => logger(t0).runNow()))
    __obj.asInstanceOf[AnonLogger]
  }
}

