package typingsJapgolly.ol.osmMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.ol.olTileMod.LoadFunction
import typingsJapgolly.ol.olTileMod.Tile
import typingsJapgolly.ol.sourceSourceMod.AttributionLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var attributions: js.UndefOr[AttributionLike] = js.undefined
  var cacheSize: js.UndefOr[Double] = js.undefined
  var crossOrigin: js.UndefOr[String] = js.undefined
  var maxZoom: js.UndefOr[Double] = js.undefined
  var opaque: js.UndefOr[Boolean] = js.undefined
  var reprojectionErrorThreshold: js.UndefOr[Double] = js.undefined
  var tileLoadFunction: js.UndefOr[LoadFunction] = js.undefined
  var url: js.UndefOr[String] = js.undefined
  var wrapX: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    attributions: AttributionLike = null,
    cacheSize: Int | Double = null,
    crossOrigin: String = null,
    maxZoom: Int | Double = null,
    opaque: js.UndefOr[Boolean] = js.undefined,
    reprojectionErrorThreshold: Int | Double = null,
    tileLoadFunction: (/* p0 */ Tile, /* p1 */ String) => Callback = null,
    url: String = null,
    wrapX: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (attributions != null) __obj.updateDynamic("attributions")(attributions.asInstanceOf[js.Any])
    if (cacheSize != null) __obj.updateDynamic("cacheSize")(cacheSize.asInstanceOf[js.Any])
    if (crossOrigin != null) __obj.updateDynamic("crossOrigin")(crossOrigin.asInstanceOf[js.Any])
    if (maxZoom != null) __obj.updateDynamic("maxZoom")(maxZoom.asInstanceOf[js.Any])
    if (!js.isUndefined(opaque)) __obj.updateDynamic("opaque")(opaque.asInstanceOf[js.Any])
    if (reprojectionErrorThreshold != null) __obj.updateDynamic("reprojectionErrorThreshold")(reprojectionErrorThreshold.asInstanceOf[js.Any])
    if (tileLoadFunction != null) __obj.updateDynamic("tileLoadFunction")(js.Any.fromFunction2((t0: /* p0 */ typingsJapgolly.ol.olTileMod.Tile, t1: /* p1 */ java.lang.String) => tileLoadFunction(t0, t1).runNow()))
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (!js.isUndefined(wrapX)) __obj.updateDynamic("wrapX")(wrapX.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

