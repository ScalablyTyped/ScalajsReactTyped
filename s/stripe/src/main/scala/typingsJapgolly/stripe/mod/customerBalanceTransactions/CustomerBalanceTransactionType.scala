package typingsJapgolly.stripe.mod.customerBalanceTransactions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.stripe.stripeStrings.adjustment
  - typingsJapgolly.stripe.stripeStrings.applied_to_invoice
  - typingsJapgolly.stripe.stripeStrings.credit_note
  - typingsJapgolly.stripe.stripeStrings.initial
  - typingsJapgolly.stripe.stripeStrings.invoice_too_large
  - typingsJapgolly.stripe.stripeStrings.invoice_too_small
  - typingsJapgolly.stripe.stripeStrings.unspent_receiver_credit
*/
trait CustomerBalanceTransactionType extends js.Object

object CustomerBalanceTransactionType {
  @scala.inline
  def adjustment: typingsJapgolly.stripe.stripeStrings.adjustment = this.cast("adjustment")
  @scala.inline
  def applied_to_invoice: typingsJapgolly.stripe.stripeStrings.applied_to_invoice = this.cast("applied_to_invoice")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def credit_note: typingsJapgolly.stripe.stripeStrings.credit_note = this.cast("credit_note")
  @scala.inline
  def initial: typingsJapgolly.stripe.stripeStrings.initial = this.cast("initial")
  @scala.inline
  def invoice_too_large: typingsJapgolly.stripe.stripeStrings.invoice_too_large = this.cast("invoice_too_large")
  @scala.inline
  def invoice_too_small: typingsJapgolly.stripe.stripeStrings.invoice_too_small = this.cast("invoice_too_small")
  @scala.inline
  def unspent_receiver_credit: typingsJapgolly.stripe.stripeStrings.unspent_receiver_credit = this.cast("unspent_receiver_credit")
}

