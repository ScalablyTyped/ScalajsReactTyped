package typingsJapgolly.openlayers.mod.olx.control

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.Element
import typingsJapgolly.openlayers.mod.MapEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ControlOptions extends js.Object {
  var element: js.UndefOr[Element] = js.undefined
  var render: js.UndefOr[js.Function1[/* event */ MapEvent, _]] = js.undefined
  var target: js.UndefOr[Element | String] = js.undefined
}

object ControlOptions {
  @scala.inline
  def apply(
    element: Element = null,
    render: /* event */ MapEvent => CallbackTo[js.Any] = null,
    target: Element | String = null
  ): ControlOptions = {
    val __obj = js.Dynamic.literal()
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.openlayers.mod.MapEvent) => render(t0).runNow()))
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[ControlOptions]
  }
}

