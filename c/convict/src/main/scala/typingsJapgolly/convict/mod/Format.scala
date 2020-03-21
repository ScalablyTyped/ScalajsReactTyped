package typingsJapgolly.convict.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Format extends js.Object {
  var coerce: js.UndefOr[js.Function1[/* val */ js.Any, _]] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var validate: js.UndefOr[js.Function1[/* val */ js.Any, Unit]] = js.undefined
}

object Format {
  @scala.inline
  def apply(
    coerce: /* val */ js.Any => CallbackTo[js.Any] = null,
    name: String = null,
    validate: /* val */ js.Any => Callback = null
  ): Format = {
    val __obj = js.Dynamic.literal()
    if (coerce != null) __obj.updateDynamic("coerce")(js.Any.fromFunction1((t0: /* val */ js.Any) => coerce(t0).runNow()))
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (validate != null) __obj.updateDynamic("validate")(js.Any.fromFunction1((t0: /* val */ js.Any) => validate(t0).runNow()))
    __obj.asInstanceOf[Format]
  }
}

