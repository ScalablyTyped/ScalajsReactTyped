package typingsJapgolly.ol.tilegridTileGridMod

import typingsJapgolly.ol.coordinateMod.Coordinate
import typingsJapgolly.ol.extentMod.Extent
import typingsJapgolly.ol.sizeMod.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var extent: js.UndefOr[Extent] = js.undefined
  var minZoom: js.UndefOr[Double] = js.undefined
  var origin: js.UndefOr[Coordinate] = js.undefined
  var origins: js.UndefOr[js.Array[Coordinate]] = js.undefined
  var resolutions: js.Array[Double]
  var sizes: js.UndefOr[js.Array[Size]] = js.undefined
  var tileSize: js.UndefOr[Double | Size] = js.undefined
  var tileSizes: js.UndefOr[js.Array[Size]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    resolutions: js.Array[Double],
    extent: Extent = null,
    minZoom: Int | Double = null,
    origin: Coordinate = null,
    origins: js.Array[Coordinate] = null,
    sizes: js.Array[Size] = null,
    tileSize: Double | Size = null,
    tileSizes: js.Array[Size] = null
  ): Options = {
    val __obj = js.Dynamic.literal(resolutions = resolutions.asInstanceOf[js.Any])
    if (extent != null) __obj.updateDynamic("extent")(extent.asInstanceOf[js.Any])
    if (minZoom != null) __obj.updateDynamic("minZoom")(minZoom.asInstanceOf[js.Any])
    if (origin != null) __obj.updateDynamic("origin")(origin.asInstanceOf[js.Any])
    if (origins != null) __obj.updateDynamic("origins")(origins.asInstanceOf[js.Any])
    if (sizes != null) __obj.updateDynamic("sizes")(sizes.asInstanceOf[js.Any])
    if (tileSize != null) __obj.updateDynamic("tileSize")(tileSize.asInstanceOf[js.Any])
    if (tileSizes != null) __obj.updateDynamic("tileSizes")(tileSizes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

