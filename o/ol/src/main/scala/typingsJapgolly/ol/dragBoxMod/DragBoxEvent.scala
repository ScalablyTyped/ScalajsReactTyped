package typingsJapgolly.ol.dragBoxMod

import typingsJapgolly.ol.coordinateMod.Coordinate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/interaction/DragBox", "DragBoxEvent")
@js.native
class DragBoxEvent protected ()
  extends typingsJapgolly.ol.eventMod.default {
  def this(
    `type`: String,
    coordinate: Coordinate,
    mapBrowserEvent: typingsJapgolly.ol.mapBrowserEventMod.default
  ) = this()
  var coordinate: Coordinate = js.native
  var mapBrowserEvent: typingsJapgolly.ol.mapBrowserEventMod.default = js.native
}

