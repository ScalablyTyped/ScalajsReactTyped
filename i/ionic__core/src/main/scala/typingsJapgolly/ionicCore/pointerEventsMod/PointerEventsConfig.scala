package typingsJapgolly.ionicCore.pointerEventsMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointerEventsConfig extends js.Object {
  var capture: js.UndefOr[Boolean] = js.undefined
  var element: js.UndefOr[HTMLElement] = js.undefined
  var passive: js.UndefOr[Boolean] = js.undefined
  var pointerMove: js.UndefOr[js.Function1[/* ev */ js.Any, Unit]] = js.undefined
  var pointerUp: js.UndefOr[js.Function1[/* ev */ js.Any, Unit]] = js.undefined
  var zone: js.UndefOr[Boolean] = js.undefined
  def pointerDown(ev: js.Any): Boolean
}

object PointerEventsConfig {
  @scala.inline
  def apply(
    pointerDown: js.Any => CallbackTo[Boolean],
    capture: js.UndefOr[Boolean] = js.undefined,
    element: HTMLElement = null,
    passive: js.UndefOr[Boolean] = js.undefined,
    pointerMove: /* ev */ js.Any => Callback = null,
    pointerUp: /* ev */ js.Any => Callback = null,
    zone: js.UndefOr[Boolean] = js.undefined
  ): PointerEventsConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("pointerDown")(js.Any.fromFunction1((t0: js.Any) => pointerDown(t0).runNow()))
    if (!js.isUndefined(capture)) __obj.updateDynamic("capture")(capture.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (!js.isUndefined(passive)) __obj.updateDynamic("passive")(passive.asInstanceOf[js.Any])
    if (pointerMove != null) __obj.updateDynamic("pointerMove")(js.Any.fromFunction1((t0: /* ev */ js.Any) => pointerMove(t0).runNow()))
    if (pointerUp != null) __obj.updateDynamic("pointerUp")(js.Any.fromFunction1((t0: /* ev */ js.Any) => pointerUp(t0).runNow()))
    if (!js.isUndefined(zone)) __obj.updateDynamic("zone")(zone.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointerEventsConfig]
  }
}

