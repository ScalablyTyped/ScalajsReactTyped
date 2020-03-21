package typingsJapgolly.reactFns.geoPositionGeoPositionMod

import org.scalajs.dom.raw.PositionError
import typingsJapgolly.reactFns.AnonLatitude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeoPositionProps extends js.Object {
  var coords: js.UndefOr[AnonLatitude] = js.undefined
  var error: js.UndefOr[PositionError] = js.undefined
  var isLoading: Boolean
}

object GeoPositionProps {
  @scala.inline
  def apply(isLoading: Boolean, coords: AnonLatitude = null, error: PositionError = null): GeoPositionProps = {
    val __obj = js.Dynamic.literal(isLoading = isLoading.asInstanceOf[js.Any])
    if (coords != null) __obj.updateDynamic("coords")(coords.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoPositionProps]
  }
}

