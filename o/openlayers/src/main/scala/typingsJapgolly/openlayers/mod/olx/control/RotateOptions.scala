package typingsJapgolly.openlayers.mod.olx.control

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.Element
import typingsJapgolly.openlayers.mod.MapEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RotateOptions extends js.Object {
  var autoHide: js.UndefOr[Boolean] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
  var label: js.UndefOr[String | Element] = js.undefined
  var render: js.UndefOr[js.Function1[/* event */ MapEvent, _]] = js.undefined
  var resetNorth: js.UndefOr[js.Function0[_]] = js.undefined
  var target: js.UndefOr[Element] = js.undefined
  var tipLabel: js.UndefOr[String] = js.undefined
}

object RotateOptions {
  @scala.inline
  def apply(
    autoHide: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    duration: Int | Double = null,
    label: String | Element = null,
    render: /* event */ MapEvent => CallbackTo[js.Any] = null,
    resetNorth: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    target: Element = null,
    tipLabel: String = null
  ): RotateOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoHide)) __obj.updateDynamic("autoHide")(autoHide.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.openlayers.mod.MapEvent) => render(t0).runNow()))
    resetNorth.foreach(p => __obj.updateDynamic("resetNorth")(p.toJsFn))
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (tipLabel != null) __obj.updateDynamic("tipLabel")(tipLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[RotateOptions]
  }
}

