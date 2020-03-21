package typingsJapgolly.braintree

import typingsJapgolly.braintree.mod.Commercial
import typingsJapgolly.braintree.mod.Debit
import typingsJapgolly.braintree.mod.DurbinRegulated
import typingsJapgolly.braintree.mod.HealthCare
import typingsJapgolly.braintree.mod.Payroll
import typingsJapgolly.braintree.mod.Prepaid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCardType extends js.Object {
  var bin: String
  var cardType: String
  var cardholderName: String
  var commercial: Commercial
  var countryOfIssuance: String
  var debit: Debit
  var durbinRegulated: DurbinRegulated
  var expirationMonth: String
  var expirationYear: String
  var healthcare: HealthCare
  var imageUrl: String
  var issuingBank: String
  var last4: String
  var paymentInsuranceName: String
  var payroll: Payroll
  var prepaid: Prepaid
  var productId: String
  var sourceDescription: String
  var token: String
}

object AnonCardType {
  @scala.inline
  def apply(
    bin: String,
    cardType: String,
    cardholderName: String,
    commercial: Commercial,
    countryOfIssuance: String,
    debit: Debit,
    durbinRegulated: DurbinRegulated,
    expirationMonth: String,
    expirationYear: String,
    healthcare: HealthCare,
    imageUrl: String,
    issuingBank: String,
    last4: String,
    paymentInsuranceName: String,
    payroll: Payroll,
    prepaid: Prepaid,
    productId: String,
    sourceDescription: String,
    token: String
  ): AnonCardType = {
    val __obj = js.Dynamic.literal(bin = bin.asInstanceOf[js.Any], cardType = cardType.asInstanceOf[js.Any], cardholderName = cardholderName.asInstanceOf[js.Any], commercial = commercial.asInstanceOf[js.Any], countryOfIssuance = countryOfIssuance.asInstanceOf[js.Any], debit = debit.asInstanceOf[js.Any], durbinRegulated = durbinRegulated.asInstanceOf[js.Any], expirationMonth = expirationMonth.asInstanceOf[js.Any], expirationYear = expirationYear.asInstanceOf[js.Any], healthcare = healthcare.asInstanceOf[js.Any], imageUrl = imageUrl.asInstanceOf[js.Any], issuingBank = issuingBank.asInstanceOf[js.Any], last4 = last4.asInstanceOf[js.Any], paymentInsuranceName = paymentInsuranceName.asInstanceOf[js.Any], payroll = payroll.asInstanceOf[js.Any], prepaid = prepaid.asInstanceOf[js.Any], productId = productId.asInstanceOf[js.Any], sourceDescription = sourceDescription.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCardType]
  }
}

