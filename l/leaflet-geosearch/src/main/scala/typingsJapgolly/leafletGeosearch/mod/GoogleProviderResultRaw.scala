package typingsJapgolly.leafletGeosearch.mod

import typingsJapgolly.leafletGeosearch.AnonLocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleProviderResultRaw extends js.Object {
  var address_components: js.Array[GoogleProviderResultAddressComponent]
  var formatted_address: String
  var geometry: AnonLocation
  var place_id: String
  var types: js.Array[String]
}

object GoogleProviderResultRaw {
  @scala.inline
  def apply(
    address_components: js.Array[GoogleProviderResultAddressComponent],
    formatted_address: String,
    geometry: AnonLocation,
    place_id: String,
    types: js.Array[String]
  ): GoogleProviderResultRaw = {
    val __obj = js.Dynamic.literal(address_components = address_components.asInstanceOf[js.Any], formatted_address = formatted_address.asInstanceOf[js.Any], geometry = geometry.asInstanceOf[js.Any], place_id = place_id.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GoogleProviderResultRaw]
  }
}

