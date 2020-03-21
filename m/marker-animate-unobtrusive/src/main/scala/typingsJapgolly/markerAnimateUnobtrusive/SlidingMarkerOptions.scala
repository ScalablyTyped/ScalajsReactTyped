package typingsJapgolly.markerAnimateUnobtrusive

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.Element
import typingsJapgolly.googlemaps.google.maps.Animation
import typingsJapgolly.googlemaps.google.maps.Icon
import typingsJapgolly.googlemaps.google.maps.LatLng
import typingsJapgolly.googlemaps.google.maps.LatLngLiteral
import typingsJapgolly.googlemaps.google.maps.Map
import typingsJapgolly.googlemaps.google.maps.Marker
import typingsJapgolly.googlemaps.google.maps.MarkerLabel
import typingsJapgolly.googlemaps.google.maps.MarkerOptions
import typingsJapgolly.googlemaps.google.maps.MarkerShape
import typingsJapgolly.googlemaps.google.maps.Point
import typingsJapgolly.googlemaps.google.maps.StreetViewPanorama
import typingsJapgolly.googlemaps.google.maps.Symbol
import typingsJapgolly.markerAnimateUnobtrusive.jQuery.easing.IEasingType
import typingsJapgolly.markerAnimateUnobtrusive.markerAnimateUnobtrusiveStrings.linear
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SlidingMarkerOptions extends MarkerOptions {
  var animateFunctionAdapter: js.UndefOr[
    js.Function4[
      /* marker */ Marker, 
      /* destPoint */ LatLng, 
      /* easing */ linear | IEasingType, 
      /* duration */ Double, 
      Unit
    ]
  ] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
  var easing: js.UndefOr[IEasingType] = js.undefined
}

object SlidingMarkerOptions {
  @scala.inline
  def apply(
    anchorPoint: Point = null,
    animateFunctionAdapter: (/* marker */ Marker, /* destPoint */ LatLng, /* easing */ linear | IEasingType, /* duration */ Double) => Callback = null,
    animation: Animation = null,
    clickable: js.UndefOr[Boolean] = js.undefined,
    crossOnDrag: js.UndefOr[Boolean] = js.undefined,
    cursor: String = null,
    draggable: js.UndefOr[Boolean] = js.undefined,
    duration: Int | Double = null,
    easing: IEasingType = null,
    icon: String | Icon | Symbol = null,
    label: String | MarkerLabel = null,
    map: Map[Element] | StreetViewPanorama = null,
    opacity: Int | Double = null,
    optimized: js.UndefOr[Boolean] = js.undefined,
    position: LatLng | LatLngLiteral = null,
    shape: MarkerShape = null,
    title: String = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    zIndex: Int | Double = null
  ): SlidingMarkerOptions = {
    val __obj = js.Dynamic.literal()
    if (anchorPoint != null) __obj.updateDynamic("anchorPoint")(anchorPoint.asInstanceOf[js.Any])
    if (animateFunctionAdapter != null) __obj.updateDynamic("animateFunctionAdapter")(js.Any.fromFunction4((t0: /* marker */ typingsJapgolly.googlemaps.google.maps.Marker, t1: /* destPoint */ typingsJapgolly.googlemaps.google.maps.LatLng, t2: /* easing */ typingsJapgolly.markerAnimateUnobtrusive.markerAnimateUnobtrusiveStrings.linear | typingsJapgolly.markerAnimateUnobtrusive.jQuery.easing.IEasingType, t3: /* duration */ scala.Double) => animateFunctionAdapter(t0, t1, t2, t3).runNow()))
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (!js.isUndefined(clickable)) __obj.updateDynamic("clickable")(clickable.asInstanceOf[js.Any])
    if (!js.isUndefined(crossOnDrag)) __obj.updateDynamic("crossOnDrag")(crossOnDrag.asInstanceOf[js.Any])
    if (cursor != null) __obj.updateDynamic("cursor")(cursor.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(map.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (!js.isUndefined(optimized)) __obj.updateDynamic("optimized")(optimized.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlidingMarkerOptions]
  }
}

