package typingsJapgolly.history.createHashHistoryMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HashHistoryBuildOptions extends js.Object {
  var basename: js.UndefOr[String] = js.undefined
  var getUserConfirmation: js.UndefOr[
    js.Function2[/* message */ String, /* callback */ js.Function1[/* result */ Boolean, Unit], Unit]
  ] = js.undefined
  var hashType: js.UndefOr[HashType] = js.undefined
}

object HashHistoryBuildOptions {
  @scala.inline
  def apply(
    basename: String = null,
    getUserConfirmation: (/* message */ String, /* callback */ js.Function1[/* result */ Boolean, Unit]) => Callback = null,
    hashType: HashType = null
  ): HashHistoryBuildOptions = {
    val __obj = js.Dynamic.literal()
    if (basename != null) __obj.updateDynamic("basename")(basename.asInstanceOf[js.Any])
    if (getUserConfirmation != null) __obj.updateDynamic("getUserConfirmation")(js.Any.fromFunction2((t0: /* message */ java.lang.String, t1: /* callback */ js.Function1[/* result */ scala.Boolean, scala.Unit]) => getUserConfirmation(t0, t1).runNow()))
    if (hashType != null) __obj.updateDynamic("hashType")(hashType.asInstanceOf[js.Any])
    __obj.asInstanceOf[HashHistoryBuildOptions]
  }
}

