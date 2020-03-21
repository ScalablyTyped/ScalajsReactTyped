package typingsJapgolly.openlayers.mod.olx.source

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.openlayers.mod.AttributionLike
import typingsJapgolly.openlayers.mod.GlobalObject
import typingsJapgolly.openlayers.mod.ImageTile
import typingsJapgolly.openlayers.mod.ProjectionLike
import typingsJapgolly.openlayers.mod.Tile
import typingsJapgolly.openlayers.mod.Tile.State
import typingsJapgolly.openlayers.mod.TileCoord
import typingsJapgolly.openlayers.mod.TileLoadFunctionType
import typingsJapgolly.openlayers.mod.olx.LogoOptions
import typingsJapgolly.openlayers.mod.source.WMTSRequestEncoding
import typingsJapgolly.openlayers.mod.tilegrid.WMTS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WMTSOptions extends js.Object {
  var attributions: js.UndefOr[AttributionLike] = js.undefined
  var cacheSize: js.UndefOr[Double] = js.undefined
  var crossOrigin: js.UndefOr[String] = js.undefined
  var dimensions: js.UndefOr[GlobalObject] = js.undefined
  var format: js.UndefOr[String] = js.undefined
  var layer: String
  var logo: js.UndefOr[String | LogoOptions] = js.undefined
  var matrixSet: String
  var projection: ProjectionLike
  var reprojectionErrorThreshold: js.UndefOr[Double] = js.undefined
  var requestEncoding: js.UndefOr[WMTSRequestEncoding | String] = js.undefined
  var style: String
  var tileClass: js.UndefOr[
    js.Function6[
      /* n */ ImageTile, 
      /* coords */ TileCoord, 
      /* state */ State, 
      /* s1 */ String, 
      /* s2 */ String, 
      /* type */ TileLoadFunctionType, 
      _
    ]
  ] = js.undefined
  var tileGrid: WMTS
  var tileLoadFunction: js.UndefOr[TileLoadFunctionType] = js.undefined
  var tilePixelRatio: js.UndefOr[Double] = js.undefined
  var url: js.UndefOr[String] = js.undefined
  var urls: js.UndefOr[js.Array[String]] = js.undefined
  var version: js.UndefOr[String] = js.undefined
  var wrapX: js.UndefOr[Boolean] = js.undefined
}

object WMTSOptions {
  @scala.inline
  def apply(
    layer: String,
    matrixSet: String,
    style: String,
    tileGrid: WMTS,
    attributions: AttributionLike = null,
    cacheSize: Int | Double = null,
    crossOrigin: String = null,
    dimensions: GlobalObject = null,
    format: String = null,
    logo: String | LogoOptions = null,
    projection: ProjectionLike = null,
    reprojectionErrorThreshold: Int | Double = null,
    requestEncoding: WMTSRequestEncoding | String = null,
    tileClass: (/* n */ ImageTile, /* coords */ TileCoord, /* state */ State, /* s1 */ String, /* s2 */ String, /* type */ TileLoadFunctionType) => CallbackTo[js.Any] = null,
    tileLoadFunction: (/* tile */ Tile, /* url */ String) => Callback = null,
    tilePixelRatio: Int | Double = null,
    url: String = null,
    urls: js.Array[String] = null,
    version: String = null,
    wrapX: js.UndefOr[Boolean] = js.undefined
  ): WMTSOptions = {
    val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any], matrixSet = matrixSet.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], tileGrid = tileGrid.asInstanceOf[js.Any])
    if (attributions != null) __obj.updateDynamic("attributions")(attributions.asInstanceOf[js.Any])
    if (cacheSize != null) __obj.updateDynamic("cacheSize")(cacheSize.asInstanceOf[js.Any])
    if (crossOrigin != null) __obj.updateDynamic("crossOrigin")(crossOrigin.asInstanceOf[js.Any])
    if (dimensions != null) __obj.updateDynamic("dimensions")(dimensions.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (logo != null) __obj.updateDynamic("logo")(logo.asInstanceOf[js.Any])
    if (projection != null) __obj.updateDynamic("projection")(projection.asInstanceOf[js.Any])
    if (reprojectionErrorThreshold != null) __obj.updateDynamic("reprojectionErrorThreshold")(reprojectionErrorThreshold.asInstanceOf[js.Any])
    if (requestEncoding != null) __obj.updateDynamic("requestEncoding")(requestEncoding.asInstanceOf[js.Any])
    if (tileClass != null) __obj.updateDynamic("tileClass")(js.Any.fromFunction6((t0: /* n */ typingsJapgolly.openlayers.mod.ImageTile, t1: /* coords */ typingsJapgolly.openlayers.mod.TileCoord, t2: /* state */ typingsJapgolly.openlayers.mod.Tile.State, t3: /* s1 */ java.lang.String, t4: /* s2 */ java.lang.String, t5: /* type */ typingsJapgolly.openlayers.mod.TileLoadFunctionType) => tileClass(t0, t1, t2, t3, t4, t5).runNow()))
    if (tileLoadFunction != null) __obj.updateDynamic("tileLoadFunction")(js.Any.fromFunction2((t0: /* tile */ typingsJapgolly.openlayers.mod.Tile, t1: /* url */ java.lang.String) => tileLoadFunction(t0, t1).runNow()))
    if (tilePixelRatio != null) __obj.updateDynamic("tilePixelRatio")(tilePixelRatio.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (urls != null) __obj.updateDynamic("urls")(urls.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    if (!js.isUndefined(wrapX)) __obj.updateDynamic("wrapX")(wrapX.asInstanceOf[js.Any])
    __obj.asInstanceOf[WMTSOptions]
  }
}

