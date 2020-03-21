package typingsJapgolly.reactStripeElements.mod.ReactStripeElements

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// From https://stripe.com/docs/stripe-js/reference#element-types
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.reactStripeElements.reactStripeElementsStrings.card
  - typingsJapgolly.reactStripeElements.reactStripeElementsStrings.cardNumber
  - typingsJapgolly.reactStripeElements.reactStripeElementsStrings.cardExpiry
  - typingsJapgolly.reactStripeElements.reactStripeElementsStrings.cardCvc
  - typingsJapgolly.reactStripeElements.reactStripeElementsStrings.paymentRequestButton
  - typingsJapgolly.reactStripeElements.reactStripeElementsStrings.iban
  - typingsJapgolly.reactStripeElements.reactStripeElementsStrings.idealBank
*/
trait TokenType extends js.Object

object TokenType {
  @scala.inline
  def card: typingsJapgolly.reactStripeElements.reactStripeElementsStrings.card = this.cast("card")
  @scala.inline
  def cardCvc: typingsJapgolly.reactStripeElements.reactStripeElementsStrings.cardCvc = this.cast("cardCvc")
  @scala.inline
  def cardExpiry: typingsJapgolly.reactStripeElements.reactStripeElementsStrings.cardExpiry = this.cast("cardExpiry")
  @scala.inline
  def cardNumber: typingsJapgolly.reactStripeElements.reactStripeElementsStrings.cardNumber = this.cast("cardNumber")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def iban: typingsJapgolly.reactStripeElements.reactStripeElementsStrings.iban = this.cast("iban")
  @scala.inline
  def idealBank: typingsJapgolly.reactStripeElements.reactStripeElementsStrings.idealBank = this.cast("idealBank")
  @scala.inline
  def paymentRequestButton: typingsJapgolly.reactStripeElements.reactStripeElementsStrings.paymentRequestButton = this.cast("paymentRequestButton")
}

