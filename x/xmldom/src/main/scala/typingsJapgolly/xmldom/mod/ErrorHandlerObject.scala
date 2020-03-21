package typingsJapgolly.xmldom.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorHandlerObject extends js.Object {
  var error: js.UndefOr[js.Function1[/* msg */ js.Any, _]] = js.undefined
  var fatalError: js.UndefOr[js.Function1[/* msg */ js.Any, _]] = js.undefined
  var warning: js.UndefOr[js.Function1[/* msg */ js.Any, _]] = js.undefined
}

object ErrorHandlerObject {
  @scala.inline
  def apply(
    error: /* msg */ js.Any => CallbackTo[js.Any] = null,
    fatalError: /* msg */ js.Any => CallbackTo[js.Any] = null,
    warning: /* msg */ js.Any => CallbackTo[js.Any] = null
  ): ErrorHandlerObject = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction1((t0: /* msg */ js.Any) => error(t0).runNow()))
    if (fatalError != null) __obj.updateDynamic("fatalError")(js.Any.fromFunction1((t0: /* msg */ js.Any) => fatalError(t0).runNow()))
    if (warning != null) __obj.updateDynamic("warning")(js.Any.fromFunction1((t0: /* msg */ js.Any) => warning(t0).runNow()))
    __obj.asInstanceOf[ErrorHandlerObject]
  }
}

