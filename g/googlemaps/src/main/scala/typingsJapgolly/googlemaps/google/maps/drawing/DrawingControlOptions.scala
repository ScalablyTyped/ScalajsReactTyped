package typingsJapgolly.googlemaps.google.maps.drawing

import typingsJapgolly.googlemaps.google.maps.ControlPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawingControlOptions extends js.Object {
  var drawingModes: js.UndefOr[js.Array[OverlayType]] = js.undefined
  var position: js.UndefOr[ControlPosition] = js.undefined
}

object DrawingControlOptions {
  @scala.inline
  def apply(drawingModes: js.Array[OverlayType] = null, position: ControlPosition = null): DrawingControlOptions = {
    val __obj = js.Dynamic.literal()
    if (drawingModes != null) __obj.updateDynamic("drawingModes")(drawingModes.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawingControlOptions]
  }
}

