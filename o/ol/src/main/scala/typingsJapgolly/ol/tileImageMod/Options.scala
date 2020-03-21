package typingsJapgolly.ol.tileImageMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.ol.olTileMod.LoadFunction
import typingsJapgolly.ol.olTileMod.Tile
import typingsJapgolly.ol.olTileMod.UrlFunction
import typingsJapgolly.ol.projMod.ProjectionLike
import typingsJapgolly.ol.sourceSourceMod.AttributionLike
import typingsJapgolly.ol.stateMod.State
import typingsJapgolly.ol.tilecoordMod.TileCoord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var attributions: js.UndefOr[AttributionLike] = js.undefined
  var attributionsCollapsible: js.UndefOr[Boolean] = js.undefined
  var cacheSize: js.UndefOr[Double] = js.undefined
  var crossOrigin: js.UndefOr[String] = js.undefined
  var key: js.UndefOr[String] = js.undefined
  var opaque: js.UndefOr[Boolean] = js.undefined
  var projection: js.UndefOr[ProjectionLike] = js.undefined
  var reprojectionErrorThreshold: js.UndefOr[Double] = js.undefined
  var state: js.UndefOr[State] = js.undefined
  var tileClass: js.UndefOr[typingsJapgolly.ol.imageTileMod.default] = js.undefined
  var tileGrid: js.UndefOr[typingsJapgolly.ol.tilegridTileGridMod.default] = js.undefined
  var tileLoadFunction: js.UndefOr[LoadFunction] = js.undefined
  var tilePixelRatio: js.UndefOr[Double] = js.undefined
  var tileUrlFunction: js.UndefOr[UrlFunction] = js.undefined
  var transition: js.UndefOr[Double] = js.undefined
  var url: js.UndefOr[String] = js.undefined
  var urls: js.UndefOr[js.Array[String]] = js.undefined
  var wrapX: js.UndefOr[Boolean] = js.undefined
  var zDirection: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    attributions: AttributionLike = null,
    attributionsCollapsible: js.UndefOr[Boolean] = js.undefined,
    cacheSize: Int | Double = null,
    crossOrigin: String = null,
    key: String = null,
    opaque: js.UndefOr[Boolean] = js.undefined,
    projection: ProjectionLike = null,
    reprojectionErrorThreshold: Int | Double = null,
    state: State = null,
    tileClass: typingsJapgolly.ol.imageTileMod.default = null,
    tileGrid: typingsJapgolly.ol.tilegridTileGridMod.default = null,
    tileLoadFunction: (/* p0 */ Tile, /* p1 */ String) => Callback = null,
    tilePixelRatio: Int | Double = null,
    tileUrlFunction: (/* p0 */ TileCoord, /* p1 */ Double, /* p2 */ typingsJapgolly.ol.projectionMod.default) => CallbackTo[String] = null,
    transition: Int | Double = null,
    url: String = null,
    urls: js.Array[String] = null,
    wrapX: js.UndefOr[Boolean] = js.undefined,
    zDirection: Int | Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (attributions != null) __obj.updateDynamic("attributions")(attributions.asInstanceOf[js.Any])
    if (!js.isUndefined(attributionsCollapsible)) __obj.updateDynamic("attributionsCollapsible")(attributionsCollapsible.asInstanceOf[js.Any])
    if (cacheSize != null) __obj.updateDynamic("cacheSize")(cacheSize.asInstanceOf[js.Any])
    if (crossOrigin != null) __obj.updateDynamic("crossOrigin")(crossOrigin.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(opaque)) __obj.updateDynamic("opaque")(opaque.asInstanceOf[js.Any])
    if (projection != null) __obj.updateDynamic("projection")(projection.asInstanceOf[js.Any])
    if (reprojectionErrorThreshold != null) __obj.updateDynamic("reprojectionErrorThreshold")(reprojectionErrorThreshold.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (tileClass != null) __obj.updateDynamic("tileClass")(tileClass.asInstanceOf[js.Any])
    if (tileGrid != null) __obj.updateDynamic("tileGrid")(tileGrid.asInstanceOf[js.Any])
    if (tileLoadFunction != null) __obj.updateDynamic("tileLoadFunction")(js.Any.fromFunction2((t0: /* p0 */ typingsJapgolly.ol.olTileMod.Tile, t1: /* p1 */ java.lang.String) => tileLoadFunction(t0, t1).runNow()))
    if (tilePixelRatio != null) __obj.updateDynamic("tilePixelRatio")(tilePixelRatio.asInstanceOf[js.Any])
    if (tileUrlFunction != null) __obj.updateDynamic("tileUrlFunction")(js.Any.fromFunction3((t0: /* p0 */ typingsJapgolly.ol.tilecoordMod.TileCoord, t1: /* p1 */ scala.Double, t2: /* p2 */ typingsJapgolly.ol.projectionMod.default) => tileUrlFunction(t0, t1, t2).runNow()))
    if (transition != null) __obj.updateDynamic("transition")(transition.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (urls != null) __obj.updateDynamic("urls")(urls.asInstanceOf[js.Any])
    if (!js.isUndefined(wrapX)) __obj.updateDynamic("wrapX")(wrapX.asInstanceOf[js.Any])
    if (zDirection != null) __obj.updateDynamic("zDirection")(zDirection.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

