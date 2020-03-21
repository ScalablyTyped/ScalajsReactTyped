package typingsJapgolly.mapboxGl.mod

import typingsJapgolly.mapboxGl.mapboxGlStrings.boxzoomcancel
import typingsJapgolly.mapboxGl.mapboxGlStrings.boxzoomend
import typingsJapgolly.mapboxGl.mapboxGlStrings.boxzoomstart
import typingsJapgolly.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapBoxZoomEvent extends MapboxEvent[MouseEvent] {
  var boxZoomBounds: LngLatBounds = js.native
  @JSName("type")
  var type_MapBoxZoomEvent: boxzoomstart | boxzoomend | boxzoomcancel = js.native
}

