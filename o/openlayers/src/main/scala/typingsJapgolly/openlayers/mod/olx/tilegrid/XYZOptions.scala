package typingsJapgolly.openlayers.mod.olx.tilegrid

import typingsJapgolly.openlayers.mod.Extent_
import typingsJapgolly.openlayers.mod.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XYZOptions extends js.Object {
  var extent: js.UndefOr[Extent_] = js.undefined
  var maxZoom: js.UndefOr[Double] = js.undefined
  var minZoom: js.UndefOr[Double] = js.undefined
  var tileSize: js.UndefOr[Double | Size] = js.undefined
}

object XYZOptions {
  @scala.inline
  def apply(
    extent: Extent_ = null,
    maxZoom: Int | Double = null,
    minZoom: Int | Double = null,
    tileSize: Double | Size = null
  ): XYZOptions = {
    val __obj = js.Dynamic.literal()
    if (extent != null) __obj.updateDynamic("extent")(extent.asInstanceOf[js.Any])
    if (maxZoom != null) __obj.updateDynamic("maxZoom")(maxZoom.asInstanceOf[js.Any])
    if (minZoom != null) __obj.updateDynamic("minZoom")(minZoom.asInstanceOf[js.Any])
    if (tileSize != null) __obj.updateDynamic("tileSize")(tileSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[XYZOptions]
  }
}

