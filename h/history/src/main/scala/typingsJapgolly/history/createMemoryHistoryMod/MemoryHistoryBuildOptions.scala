package typingsJapgolly.history.createMemoryHistoryMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MemoryHistoryBuildOptions extends js.Object {
  var getUserConfirmation: js.UndefOr[
    js.Function2[/* message */ String, /* callback */ js.Function1[/* result */ Boolean, Unit], Unit]
  ] = js.undefined
  var initialEntries: js.UndefOr[js.Array[String]] = js.undefined
  var initialIndex: js.UndefOr[Double] = js.undefined
  var keyLength: js.UndefOr[Double] = js.undefined
}

object MemoryHistoryBuildOptions {
  @scala.inline
  def apply(
    getUserConfirmation: (/* message */ String, /* callback */ js.Function1[/* result */ Boolean, Unit]) => Callback = null,
    initialEntries: js.Array[String] = null,
    initialIndex: Int | Double = null,
    keyLength: Int | Double = null
  ): MemoryHistoryBuildOptions = {
    val __obj = js.Dynamic.literal()
    if (getUserConfirmation != null) __obj.updateDynamic("getUserConfirmation")(js.Any.fromFunction2((t0: /* message */ java.lang.String, t1: /* callback */ js.Function1[/* result */ scala.Boolean, scala.Unit]) => getUserConfirmation(t0, t1).runNow()))
    if (initialEntries != null) __obj.updateDynamic("initialEntries")(initialEntries.asInstanceOf[js.Any])
    if (initialIndex != null) __obj.updateDynamic("initialIndex")(initialIndex.asInstanceOf[js.Any])
    if (keyLength != null) __obj.updateDynamic("keyLength")(keyLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemoryHistoryBuildOptions]
  }
}

