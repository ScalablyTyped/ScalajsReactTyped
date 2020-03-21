package typingsJapgolly.reactLeaflet.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.leaflet.mod.CrossOrigin
import typingsJapgolly.leaflet.mod.LatLngBoundsExpression
import typingsJapgolly.leaflet.mod.LeafletEvent
import typingsJapgolly.leaflet.mod.Point_
import typingsJapgolly.leaflet.mod.TileEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.leaflet.mod.GridLayerOptions because var conflicts: attribution, pane. Inlined bounds, className, keepBuffer, maxZoom, minZoom, noWrap, opacity, tileSize, updateInterval, updateWhenIdle, updateWhenZooming, zIndex
- typingsJapgolly.leaflet.mod.TileLayerOptions because var conflicts: attribution, pane. Inlined accessToken, crossOrigin, detectRetina, errorTileUrl, id, maxNativeZoom, minNativeZoom, subdomains, tms, zoomOffset, zoomReverse */ trait TileLayerProps
  extends MapLayerProps
     with TileLayerEvents {
  var accessToken: js.UndefOr[String] = js.undefined
  var bounds: js.UndefOr[LatLngBoundsExpression] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var crossOrigin: js.UndefOr[CrossOrigin] = js.undefined
  var detectRetina: js.UndefOr[Boolean] = js.undefined
  var errorTileUrl: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var keepBuffer: js.UndefOr[Double] = js.undefined
  var maxNativeZoom: js.UndefOr[Double] = js.undefined
  var maxZoom: js.UndefOr[Double] = js.undefined
  var minNativeZoom: js.UndefOr[Double] = js.undefined
  var minZoom: js.UndefOr[Double] = js.undefined
  var noWrap: js.UndefOr[Boolean] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
  var subdomains: js.UndefOr[String | js.Array[String]] = js.undefined
  var tileSize: js.UndefOr[Double | Point_] = js.undefined
  var tms: js.UndefOr[Boolean] = js.undefined
  var updateInterval: js.UndefOr[Double] = js.undefined
  var updateWhenIdle: js.UndefOr[Boolean] = js.undefined
  var updateWhenZooming: js.UndefOr[Boolean] = js.undefined
  var url: String
  var zIndex: js.UndefOr[Double] = js.undefined
  var zoomOffset: js.UndefOr[Double] = js.undefined
  var zoomReverse: js.UndefOr[Boolean] = js.undefined
}

object TileLayerProps {
  @scala.inline
  def apply(
    url: String,
    accessToken: String = null,
    attribution: String = null,
    bounds: LatLngBoundsExpression = null,
    children: Children = null,
    className: String = null,
    crossOrigin: CrossOrigin = null,
    detectRetina: js.UndefOr[Boolean] = js.undefined,
    errorTileUrl: String = null,
    id: String = null,
    keepBuffer: Int | Double = null,
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
    subdomains: String | js.Array[String] = null,
    tileSize: Double | Point_ = null,
    tms: js.UndefOr[Boolean] = js.undefined,
    updateInterval: Int | Double = null,
    updateWhenIdle: js.UndefOr[Boolean] = js.undefined,
    updateWhenZooming: js.UndefOr[Boolean] = js.undefined,
    zIndex: Int | Double = null,
    zoomOffset: Int | Double = null,
    zoomReverse: js.UndefOr[Boolean] = js.undefined
  ): TileLayerProps = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (accessToken != null) __obj.updateDynamic("accessToken")(accessToken.asInstanceOf[js.Any])
    if (attribution != null) __obj.updateDynamic("attribution")(attribution.asInstanceOf[js.Any])
    if (bounds != null) __obj.updateDynamic("bounds")(bounds.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (crossOrigin != null) __obj.updateDynamic("crossOrigin")(crossOrigin.asInstanceOf[js.Any])
    if (!js.isUndefined(detectRetina)) __obj.updateDynamic("detectRetina")(detectRetina.asInstanceOf[js.Any])
    if (errorTileUrl != null) __obj.updateDynamic("errorTileUrl")(errorTileUrl.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (keepBuffer != null) __obj.updateDynamic("keepBuffer")(keepBuffer.asInstanceOf[js.Any])
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
    if (subdomains != null) __obj.updateDynamic("subdomains")(subdomains.asInstanceOf[js.Any])
    if (tileSize != null) __obj.updateDynamic("tileSize")(tileSize.asInstanceOf[js.Any])
    if (!js.isUndefined(tms)) __obj.updateDynamic("tms")(tms.asInstanceOf[js.Any])
    if (updateInterval != null) __obj.updateDynamic("updateInterval")(updateInterval.asInstanceOf[js.Any])
    if (!js.isUndefined(updateWhenIdle)) __obj.updateDynamic("updateWhenIdle")(updateWhenIdle.asInstanceOf[js.Any])
    if (!js.isUndefined(updateWhenZooming)) __obj.updateDynamic("updateWhenZooming")(updateWhenZooming.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    if (zoomOffset != null) __obj.updateDynamic("zoomOffset")(zoomOffset.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomReverse)) __obj.updateDynamic("zoomReverse")(zoomReverse.asInstanceOf[js.Any])
    __obj.asInstanceOf[TileLayerProps]
  }
}

