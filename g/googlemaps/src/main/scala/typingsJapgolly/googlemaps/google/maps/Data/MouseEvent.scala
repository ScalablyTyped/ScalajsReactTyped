package typingsJapgolly.googlemaps.google.maps.Data

import japgolly.scalajs.react.Callback
import typingsJapgolly.googlemaps.google.maps.LatLng
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line:no-unnecessary-qualifier
trait MouseEvent
  extends typingsJapgolly.googlemaps.google.maps.MouseEvent {
  var feature: Feature
}

object MouseEvent {
  @scala.inline
  def apply(feature: Feature, latLng: LatLng, stop: Callback): MouseEvent = {
    val __obj = js.Dynamic.literal(feature = feature.asInstanceOf[js.Any], latLng = latLng.asInstanceOf[js.Any])
    __obj.updateDynamic("stop")(stop.toJsFn)
    __obj.asInstanceOf[MouseEvent]
  }
}

