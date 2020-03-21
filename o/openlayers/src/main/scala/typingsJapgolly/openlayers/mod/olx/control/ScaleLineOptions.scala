package typingsJapgolly.openlayers.mod.olx.control

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.Element
import typingsJapgolly.openlayers.mod.MapEvent
import typingsJapgolly.openlayers.mod.control.ScaleLine.Units
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScaleLineOptions extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var minWidth: js.UndefOr[Double] = js.undefined
  var render: js.UndefOr[js.Function1[/* event */ MapEvent, _]] = js.undefined
  var target: js.UndefOr[Element] = js.undefined
  var units: js.UndefOr[Units | String] = js.undefined
}

object ScaleLineOptions {
  @scala.inline
  def apply(
    className: String = null,
    minWidth: Int | Double = null,
    render: /* event */ MapEvent => CallbackTo[js.Any] = null,
    target: Element = null,
    units: Units | String = null
  ): ScaleLineOptions = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.openlayers.mod.MapEvent) => render(t0).runNow()))
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (units != null) __obj.updateDynamic("units")(units.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScaleLineOptions]
  }
}

