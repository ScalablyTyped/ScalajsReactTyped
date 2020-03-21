package typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountBusinessInformation extends js.Object {
  var address: js.UndefOr[AccountAddress] = js.undefined
  var customerService: js.UndefOr[AccountCustomerService] = js.undefined
  var phoneNumber: js.UndefOr[String] = js.undefined
}

object AccountBusinessInformation {
  @scala.inline
  def apply(
    address: AccountAddress = null,
    customerService: AccountCustomerService = null,
    phoneNumber: String = null
  ): AccountBusinessInformation = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (customerService != null) __obj.updateDynamic("customerService")(customerService.asInstanceOf[js.Any])
    if (phoneNumber != null) __obj.updateDynamic("phoneNumber")(phoneNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountBusinessInformation]
  }
}

