package typingsJapgolly.leafletPolylinedecorator.mod.Symbol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarkerOptions extends js.Object {
  var markerOptions: js.UndefOr[typingsJapgolly.leaflet.mod.MarkerOptions] = js.undefined
  var rotate: js.UndefOr[Boolean] = js.undefined
}

object MarkerOptions {
  @scala.inline
  def apply(
    markerOptions: typingsJapgolly.leaflet.mod.MarkerOptions = null,
    rotate: js.UndefOr[Boolean] = js.undefined
  ): MarkerOptions = {
    val __obj = js.Dynamic.literal()
    if (markerOptions != null) __obj.updateDynamic("markerOptions")(markerOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(rotate)) __obj.updateDynamic("rotate")(rotate.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkerOptions]
  }
}

