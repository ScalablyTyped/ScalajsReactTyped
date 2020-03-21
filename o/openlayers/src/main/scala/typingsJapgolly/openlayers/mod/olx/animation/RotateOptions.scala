package typingsJapgolly.openlayers.mod.olx.animation

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.openlayers.mod.Coordinate_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RotateOptions extends js.Object {
  var anchor: js.UndefOr[Coordinate_] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
  var easing: js.UndefOr[js.Function1[/* t */ Double, Double]] = js.undefined
  var rotation: js.UndefOr[Double] = js.undefined
  var start: js.UndefOr[Double] = js.undefined
}

object RotateOptions {
  @scala.inline
  def apply(
    anchor: Coordinate_ = null,
    duration: Int | Double = null,
    easing: /* t */ Double => CallbackTo[Double] = null,
    rotation: Int | Double = null,
    start: Int | Double = null
  ): RotateOptions = {
    val __obj = js.Dynamic.literal()
    if (anchor != null) __obj.updateDynamic("anchor")(anchor.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(js.Any.fromFunction1((t0: /* t */ scala.Double) => easing(t0).runNow()))
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[RotateOptions]
  }
}

