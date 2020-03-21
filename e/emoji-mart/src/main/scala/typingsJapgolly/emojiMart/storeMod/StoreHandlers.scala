package typingsJapgolly.emojiMart.storeMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StoreHandlers extends js.Object {
  var getter: js.UndefOr[js.Function1[/* key */ String, _]] = js.undefined
  var setter: js.UndefOr[js.Function2[/* key */ String, /* value */ js.Any, Unit]] = js.undefined
}

object StoreHandlers {
  @scala.inline
  def apply(
    getter: /* key */ String => CallbackTo[js.Any] = null,
    setter: (/* key */ String, /* value */ js.Any) => Callback = null
  ): StoreHandlers = {
    val __obj = js.Dynamic.literal()
    if (getter != null) __obj.updateDynamic("getter")(js.Any.fromFunction1((t0: /* key */ java.lang.String) => getter(t0).runNow()))
    if (setter != null) __obj.updateDynamic("setter")(js.Any.fromFunction2((t0: /* key */ java.lang.String, t1: /* value */ js.Any) => setter(t0, t1).runNow()))
    __obj.asInstanceOf[StoreHandlers]
  }
}

