package typingsJapgolly.googleMapsReact.mod

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.Element
import typingsJapgolly.googlemaps.google.maps.Animation
import typingsJapgolly.googlemaps.google.maps.Icon
import typingsJapgolly.googlemaps.google.maps.LatLng
import typingsJapgolly.googlemaps.google.maps.LatLngLiteral
import typingsJapgolly.googlemaps.google.maps.MarkerLabel
import typingsJapgolly.googlemaps.google.maps.MarkerShape
import typingsJapgolly.googlemaps.google.maps.Point
import typingsJapgolly.googlemaps.google.maps.StreetViewPanorama
import typingsJapgolly.googlemaps.google.maps.Symbol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<googlemaps.google.maps.MarkerOptions> */
trait MarkerProps extends js.Object {
  var anchorPoint: js.UndefOr[Point] = js.undefined
  var animation: js.UndefOr[Animation] = js.undefined
  var clickable: js.UndefOr[Boolean] = js.undefined
  var crossOnDrag: js.UndefOr[Boolean] = js.undefined
  var cursor: js.UndefOr[String] = js.undefined
  var draggable: js.UndefOr[Boolean] = js.undefined
  var icon: js.UndefOr[String | Icon | Symbol] = js.undefined
  var label: js.UndefOr[String | MarkerLabel] = js.undefined
  var map: js.UndefOr[typingsJapgolly.googlemaps.google.maps.Map[Element] | StreetViewPanorama] = js.undefined
  var mapCenter: js.UndefOr[LatLng | LatLngLiteral] = js.undefined
  var onClick: js.UndefOr[markerEventHandler] = js.undefined
  var onDblclick: js.UndefOr[markerEventHandler] = js.undefined
  var onDragend: js.UndefOr[markerEventHandler] = js.undefined
  var onMousedown: js.UndefOr[markerEventHandler] = js.undefined
  var onMouseout: js.UndefOr[markerEventHandler] = js.undefined
  var onMouseover: js.UndefOr[markerEventHandler] = js.undefined
  var onMouseup: js.UndefOr[markerEventHandler] = js.undefined
  var onRecenter: js.UndefOr[markerEventHandler] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
  var optimized: js.UndefOr[Boolean] = js.undefined
  var position: js.UndefOr[LatLng | LatLngLiteral] = js.undefined
  var shape: js.UndefOr[MarkerShape] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
  var zIndex: js.UndefOr[Double] = js.undefined
}

