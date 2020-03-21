package typingsJapgolly.ol.rotateMod

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var autoHide: js.UndefOr[Boolean] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
  var label: js.UndefOr[String | HTMLElement] = js.undefined
  var render: js.UndefOr[js.Function1[/* p0 */ typingsJapgolly.ol.mapEventMod.default, Unit]] = js.undefined
  var resetNorth: js.UndefOr[js.Function0[Unit]] = js.undefined
  var target: js.UndefOr[HTMLElement | String] = js.undefined
  var tipLabel: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    autoHide: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    duration: Int | Double = null,
    label: String | HTMLElement = null,
    render: /* p0 */ typingsJapgolly.ol.mapEventMod.default => Callback = null,
    resetNorth: js.UndefOr[Callback] = js.undefined,
    target: HTMLElement | String = null,
    tipLabel: String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoHide)) __obj.updateDynamic("autoHide")(autoHide.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1((t0: /* p0 */ typingsJapgolly.ol.mapEventMod.default) => render(t0).runNow()))
    resetNorth.foreach(p => __obj.updateDynamic("resetNorth")(p.toJsFn))
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (tipLabel != null) __obj.updateDynamic("tipLabel")(tipLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

