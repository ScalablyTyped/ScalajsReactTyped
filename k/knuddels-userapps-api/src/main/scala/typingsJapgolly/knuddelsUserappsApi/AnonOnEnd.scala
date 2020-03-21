package typingsJapgolly.knuddelsUserappsApi

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOnEnd extends js.Object {
  var onEnd: js.UndefOr[
    js.Function2[/* accessibleUserCount */ Double, /* key */ js.UndefOr[String], Unit]
  ] = js.undefined
  var onStart: js.UndefOr[
    js.Function2[/* accessibleUserCount */ Double, /* key */ js.UndefOr[String], Unit]
  ] = js.undefined
}

object AnonOnEnd {
  @scala.inline
  def apply(
    onEnd: (/* accessibleUserCount */ Double, /* key */ js.UndefOr[String]) => Callback = null,
    onStart: (/* accessibleUserCount */ Double, /* key */ js.UndefOr[String]) => Callback = null
  ): AnonOnEnd = {
    val __obj = js.Dynamic.literal()
    if (onEnd != null) __obj.updateDynamic("onEnd")(js.Any.fromFunction2((t0: /* accessibleUserCount */ scala.Double, t1: /* key */ js.UndefOr[java.lang.String]) => onEnd(t0, t1).runNow()))
    if (onStart != null) __obj.updateDynamic("onStart")(js.Any.fromFunction2((t0: /* accessibleUserCount */ scala.Double, t1: /* key */ js.UndefOr[java.lang.String]) => onStart(t0, t1).runNow()))
    __obj.asInstanceOf[AnonOnEnd]
  }
}

