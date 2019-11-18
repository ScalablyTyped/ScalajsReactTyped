package typingsJapgolly.googlemaps.google.maps.drawing

import typingsJapgolly.googlemaps.google.maps.Circle
import typingsJapgolly.googlemaps.google.maps.Marker
import typingsJapgolly.googlemaps.google.maps.Polygon
import typingsJapgolly.googlemaps.google.maps.Polyline
import typingsJapgolly.googlemaps.google.maps.Rectangle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The properties of an overlaycomplete event on a DrawingManager.. */
trait OverlayCompleteEvent extends js.Object {
  /** The completed overlay. */
  var overlay: Marker | Polygon | Polyline | Rectangle | Circle
  /** The completed overlay's type. */
  var `type`: OverlayType
}

object OverlayCompleteEvent {
  @scala.inline
  def apply(overlay: Marker | Polygon | Polyline | Rectangle | Circle, `type`: OverlayType): OverlayCompleteEvent = {
    val __obj = js.Dynamic.literal(overlay = overlay.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverlayCompleteEvent]
  }
}

