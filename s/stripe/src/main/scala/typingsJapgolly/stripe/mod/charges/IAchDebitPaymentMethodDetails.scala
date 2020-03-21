package typingsJapgolly.stripe.mod.charges

import typingsJapgolly.stripe.stripeStrings.ach_debit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAchDebitPaymentMethodDetails extends IPaymentMethodDetails {
  var `type`: ach_debit
}

object IAchDebitPaymentMethodDetails {
  @scala.inline
  def apply(`type`: ach_debit): IAchDebitPaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAchDebitPaymentMethodDetails]
  }
}

