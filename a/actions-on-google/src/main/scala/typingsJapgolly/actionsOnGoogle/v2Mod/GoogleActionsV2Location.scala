package typingsJapgolly.actionsOnGoogle.v2Mod

import typingsJapgolly.actionsOnGoogle.argumentArgumentMod._Argument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsV2Location extends _Argument {
  /**
    * City.
    * Requires the DEVICE_PRECISE_LOCATION or
    * DEVICE_COARSE_LOCATION permission.
    */
  var city: js.UndefOr[String] = js.undefined
  /**
    * Geo coordinates.
    * Requires the DEVICE_PRECISE_LOCATION permission.
    */
  var coordinates: js.UndefOr[GoogleTypeLatLng] = js.undefined
  /**
    * Display address, e.g., \"1600 Amphitheatre Pkwy, Mountain View, CA 94043\".
    * Requires the DEVICE_PRECISE_LOCATION permission.
    */
  var formattedAddress: js.UndefOr[String] = js.undefined
  /**
    * Name of the place.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Notes about the location.
    */
  var notes: js.UndefOr[String] = js.undefined
  /**
    * Phone number of the location, e.g. contact number of business location or
    * phone number for delivery location.
    */
  var phoneNumber: js.UndefOr[String] = js.undefined
  /**
    * place_id is used with Places API to fetch details of a place.
    * See https://developers.google.com/places/web-service/place-id
    */
  var placeId: js.UndefOr[String] = js.undefined
  /**
    * Postal address.
    * Requires the DEVICE_PRECISE_LOCATION or
    * DEVICE_COARSE_LOCATION permission.
    */
  var postalAddress: js.UndefOr[GoogleTypePostalAddress] = js.undefined
  /**
    * Zip code.
    * Requires the DEVICE_PRECISE_LOCATION or
    * DEVICE_COARSE_LOCATION permission.
    */
  var zipCode: js.UndefOr[String] = js.undefined
}

object GoogleActionsV2Location {
  @scala.inline
  def apply(
    city: String = null,
    coordinates: GoogleTypeLatLng = null,
    formattedAddress: String = null,
    name: String = null,
    notes: String = null,
    phoneNumber: String = null,
    placeId: String = null,
    postalAddress: GoogleTypePostalAddress = null,
    zipCode: String = null
  ): GoogleActionsV2Location = {
    val __obj = js.Dynamic.literal()
    if (city != null) __obj.updateDynamic("city")(city.asInstanceOf[js.Any])
    if (coordinates != null) __obj.updateDynamic("coordinates")(coordinates.asInstanceOf[js.Any])
    if (formattedAddress != null) __obj.updateDynamic("formattedAddress")(formattedAddress.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (notes != null) __obj.updateDynamic("notes")(notes.asInstanceOf[js.Any])
    if (phoneNumber != null) __obj.updateDynamic("phoneNumber")(phoneNumber.asInstanceOf[js.Any])
    if (placeId != null) __obj.updateDynamic("placeId")(placeId.asInstanceOf[js.Any])
    if (postalAddress != null) __obj.updateDynamic("postalAddress")(postalAddress.asInstanceOf[js.Any])
    if (zipCode != null) __obj.updateDynamic("zipCode")(zipCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleActionsV2Location]
  }
}

