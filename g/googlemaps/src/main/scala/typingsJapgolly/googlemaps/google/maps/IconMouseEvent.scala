package typingsJapgolly.googlemaps.google.maps

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This object is sent in an event when a user clicks on an icon on the map.
  * The place ID of this place is stored in the placeId member.
  * To prevent the default info window from showing up, call the stop() method
  * on this event to prevent it being propagated. Learn more about place IDs in
  * the Places API developer guide.
  */
trait IconMouseEvent extends MouseEvent {
  /**
    * The place ID of the place that was clicked.
    * This place ID can be used to query more information about the feature
    * that was clicked.
    */
  var placeId: String
}

object IconMouseEvent {
  @scala.inline
  def apply(latLng: LatLng, placeId: String, stop: Callback): IconMouseEvent = {
    val __obj = js.Dynamic.literal(latLng = latLng.asInstanceOf[js.Any], placeId = placeId.asInstanceOf[js.Any])
    __obj.updateDynamic("stop")(stop.toJsFn)
    __obj.asInstanceOf[IconMouseEvent]
  }
}

