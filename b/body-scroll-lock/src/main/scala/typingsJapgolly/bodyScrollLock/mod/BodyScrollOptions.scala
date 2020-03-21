package typingsJapgolly.bodyScrollLock.mod

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BodyScrollOptions extends js.Object {
  var allowTouchMove: js.UndefOr[js.Function1[/* el */ HTMLElement | Element, Unit]] = js.undefined
  var reserveScrollBarGap: js.UndefOr[Boolean] = js.undefined
}

object BodyScrollOptions {
  @scala.inline
  def apply(
    allowTouchMove: /* el */ HTMLElement | Element => Callback = null,
    reserveScrollBarGap: js.UndefOr[Boolean] = js.undefined
  ): BodyScrollOptions = {
    val __obj = js.Dynamic.literal()
    if (allowTouchMove != null) __obj.updateDynamic("allowTouchMove")(js.Any.fromFunction1((t0: /* el */ org.scalajs.dom.raw.HTMLElement | org.scalajs.dom.raw.Element) => allowTouchMove(t0).runNow()))
    if (!js.isUndefined(reserveScrollBarGap)) __obj.updateDynamic("reserveScrollBarGap")(reserveScrollBarGap.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyScrollOptions]
  }
}

