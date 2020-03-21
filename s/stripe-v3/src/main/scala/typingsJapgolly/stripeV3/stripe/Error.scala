package typingsJapgolly.stripeV3.stripe

import typingsJapgolly.stripeV3.stripe.paymentIntents.PaymentIntent
import typingsJapgolly.stripeV3.stripe.paymentMethod.PaymentMethod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Error extends js.Object {
  /**
    * For card errors, the ID of the failed charge.
    */
  var charge: String
  /**
    * For some errors that could be handled programmatically,
    * a short string indicating the error code reported.
    */
  var code: js.UndefOr[String] = js.undefined
  /**
    * For card errors resulting from a card issuer decline,
    * a short string indicating the card issuer’s reason for
    * the decline if they provide one.
    */
  var decline_code: js.UndefOr[String] = js.undefined
  /**
    * A URL to more information about the error code reported.
    */
  var doc_url: js.UndefOr[String] = js.undefined
  /**
    * A human-readable message providing more details about the
    * error. For card errors, these messages can be shown to
    * your users.
    */
  var message: js.UndefOr[String] = js.undefined
  /**
    * If the error is parameter-specific, the parameter related
    * to the error. For example, you can use this to display a
    * message near the correct form field.
    */
  var param: js.UndefOr[String] = js.undefined
  /**
    * The PaymentIntent object for errors returned on a request
    * involving a PaymentIntent.
    */
  var payment_intent: js.UndefOr[PaymentIntent] = js.undefined
  /**
    * The PaymentMethod object for errors returned on a
    * request involving a PaymentMethod.
    */
  var payment_method: js.UndefOr[PaymentMethod] = js.undefined
  /**
    * The source object for errors returned on a request involving
    * a source.
    */
  var source: js.UndefOr[Source] = js.undefined
  /**
    * The type of error returned.
    */
  var `type`: ErrorType
}

object Error {
  @scala.inline
  def apply(
    charge: String,
    `type`: ErrorType,
    code: String = null,
    decline_code: String = null,
    doc_url: String = null,
    message: String = null,
    param: String = null,
    payment_intent: PaymentIntent = null,
    payment_method: PaymentMethod = null,
    source: Source = null
  ): Error = {
    val __obj = js.Dynamic.literal(charge = charge.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (decline_code != null) __obj.updateDynamic("decline_code")(decline_code.asInstanceOf[js.Any])
    if (doc_url != null) __obj.updateDynamic("doc_url")(doc_url.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (param != null) __obj.updateDynamic("param")(param.asInstanceOf[js.Any])
    if (payment_intent != null) __obj.updateDynamic("payment_intent")(payment_intent.asInstanceOf[js.Any])
    if (payment_method != null) __obj.updateDynamic("payment_method")(payment_method.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Error]
  }
}

