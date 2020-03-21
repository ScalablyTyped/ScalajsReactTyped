package typingsJapgolly.openlayers.mod.olx.source

import japgolly.scalajs.react.Callback
import typingsJapgolly.openlayers.mod.Tile
import typingsJapgolly.openlayers.mod.TileLoadFunctionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapQuestOptions extends js.Object {
  var cacheSize: js.UndefOr[Double] = js.undefined
  var layer: String
  var reprojectionErrorThreshold: js.UndefOr[Double] = js.undefined
  var tileLoadFunction: js.UndefOr[TileLoadFunctionType] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object MapQuestOptions {
  @scala.inline
  def apply(
    layer: String,
    cacheSize: Int | Double = null,
    reprojectionErrorThreshold: Int | Double = null,
    tileLoadFunction: (/* tile */ Tile, /* url */ String) => Callback = null,
    url: String = null
  ): MapQuestOptions = {
    val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any])
    if (cacheSize != null) __obj.updateDynamic("cacheSize")(cacheSize.asInstanceOf[js.Any])
    if (reprojectionErrorThreshold != null) __obj.updateDynamic("reprojectionErrorThreshold")(reprojectionErrorThreshold.asInstanceOf[js.Any])
    if (tileLoadFunction != null) __obj.updateDynamic("tileLoadFunction")(js.Any.fromFunction2((t0: /* tile */ typingsJapgolly.openlayers.mod.Tile, t1: /* url */ java.lang.String) => tileLoadFunction(t0, t1).runNow()))
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapQuestOptions]
  }
}

