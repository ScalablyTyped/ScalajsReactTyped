package typingsJapgolly.openlayers.mod.olx.animation

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.openlayers.mod.Coordinate_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PanOptions extends js.Object {
  var duration: js.UndefOr[Double] = js.undefined
  var easing: js.UndefOr[js.Function1[/* t */ Double, Double]] = js.undefined
  var source: Coordinate_
  var start: js.UndefOr[Double] = js.undefined
}

object PanOptions {
  @scala.inline
  def apply(
    source: Coordinate_,
    duration: Int | Double = null,
    easing: /* t */ Double => CallbackTo[Double] = null,
    start: Int | Double = null
  ): PanOptions = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(js.Any.fromFunction1((t0: /* t */ scala.Double) => easing(t0).runNow()))
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[PanOptions]
  }
}

