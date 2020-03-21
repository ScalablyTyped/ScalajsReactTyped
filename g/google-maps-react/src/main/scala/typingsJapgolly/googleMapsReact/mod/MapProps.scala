package typingsJapgolly.googleMapsReact.mod

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.Element
import typingsJapgolly.googlemaps.google.maps.FullscreenControlOptions
import typingsJapgolly.googlemaps.google.maps.GestureHandlingOptions
import typingsJapgolly.googlemaps.google.maps.LatLng
import typingsJapgolly.googlemaps.google.maps.LatLngBounds
import typingsJapgolly.googlemaps.google.maps.LatLngBoundsLiteral
import typingsJapgolly.googlemaps.google.maps.LatLngLiteral
import typingsJapgolly.googlemaps.google.maps.MapOptions
import typingsJapgolly.googlemaps.google.maps.MapRestriction
import typingsJapgolly.googlemaps.google.maps.MapTypeControlOptions
import typingsJapgolly.googlemaps.google.maps.MapTypeId
import typingsJapgolly.googlemaps.google.maps.MapTypeStyle
import typingsJapgolly.googlemaps.google.maps.PanControlOptions
import typingsJapgolly.googlemaps.google.maps.RotateControlOptions
import typingsJapgolly.googlemaps.google.maps.ScaleControlOptions
import typingsJapgolly.googlemaps.google.maps.StreetViewControlOptions
import typingsJapgolly.googlemaps.google.maps.StreetViewPanorama
import typingsJapgolly.googlemaps.google.maps.ZoomControlOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapProps extends MapOptions {
  var bounds: js.UndefOr[LatLngBounds | LatLngBoundsLiteral] = js.undefined
  var centerAroundCurrentLocation: js.UndefOr[Boolean] = js.undefined
  var google: GoogleAPI
  var initialCenter: js.UndefOr[LatLngLiteral] = js.undefined
  var loaded: js.UndefOr[Boolean] = js.undefined
  var onBoundsChanged: js.UndefOr[mapEventHandler] = js.undefined
  var onCenterChanged: js.UndefOr[mapEventHandler] = js.undefined
  var onClick: js.UndefOr[mapEventHandler] = js.undefined
  var onDblclick: js.UndefOr[mapEventHandler] = js.undefined
  var onDragend: js.UndefOr[mapEventHandler] = js.undefined
  var onDragstart: js.UndefOr[mapEventHandler] = js.undefined
  var onHeadingChange: js.UndefOr[mapEventHandler] = js.undefined
  var onIdle: js.UndefOr[mapEventHandler] = js.undefined
  var onMaptypeidChanged: js.UndefOr[mapEventHandler] = js.undefined
  var onMousemove: js.UndefOr[mapEventHandler] = js.undefined
  var onMouseout: js.UndefOr[mapEventHandler] = js.undefined
  var onMouseover: js.UndefOr[mapEventHandler] = js.undefined
  var onProjectionChanged: js.UndefOr[mapEventHandler] = js.undefined
  var onReady: js.UndefOr[mapEventHandler] = js.undefined
  var onRecenter: js.UndefOr[mapEventHandler] = js.undefined
  var onResize: js.UndefOr[mapEventHandler] = js.undefined
  var onRightclick: js.UndefOr[mapEventHandler] = js.undefined
  var onTilesloaded: js.UndefOr[mapEventHandler] = js.undefined
  var onTiltChanged: js.UndefOr[mapEventHandler] = js.undefined
  var onZoomChanged: js.UndefOr[mapEventHandler] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
}

