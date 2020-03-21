package typingsJapgolly.mapbox.mod._Global_.L.mapbox

import typingsJapgolly.leaflet.mod.ControlPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeocoderControlOptions
  extends typingsJapgolly.leaflet.mod.ControlOptions {
  var keepOpen: js.UndefOr[Boolean] = js.undefined
}

object GeocoderControlOptions {
  @scala.inline
  def apply(keepOpen: js.UndefOr[Boolean] = js.undefined, position: ControlPosition = null): GeocoderControlOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(keepOpen)) __obj.updateDynamic("keepOpen")(keepOpen.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeocoderControlOptions]
  }
}

