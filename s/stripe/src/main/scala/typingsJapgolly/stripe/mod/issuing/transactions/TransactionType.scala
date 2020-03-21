package typingsJapgolly.stripe.mod.issuing.transactions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.stripe.stripeStrings.capture
  - typingsJapgolly.stripe.stripeStrings.refund
  - typingsJapgolly.stripe.stripeStrings.cash_withdrawal
  - typingsJapgolly.stripe.stripeStrings.refund_reversal
  - typingsJapgolly.stripe.stripeStrings.dispute
  - typingsJapgolly.stripe.stripeStrings.dispute_loss
*/
trait TransactionType extends js.Object

object TransactionType {
  @scala.inline
  def capture: typingsJapgolly.stripe.stripeStrings.capture = this.cast("capture")
  @scala.inline
  def cash_withdrawal: typingsJapgolly.stripe.stripeStrings.cash_withdrawal = this.cast("cash_withdrawal")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def dispute: typingsJapgolly.stripe.stripeStrings.dispute = this.cast("dispute")
  @scala.inline
  def dispute_loss: typingsJapgolly.stripe.stripeStrings.dispute_loss = this.cast("dispute_loss")
  @scala.inline
  def refund: typingsJapgolly.stripe.stripeStrings.refund = this.cast("refund")
  @scala.inline
  def refund_reversal: typingsJapgolly.stripe.stripeStrings.refund_reversal = this.cast("refund_reversal")
}

