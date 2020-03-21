package typingsJapgolly.googlepay.google.payments.api

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BillingAddressParameters extends js.Object {
  var format: js.UndefOr[BillingAddressFormat] = js.undefined
  var phoneNumberRequired: js.UndefOr[Boolean] = js.undefined
}

object BillingAddressParameters {
  @scala.inline
  def apply(format: BillingAddressFormat = null, phoneNumberRequired: js.UndefOr[Boolean] = js.undefined): BillingAddressParameters = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (!js.isUndefined(phoneNumberRequired)) __obj.updateDynamic("phoneNumberRequired")(phoneNumberRequired.asInstanceOf[js.Any])
    __obj.asInstanceOf[BillingAddressParameters]
  }
}