object MarkerProps {
  @scala.inline
  def apply(
    anchorPoint: Point = null,
    animation: Animation = null,
    clickable: js.UndefOr[Boolean] = js.undefined,
    crossOnDrag: js.UndefOr[Boolean] = js.undefined,
    cursor: String = null,
    draggable: js.UndefOr[Boolean] = js.undefined,
    icon: String | Icon | Symbol = null,
    label: String | MarkerLabel = null,
    map: typingsJapgolly.googlemaps.google.maps.Map[Element] | StreetViewPanorama = null,
    mapCenter: LatLng | LatLngLiteral = null,
    onClick: (/* props */ js.UndefOr[MarkerProps], /* marker */ js.UndefOr[typingsJapgolly.googlemaps.google.maps.Marker], /* event */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    onDblclick: (/* props */ js.UndefOr[MarkerProps], /* marker */ js.UndefOr[typingsJapgolly.googlemaps.google.maps.Marker], /* event */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    onDragend: (/* props */ js.UndefOr[MarkerProps], /* marker */ js.UndefOr[typingsJapgolly.googlemaps.google.maps.Marker], /* event */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    onMousedown: (/* props */ js.UndefOr[MarkerProps], /* marker */ js.UndefOr[typingsJapgolly.googlemaps.google.maps.Marker], /* event */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    onMouseout: (/* props */ js.UndefOr[MarkerProps], /* marker */ js.UndefOr[typingsJapgolly.googlemaps.google.maps.Marker], /* event */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    onMouseover: (/* props */ js.UndefOr[MarkerProps], /* marker */ js.UndefOr[typingsJapgolly.googlemaps.google.maps.Marker], /* event */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    onMouseup: (/* props */ js.UndefOr[MarkerProps], /* marker */ js.UndefOr[typingsJapgolly.googlemaps.google.maps.Marker], /* event */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    onRecenter: (/* props */ js.UndefOr[MarkerProps], /* marker */ js.UndefOr[typingsJapgolly.googlemaps.google.maps.Marker], /* event */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    opacity: Int | Double = null,
    optimized: js.UndefOr[Boolean] = js.undefined,
    position: LatLng | LatLngLiteral = null,
    shape: MarkerShape = null,
    title: String = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    zIndex: Int | Double = null
  ): MarkerProps = {
    val __obj = js.Dynamic.literal()
    if (anchorPoint != null) __obj.updateDynamic("anchorPoint")(anchorPoint.asInstanceOf[js.Any])
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (!js.isUndefined(clickable)) __obj.updateDynamic("clickable")(clickable.asInstanceOf[js.Any])
    if (!js.isUndefined(crossOnDrag)) __obj.updateDynamic("crossOnDrag")(crossOnDrag.asInstanceOf[js.Any])
    if (cursor != null) __obj.updateDynamic("cursor")(cursor.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(map.asInstanceOf[js.Any])
    if (mapCenter != null) __obj.updateDynamic("mapCenter")(mapCenter.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction3((t0: /* props */ js.UndefOr[typingsJapgolly.googleMapsReact.mod.MarkerProps], t1: /* marker */ js.UndefOr[typingsJapgolly.googlemaps.google.maps.Marker], t2: /* event */ js.UndefOr[js.Any]) => onClick(t0, t1, t2).runNow()))
    if (onDblclick != null) __obj.updateDynamic("onDblclick")(js.Any.fromFunction3((t0: /* props */ js.UndefOr[typingsJapgolly.googleMapsReact.mod.MarkerProps], t1: /* marker */ js.UndefOr[typingsJapgolly.googlemaps.google.maps.Marker], t2: /* event */ js.UndefOr[js.Any]) => onDblclick(t0, t1, t2).runNow()))
    if (onDragend != null) __obj.updateDynamic("onDragend")(js.Any.fromFunction3((t0: /* props */ js.UndefOr[typingsJapgolly.googleMapsReact.mod.MarkerProps], t1: /* marker */ js.UndefOr[typingsJapgolly.googlemaps.google.maps.Marker], t2: /* event */ js.UndefOr[js.Any]) => onDragend(t0, t1, t2).runNow()))
    if (onMousedown != null) __obj.updateDynamic("onMousedown")(js.Any.fromFunction3((t0: /* props */ js.UndefOr[typingsJapgolly.googleMapsReact.mod.MarkerProps], t1: /* marker */ js.UndefOr[typingsJapgolly.googlemaps.google.maps.Marker], t2: /* event */ js.UndefOr[js.Any]) => onMousedown(t0, t1, t2).runNow()))
    if (onMouseout != null) __obj.updateDynamic("onMouseout")(js.Any.fromFunction3((t0: /* props */ js.UndefOr[typingsJapgolly.googleMapsReact.mod.MarkerProps], t1: /* marker */ js.UndefOr[typingsJapgolly.googlemaps.google.maps.Marker], t2: /* event */ js.UndefOr[js.Any]) => onMouseout(t0, t1, t2).runNow()))
    if (onMouseover != null) __obj.updateDynamic("onMouseover")(js.Any.fromFunction3((t0: /* props */ js.UndefOr[typingsJapgolly.googleMapsReact.mod.MarkerProps], t1: /* marker */ js.UndefOr[typingsJapgolly.googlemaps.google.maps.Marker], t2: /* event */ js.UndefOr[js.Any]) => onMouseover(t0, t1, t2).runNow()))
    if (onMouseup != null) __obj.updateDynamic("onMouseup")(js.Any.fromFunction3((t0: /* props */ js.UndefOr[typingsJapgolly.googleMapsReact.mod.MarkerProps], t1: /* marker */ js.UndefOr[typingsJapgolly.googlemaps.google.maps.Marker], t2: /* event */ js.UndefOr[js.Any]) => onMouseup(t0, t1, t2).runNow()))
    if (onRecenter != null) __obj.updateDynamic("onRecenter")(js.Any.fromFunction3((t0: /* props */ js.UndefOr[typingsJapgolly.googleMapsReact.mod.MarkerProps], t1: /* marker */ js.UndefOr[typingsJapgolly.googlemaps.google.maps.Marker], t2: /* event */ js.UndefOr[js.Any]) => onRecenter(t0, t1, t2).runNow()))
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (!js.isUndefined(optimized)) __obj.updateDynamic("optimized")(optimized.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkerProps]
  }
}

