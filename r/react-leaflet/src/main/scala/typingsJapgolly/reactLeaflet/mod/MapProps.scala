package typingsJapgolly.reactLeaflet.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.leaflet.mod.CRS
import typingsJapgolly.leaflet.mod.DragEndEvent
import typingsJapgolly.leaflet.mod.ErrorEvent
import typingsJapgolly.leaflet.mod.FitBoundsOptions
import typingsJapgolly.leaflet.mod.LatLngBoundsExpression
import typingsJapgolly.leaflet.mod.LatLngExpression
import typingsJapgolly.leaflet.mod.Layer
import typingsJapgolly.leaflet.mod.LayerEvent
import typingsJapgolly.leaflet.mod.LayersControlEvent
import typingsJapgolly.leaflet.mod.LeafletEvent
import typingsJapgolly.leaflet.mod.LeafletMouseEvent
import typingsJapgolly.leaflet.mod.LocationEvent
import typingsJapgolly.leaflet.mod.PointExpression
import typingsJapgolly.leaflet.mod.PopupEvent
import typingsJapgolly.leaflet.mod.Renderer
import typingsJapgolly.leaflet.mod.ResizeEvent
import typingsJapgolly.leaflet.mod.Zoom
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.leaflet.mod.LocateOptions because var conflicts: maxZoom. Inlined enableHighAccuracy, maximumAge, setView, timeout, watch
- typingsJapgolly.leaflet.mod.MapOptions because var conflicts: easeLinearity, maxZoom. Inlined attributionControl, bounceAtZoomLimits, boxZoom, center, closePopupOnClick, crs, doubleClickZoom, dragging, fadeAnimation, inertia, inertiaDeceleration, inertiaMaxSpeed, keyboard, keyboardPanDelta, layers, markerZoomAnimation, maxBounds, maxBoundsViscosity, minZoom, preferCanvas, renderer, scrollWheelZoom, tap, tapTolerance, touchZoom, trackResize, transform3DLimit, wheelDebounceTime, wheelPxPerZoomLevel, worldCopyJump, zoom, zoomAnimation, zoomAnimationThreshold, zoomControl, zoomDelta, zoomSnap */ trait MapProps
  extends FitBoundsOptions
     with MapEvents {
  // Control options
  var attributionControl: js.UndefOr[Boolean] = js.undefined
  var bounceAtZoomLimits: js.UndefOr[Boolean] = js.undefined
  var bounds: js.UndefOr[LatLngBoundsExpression] = js.undefined
  var boundsOptions: js.UndefOr[FitBoundsOptions] = js.undefined
  var boxZoom: js.UndefOr[Boolean] = js.undefined
  var center: js.UndefOr[LatLngExpression] = js.undefined
  var children: Children
  var className: js.UndefOr[String] = js.undefined
  // Interaction options
  var closePopupOnClick: js.UndefOr[Boolean] = js.undefined
  // Map state options
  var crs: js.UndefOr[CRS] = js.undefined
  var doubleClickZoom: js.UndefOr[Zoom] = js.undefined
  var dragging: js.UndefOr[Boolean] = js.undefined
  var enableHighAccuracy: js.UndefOr[Boolean] = js.undefined
  // Animation options
  var fadeAnimation: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  // Panning inertia options
  var inertia: js.UndefOr[Boolean] = js.undefined
  var inertiaDeceleration: js.UndefOr[Double] = js.undefined
  var inertiaMaxSpeed: js.UndefOr[Double] = js.undefined
  // Keyboard navigation options
  var keyboard: js.UndefOr[Boolean] = js.undefined
  var keyboardPanDelta: js.UndefOr[Double] = js.undefined
  var layers: js.UndefOr[js.Array[Layer]] = js.undefined
  var markerZoomAnimation: js.UndefOr[Boolean] = js.undefined
  var maxBounds: js.UndefOr[LatLngBoundsExpression] = js.undefined
  var maxBoundsViscosity: js.UndefOr[Double] = js.undefined
  var maximumAge: js.UndefOr[Double] = js.undefined
  var minZoom: js.UndefOr[Double] = js.undefined
  var onViewportChange: js.UndefOr[js.Function1[/* viewport */ Viewport, Unit]] = js.undefined
  var onViewportChanged: js.UndefOr[js.Function1[/* viewport */ Viewport, Unit]] = js.undefined
  var preferCanvas: js.UndefOr[Boolean] = js.undefined
  var renderer: js.UndefOr[Renderer] = js.undefined
  // Mousewheel options
  var scrollWheelZoom: js.UndefOr[Zoom] = js.undefined
  var setView: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  // Touch interaction options
  var tap: js.UndefOr[Boolean] = js.undefined
  var tapTolerance: js.UndefOr[Double] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
  var touchZoom: js.UndefOr[Zoom] = js.undefined
  var trackResize: js.UndefOr[Boolean] = js.undefined
  var transform3DLimit: js.UndefOr[Double] = js.undefined
  var useFlyTo: js.UndefOr[Boolean] = js.undefined
  var viewport: js.UndefOr[Viewport] = js.undefined
  var watch: js.UndefOr[Boolean] = js.undefined
  var wheelDebounceTime: js.UndefOr[Double] = js.undefined
  var wheelPxPerZoomLevel: js.UndefOr[Double] = js.undefined
  var whenReady: js.UndefOr[js.Function0[Unit]] = js.undefined
  var worldCopyJump: js.UndefOr[Boolean] = js.undefined
  var zoom: js.UndefOr[Double] = js.undefined
  var zoomAnimation: js.UndefOr[Boolean] = js.undefined
  var zoomAnimationThreshold: js.UndefOr[Double] = js.undefined
  var zoomControl: js.UndefOr[Boolean] = js.undefined
  var zoomDelta: js.UndefOr[Double] = js.undefined
  var zoomSnap: js.UndefOr[Double] = js.undefined
}

