package typingsJapgolly.esriLeaflet.mod.leafletAugmentingMod.esri

import typingsJapgolly.leaflet.mod.CrossOrigin
import typingsJapgolly.leaflet.mod.LatLngBoundsExpression
import typingsJapgolly.leaflet.mod.Point_
import typingsJapgolly.leaflet.mod.TileLayerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for `L.esri.TiledMapLayer`
  */
trait TiledMapLayerOptions
  extends TileLayerOptions
     with LayerOptionsBase {
  /**
    * If correctZoomLevels is enabled this controls the amount of tolerance for the difference at each scale
    * level for remapping tile levels.
    *
    * Default 0.1
    */
  var zoomOffsetAllowance: js.UndefOr[Double] = js.undefined
}

object TiledMapLayerOptions {
  @scala.inline
  def apply(
    url: String,
    accessToken: String = null,
    attribution: String = null,
    bounds: LatLngBoundsExpression = null,
    className: String = null,
    crossOrigin: CrossOrigin = null,
    detectRetina: js.UndefOr[Boolean] = js.undefined,
    errorTileUrl: String = null,
    id: String = null,
    keepBuffer: Int | Double = null,
    maxNativeZoom: Int | Double = null,
    maxZoom: Int | Double = null,
    minNativeZoom: Int | Double = null,
    minZoom: Int | Double = null,
    noWrap: js.UndefOr[Boolean] = js.undefined,
    opacity: Int | Double = null,
    pane: String = null,
    proxy: String = null,
    subdomains: String | js.Array[String] = null,
    tileSize: Double | Point_ = null,
    tms: js.UndefOr[Boolean] = js.undefined,
    token: String = null,
    updateInterval: Int | Double = null,
    updateWhenIdle: js.UndefOr[Boolean] = js.undefined,
    updateWhenZooming: js.UndefOr[Boolean] = js.undefined,
    useCors: js.UndefOr[Boolean] = js.undefined,
    zIndex: Int | Double = null,
    zoomOffset: Int | Double = null,
    zoomOffsetAllowance: Int | Double = null,
    zoomReverse: js.UndefOr[Boolean] = js.undefined
  ): TiledMapLayerOptions = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (accessToken != null) __obj.updateDynamic("accessToken")(accessToken.asInstanceOf[js.Any])
    if (attribution != null) __obj.updateDynamic("attribution")(attribution.asInstanceOf[js.Any])
    if (bounds != null) __obj.updateDynamic("bounds")(bounds.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (crossOrigin != null) __obj.updateDynamic("crossOrigin")(crossOrigin.asInstanceOf[js.Any])
    if (!js.isUndefined(detectRetina)) __obj.updateDynamic("detectRetina")(detectRetina.asInstanceOf[js.Any])
    if (errorTileUrl != null) __obj.updateDynamic("errorTileUrl")(errorTileUrl.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (keepBuffer != null) __obj.updateDynamic("keepBuffer")(keepBuffer.asInstanceOf[js.Any])
    if (maxNativeZoom != null) __obj.updateDynamic("maxNativeZoom")(maxNativeZoom.asInstanceOf[js.Any])
    if (maxZoom != null) __obj.updateDynamic("maxZoom")(maxZoom.asInstanceOf[js.Any])
    if (minNativeZoom != null) __obj.updateDynamic("minNativeZoom")(minNativeZoom.asInstanceOf[js.Any])
    if (minZoom != null) __obj.updateDynamic("minZoom")(minZoom.asInstanceOf[js.Any])
    if (!js.isUndefined(noWrap)) __obj.updateDynamic("noWrap")(noWrap.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (pane != null) __obj.updateDynamic("pane")(pane.asInstanceOf[js.Any])
    if (proxy != null) __obj.updateDynamic("proxy")(proxy.asInstanceOf[js.Any])
    if (subdomains != null) __obj.updateDynamic("subdomains")(subdomains.asInstanceOf[js.Any])
    if (tileSize != null) __obj.updateDynamic("tileSize")(tileSize.asInstanceOf[js.Any])
    if (!js.isUndefined(tms)) __obj.updateDynamic("tms")(tms.asInstanceOf[js.Any])
    if (token != null) __obj.updateDynamic("token")(token.asInstanceOf[js.Any])
    if (updateInterval != null) __obj.updateDynamic("updateInterval")(updateInterval.asInstanceOf[js.Any])
    if (!js.isUndefined(updateWhenIdle)) __obj.updateDynamic("updateWhenIdle")(updateWhenIdle.asInstanceOf[js.Any])
    if (!js.isUndefined(updateWhenZooming)) __obj.updateDynamic("updateWhenZooming")(updateWhenZooming.asInstanceOf[js.Any])
    if (!js.isUndefined(useCors)) __obj.updateDynamic("useCors")(useCors.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    if (zoomOffset != null) __obj.updateDynamic("zoomOffset")(zoomOffset.asInstanceOf[js.Any])
    if (zoomOffsetAllowance != null) __obj.updateDynamic("zoomOffsetAllowance")(zoomOffsetAllowance.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomReverse)) __obj.updateDynamic("zoomReverse")(zoomReverse.asInstanceOf[js.Any])
    __obj.asInstanceOf[TiledMapLayerOptions]
  }
}

