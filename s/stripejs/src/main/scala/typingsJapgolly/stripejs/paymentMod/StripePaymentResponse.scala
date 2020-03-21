package typingsJapgolly.stripejs.paymentMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.stripejs.shippingMod.ShippingAddress
import typingsJapgolly.stripejs.shippingMod.ShippingOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StripePaymentResponse extends js.Object {
  /**
    * The unique name of the payment handler the customer chose to authorize payment
    * @example 'basic-card'
    */
  val methodName: String
  val payerEmail: js.UndefOr[String] = js.undefined
  /**
    * Information about the payer
    * NOTE: This is only set if the corresponding field was set to `true` in the `PaymentOptions`
    *
    * @see PaymentOptions.requestPayerName
    * @see PaymentOptions.requestPayerEmail
    * @see PaymentOptions.requestPayerPhone
    */
  val payerName: js.UndefOr[String] = js.undefined
  val payerPhone: js.UndefOr[String] = js.undefined
  /**
    * The shipping address the payer selected
    */
  val shippingAddress: ShippingAddress
  /**
    * The shipping option the payer selected
    */
  val shippingOption: ShippingOption
  /**
    * NOTE: Only available when the event type 'source' was used
    */
  val source: js.UndefOr[js.Any] = js.undefined
  /**
    * NOTE: Only available when the event type 'token' was used
    */
  val token: js.UndefOr[js.Any] = js.undefined
  /**
    * A function to complete the payment and give feedback to the user
    * Call this when you have processed the token data provided by the API
    *
    * @param status - The status that should be shown to the user
    */
  def complete(status: completeStatus): Unit
}

object StripePaymentResponse {
  @scala.inline
  def apply(
    complete: completeStatus => Callback,
    methodName: String,
    shippingAddress: ShippingAddress,
    shippingOption: ShippingOption,
    payerEmail: String = null,
    payerName: String = null,
    payerPhone: String = null,
    source: js.Any = null,
    token: js.Any = null
  ): StripePaymentResponse = {
    val __obj = js.Dynamic.literal(methodName = methodName.asInstanceOf[js.Any], shippingAddress = shippingAddress.asInstanceOf[js.Any], shippingOption = shippingOption.asInstanceOf[js.Any])
    __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: typingsJapgolly.stripejs.paymentMod.completeStatus) => complete(t0).runNow()))
    if (payerEmail != null) __obj.updateDynamic("payerEmail")(payerEmail.asInstanceOf[js.Any])
    if (payerName != null) __obj.updateDynamic("payerName")(payerName.asInstanceOf[js.Any])
    if (payerPhone != null) __obj.updateDynamic("payerPhone")(payerPhone.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (token != null) __obj.updateDynamic("token")(token.asInstanceOf[js.Any])
    __obj.asInstanceOf[StripePaymentResponse]
  }
}

