package typingsJapgolly.ol.zoomSliderMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
  var render: js.UndefOr[js.Function1[/* p0 */ typingsJapgolly.ol.mapEventMod.default, Unit]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    className: String = null,
    duration: Int | Double = null,
    render: /* p0 */ typingsJapgolly.ol.mapEventMod.default => Callback = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1((t0: /* p0 */ typingsJapgolly.ol.mapEventMod.default) => render(t0).runNow()))
    __obj.asInstanceOf[Options]
  }
}

