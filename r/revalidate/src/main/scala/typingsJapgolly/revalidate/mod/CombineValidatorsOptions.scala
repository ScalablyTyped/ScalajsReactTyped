package typingsJapgolly.revalidate.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CombineValidatorsOptions extends js.Object {
  var serializeValues: js.UndefOr[js.Function1[/* values */ js.Any, _]] = js.undefined
}

object CombineValidatorsOptions {
  @scala.inline
  def apply(serializeValues: /* values */ js.Any => CallbackTo[js.Any] = null): CombineValidatorsOptions = {
    val __obj = js.Dynamic.literal()
    if (serializeValues != null) __obj.updateDynamic("serializeValues")(js.Any.fromFunction1((t0: /* values */ js.Any) => serializeValues(t0).runNow()))
    __obj.asInstanceOf[CombineValidatorsOptions]
  }
}

