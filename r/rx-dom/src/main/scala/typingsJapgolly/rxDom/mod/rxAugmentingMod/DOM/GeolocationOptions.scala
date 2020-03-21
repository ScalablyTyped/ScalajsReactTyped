package typingsJapgolly.rxDom.mod.rxAugmentingMod.DOM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeolocationOptions extends js.Object {
  var enableHighAccuracy: js.UndefOr[Boolean] = js.undefined
  var maximumAge: js.UndefOr[Double] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object GeolocationOptions {
  @scala.inline
  def apply(
    enableHighAccuracy: js.UndefOr[Boolean] = js.undefined,
    maximumAge: Int | Double = null,
    timeout: Int | Double = null
  ): GeolocationOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enableHighAccuracy)) __obj.updateDynamic("enableHighAccuracy")(enableHighAccuracy.asInstanceOf[js.Any])
    if (maximumAge != null) __obj.updateDynamic("maximumAge")(maximumAge.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeolocationOptions]
  }
}

