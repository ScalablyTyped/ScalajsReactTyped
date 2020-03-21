package typingsJapgolly.reactLeaflet.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.leaflet.mod.CRS
import typingsJapgolly.leaflet.mod.CrossOrigin
import typingsJapgolly.leaflet.mod.LatLngBoundsExpression
import typingsJapgolly.leaflet.mod.LeafletEvent
import typingsJapgolly.leaflet.mod.Point_
import typingsJapgolly.leaflet.mod.TileEvent
import typingsJapgolly.leaflet.mod.WMSOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.reactLeaflet.mod.MapComponentProps because var conflicts: pane. Inlined leaflet
- typingsJapgolly.reactLeaflet.mod.MapLayerProps because var conflicts: attribution, pane. Inlined children */ trait WMSTileLayerProps
  extends WMSOptions
     with TileLayerEvents {
  var children: js.UndefOr[Children] = js.undefined
  var leaflet: js.UndefOr[LeafletContext] = js.undefined
  var url: String
}

object WMSTileLayerProps {
  @scala.inline
  def apply(
    url: String,
    accessToken: String = null,
    attribution: String = null,
    bounds: LatLngBoundsExpression = null,
    children: Children = null,
    className: String = null,
    crossOrigin: CrossOrigin = null,
    crs: CRS = null,
    detectRetina: js.UndefOr[Boolean] = js.undefined,
    errorTileUrl: String = null,
    format: String = null,
    id: String = null,
    keepBuffer: Int | Double = null,
    layers: String = null,
    leaflet: LeafletContext = null,
    maxNativeZoom: Int | Double = null,
    maxZoom: Int | Double = null,
    minNativeZoom: Int | Double = null,
    minZoom: Int | Double = null,
    noWrap: js.UndefOr[Boolean] = js.undefined,
    onload: /* event */ LeafletEvent => Callback = null,
    onloading: /* event */ LeafletEvent => Callback = null,
    ontileerror: /* event */ TileEvent => Callback = null,
    ontileload: /* event */ TileEvent => Callback = null,
    ontileloadstart: /* event */ TileEvent => Callback = null,
    ontileunload: /* event */ TileEvent => Callback = null,
    opacity: Int | Double = null,
    pane: String = null,
    styles: String = null,
    subdomains: String | js.Array[String] = null,
    tileSize: Double | Point_ = null,
    tms: js.UndefOr[Boolean] = js.undefined,
    transparent: js.UndefOr[Boolean] = js.undefined,
    updateInterval: Int | Double = null,
    updateWhenIdle: js.UndefOr[Boolean] = js.undefined,
    updateWhenZooming: js.UndefOr[Boolean] = js.undefined,
    uppercase: js.UndefOr[Boolean] = js.undefined,
    version: String = null,
    zIndex: Int | Double = null,
    zoomOffset: Int | Double = null,
    zoomReverse: js.UndefOr[Boolean] = js.undefined
  ): WMSTileLayerProps = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (accessToken != null) __obj.updateDynamic("accessToken")(accessToken.asInstanceOf[js.Any])
    if (attribution != null) __obj.updateDynamic("attribution")(attribution.asInstanceOf[js.Any])
    if (bounds != null) __obj.updateDynamic("bounds")(bounds.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (crossOrigin != null) __obj.updateDynamic("crossOrigin")(crossOrigin.asInstanceOf[js.Any])
    if (crs != null) __obj.updateDynamic("crs")(crs.asInstanceOf[js.Any])
    if (!js.isUndefined(detectRetina)) __obj.updateDynamic("detectRetina")(detectRetina.asInstanceOf[js.Any])
    if (errorTileUrl != null) __obj.updateDynamic("errorTileUrl")(errorTileUrl.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (keepBuffer != null) __obj.updateDynamic("keepBuffer")(keepBuffer.asInstanceOf[js.Any])
    if (layers != null) __obj.updateDynamic("layers")(layers.asInstanceOf[js.Any])
    if (leaflet != null) __obj.updateDynamic("leaflet")(leaflet.asInstanceOf[js.Any])
    if (maxNativeZoom != null) __obj.updateDynamic("maxNativeZoom")(maxNativeZoom.asInstanceOf[js.Any])
    if (maxZoom != null) __obj.updateDynamic("maxZoom")(maxZoom.asInstanceOf[js.Any])
    if (minNativeZoom != null) __obj.updateDynamic("minNativeZoom")(minNativeZoom.asInstanceOf[js.Any])
    if (minZoom != null) __obj.updateDynamic("minZoom")(minZoom.asInstanceOf[js.Any])
    if (!js.isUndefined(noWrap)) __obj.updateDynamic("noWrap")(noWrap.asInstanceOf[js.Any])
    if (onload != null) __obj.updateDynamic("onload")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.LeafletEvent) => onload(t0).runNow()))
    if (onloading != null) __obj.updateDynamic("onloading")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.LeafletEvent) => onloading(t0).runNow()))
    if (ontileerror != null) __obj.updateDynamic("ontileerror")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.TileEvent) => ontileerror(t0).runNow()))
    if (ontileload != null) __obj.updateDynamic("ontileload")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.TileEvent) => ontileload(t0).runNow()))
    if (ontileloadstart != null) __obj.updateDynamic("ontileloadstart")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.TileEvent) => ontileloadstart(t0).runNow()))
    if (ontileunload != null) __obj.updateDynamic("ontileunload")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.TileEvent) => ontileunload(t0).runNow()))
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (pane != null) __obj.updateDynamic("pane")(pane.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (subdomains != null) __obj.updateDynamic("subdomains")(subdomains.asInstanceOf[js.Any])
    if (tileSize != null) __obj.updateDynamic("tileSize")(tileSize.asInstanceOf[js.Any])
    if (!js.isUndefined(tms)) __obj.updateDynamic("tms")(tms.asInstanceOf[js.Any])
    if (!js.isUndefined(transparent)) __obj.updateDynamic("transparent")(transparent.asInstanceOf[js.Any])
    if (updateInterval != null) __obj.updateDynamic("updateInterval")(updateInterval.asInstanceOf[js.Any])
    if (!js.isUndefined(updateWhenIdle)) __obj.updateDynamic("updateWhenIdle")(updateWhenIdle.asInstanceOf[js.Any])
    if (!js.isUndefined(updateWhenZooming)) __obj.updateDynamic("updateWhenZooming")(updateWhenZooming.asInstanceOf[js.Any])
    if (!js.isUndefined(uppercase)) __obj.updateDynamic("uppercase")(uppercase.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    if (zoomOffset != null) __obj.updateDynamic("zoomOffset")(zoomOffset.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomReverse)) __obj.updateDynamic("zoomReverse")(zoomReverse.asInstanceOf[js.Any])
    __obj.asInstanceOf[WMSTileLayerProps]
  }
}

