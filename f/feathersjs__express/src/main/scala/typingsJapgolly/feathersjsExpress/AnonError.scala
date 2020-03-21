package typingsJapgolly.feathersjsExpress

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonError extends js.Object {
  var error: js.UndefOr[js.Function1[/* msg */ String, Unit]] = js.undefined
}

object AnonError {
  @scala.inline
  def apply(error: /* msg */ String => Callback = null): AnonError = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction1((t0: /* msg */ java.lang.String) => error(t0).runNow()))
    __obj.asInstanceOf[AnonError]
  }
}

