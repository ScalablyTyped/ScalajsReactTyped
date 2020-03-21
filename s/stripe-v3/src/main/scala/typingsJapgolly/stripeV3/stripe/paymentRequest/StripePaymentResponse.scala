package typingsJapgolly.stripeV3.stripe.paymentRequest

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StripePaymentResponse extends js.Object {
  var methodName: String
  var payerEmail: js.UndefOr[String] = js.undefined
  var payerName: js.UndefOr[String] = js.undefined
  var payerPhone: js.UndefOr[String] = js.undefined
  var shippingAddress: js.UndefOr[ShippingAddress] = js.undefined
  var shippingOption: js.UndefOr[ShippingOption] = js.undefined
  def complete(status: String): Unit
}

object StripePaymentResponse {
  @scala.inline
  def apply(
    complete: String => Callback,
    methodName: String,
    payerEmail: String = null,
    payerName: String = null,
    payerPhone: String = null,
    shippingAddress: ShippingAddress = null,
    shippingOption: ShippingOption = null
  ): StripePaymentResponse = {
    val __obj = js.Dynamic.literal(methodName = methodName.asInstanceOf[js.Any])
    __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: java.lang.String) => complete(t0).runNow()))
    if (payerEmail != null) __obj.updateDynamic("payerEmail")(payerEmail.asInstanceOf[js.Any])
    if (payerName != null) __obj.updateDynamic("payerName")(payerName.asInstanceOf[js.Any])
    if (payerPhone != null) __obj.updateDynamic("payerPhone")(payerPhone.asInstanceOf[js.Any])
    if (shippingAddress != null) __obj.updateDynamic("shippingAddress")(shippingAddress.asInstanceOf[js.Any])
    if (shippingOption != null) __obj.updateDynamic("shippingOption")(shippingOption.asInstanceOf[js.Any])
    __obj.asInstanceOf[StripePaymentResponse]
  }
}

