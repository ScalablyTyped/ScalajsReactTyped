package typingsJapgolly.reactGeosuggest.mod

import typingsJapgolly.googlemaps.google.maps.GeocoderResult
import typingsJapgolly.reactGeosuggest.AnonLat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Suggest extends js.Object {
  var gmaps: js.UndefOr[GeocoderResult] = js.undefined
  var label: String
  var location: AnonLat
  var placeId: String
}

object Suggest {
  @scala.inline
  def apply(label: String, location: AnonLat, placeId: String, gmaps: GeocoderResult = null): Suggest = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], placeId = placeId.asInstanceOf[js.Any])
    if (gmaps != null) __obj.updateDynamic("gmaps")(gmaps.asInstanceOf[js.Any])
    __obj.asInstanceOf[Suggest]
  }
}

