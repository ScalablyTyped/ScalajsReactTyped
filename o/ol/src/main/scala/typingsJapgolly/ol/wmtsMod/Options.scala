package typingsJapgolly.ol.wmtsMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.ol.olTileMod.LoadFunction
import typingsJapgolly.ol.olTileMod.Tile
import typingsJapgolly.ol.projMod.ProjectionLike
import typingsJapgolly.ol.sourceSourceMod.AttributionLike
import typingsJapgolly.ol.wmtsrequestencodingMod.WMTSRequestEncoding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var attributions: js.UndefOr[AttributionLike] = js.undefined
  var cacheSize: js.UndefOr[Double] = js.undefined
  var crossOrigin: js.UndefOr[String] = js.undefined
  var dimensions: js.UndefOr[js.Any] = js.undefined
  var format: js.UndefOr[String] = js.undefined
  var layer: String
  var matrixSet: String
  var projection: js.UndefOr[ProjectionLike] = js.undefined
  var reprojectionErrorThreshold: js.UndefOr[Double] = js.undefined
  var requestEncoding: js.UndefOr[WMTSRequestEncoding | String] = js.undefined
  var style: String
  var tileClass: js.UndefOr[typingsJapgolly.ol.imageTileMod.default] = js.undefined
  var tileGrid: typingsJapgolly.ol.tilegridWmtsMod.default
  var tileLoadFunction: js.UndefOr[LoadFunction] = js.undefined
  var tilePixelRatio: js.UndefOr[Double] = js.undefined
  var transition: js.UndefOr[Double] = js.undefined
  var url: js.UndefOr[String] = js.undefined
  var urls: js.UndefOr[js.Array[String]] = js.undefined
  var version: js.UndefOr[String] = js.undefined
  var wrapX: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    layer: String,
    matrixSet: String,
    style: String,
    tileGrid: typingsJapgolly.ol.tilegridWmtsMod.default,
    attributions: AttributionLike = null,
    cacheSize: Int | Double = null,
    crossOrigin: String = null,
    dimensions: js.Any = null,
    format: String = null,
    projection: ProjectionLike = null,
    reprojectionErrorThreshold: Int | Double = null,
    requestEncoding: WMTSRequestEncoding | String = null,
    tileClass: typingsJapgolly.ol.imageTileMod.default = null,
    tileLoadFunction: (/* p0 */ Tile, /* p1 */ String) => Callback = null,
    tilePixelRatio: Int | Double = null,
    transition: Int | Double = null,
    url: String = null,
    urls: js.Array[String] = null,
    version: String = null,
    wrapX: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any], matrixSet = matrixSet.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], tileGrid = tileGrid.asInstanceOf[js.Any])
    if (attributions != null) __obj.updateDynamic("attributions")(attributions.asInstanceOf[js.Any])
    if (cacheSize != null) __obj.updateDynamic("cacheSize")(cacheSize.asInstanceOf[js.Any])
    if (crossOrigin != null) __obj.updateDynamic("crossOrigin")(crossOrigin.asInstanceOf[js.Any])
    if (dimensions != null) __obj.updateDynamic("dimensions")(dimensions.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (projection != null) __obj.updateDynamic("projection")(projection.asInstanceOf[js.Any])
    if (reprojectionErrorThreshold != null) __obj.updateDynamic("reprojectionErrorThreshold")(reprojectionErrorThreshold.asInstanceOf[js.Any])
    if (requestEncoding != null) __obj.updateDynamic("requestEncoding")(requestEncoding.asInstanceOf[js.Any])
    if (tileClass != null) __obj.updateDynamic("tileClass")(tileClass.asInstanceOf[js.Any])
    if (tileLoadFunction != null) __obj.updateDynamic("tileLoadFunction")(js.Any.fromFunction2((t0: /* p0 */ typingsJapgolly.ol.olTileMod.Tile, t1: /* p1 */ java.lang.String) => tileLoadFunction(t0, t1).runNow()))
    if (tilePixelRatio != null) __obj.updateDynamic("tilePixelRatio")(tilePixelRatio.asInstanceOf[js.Any])
    if (transition != null) __obj.updateDynamic("transition")(transition.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (urls != null) __obj.updateDynamic("urls")(urls.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    if (!js.isUndefined(wrapX)) __obj.updateDynamic("wrapX")(wrapX.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

