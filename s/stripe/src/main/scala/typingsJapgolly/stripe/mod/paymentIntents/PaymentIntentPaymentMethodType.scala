package typingsJapgolly.stripe.mod.paymentIntents

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Payment methods supported by Payment Intents. This is a subsetset of all Payment Method types. See https://stripe.com/docs/api/payment_methods/create#create_payment_method-type */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.stripe.stripeStrings.card
  - typingsJapgolly.stripe.stripeStrings.ideal
  - typingsJapgolly.stripe.stripeStrings.sepa_debit
*/
trait PaymentIntentPaymentMethodType extends js.Object

object PaymentIntentPaymentMethodType {
  @scala.inline
  def card: typingsJapgolly.stripe.stripeStrings.card = this.cast("card")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def ideal: typingsJapgolly.stripe.stripeStrings.ideal = this.cast("ideal")
  @scala.inline
  def sepa_debit: typingsJapgolly.stripe.stripeStrings.sepa_debit = this.cast("sepa_debit")
}

