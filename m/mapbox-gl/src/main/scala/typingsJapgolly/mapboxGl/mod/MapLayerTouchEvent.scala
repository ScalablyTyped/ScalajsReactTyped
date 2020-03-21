package typingsJapgolly.mapboxGl.mod

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.TouchEvent
import typingsJapgolly.mapboxGl.mapboxGlStrings.touchcancel
import typingsJapgolly.mapboxGl.mapboxGlStrings.touchend
import typingsJapgolly.mapboxGl.mapboxGlStrings.touchstart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined mapbox-gl.mapbox-gl.MapTouchEvent & {  features ? :std.Array<mapbox-gl.mapbox-gl.MapboxGeoJSONFeature>} */
trait MapLayerTouchEvent extends js.Object {
  var defaultPrevented: Boolean
  var features: js.UndefOr[js.Array[MapboxGeoJSONFeature]] = js.undefined
  var lngLat: LngLat
  var lngLats: js.Array[LngLat]
  var originalEvent: TouchEvent
  var point: Point
  var points: js.Array[Point]
  var target: Map
  var `type`: touchstart | touchend | touchcancel
  def preventDefault(): Unit
}

object MapLayerTouchEvent {
  @scala.inline
  def apply(
    defaultPrevented: Boolean,
    lngLat: LngLat,
    lngLats: js.Array[LngLat],
    originalEvent: TouchEvent,
    point: Point,
    points: js.Array[Point],
    preventDefault: Callback,
    target: Map,
    `type`: touchstart | touchend | touchcancel,
    features: js.Array[MapboxGeoJSONFeature] = null
  ): MapLayerTouchEvent = {
    val __obj = js.Dynamic.literal(defaultPrevented = defaultPrevented.asInstanceOf[js.Any], lngLat = lngLat.asInstanceOf[js.Any], lngLats = lngLats.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("preventDefault")(preventDefault.toJsFn)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (features != null) __obj.updateDynamic("features")(features.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapLayerTouchEvent]
  }
}

