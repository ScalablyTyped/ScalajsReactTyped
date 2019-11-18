package typingsJapgolly.googlemaps.google.maps

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreetViewTileData extends js.Object {
  var centerHeading: js.UndefOr[Double] = js.undefined
  var tileSize: js.UndefOr[Size] = js.undefined
  var worldSize: js.UndefOr[Size] = js.undefined
  def getTileUrl(pano: String, tileZoom: Double, tileX: Double, tileY: Double): String
}

object StreetViewTileData {
  @scala.inline
  def apply(
    getTileUrl: (String, Double, Double, Double) => CallbackTo[String],
    centerHeading: Int | Double = null,
    tileSize: Size = null,
    worldSize: Size = null
  ): StreetViewTileData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getTileUrl")(js.Any.fromFunction4((t0: java.lang.String, t1: scala.Double, t2: scala.Double, t3: scala.Double) => getTileUrl(t0, t1, t2, t3).runNow()))
    if (centerHeading != null) __obj.updateDynamic("centerHeading")(centerHeading.asInstanceOf[js.Any])
    if (tileSize != null) __obj.updateDynamic("tileSize")(tileSize.asInstanceOf[js.Any])
    if (worldSize != null) __obj.updateDynamic("worldSize")(worldSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreetViewTileData]
  }
}

