package typingsJapgolly.webpackMerge.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomizeOptions extends js.Object {
  var customizeArray: js.UndefOr[CustomizeArrayFunction | UniqueFunction] = js.undefined
  var customizeObject: js.UndefOr[CustomizeObjectFunction] = js.undefined
}

object CustomizeOptions {
  @scala.inline
  def apply(
    customizeArray: ((/* a */ js.Array[js.Any]) | (/* field */ String), /* b */ js.Array[js.Any | String], (/* keyFn */ js.Function1[/* field */ js.Any, String]) | (/* key */ String)) => CallbackTo[js.UndefOr[js.Array[js.Any] | CustomizeArrayFunction | Null]] = null,
    customizeObject: (/* a */ js.Object, /* b */ js.Object, /* key */ String) => CallbackTo[js.UndefOr[js.Object | Null]] = null
  ): CustomizeOptions = {
    val __obj = js.Dynamic.literal()
    if (customizeArray != null) __obj.updateDynamic("customizeArray")(js.Any.fromFunction3((t0: (/* a */ js.Array[js.Any]) | (/* field */ java.lang.String), t1: /* b */ js.Array[js.Any | java.lang.String], t2: (/* keyFn */ js.Function1[/* field */ js.Any, java.lang.String]) | (/* key */ java.lang.String)) => customizeArray(t0, t1, t2).runNow()))
    if (customizeObject != null) __obj.updateDynamic("customizeObject")(js.Any.fromFunction3((t0: /* a */ js.Object, t1: /* b */ js.Object, t2: /* key */ java.lang.String) => customizeObject(t0, t1, t2).runNow()))
    __obj.asInstanceOf[CustomizeOptions]
  }
}

