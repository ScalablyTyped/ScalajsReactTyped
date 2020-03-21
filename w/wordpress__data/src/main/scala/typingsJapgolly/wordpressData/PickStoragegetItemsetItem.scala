package typingsJapgolly.wordpressData

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<std.Storage, 'getItem' | 'setItem'> & std.Partial<std.Storage> */
trait PickStoragegetItemsetItem extends js.Object {
  var clear: js.UndefOr[js.Function0[Unit]] = js.undefined
  var getItem: js.UndefOr[js.Function1[/* key */ String, String | Null]] = js.undefined
  var key: js.UndefOr[js.Function1[/* index */ Double, String | Null]] = js.undefined
  var length: js.UndefOr[Double] = js.undefined
  var removeItem: js.UndefOr[js.Function1[/* key */ String, Unit]] = js.undefined
  var setItem: js.UndefOr[js.Function2[/* key */ String, /* value */ String, Unit]] = js.undefined
}

object PickStoragegetItemsetItem {
  @scala.inline
  def apply(
    clear: js.UndefOr[Callback] = js.undefined,
    getItem: /* key */ String => CallbackTo[String | Null] = null,
    key: /* index */ Double => CallbackTo[String | Null] = null,
    length: Int | Double = null,
    removeItem: /* key */ String => Callback = null,
    setItem: (/* key */ String, /* value */ String) => Callback = null
  ): PickStoragegetItemsetItem = {
    val __obj = js.Dynamic.literal()
    clear.foreach(p => __obj.updateDynamic("clear")(p.toJsFn))
    if (getItem != null) __obj.updateDynamic("getItem")(js.Any.fromFunction1((t0: /* key */ java.lang.String) => getItem(t0).runNow()))
    if (key != null) __obj.updateDynamic("key")(js.Any.fromFunction1((t0: /* index */ scala.Double) => key(t0).runNow()))
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (removeItem != null) __obj.updateDynamic("removeItem")(js.Any.fromFunction1((t0: /* key */ java.lang.String) => removeItem(t0).runNow()))
    if (setItem != null) __obj.updateDynamic("setItem")(js.Any.fromFunction2((t0: /* key */ java.lang.String, t1: /* value */ java.lang.String) => setItem(t0, t1).runNow()))
    __obj.asInstanceOf[PickStoragegetItemsetItem]
  }
}

