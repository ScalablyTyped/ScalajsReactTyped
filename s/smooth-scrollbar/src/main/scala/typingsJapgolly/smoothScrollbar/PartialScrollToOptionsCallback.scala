package typingsJapgolly.smoothScrollbar

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.smoothScrollbar.scrollbarMod.Scrollbar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<smooth-scrollbar.smooth-scrollbar/interfaces.ScrollToOptions> */
trait PartialScrollToOptionsCallback extends js.Object {
  var callback: js.UndefOr[js.ThisFunction0[/* this */ Scrollbar, Unit]] = js.undefined
  var easing: js.UndefOr[js.Function1[/* percent */ Double, Double]] = js.undefined
}

object PartialScrollToOptionsCallback {
  @scala.inline
  def apply(
    callback: js.ThisFunction0[/* this */ Scrollbar, Unit] = null,
    easing: /* percent */ Double => CallbackTo[Double] = null
  ): PartialScrollToOptionsCallback = {
    val __obj = js.Dynamic.literal()
    if (callback != null) __obj.updateDynamic("callback")(callback.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(js.Any.fromFunction1((t0: /* percent */ scala.Double) => easing(t0).runNow()))
    __obj.asInstanceOf[PartialScrollToOptionsCallback]
  }
}

