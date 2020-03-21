package typingsJapgolly.googleapis.civicinfoV2Mod.civicinfoV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A simple representation of an address.
  */
@js.native
trait SchemaSimpleAddressType extends js.Object {
  /**
    * The city or town for the address.
    */
  var city: js.UndefOr[String] = js.native
  /**
    * The street name and number of this address.
    */
  var line1: js.UndefOr[String] = js.native
  /**
    * The second line the address, if needed.
    */
  var line2: js.UndefOr[String] = js.native
  /**
    * The third line of the address, if needed.
    */
  var line3: js.UndefOr[String] = js.native
  /**
    * The name of the location.
    */
  var locationName: js.UndefOr[String] = js.native
  /**
    * The US two letter state abbreviation of the address.
    */
  var state: js.UndefOr[String] = js.native
  /**
    * The US Postal Zip Code of the address.
    */
  var zip: js.UndefOr[String] = js.native
}

object SchemaSimpleAddressType {
  @scala.inline
  def apply(
    city: String = null,
    line1: String = null,
    line2: String = null,
    line3: String = null,
    locationName: String = null,
    state: String = null,
    zip: String = null
  ): SchemaSimpleAddressType = {
    val __obj = js.Dynamic.literal()
    if (city != null) __obj.updateDynamic("city")(city.asInstanceOf[js.Any])
    if (line1 != null) __obj.updateDynamic("line1")(line1.asInstanceOf[js.Any])
    if (line2 != null) __obj.updateDynamic("line2")(line2.asInstanceOf[js.Any])
    if (line3 != null) __obj.updateDynamic("line3")(line3.asInstanceOf[js.Any])
    if (locationName != null) __obj.updateDynamic("locationName")(locationName.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (zip != null) __obj.updateDynamic("zip")(zip.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSimpleAddressType]
  }
}

