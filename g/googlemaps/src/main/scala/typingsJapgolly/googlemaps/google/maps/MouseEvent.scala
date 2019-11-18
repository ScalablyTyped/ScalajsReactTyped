package typingsJapgolly.googlemaps.google.maps

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This object is returned from various mouse events on the map and overlays,
  * and contains all the fields shown below.
  */
trait MouseEvent extends js.Object {
  /**
    * The latitude/longitude that was below the cursor when the event
    * occurred.
    */
  var latLng: LatLng
  /** Prevents this event from propagating further. */
  def stop(): Unit
}

object MouseEvent {
  @scala.inline
  def apply(latLng: LatLng, stop: Callback): MouseEvent = {
    val __obj = js.Dynamic.literal(latLng = latLng.asInstanceOf[js.Any])
    __obj.updateDynamic("stop")(stop.toJsFn)
    __obj.asInstanceOf[MouseEvent]
  }
}

