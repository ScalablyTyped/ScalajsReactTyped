package typingsJapgolly.braintree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.braintree.braintreeStrings.transaction_disbursed
  - typingsJapgolly.braintree.braintreeStrings.transaction_settled
  - typingsJapgolly.braintree.braintreeStrings.transaction_settlement_declined
*/
trait TransactionNotificationKind extends _WebhookNotificationKind

object TransactionNotificationKind {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def transaction_disbursed: typingsJapgolly.braintree.braintreeStrings.transaction_disbursed = this.cast("transaction_disbursed")
  @scala.inline
  def transaction_settled: typingsJapgolly.braintree.braintreeStrings.transaction_settled = this.cast("transaction_settled")
  @scala.inline
  def transaction_settlement_declined: typingsJapgolly.braintree.braintreeStrings.transaction_settlement_declined = this.cast("transaction_settlement_declined")
}

