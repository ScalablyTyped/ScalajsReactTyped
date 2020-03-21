package typingsJapgolly.octokitRest

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDebug extends js.Object {
  var debug: js.UndefOr[js.Function2[/* message */ String, /* info */ js.UndefOr[js.Object], Unit]] = js.undefined
  var error: js.UndefOr[js.Function2[/* message */ String, /* info */ js.UndefOr[js.Object], Unit]] = js.undefined
  var info: js.UndefOr[js.Function2[/* message */ String, /* info */ js.UndefOr[js.Object], Unit]] = js.undefined
  var warn: js.UndefOr[js.Function2[/* message */ String, /* info */ js.UndefOr[js.Object], Unit]] = js.undefined
}

object AnonDebug {
  @scala.inline
  def apply(
    debug: (/* message */ String, /* info */ js.UndefOr[js.Object]) => Callback = null,
    error: (/* message */ String, /* info */ js.UndefOr[js.Object]) => Callback = null,
    info: (/* message */ String, /* info */ js.UndefOr[js.Object]) => Callback = null,
    warn: (/* message */ String, /* info */ js.UndefOr[js.Object]) => Callback = null
  ): AnonDebug = {
    val __obj = js.Dynamic.literal()
    if (debug != null) __obj.updateDynamic("debug")(js.Any.fromFunction2((t0: /* message */ java.lang.String, t1: /* info */ js.UndefOr[js.Object]) => debug(t0, t1).runNow()))
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction2((t0: /* message */ java.lang.String, t1: /* info */ js.UndefOr[js.Object]) => error(t0, t1).runNow()))
    if (info != null) __obj.updateDynamic("info")(js.Any.fromFunction2((t0: /* message */ java.lang.String, t1: /* info */ js.UndefOr[js.Object]) => info(t0, t1).runNow()))
    if (warn != null) __obj.updateDynamic("warn")(js.Any.fromFunction2((t0: /* message */ java.lang.String, t1: /* info */ js.UndefOr[js.Object]) => warn(t0, t1).runNow()))
    __obj.asInstanceOf[AnonDebug]
  }
}

