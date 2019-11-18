package typingsJapgolly.reactDashDom.reactDashDomMod

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.Comment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// enableSuspenseServerRenderer feature
trait HydrationOptions extends js.Object {
  var onDeleted: js.UndefOr[js.Function1[/* suspenseInstance */ Comment, Unit]] = js.undefined
  var onHydrated: js.UndefOr[js.Function1[/* suspenseInstance */ Comment, Unit]] = js.undefined
}

object HydrationOptions {
  @scala.inline
  def apply(
    onDeleted: /* suspenseInstance */ Comment => Callback = null,
    onHydrated: /* suspenseInstance */ Comment => Callback = null
  ): HydrationOptions = {
    val __obj = js.Dynamic.literal()
    if (onDeleted != null) __obj.updateDynamic("onDeleted")(js.Any.fromFunction1((t0: /* suspenseInstance */ org.scalajs.dom.raw.Comment) => onDeleted(t0).runNow()))
    if (onHydrated != null) __obj.updateDynamic("onHydrated")(js.Any.fromFunction1((t0: /* suspenseInstance */ org.scalajs.dom.raw.Comment) => onHydrated(t0).runNow()))
    __obj.asInstanceOf[HydrationOptions]
  }
}

