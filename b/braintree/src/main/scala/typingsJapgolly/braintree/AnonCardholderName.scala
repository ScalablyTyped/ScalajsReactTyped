package typingsJapgolly.braintree

import typingsJapgolly.braintree.mod.Commercial
import typingsJapgolly.braintree.mod.CustomerLocation
import typingsJapgolly.braintree.mod.DurbinRegulated
import typingsJapgolly.braintree.mod.HealthCare
import typingsJapgolly.braintree.mod.Payroll
import typingsJapgolly.braintree.mod.Prepaid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCardholderName extends js.Object {
  var bin: String
  var cardType: String
  var cardholderName: js.UndefOr[String] = js.undefined
  var commercial: Commercial
  var countryOfIssuance: String
  var customerLocation: CustomerLocation
  var debit: String
  var durbinRegulated: DurbinRegulated
  var expirationDate: js.UndefOr[String] = js.undefined
  var expirationMonth: js.UndefOr[String] = js.undefined
  var expirationYear: js.UndefOr[String] = js.undefined
  var healthcare: HealthCare
  var imageUrl: js.UndefOr[String] = js.undefined
  var issuingBank: String
  var last4: String
  var maskedNumber: js.UndefOr[String] = js.undefined
  var payroll: Payroll
  var prepaid: Prepaid
  var productId: String
  var token: String
  var uniqueNumberIdentifier: String
}

object AnonCardholderName {
  @scala.inline
  def apply(
    bin: String,
    cardType: String,
    commercial: Commercial,
    countryOfIssuance: String,
    customerLocation: CustomerLocation,
    debit: String,
    durbinRegulated: DurbinRegulated,
    healthcare: HealthCare,
    issuingBank: String,
    last4: String,
    payroll: Payroll,
    prepaid: Prepaid,
    productId: String,
    token: String,
    uniqueNumberIdentifier: String,
    cardholderName: String = null,
    expirationDate: String = null,
    expirationMonth: String = null,
    expirationYear: String = null,
    imageUrl: String = null,
    maskedNumber: String = null
  ): AnonCardholderName = {
    val __obj = js.Dynamic.literal(bin = bin.asInstanceOf[js.Any], cardType = cardType.asInstanceOf[js.Any], commercial = commercial.asInstanceOf[js.Any], countryOfIssuance = countryOfIssuance.asInstanceOf[js.Any], customerLocation = customerLocation.asInstanceOf[js.Any], debit = debit.asInstanceOf[js.Any], durbinRegulated = durbinRegulated.asInstanceOf[js.Any], healthcare = healthcare.asInstanceOf[js.Any], issuingBank = issuingBank.asInstanceOf[js.Any], last4 = last4.asInstanceOf[js.Any], payroll = payroll.asInstanceOf[js.Any], prepaid = prepaid.asInstanceOf[js.Any], productId = productId.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any], uniqueNumberIdentifier = uniqueNumberIdentifier.asInstanceOf[js.Any])
    if (cardholderName != null) __obj.updateDynamic("cardholderName")(cardholderName.asInstanceOf[js.Any])
    if (expirationDate != null) __obj.updateDynamic("expirationDate")(expirationDate.asInstanceOf[js.Any])
    if (expirationMonth != null) __obj.updateDynamic("expirationMonth")(expirationMonth.asInstanceOf[js.Any])
    if (expirationYear != null) __obj.updateDynamic("expirationYear")(expirationYear.asInstanceOf[js.Any])
    if (imageUrl != null) __obj.updateDynamic("imageUrl")(imageUrl.asInstanceOf[js.Any])
    if (maskedNumber != null) __obj.updateDynamic("maskedNumber")(maskedNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCardholderName]
  }
}

