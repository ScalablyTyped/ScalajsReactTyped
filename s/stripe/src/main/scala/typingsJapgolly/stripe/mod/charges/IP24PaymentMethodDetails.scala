package typingsJapgolly.stripe.mod.charges

import typingsJapgolly.stripe.stripeStrings.p24
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IP24PaymentMethodDetails extends IPaymentMethodDetails {
  var `type`: p24
}

object IP24PaymentMethodDetails {
  @scala.inline
  def apply(`type`: p24): IP24PaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IP24PaymentMethodDetails]
  }
}

