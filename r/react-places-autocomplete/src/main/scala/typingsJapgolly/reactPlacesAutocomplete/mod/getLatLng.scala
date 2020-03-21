package typingsJapgolly.reactPlacesAutocomplete.mod

import typingsJapgolly.googlemaps.google.maps.GeocoderResult
import typingsJapgolly.googlemaps.google.maps.LatLngLiteral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-places-autocomplete", "getLatLng")
@js.native
object getLatLng extends js.Object {
  def apply(results: GeocoderResult): js.Promise[LatLngLiteral] = js.native
}