object MapProps {
  @scala.inline
  def apply(
    google: GoogleAPI,
    backgroundColor: String = null,
    bounds: LatLngBounds | LatLngBoundsLiteral = null,
    center: LatLng | LatLngLiteral = null,
    centerAroundCurrentLocation: js.UndefOr[Boolean] = js.undefined,
    clickableIcons: js.UndefOr[Boolean] = js.undefined,
    controlSize: Int | Double = null,
    disableDefaultUI: js.UndefOr[Boolean] = js.undefined,
    disableDoubleClickZoom: js.UndefOr[Boolean] = js.undefined,
    draggable: js.UndefOr[Boolean] = js.undefined,
    draggableCursor: String = null,
    draggingCursor: String = null,
    fullscreenControl: js.UndefOr[Boolean] = js.undefined,
    fullscreenControlOptions: FullscreenControlOptions = null,
    gestureHandling: GestureHandlingOptions = null,
    heading: Int | Double = null,
    initialCenter: LatLngLiteral = null,
    keyboardShortcuts: js.UndefOr[Boolean] = js.undefined,
    loaded: js.UndefOr[Boolean] = js.undefined,
    mapTypeControl: js.UndefOr[Boolean] = js.undefined,
    mapTypeControlOptions: MapTypeControlOptions = null,
    mapTypeId: MapTypeId | String = null,
    maxZoom: Int | Double = null,
    minZoom: Int | Double = null,
    noClear: js.UndefOr[Boolean] = js.undefined,
    onBoundsChanged: (/* mapProps */ js.UndefOr[MapProps], /* map */ js.UndefOr[typingsJapgolly.googlemaps.google.maps.Map[Element]], /* event */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    onCenterChanged: (/* mapProps */ js.UndefOr[MapProps], /* map */ js.UndefOr[typingsJapgolly.googlemaps.google.maps.Map[Element]], /* event */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    onClick: (/* mapProps */ js.UndefOr[MapProps], /* map */ js.UndefOr[typingsJapgolly.googlemaps.google.maps.Map[Element]], /* event */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    onDblclick: (/* mapProps */ js.UndefOr[MapProps], /* map */ js.UndefOr[typingsJapgolly.googlemaps.google.maps.Map[Element]], /* event */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    onDragend: (/* mapProps */ js.UndefOr[MapProps], /* map */ js.UndefOr[typingsJapgolly.googlemaps.google.maps.Map[Element]], /* event */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    onDragstart: (/* mapProps */ js.UndefOr[MapProps], /* map */ js.UndefOr[typingsJapgolly.googlemaps.google.maps.Map[Element]], /* event */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    onHeadingChange: (/* mapProps */ js.UndefOr[MapProps], /* map */ js.UndefOr[typingsJapgolly.googlemaps.google.maps.Map[Element]], /* event */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    onIdle: (/* mapProps */ js.UndefOr[MapProps], /* map */ js.UndefOr[typingsJapgolly.googlemaps.google.maps.Map[Element]], /* event */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    onMaptypeidChanged: (/* mapProps */ js.UndefOr[MapProps], /* map */ js.UndefOr[typingsJapgolly.googlemaps.google.maps.Map[Element]], /* event */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    onMousemove: (/* mapProps */ js.UndefOr[MapProps], /* map */ js.UndefOr[typingsJapgolly.googlemaps.google.maps.Map[Element]], /* event */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    onMouseout: (/* mapProps */ js.UndefOr[MapProps], /* map */ js.UndefOr[typingsJapgolly.googlemaps.google.maps.Map[Element]], /* event */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    onMouseover: (/* mapProps */ js.UndefOr[MapProps], /* map */ js.UndefOr[typingsJapgolly.googlemaps.google.maps.Map[Element]], /* event */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    onProjectionChanged: (/* mapProps */ js.UndefOr[MapProps], /* map */ js.UndefOr[typingsJapgolly.googlemaps.google.maps.Map[Element]], /* event */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    onReady: (/* mapProps */ js.UndefOr[MapProps], /* map */ js.UndefOr[typingsJapgolly.googlemaps.google.maps.Map[Element]], /* event */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    onRecenter: (/* mapProps */ js.UndefOr[MapProps], /* map */ js.UndefOr[typingsJapgolly.googlemaps.google.maps.Map[Element]], /* event */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    onResize: (/* mapProps */ js.UndefOr[MapProps], /* map */ js.UndefOr[typingsJapgolly.googlemaps.google.maps.Map[Element]], /* event */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    onRightclick: (/* mapProps */ js.UndefOr[MapProps], /* map */ js.UndefOr[typingsJapgolly.googlemaps.google.maps.Map[Element]], /* event */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    onTilesloaded: (/* mapProps */ js.UndefOr[MapProps], /* map */ js.UndefOr[typingsJapgolly.googlemaps.google.maps.Map[Element]], /* event */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    onTiltChanged: (/* mapProps */ js.UndefOr[MapProps], /* map */ js.UndefOr[typingsJapgolly.googlemaps.google.maps.Map[Element]], /* event */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    onZoomChanged: (/* mapProps */ js.UndefOr[MapProps], /* map */ js.UndefOr[typingsJapgolly.googlemaps.google.maps.Map[Element]], /* event */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    panControl: js.UndefOr[Boolean] = js.undefined,
    panControlOptions: PanControlOptions = null,
    restriction: MapRestriction = null,
    rotateControl: js.UndefOr[Boolean] = js.undefined,
    rotateControlOptions: RotateControlOptions = null,
    scaleControl: js.UndefOr[Boolean] = js.undefined,
    scaleControlOptions: ScaleControlOptions = null,
    scrollwheel: js.UndefOr[Boolean] = js.undefined,
    streetView: StreetViewPanorama = null,
    streetViewControl: js.UndefOr[Boolean] = js.undefined,
    streetViewControlOptions: StreetViewControlOptions = null,
    styles: js.Array[MapTypeStyle] = null,
    tilt: Int | Double = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    zoom: Int | Double = null,
    zoomControl: js.UndefOr[Boolean] = js.undefined,
    zoomControlOptions: ZoomControlOptions = null
  ): MapProps = {
    val __obj = js.Dynamic.literal(google = google.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (bounds != null) __obj.updateDynamic("bounds")(bounds.asInstanceOf[js.Any])
    if (center != null) __obj.updateDynamic("center")(center.asInstanceOf[js.Any])
    if (!js.isUndefined(centerAroundCurrentLocation)) __obj.updateDynamic("centerAroundCurrentLocation")(centerAroundCurrentLocation.asInstanceOf[js.Any])
    if (!js.isUndefined(clickableIcons)) __obj.updateDynamic("clickableIcons")(clickableIcons.asInstanceOf[js.Any])
    if (controlSize != null) __obj.updateDynamic("controlSize")(controlSize.asInstanceOf[js.Any])
    if (!js.isUndefined(disableDefaultUI)) __obj.updateDynamic("disableDefaultUI")(disableDefaultUI.asInstanceOf[js.Any])
    if (!js.isUndefined(disableDoubleClickZoom)) __obj.updateDynamic("disableDoubleClickZoom")(disableDoubleClickZoom.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.asInstanceOf[js.Any])
    if (draggableCursor != null) __obj.updateDynamic("draggableCursor")(draggableCursor.asInstanceOf[js.Any])
    if (draggingCursor != null) __obj.updateDynamic("draggingCursor")(draggingCursor.asInstanceOf[js.Any])
    if (!js.isUndefined(fullscreenControl)) __obj.updateDynamic("fullscreenControl")(fullscreenControl.asInstanceOf[js.Any])
    if (fullscreenControlOptions != null) __obj.updateDynamic("fullscreenControlOptions")(fullscreenControlOptions.asInstanceOf[js.Any])
    if (gestureHandling != null) __obj.updateDynamic("gestureHandling")(gestureHandling.asInstanceOf[js.Any])
    if (heading != null) __obj.updateDynamic("heading")(heading.asInstanceOf[js.Any])
    if (initialCenter != null) __obj.updateDynamic("initialCenter")(initialCenter.asInstanceOf[js.Any])
    if (!js.isUndefined(keyboardShortcuts)) __obj.updateDynamic("keyboardShortcuts")(keyboardShortcuts.asInstanceOf[js.Any])
    if (!js.isUndefined(loaded)) __obj.updateDynamic("loaded")(loaded.asInstanceOf[js.Any])
    if (!js.isUndefined(mapTypeControl)) __obj.updateDynamic("mapTypeControl")(mapTypeControl.asInstanceOf[js.Any])
    if (mapTypeControlOptions != null) __obj.updateDynamic("mapTypeControlOptions")(mapTypeControlOptions.asInstanceOf[js.Any])
    if (mapTypeId != null) __obj.updateDynamic("mapTypeId")(mapTypeId.asInstanceOf[js.Any])
    if (maxZoom != null) __obj.updateDynamic("maxZoom")(maxZoom.asInstanceOf[js.Any])
    if (minZoom != null) __obj.updateDynamic("minZoom")(minZoom.asInstanceOf[js.Any])
    if (!js.isUndefined(noClear)) __obj.updateDynamic("noClear")(noClear.asInstanceOf[js.Any])
    if (onBoundsChanged != null) __obj.updateDynamic("onBoundsChanged")(js.Any.fromFunction3((t0: /* mapProps */ js.UndefOr[typingsJapgolly.googleMapsReact.mod.MapProps], t1: /* map */ js.UndefOr[typingsJapgolly.googlemaps.google.maps.Map[org.scalajs.dom.raw.Element]], t2: /* event */ js.UndefOr[js.Any]) => onBoundsChanged(t0, t1, t2).runNow()))
    if (onCenterChanged != null) __obj.updateDynamic("onCenterChanged")(js.Any.fromFunction3((t0: /* mapProps */ js.UndefOr[typingsJapgolly.googleMapsReact.mod.MapProps], t1: /* map */ js.UndefOr[typingsJapgolly.googlemaps.google.maps.Map[org.scalajs.dom.raw.Element]], t2: /* event */ js.UndefOr[js.Any]) => onCenterChanged(t0, t1, t2).runNow()))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction3((t0: /* mapProps */ js.UndefOr[typingsJapgolly.googleMapsReact.mod.MapProps], t1: /* map */ js.UndefOr[typingsJapgolly.googlemaps.google.maps.Map[org.scalajs.dom.raw.Element]], t2: /* event */ js.UndefOr[js.Any]) => onClick(t0, t1, t2).runNow()))
    if (onDblclick != null) __obj.updateDynamic("onDblclick")(js.Any.fromFunction3((t0: /* mapProps */ js.UndefOr[typingsJapgolly.googleMapsReact.mod.MapProps], t1: /* map */ js.UndefOr[typingsJapgolly.googlemaps.google.maps.Map[org.scalajs.dom.raw.Element]], t2: /* event */ js.UndefOr[js.Any]) => onDblclick(t0, t1, t2).runNow()))
    if (onDragend != null) __obj.updateDynamic("onDragend")(js.Any.fromFunction3((t0: /* mapProps */ js.UndefOr[typingsJapgolly.googleMapsReact.mod.MapProps], t1: /* map */ js.UndefOr[typingsJapgolly.googlemaps.google.maps.Map[org.scalajs.dom.raw.Element]], t2: /* event */ js.UndefOr[js.Any]) => onDragend(t0, t1, t2).runNow()))
    if (onDragstart != null) __obj.updateDynamic("onDragstart")(js.Any.fromFunction3((t0: /* mapProps */ js.UndefOr[typingsJapgolly.googleMapsReact.mod.MapProps], t1: /* map */ js.UndefOr[typingsJapgolly.googlemaps.google.maps.Map[org.scalajs.dom.raw.Element]], t2: /* event */ js.UndefOr[js.Any]) => onDragstart(t0, t1, t2).runNow()))
    if (onHeadingChange != null) __obj.updateDynamic("onHeadingChange")(js.Any.fromFunction3((t0: /* mapProps */ js.UndefOr[typingsJapgolly.googleMapsReact.mod.MapProps], t1: /* map */ js.UndefOr[typingsJapgolly.googlemaps.google.maps.Map[org.scalajs.dom.raw.Element]], t2: /* event */ js.UndefOr[js.Any]) => onHeadingChange(t0, t1, t2).runNow()))
    if (onIdle != null) __obj.updateDynamic("onIdle")(js.Any.fromFunction3((t0: /* mapProps */ js.UndefOr[typingsJapgolly.googleMapsReact.mod.MapProps], t1: /* map */ js.UndefOr[typingsJapgolly.googlemaps.google.maps.Map[org.scalajs.dom.raw.Element]], t2: /* event */ js.UndefOr[js.Any]) => onIdle(t0, t1, t2).runNow()))
    if (onMaptypeidChanged != null) __obj.updateDynamic("onMaptypeidChanged")(js.Any.fromFunction3((t0: /* mapProps */ js.UndefOr[typingsJapgolly.googleMapsReact.mod.MapProps], t1: /* map */ js.UndefOr[typingsJapgolly.googlemaps.google.maps.Map[org.scalajs.dom.raw.Element]], t2: /* event */ js.UndefOr[js.Any]) => onMaptypeidChanged(t0, t1, t2).runNow()))
    if (onMousemove != null) __obj.updateDynamic("onMousemove")(js.Any.fromFunction3((t0: /* mapProps */ js.UndefOr[typingsJapgolly.googleMapsReact.mod.MapProps], t1: /* map */ js.UndefOr[typingsJapgolly.googlemaps.google.maps.Map[org.scalajs.dom.raw.Element]], t2: /* event */ js.UndefOr[js.Any]) => onMousemove(t0, t1, t2).runNow()))
    if (onMouseout != null) __obj.updateDynamic("onMouseout")(js.Any.fromFunction3((t0: /* mapProps */ js.UndefOr[typingsJapgolly.googleMapsReact.mod.MapProps], t1: /* map */ js.UndefOr[typingsJapgolly.googlemaps.google.maps.Map[org.scalajs.dom.raw.Element]], t2: /* event */ js.UndefOr[js.Any]) => onMouseout(t0, t1, t2).runNow()))
    if (onMouseover != null) __obj.updateDynamic("onMouseover")(js.Any.fromFunction3((t0: /* mapProps */ js.UndefOr[typingsJapgolly.googleMapsReact.mod.MapProps], t1: /* map */ js.UndefOr[typingsJapgolly.googlemaps.google.maps.Map[org.scalajs.dom.raw.Element]], t2: /* event */ js.UndefOr[js.Any]) => onMouseover(t0, t1, t2).runNow()))
    if (onProjectionChanged != null) __obj.updateDynamic("onProjectionChanged")(js.Any.fromFunction3((t0: /* mapProps */ js.UndefOr[typingsJapgolly.googleMapsReact.mod.MapProps], t1: /* map */ js.UndefOr[typingsJapgolly.googlemaps.google.maps.Map[org.scalajs.dom.raw.Element]], t2: /* event */ js.UndefOr[js.Any]) => onProjectionChanged(t0, t1, t2).runNow()))
    if (onReady != null) __obj.updateDynamic("onReady")(js.Any.fromFunction3((t0: /* mapProps */ js.UndefOr[typingsJapgolly.googleMapsReact.mod.MapProps], t1: /* map */ js.UndefOr[typingsJapgolly.googlemaps.google.maps.Map[org.scalajs.dom.raw.Element]], t2: /* event */ js.UndefOr[js.Any]) => onReady(t0, t1, t2).runNow()))
    if (onRecenter != null) __obj.updateDynamic("onRecenter")(js.Any.fromFunction3((t0: /* mapProps */ js.UndefOr[typingsJapgolly.googleMapsReact.mod.MapProps], t1: /* map */ js.UndefOr[typingsJapgolly.googlemaps.google.maps.Map[org.scalajs.dom.raw.Element]], t2: /* event */ js.UndefOr[js.Any]) => onRecenter(t0, t1, t2).runNow()))
    if (onResize != null) __obj.updateDynamic("onResize")(js.Any.fromFunction3((t0: /* mapProps */ js.UndefOr[typingsJapgolly.googleMapsReact.mod.MapProps], t1: /* map */ js.UndefOr[typingsJapgolly.googlemaps.google.maps.Map[org.scalajs.dom.raw.Element]], t2: /* event */ js.UndefOr[js.Any]) => onResize(t0, t1, t2).runNow()))
    if (onRightclick != null) __obj.updateDynamic("onRightclick")(js.Any.fromFunction3((t0: /* mapProps */ js.UndefOr[typingsJapgolly.googleMapsReact.mod.MapProps], t1: /* map */ js.UndefOr[typingsJapgolly.googlemaps.google.maps.Map[org.scalajs.dom.raw.Element]], t2: /* event */ js.UndefOr[js.Any]) => onRightclick(t0, t1, t2).runNow()))
    if (onTilesloaded != null) __obj.updateDynamic("onTilesloaded")(js.Any.fromFunction3((t0: /* mapProps */ js.UndefOr[typingsJapgolly.googleMapsReact.mod.MapProps], t1: /* map */ js.UndefOr[typingsJapgolly.googlemaps.google.maps.Map[org.scalajs.dom.raw.Element]], t2: /* event */ js.UndefOr[js.Any]) => onTilesloaded(t0, t1, t2).runNow()))
    if (onTiltChanged != null) __obj.updateDynamic("onTiltChanged")(js.Any.fromFunction3((t0: /* mapProps */ js.UndefOr[typingsJapgolly.googleMapsReact.mod.MapProps], t1: /* map */ js.UndefOr[typingsJapgolly.googlemaps.google.maps.Map[org.scalajs.dom.raw.Element]], t2: /* event */ js.UndefOr[js.Any]) => onTiltChanged(t0, t1, t2).runNow()))
    if (onZoomChanged != null) __obj.updateDynamic("onZoomChanged")(js.Any.fromFunction3((t0: /* mapProps */ js.UndefOr[typingsJapgolly.googleMapsReact.mod.MapProps], t1: /* map */ js.UndefOr[typingsJapgolly.googlemaps.google.maps.Map[org.scalajs.dom.raw.Element]], t2: /* event */ js.UndefOr[js.Any]) => onZoomChanged(t0, t1, t2).runNow()))
    if (!js.isUndefined(panControl)) __obj.updateDynamic("panControl")(panControl.asInstanceOf[js.Any])
    if (panControlOptions != null) __obj.updateDynamic("panControlOptions")(panControlOptions.asInstanceOf[js.Any])
    if (restriction != null) __obj.updateDynamic("restriction")(restriction.asInstanceOf[js.Any])
    if (!js.isUndefined(rotateControl)) __obj.updateDynamic("rotateControl")(rotateControl.asInstanceOf[js.Any])
    if (rotateControlOptions != null) __obj.updateDynamic("rotateControlOptions")(rotateControlOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(scaleControl)) __obj.updateDynamic("scaleControl")(scaleControl.asInstanceOf[js.Any])
    if (scaleControlOptions != null) __obj.updateDynamic("scaleControlOptions")(scaleControlOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollwheel)) __obj.updateDynamic("scrollwheel")(scrollwheel.asInstanceOf[js.Any])
    if (streetView != null) __obj.updateDynamic("streetView")(streetView.asInstanceOf[js.Any])
    if (!js.isUndefined(streetViewControl)) __obj.updateDynamic("streetViewControl")(streetViewControl.asInstanceOf[js.Any])
    if (streetViewControlOptions != null) __obj.updateDynamic("streetViewControlOptions")(streetViewControlOptions.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (tilt != null) __obj.updateDynamic("tilt")(tilt.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (zoom != null) __obj.updateDynamic("zoom")(zoom.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomControl)) __obj.updateDynamic("zoomControl")(zoomControl.asInstanceOf[js.Any])
    if (zoomControlOptions != null) __obj.updateDynamic("zoomControlOptions")(zoomControlOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapProps]
  }
}

