package typingsJapgolly.reactPlacesAutocomplete.mod

import typingsJapgolly.googlemaps.google.maps.GeocoderResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-places-autocomplete", "geocodeByPlaceId")
@js.native
object geocodeByPlaceId extends js.Object {
  def apply(placeId: String): js.Promise[js.Array[GeocoderResult]] = js.native
}

