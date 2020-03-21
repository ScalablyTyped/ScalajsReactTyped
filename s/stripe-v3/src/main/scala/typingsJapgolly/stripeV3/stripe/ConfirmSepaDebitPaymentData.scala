package typingsJapgolly.stripeV3.stripe

import typingsJapgolly.stripeV3.AnonSepadebit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfirmSepaDebitPaymentData extends js.Object {
  /**
    * Pass an object to confirm using data collected by an iban Element or
    * by passing data directly and to supply additional required billing
    * details:
    */
  var payment_method: js.UndefOr[String | AnonSepadebit] = js.undefined
}

object ConfirmSepaDebitPaymentData {
  @scala.inline
  def apply(payment_method: String | AnonSepadebit = null): ConfirmSepaDebitPaymentData = {
    val __obj = js.Dynamic.literal()
    if (payment_method != null) __obj.updateDynamic("payment_method")(payment_method.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfirmSepaDebitPaymentData]
  }
}

