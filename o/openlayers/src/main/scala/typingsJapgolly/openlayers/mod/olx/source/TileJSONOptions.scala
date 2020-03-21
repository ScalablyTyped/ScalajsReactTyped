package typingsJapgolly.openlayers.mod.olx.source

import japgolly.scalajs.react.Callback
import typingsJapgolly.openlayers.mod.AttributionLike
import typingsJapgolly.openlayers.mod.Tile
import typingsJapgolly.openlayers.mod.TileLoadFunctionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TileJSONOptions extends js.Object {
  var attributions: js.UndefOr[AttributionLike] = js.undefined
  var cacheSize: js.UndefOr[Double] = js.undefined
  var crossOrigin: js.UndefOr[String] = js.undefined
  var jsonp: js.UndefOr[Boolean] = js.undefined
  var reprojectionErrorThreshold: js.UndefOr[Double] = js.undefined
  var tileLoadFunction: js.UndefOr[TileLoadFunctionType] = js.undefined
  var transition: js.UndefOr[Double] = js.undefined
  var url: String
  var wrapX: js.UndefOr[Boolean] = js.undefined
}

object TileJSONOptions {
  @scala.inline
  def apply(
    url: String,
    attributions: AttributionLike = null,
    cacheSize: Int | Double = null,
    crossOrigin: String = null,
    jsonp: js.UndefOr[Boolean] = js.undefined,
    reprojectionErrorThreshold: Int | Double = null,
    tileLoadFunction: (/* tile */ Tile, /* url */ String) => Callback = null,
    transition: Int | Double = null,
    wrapX: js.UndefOr[Boolean] = js.undefined
  ): TileJSONOptions = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (attributions != null) __obj.updateDynamic("attributions")(attributions.asInstanceOf[js.Any])
    if (cacheSize != null) __obj.updateDynamic("cacheSize")(cacheSize.asInstanceOf[js.Any])
    if (crossOrigin != null) __obj.updateDynamic("crossOrigin")(crossOrigin.asInstanceOf[js.Any])
    if (!js.isUndefined(jsonp)) __obj.updateDynamic("jsonp")(jsonp.asInstanceOf[js.Any])
    if (reprojectionErrorThreshold != null) __obj.updateDynamic("reprojectionErrorThreshold")(reprojectionErrorThreshold.asInstanceOf[js.Any])
    if (tileLoadFunction != null) __obj.updateDynamic("tileLoadFunction")(js.Any.fromFunction2((t0: /* tile */ typingsJapgolly.openlayers.mod.Tile, t1: /* url */ java.lang.String) => tileLoadFunction(t0, t1).runNow()))
    if (transition != null) __obj.updateDynamic("transition")(transition.asInstanceOf[js.Any])
    if (!js.isUndefined(wrapX)) __obj.updateDynamic("wrapX")(wrapX.asInstanceOf[js.Any])
    __obj.asInstanceOf[TileJSONOptions]
  }
}

