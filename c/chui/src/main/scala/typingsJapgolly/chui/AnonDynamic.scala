package typingsJapgolly.chui

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDynamic extends js.Object {
  var callback: js.UndefOr[js.Function1[/* args */ js.UndefOr[js.Any], _]] = js.undefined
  var dynamic: js.UndefOr[Boolean] = js.undefined
}

object AnonDynamic {
  @scala.inline
  def apply(
    callback: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    dynamic: js.UndefOr[Boolean] = js.undefined
  ): AnonDynamic = {
    val __obj = js.Dynamic.literal()
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callback(t0).runNow()))
    if (!js.isUndefined(dynamic)) __obj.updateDynamic("dynamic")(dynamic.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDynamic]
  }
}

