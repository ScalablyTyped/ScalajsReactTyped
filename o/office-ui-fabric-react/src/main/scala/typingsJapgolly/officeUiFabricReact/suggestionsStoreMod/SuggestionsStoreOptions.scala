package typingsJapgolly.officeUiFabricReact.suggestionsStoreMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SuggestionsStoreOptions[T] extends js.Object {
  var getAriaLabel: js.UndefOr[js.Function1[/* item */ T, String]] = js.undefined
}

object SuggestionsStoreOptions {
  @scala.inline
  def apply[T](getAriaLabel: /* item */ T => CallbackTo[String] = null): SuggestionsStoreOptions[T] = {
    val __obj = js.Dynamic.literal()
    if (getAriaLabel != null) __obj.updateDynamic("getAriaLabel")(js.Any.fromFunction1((t0: /* item */ T) => getAriaLabel(t0).runNow()))
    __obj.asInstanceOf[SuggestionsStoreOptions[T]]
  }
}

