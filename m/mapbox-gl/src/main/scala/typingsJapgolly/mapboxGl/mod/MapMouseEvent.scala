package typingsJapgolly.mapboxGl.mod

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
import typingsJapgolly.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mapbox-gl", "MapMouseEvent")
@js.native
class MapMouseEvent () extends MapboxEvent[MouseEvent] {
  var defaultPrevented: Boolean = js.native
  var lngLat: LngLat = js.native
  var point: Point = js.native
  @JSName("type")
  var type_MapMouseEvent: mousedown | mouseup | click | dblclick | mousemove | mouseover | mouseenter | mouseleave | mouseout | contextmenu = js.native
  def preventDefault(): Unit = js.native
}

