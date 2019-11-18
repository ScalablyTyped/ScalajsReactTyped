package typingsJapgolly.yandexDashMaps.yandexDashMapsMod.behavior

import typingsJapgolly.yandexDashMaps.yandexDashMapsMod.IMapMarginOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDblClickZoomOptions extends IMapMarginOptions {
  var centering: js.UndefOr[Boolean] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
}

object IDblClickZoomOptions {
  @scala.inline
  def apply(
    centering: js.UndefOr[Boolean] = js.undefined,
    duration: Int | Double = null,
    useMapMargin: js.UndefOr[Boolean] = js.undefined
  ): IDblClickZoomOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(centering)) __obj.updateDynamic("centering")(centering.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (!js.isUndefined(useMapMargin)) __obj.updateDynamic("useMapMargin")(useMapMargin.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDblClickZoomOptions]
  }
}

