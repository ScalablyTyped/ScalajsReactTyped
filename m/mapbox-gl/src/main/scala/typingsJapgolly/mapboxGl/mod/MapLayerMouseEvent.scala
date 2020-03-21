package typingsJapgolly.mapboxGl.mod

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.MouseEvent
import typingsJapgolly.mapboxGl.mapboxGlStrings.click
import typingsJapgolly.mapboxGl.mapboxGlStrings.contextmenu
import typingsJapgolly.mapboxGl.mapboxGlStrings.dblclick
import typingsJapgolly.mapboxGl.mapboxGlStrings.mousedown
import typingsJapgolly.mapboxGl.mapboxGlStrings.mouseenter
import typingsJapgolly.mapboxGl.mapboxGlStrings.mouseleave
import typingsJapgolly.mapboxGl.mapboxGlStrings.mousemove
import typingsJapgolly.mapboxGl.mapboxGlStrings.mouseout
import typingsJapgolly.mapboxGl.mapboxGlStrings.mouseover
import typingsJapgolly.mapboxGl.mapboxGlStrings.mouseup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined mapbox-gl.mapbox-gl.MapMouseEvent & {  features ? :std.Array<mapbox-gl.mapbox-gl.MapboxGeoJSONFeature>} */
trait MapLayerMouseEvent extends js.Object {
  var defaultPrevented: Boolean
  var features: js.UndefOr[js.Array[MapboxGeoJSONFeature]] = js.undefined
  var lngLat: LngLat
  var originalEvent: MouseEvent
  var point: Point
  var target: Map
  var `type`: mousedown | mouseup | click | dblclick | mousemove | mouseover | mouseenter | mouseleave | mouseout | contextmenu
  def preventDefault(): Unit
}

object MapLayerMouseEvent {
  @scala.inline
  def apply(
    defaultPrevented: Boolean,
    lngLat: LngLat,
    originalEvent: MouseEvent,
    point: Point,
    preventDefault: Callback,
    target: Map,
    `type`: mousedown | mouseup | click | dblclick | mousemove | mouseover | mouseenter | mouseleave | mouseout | contextmenu,
    features: js.Array[MapboxGeoJSONFeature] = null
  ): MapLayerMouseEvent = {
    val __obj = js.Dynamic.literal(defaultPrevented = defaultPrevented.asInstanceOf[js.Any], lngLat = lngLat.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("preventDefault")(preventDefault.toJsFn)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (features != null) __obj.updateDynamic("features")(features.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapLayerMouseEvent]
  }
}