object MapProps {
  @scala.inline
  def apply(
    animate: js.UndefOr[Boolean] = js.undefined,
    attributionControl: js.UndefOr[Boolean] = js.undefined,
    bounceAtZoomLimits: js.UndefOr[Boolean] = js.undefined,
    bounds: LatLngBoundsExpression = null,
    boundsOptions: FitBoundsOptions = null,
    boxZoom: js.UndefOr[Boolean] = js.undefined,
    center: LatLngExpression = null,
    children: Children = null,
    className: String = null,
    closePopupOnClick: js.UndefOr[Boolean] = js.undefined,
    crs: CRS = null,
    doubleClickZoom: Zoom = null,
    dragging: js.UndefOr[Boolean] = js.undefined,
    duration: Int | Double = null,
    easeLinearity: Int | Double = null,
    enableHighAccuracy: js.UndefOr[Boolean] = js.undefined,
    fadeAnimation: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    inertia: js.UndefOr[Boolean] = js.undefined,
    inertiaDeceleration: Int | Double = null,
    inertiaMaxSpeed: Int | Double = null,
    keyboard: js.UndefOr[Boolean] = js.undefined,
    keyboardPanDelta: Int | Double = null,
    layers: js.Array[Layer] = null,
    markerZoomAnimation: js.UndefOr[Boolean] = js.undefined,
    maxBounds: LatLngBoundsExpression = null,
    maxBoundsViscosity: Int | Double = null,
    maxZoom: Int | Double = null,
    maximumAge: Int | Double = null,
    minZoom: Int | Double = null,
    noMoveStart: js.UndefOr[Boolean] = js.undefined,
    onViewportChange: /* viewport */ Viewport => Callback = null,
    onViewportChanged: /* viewport */ Viewport => Callback = null,
    onautopanstart: /* event */ LeafletEvent => Callback = null,
    onbaselayerchange: /* event */ LayersControlEvent => Callback = null,
    onblur: /* event */ LeafletEvent => Callback = null,
    onclick: /* event */ LeafletMouseEvent => Callback = null,
    oncontextmenu: /* event */ LeafletMouseEvent => Callback = null,
    ondblclick: /* event */ LeafletMouseEvent => Callback = null,
    ondrag: /* event */ LeafletEvent => Callback = null,
    ondragend: /* event */ DragEndEvent => Callback = null,
    ondragstart: /* event */ LeafletEvent => Callback = null,
    onfocus: /* event */ LeafletEvent => Callback = null,
    onlayeradd: /* event */ LayerEvent => Callback = null,
    onlayerremove: /* event */ LayerEvent => Callback = null,
    onload: /* event */ LeafletEvent => Callback = null,
    onlocationerror: /* event */ ErrorEvent => Callback = null,
    onlocationfound: /* event */ LocationEvent => Callback = null,
    onmousedown: /* event */ LeafletMouseEvent => Callback = null,
    onmousemove: /* event */ LeafletMouseEvent => Callback = null,
    onmouseout: /* event */ LeafletMouseEvent => Callback = null,
    onmouseover: /* event */ LeafletMouseEvent => Callback = null,
    onmouseup: /* event */ LeafletMouseEvent => Callback = null,
    onmove: /* event */ LeafletEvent => Callback = null,
    onmoveend: /* event */ LeafletEvent => Callback = null,
    onmovestart: /* event */ LeafletEvent => Callback = null,
    onoverlayadd: /* event */ LayersControlEvent => Callback = null,
    onoverlayremove: /* event */ LayersControlEvent => Callback = null,
    onpopupclose: /* event */ PopupEvent => Callback = null,
    onpopupopen: /* event */ PopupEvent => Callback = null,
    onpreclick: /* event */ LeafletMouseEvent => Callback = null,
    onresize: /* event */ ResizeEvent => Callback = null,
    onunload: /* event */ LeafletEvent => Callback = null,
    onviewreset: /* event */ LeafletEvent => Callback = null,
    onzoomend: /* event */ LeafletEvent => Callback = null,
    onzoomlevelschange: /* event */ LeafletEvent => Callback = null,
    onzoomstart: /* event */ LeafletEvent => Callback = null,
    padding: PointExpression = null,
    paddingBottomRight: PointExpression = null,
    paddingTopLeft: PointExpression = null,
    preferCanvas: js.UndefOr[Boolean] = js.undefined,
    renderer: Renderer = null,
    scrollWheelZoom: Zoom = null,
    setView: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    tap: js.UndefOr[Boolean] = js.undefined,
    tapTolerance: Int | Double = null,
    timeout: Int | Double = null,
    touchZoom: Zoom = null,
    trackResize: js.UndefOr[Boolean] = js.undefined,
    transform3DLimit: Int | Double = null,
    useFlyTo: js.UndefOr[Boolean] = js.undefined,
    viewport: Viewport = null,
    watch: js.UndefOr[Boolean] = js.undefined,
    wheelDebounceTime: Int | Double = null,
    wheelPxPerZoomLevel: Int | Double = null,
    whenReady: js.UndefOr[Callback] = js.undefined,
    worldCopyJump: js.UndefOr[Boolean] = js.undefined,
    zoom: Int | Double = null,
    zoomAnimation: js.UndefOr[Boolean] = js.undefined,
    zoomAnimationThreshold: Int | Double = null,
    zoomControl: js.UndefOr[Boolean] = js.undefined,
    zoomDelta: Int | Double = null,
    zoomSnap: Int | Double = null
  ): MapProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (!js.isUndefined(attributionControl)) __obj.updateDynamic("attributionControl")(attributionControl.asInstanceOf[js.Any])
    if (!js.isUndefined(bounceAtZoomLimits)) __obj.updateDynamic("bounceAtZoomLimits")(bounceAtZoomLimits.asInstanceOf[js.Any])
    if (bounds != null) __obj.updateDynamic("bounds")(bounds.asInstanceOf[js.Any])
    if (boundsOptions != null) __obj.updateDynamic("boundsOptions")(boundsOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(boxZoom)) __obj.updateDynamic("boxZoom")(boxZoom.asInstanceOf[js.Any])
    if (center != null) __obj.updateDynamic("center")(center.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(closePopupOnClick)) __obj.updateDynamic("closePopupOnClick")(closePopupOnClick.asInstanceOf[js.Any])
    if (crs != null) __obj.updateDynamic("crs")(crs.asInstanceOf[js.Any])
    if (doubleClickZoom != null) __obj.updateDynamic("doubleClickZoom")(doubleClickZoom.asInstanceOf[js.Any])
    if (!js.isUndefined(dragging)) __obj.updateDynamic("dragging")(dragging.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easeLinearity != null) __obj.updateDynamic("easeLinearity")(easeLinearity.asInstanceOf[js.Any])
    if (!js.isUndefined(enableHighAccuracy)) __obj.updateDynamic("enableHighAccuracy")(enableHighAccuracy.asInstanceOf[js.Any])
    if (!js.isUndefined(fadeAnimation)) __obj.updateDynamic("fadeAnimation")(fadeAnimation.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(inertia)) __obj.updateDynamic("inertia")(inertia.asInstanceOf[js.Any])
    if (inertiaDeceleration != null) __obj.updateDynamic("inertiaDeceleration")(inertiaDeceleration.asInstanceOf[js.Any])
    if (inertiaMaxSpeed != null) __obj.updateDynamic("inertiaMaxSpeed")(inertiaMaxSpeed.asInstanceOf[js.Any])
    if (!js.isUndefined(keyboard)) __obj.updateDynamic("keyboard")(keyboard.asInstanceOf[js.Any])
    if (keyboardPanDelta != null) __obj.updateDynamic("keyboardPanDelta")(keyboardPanDelta.asInstanceOf[js.Any])
    if (layers != null) __obj.updateDynamic("layers")(layers.asInstanceOf[js.Any])
    if (!js.isUndefined(markerZoomAnimation)) __obj.updateDynamic("markerZoomAnimation")(markerZoomAnimation.asInstanceOf[js.Any])
    if (maxBounds != null) __obj.updateDynamic("maxBounds")(maxBounds.asInstanceOf[js.Any])
    if (maxBoundsViscosity != null) __obj.updateDynamic("maxBoundsViscosity")(maxBoundsViscosity.asInstanceOf[js.Any])
    if (maxZoom != null) __obj.updateDynamic("maxZoom")(maxZoom.asInstanceOf[js.Any])
    if (maximumAge != null) __obj.updateDynamic("maximumAge")(maximumAge.asInstanceOf[js.Any])
    if (minZoom != null) __obj.updateDynamic("minZoom")(minZoom.asInstanceOf[js.Any])
    if (!js.isUndefined(noMoveStart)) __obj.updateDynamic("noMoveStart")(noMoveStart.asInstanceOf[js.Any])
    if (onViewportChange != null) __obj.updateDynamic("onViewportChange")(js.Any.fromFunction1((t0: /* viewport */ typingsJapgolly.reactLeaflet.mod.Viewport) => onViewportChange(t0).runNow()))
    if (onViewportChanged != null) __obj.updateDynamic("onViewportChanged")(js.Any.fromFunction1((t0: /* viewport */ typingsJapgolly.reactLeaflet.mod.Viewport) => onViewportChanged(t0).runNow()))
    if (onautopanstart != null) __obj.updateDynamic("onautopanstart")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.LeafletEvent) => onautopanstart(t0).runNow()))
    if (onbaselayerchange != null) __obj.updateDynamic("onbaselayerchange")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.LayersControlEvent) => onbaselayerchange(t0).runNow()))
    if (onblur != null) __obj.updateDynamic("onblur")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.LeafletEvent) => onblur(t0).runNow()))
    if (onclick != null) __obj.updateDynamic("onclick")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.LeafletMouseEvent) => onclick(t0).runNow()))
    if (oncontextmenu != null) __obj.updateDynamic("oncontextmenu")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.LeafletMouseEvent) => oncontextmenu(t0).runNow()))
    if (ondblclick != null) __obj.updateDynamic("ondblclick")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.LeafletMouseEvent) => ondblclick(t0).runNow()))
    if (ondrag != null) __obj.updateDynamic("ondrag")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.LeafletEvent) => ondrag(t0).runNow()))
    if (ondragend != null) __obj.updateDynamic("ondragend")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.DragEndEvent) => ondragend(t0).runNow()))
    if (ondragstart != null) __obj.updateDynamic("ondragstart")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.LeafletEvent) => ondragstart(t0).runNow()))
    if (onfocus != null) __obj.updateDynamic("onfocus")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.LeafletEvent) => onfocus(t0).runNow()))
    if (onlayeradd != null) __obj.updateDynamic("onlayeradd")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.LayerEvent) => onlayeradd(t0).runNow()))
    if (onlayerremove != null) __obj.updateDynamic("onlayerremove")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.LayerEvent) => onlayerremove(t0).runNow()))
    if (onload != null) __obj.updateDynamic("onload")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.LeafletEvent) => onload(t0).runNow()))
    if (onlocationerror != null) __obj.updateDynamic("onlocationerror")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.ErrorEvent) => onlocationerror(t0).runNow()))
    if (onlocationfound != null) __obj.updateDynamic("onlocationfound")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.LocationEvent) => onlocationfound(t0).runNow()))
    if (onmousedown != null) __obj.updateDynamic("onmousedown")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.LeafletMouseEvent) => onmousedown(t0).runNow()))
    if (onmousemove != null) __obj.updateDynamic("onmousemove")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.LeafletMouseEvent) => onmousemove(t0).runNow()))
    if (onmouseout != null) __obj.updateDynamic("onmouseout")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.LeafletMouseEvent) => onmouseout(t0).runNow()))
    if (onmouseover != null) __obj.updateDynamic("onmouseover")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.LeafletMouseEvent) => onmouseover(t0).runNow()))
    if (onmouseup != null) __obj.updateDynamic("onmouseup")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.LeafletMouseEvent) => onmouseup(t0).runNow()))
    if (onmove != null) __obj.updateDynamic("onmove")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.LeafletEvent) => onmove(t0).runNow()))
    if (onmoveend != null) __obj.updateDynamic("onmoveend")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.LeafletEvent) => onmoveend(t0).runNow()))
    if (onmovestart != null) __obj.updateDynamic("onmovestart")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.LeafletEvent) => onmovestart(t0).runNow()))
    if (onoverlayadd != null) __obj.updateDynamic("onoverlayadd")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.LayersControlEvent) => onoverlayadd(t0).runNow()))
    if (onoverlayremove != null) __obj.updateDynamic("onoverlayremove")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.LayersControlEvent) => onoverlayremove(t0).runNow()))
    if (onpopupclose != null) __obj.updateDynamic("onpopupclose")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.PopupEvent) => onpopupclose(t0).runNow()))
    if (onpopupopen != null) __obj.updateDynamic("onpopupopen")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.PopupEvent) => onpopupopen(t0).runNow()))
    if (onpreclick != null) __obj.updateDynamic("onpreclick")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.LeafletMouseEvent) => onpreclick(t0).runNow()))
    if (onresize != null) __obj.updateDynamic("onresize")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.ResizeEvent) => onresize(t0).runNow()))
    if (onunload != null) __obj.updateDynamic("onunload")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.LeafletEvent) => onunload(t0).runNow()))
    if (onviewreset != null) __obj.updateDynamic("onviewreset")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.LeafletEvent) => onviewreset(t0).runNow()))
    if (onzoomend != null) __obj.updateDynamic("onzoomend")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.LeafletEvent) => onzoomend(t0).runNow()))
    if (onzoomlevelschange != null) __obj.updateDynamic("onzoomlevelschange")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.LeafletEvent) => onzoomlevelschange(t0).runNow()))
    if (onzoomstart != null) __obj.updateDynamic("onzoomstart")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.LeafletEvent) => onzoomstart(t0).runNow()))
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (paddingBottomRight != null) __obj.updateDynamic("paddingBottomRight")(paddingBottomRight.asInstanceOf[js.Any])
    if (paddingTopLeft != null) __obj.updateDynamic("paddingTopLeft")(paddingTopLeft.asInstanceOf[js.Any])
    if (!js.isUndefined(preferCanvas)) __obj.updateDynamic("preferCanvas")(preferCanvas.asInstanceOf[js.Any])
    if (renderer != null) __obj.updateDynamic("renderer")(renderer.asInstanceOf[js.Any])
    if (scrollWheelZoom != null) __obj.updateDynamic("scrollWheelZoom")(scrollWheelZoom.asInstanceOf[js.Any])
    if (!js.isUndefined(setView)) __obj.updateDynamic("setView")(setView.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(tap)) __obj.updateDynamic("tap")(tap.asInstanceOf[js.Any])
    if (tapTolerance != null) __obj.updateDynamic("tapTolerance")(tapTolerance.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (touchZoom != null) __obj.updateDynamic("touchZoom")(touchZoom.asInstanceOf[js.Any])
    if (!js.isUndefined(trackResize)) __obj.updateDynamic("trackResize")(trackResize.asInstanceOf[js.Any])
    if (transform3DLimit != null) __obj.updateDynamic("transform3DLimit")(transform3DLimit.asInstanceOf[js.Any])
    if (!js.isUndefined(useFlyTo)) __obj.updateDynamic("useFlyTo")(useFlyTo.asInstanceOf[js.Any])
    if (viewport != null) __obj.updateDynamic("viewport")(viewport.asInstanceOf[js.Any])
    if (!js.isUndefined(watch)) __obj.updateDynamic("watch")(watch.asInstanceOf[js.Any])
    if (wheelDebounceTime != null) __obj.updateDynamic("wheelDebounceTime")(wheelDebounceTime.asInstanceOf[js.Any])
    if (wheelPxPerZoomLevel != null) __obj.updateDynamic("wheelPxPerZoomLevel")(wheelPxPerZoomLevel.asInstanceOf[js.Any])
    whenReady.foreach(p => __obj.updateDynamic("whenReady")(p.toJsFn))
    if (!js.isUndefined(worldCopyJump)) __obj.updateDynamic("worldCopyJump")(worldCopyJump.asInstanceOf[js.Any])
    if (zoom != null) __obj.updateDynamic("zoom")(zoom.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomAnimation)) __obj.updateDynamic("zoomAnimation")(zoomAnimation.asInstanceOf[js.Any])
    if (zoomAnimationThreshold != null) __obj.updateDynamic("zoomAnimationThreshold")(zoomAnimationThreshold.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomControl)) __obj.updateDynamic("zoomControl")(zoomControl.asInstanceOf[js.Any])
    if (zoomDelta != null) __obj.updateDynamic("zoomDelta")(zoomDelta.asInstanceOf[js.Any])
    if (zoomSnap != null) __obj.updateDynamic("zoomSnap")(zoomSnap.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapProps]
  }
}

