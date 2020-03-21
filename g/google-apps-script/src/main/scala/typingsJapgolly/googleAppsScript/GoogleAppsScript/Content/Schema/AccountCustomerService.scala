package typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountCustomerService extends js.Object {
  var email: js.UndefOr[String] = js.undefined
  var phoneNumber: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object AccountCustomerService {
  @scala.inline
  def apply(email: String = null, phoneNumber: String = null, url: String = null): AccountCustomerService = {
    val __obj = js.Dynamic.literal()
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (phoneNumber != null) __obj.updateDynamic("phoneNumber")(phoneNumber.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountCustomerService]
  }
}

