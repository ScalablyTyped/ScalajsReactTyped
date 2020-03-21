package typingsJapgolly.ol.controlControlMod

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var element: js.UndefOr[HTMLElement] = js.undefined
  var render: js.UndefOr[js.Function1[/* p0 */ typingsJapgolly.ol.mapEventMod.default, Unit]] = js.undefined
  var target: js.UndefOr[HTMLElement | String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    element: HTMLElement = null,
    render: /* p0 */ typingsJapgolly.ol.mapEventMod.default => Callback = null,
    target: HTMLElement | String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1((t0: /* p0 */ typingsJapgolly.ol.mapEventMod.default) => render(t0).runNow()))
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

