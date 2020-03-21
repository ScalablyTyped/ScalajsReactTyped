package typingsJapgolly.openlayers.mod.olx.source

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.openlayers.mod.AttributionLike
import typingsJapgolly.openlayers.mod.ProjectionLike
import typingsJapgolly.openlayers.mod.Tile
import typingsJapgolly.openlayers.mod.TileLoadFunctionType
import typingsJapgolly.openlayers.mod.olx.LogoOptions
import typingsJapgolly.openlayers.mod.source.wms.ServerType
import typingsJapgolly.openlayers.mod.tilegrid.TileGrid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TileWMSOptions extends js.Object {
  var attributions: js.UndefOr[AttributionLike] = js.undefined
  var cacheSize: js.UndefOr[Double] = js.undefined
  var crossOrigin: js.UndefOr[String] = js.undefined
  var gutter: js.UndefOr[Double] = js.undefined
  var hidpi: js.UndefOr[Boolean] = js.undefined
  var logo: js.UndefOr[String | LogoOptions] = js.undefined
  var params: StringDictionary[js.Any]
  var projection: js.UndefOr[ProjectionLike] = js.undefined
  var reprojectionErrorThreshold: js.UndefOr[Double] = js.undefined
  var serverType: js.UndefOr[ServerType | String] = js.undefined
  var tileGrid: js.UndefOr[TileGrid] = js.undefined
  var tileLoadFunction: js.UndefOr[TileLoadFunctionType] = js.undefined
  var transition: js.UndefOr[Double] = js.undefined
  var url: js.UndefOr[String] = js.undefined
  var urls: js.UndefOr[js.Array[String]] = js.undefined
  var wrapX: js.UndefOr[Boolean] = js.undefined
}

object TileWMSOptions {
  @scala.inline
  def apply(
    params: StringDictionary[js.Any],
    attributions: AttributionLike = null,
    cacheSize: Int | Double = null,
    crossOrigin: String = null,
    gutter: Int | Double = null,
    hidpi: js.UndefOr[Boolean] = js.undefined,
    logo: String | LogoOptions = null,
    projection: ProjectionLike = null,
    reprojectionErrorThreshold: Int | Double = null,
    serverType: ServerType | String = null,
    tileGrid: TileGrid = null,
    tileLoadFunction: (/* tile */ Tile, /* url */ String) => Callback = null,
    transition: Int | Double = null,
    url: String = null,
    urls: js.Array[String] = null,
    wrapX: js.UndefOr[Boolean] = js.undefined
  ): TileWMSOptions = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any])
    if (attributions != null) __obj.updateDynamic("attributions")(attributions.asInstanceOf[js.Any])
    if (cacheSize != null) __obj.updateDynamic("cacheSize")(cacheSize.asInstanceOf[js.Any])
    if (crossOrigin != null) __obj.updateDynamic("crossOrigin")(crossOrigin.asInstanceOf[js.Any])
    if (gutter != null) __obj.updateDynamic("gutter")(gutter.asInstanceOf[js.Any])
    if (!js.isUndefined(hidpi)) __obj.updateDynamic("hidpi")(hidpi.asInstanceOf[js.Any])
    if (logo != null) __obj.updateDynamic("logo")(logo.asInstanceOf[js.Any])
    if (projection != null) __obj.updateDynamic("projection")(projection.asInstanceOf[js.Any])
    if (reprojectionErrorThreshold != null) __obj.updateDynamic("reprojectionErrorThreshold")(reprojectionErrorThreshold.asInstanceOf[js.Any])
    if (serverType != null) __obj.updateDynamic("serverType")(serverType.asInstanceOf[js.Any])
    if (tileGrid != null) __obj.updateDynamic("tileGrid")(tileGrid.asInstanceOf[js.Any])
    if (tileLoadFunction != null) __obj.updateDynamic("tileLoadFunction")(js.Any.fromFunction2((t0: /* tile */ typingsJapgolly.openlayers.mod.Tile, t1: /* url */ java.lang.String) => tileLoadFunction(t0, t1).runNow()))
    if (transition != null) __obj.updateDynamic("transition")(transition.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (urls != null) __obj.updateDynamic("urls")(urls.asInstanceOf[js.Any])
    if (!js.isUndefined(wrapX)) __obj.updateDynamic("wrapX")(wrapX.asInstanceOf[js.Any])
    __obj.asInstanceOf[TileWMSOptions]
  }
}

