package typingsJapgolly.ol.viewMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.ol.coordinateMod.Coordinate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimationOptions extends js.Object {
  var anchor: js.UndefOr[Coordinate] = js.undefined
  var center: js.UndefOr[Coordinate] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
  var easing: js.UndefOr[js.Function1[/* p0 */ Double, Double]] = js.undefined
  var resolution: js.UndefOr[Double] = js.undefined
  var rotation: js.UndefOr[Double] = js.undefined
  var zoom: js.UndefOr[Double] = js.undefined
}

object AnimationOptions {
  @scala.inline
  def apply(
    anchor: Coordinate = null,
    center: Coordinate = null,
    duration: Int | Double = null,
    easing: /* p0 */ Double => CallbackTo[Double] = null,
    resolution: Int | Double = null,
    rotation: Int | Double = null,
    zoom: Int | Double = null
  ): AnimationOptions = {
    val __obj = js.Dynamic.literal()
    if (anchor != null) __obj.updateDynamic("anchor")(anchor.asInstanceOf[js.Any])
    if (center != null) __obj.updateDynamic("center")(center.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(js.Any.fromFunction1((t0: /* p0 */ scala.Double) => easing(t0).runNow()))
    if (resolution != null) __obj.updateDynamic("resolution")(resolution.asInstanceOf[js.Any])
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (zoom != null) __obj.updateDynamic("zoom")(zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationOptions]
  }
}

