package typingsJapgolly.usePersistedState

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<std.Storage, 'getItem' | 'setItem'> */
trait PickStoragegetItemsetItem extends js.Object {
  var getItem: js.Function1[/* key */ String, String | Null]
  var setItem: js.Function2[/* key */ String, /* value */ String, Unit]
}

object PickStoragegetItemsetItem {
  @scala.inline
  def apply(
    getItem: /* key */ String => CallbackTo[String | Null],
    setItem: (/* key */ String, /* value */ String) => Callback
  ): PickStoragegetItemsetItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getItem")(js.Any.fromFunction1((t0: /* key */ java.lang.String) => getItem(t0).runNow()))
    __obj.updateDynamic("setItem")(js.Any.fromFunction2((t0: /* key */ java.lang.String, t1: /* value */ java.lang.String) => setItem(t0, t1).runNow()))
    __obj.asInstanceOf[PickStoragegetItemsetItem]
  }
}

