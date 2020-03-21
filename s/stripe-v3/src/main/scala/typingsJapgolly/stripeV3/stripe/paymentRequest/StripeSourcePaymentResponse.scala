package typingsJapgolly.stripeV3.stripe.paymentRequest

import japgolly.scalajs.react.Callback
import typingsJapgolly.stripeV3.stripe.Source
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StripeSourcePaymentResponse extends StripePaymentResponse {
  var source: Source
}

object StripeSourcePaymentResponse {
  @scala.inline
  def apply(
    complete: String => Callback,
    methodName: String,
    source: Source,
    payerEmail: String = null,
    payerName: String = null,
    payerPhone: String = null,
    shippingAddress: ShippingAddress = null,
    shippingOption: ShippingOption = null
  ): StripeSourcePaymentResponse = {
    val __obj = js.Dynamic.literal(methodName = methodName.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: java.lang.String) => complete(t0).runNow()))
    if (payerEmail != null) __obj.updateDynamic("payerEmail")(payerEmail.asInstanceOf[js.Any])
    if (payerName != null) __obj.updateDynamic("payerName")(payerName.asInstanceOf[js.Any])
    if (payerPhone != null) __obj.updateDynamic("payerPhone")(payerPhone.asInstanceOf[js.Any])
    if (shippingAddress != null) __obj.updateDynamic("shippingAddress")(shippingAddress.asInstanceOf[js.Any])
    if (shippingOption != null) __obj.updateDynamic("shippingOption")(shippingOption.asInstanceOf[js.Any])
    __obj.asInstanceOf[StripeSourcePaymentResponse]
  }
}

