package typingsJapgolly.mapboxGl.mod

import typingsJapgolly.mapboxGl.mapboxGlStrings.wheel
import typingsJapgolly.std.WheelEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mapbox-gl", "MapWheelEvent")
@js.native
class MapWheelEvent () extends MapboxEvent[WheelEvent] {
  var defaultPrevented: Boolean = js.native
  @JSName("type")
  var type_MapWheelEvent: wheel = js.native
  def preventDefault(): Unit = js.native
}

