package typingsJapgolly.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomerPostalAddress extends js.Object {
  var addressLine1: js.UndefOr[String] = js.undefined
  var addressLine2: js.UndefOr[String] = js.undefined
  var addressLine3: js.UndefOr[String] = js.undefined
  var contactName: js.UndefOr[String] = js.undefined
  var countryCode: js.UndefOr[String] = js.undefined
  var locality: js.UndefOr[String] = js.undefined
  var organizationName: js.UndefOr[String] = js.undefined
  var postalCode: js.UndefOr[String] = js.undefined
  var region: js.UndefOr[String] = js.undefined
}

object CustomerPostalAddress {
  @scala.inline
  def apply(
    addressLine1: String = null,
    addressLine2: String = null,
    addressLine3: String = null,
    contactName: String = null,
    countryCode: String = null,
    locality: String = null,
    organizationName: String = null,
    postalCode: String = null,
    region: String = null
  ): CustomerPostalAddress = {
    val __obj = js.Dynamic.literal()
    if (addressLine1 != null) __obj.updateDynamic("addressLine1")(addressLine1.asInstanceOf[js.Any])
    if (addressLine2 != null) __obj.updateDynamic("addressLine2")(addressLine2.asInstanceOf[js.Any])
    if (addressLine3 != null) __obj.updateDynamic("addressLine3")(addressLine3.asInstanceOf[js.Any])
    if (contactName != null) __obj.updateDynamic("contactName")(contactName.asInstanceOf[js.Any])
    if (countryCode != null) __obj.updateDynamic("countryCode")(countryCode.asInstanceOf[js.Any])
    if (locality != null) __obj.updateDynamic("locality")(locality.asInstanceOf[js.Any])
    if (organizationName != null) __obj.updateDynamic("organizationName")(organizationName.asInstanceOf[js.Any])
    if (postalCode != null) __obj.updateDynamic("postalCode")(postalCode.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomerPostalAddress]
  }
}

