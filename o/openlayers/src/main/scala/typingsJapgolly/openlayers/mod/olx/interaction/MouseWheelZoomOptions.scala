package typingsJapgolly.openlayers.mod.olx.interaction

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MouseWheelZoomOptions extends js.Object {
  var constrainResolution: js.UndefOr[Boolean] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
  var useAnchor: js.UndefOr[Boolean] = js.undefined
}

object MouseWheelZoomOptions {
  @scala.inline
  def apply(
    constrainResolution: js.UndefOr[Boolean] = js.undefined,
    duration: Int | Double = null,
    timeout: Int | Double = null,
    useAnchor: js.UndefOr[Boolean] = js.undefined
  ): MouseWheelZoomOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(constrainResolution)) __obj.updateDynamic("constrainResolution")(constrainResolution.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (!js.isUndefined(useAnchor)) __obj.updateDynamic("useAnchor")(useAnchor.asInstanceOf[js.Any])
    __obj.asInstanceOf[MouseWheelZoomOptions]
  }
}

