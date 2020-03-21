package typingsJapgolly.braintreeWebDropIn

import typingsJapgolly.braintreeWebDropIn.braintreeWebDropInStrings.card
import typingsJapgolly.braintreeWebDropIn.braintreeWebDropInStrings.paypal
import typingsJapgolly.braintreeWebDropIn.braintreeWebDropInStrings.paypalCredit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPaymentOption extends js.Object {
  var paymentOption: card | paypal | paypalCredit
}

object AnonPaymentOption {
  @scala.inline
  def apply(paymentOption: card | paypal | paypalCredit): AnonPaymentOption = {
    val __obj = js.Dynamic.literal(paymentOption = paymentOption.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPaymentOption]
  }
}

