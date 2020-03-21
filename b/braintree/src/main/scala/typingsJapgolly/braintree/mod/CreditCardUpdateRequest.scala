package typingsJapgolly.braintree.mod

import typingsJapgolly.braintree.AnonCountryCodeAlpha2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreditCardUpdateRequest extends js.Object {
  var billingAddress: js.UndefOr[AnonCountryCodeAlpha2] = js.undefined
  var cardholderName: js.UndefOr[String] = js.undefined
  var cvv: js.UndefOr[String] = js.undefined
  var expirationDate: js.UndefOr[String] = js.undefined
  var expirationMonth: js.UndefOr[String] = js.undefined
  var expirationYear: js.UndefOr[String] = js.undefined
  var number: js.UndefOr[String] = js.undefined
}

object CreditCardUpdateRequest {
  @scala.inline
  def apply(
    billingAddress: AnonCountryCodeAlpha2 = null,
    cardholderName: String = null,
    cvv: String = null,
    expirationDate: String = null,
    expirationMonth: String = null,
    expirationYear: String = null,
    number: String = null
  ): CreditCardUpdateRequest = {
    val __obj = js.Dynamic.literal()
    if (billingAddress != null) __obj.updateDynamic("billingAddress")(billingAddress.asInstanceOf[js.Any])
    if (cardholderName != null) __obj.updateDynamic("cardholderName")(cardholderName.asInstanceOf[js.Any])
    if (cvv != null) __obj.updateDynamic("cvv")(cvv.asInstanceOf[js.Any])
    if (expirationDate != null) __obj.updateDynamic("expirationDate")(expirationDate.asInstanceOf[js.Any])
    if (expirationMonth != null) __obj.updateDynamic("expirationMonth")(expirationMonth.asInstanceOf[js.Any])
    if (expirationYear != null) __obj.updateDynamic("expirationYear")(expirationYear.asInstanceOf[js.Any])
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreditCardUpdateRequest]
  }
}

