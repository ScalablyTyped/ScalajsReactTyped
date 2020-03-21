package typingsJapgolly.braintree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.braintree.braintreeStrings.authorization_expired
  - typingsJapgolly.braintree.braintreeStrings.authorized
  - typingsJapgolly.braintree.braintreeStrings.authorizing
  - typingsJapgolly.braintree.braintreeStrings.settlement_pending
  - typingsJapgolly.braintree.braintreeStrings.settlement_declined
  - typingsJapgolly.braintree.braintreeStrings.failed
  - typingsJapgolly.braintree.braintreeStrings.gateway_rejected
  - typingsJapgolly.braintree.braintreeStrings.processor_declined
  - typingsJapgolly.braintree.braintreeStrings.settled
  - typingsJapgolly.braintree.braintreeStrings.settling
  - typingsJapgolly.braintree.braintreeStrings.submitted_for_settlement
  - typingsJapgolly.braintree.braintreeStrings.voided
*/
trait TransactionStatus extends js.Object

object TransactionStatus {
  @scala.inline
  def authorization_expired: typingsJapgolly.braintree.braintreeStrings.authorization_expired = this.cast("authorization_expired")
  @scala.inline
  def authorized: typingsJapgolly.braintree.braintreeStrings.authorized = this.cast("authorized")
  @scala.inline
  def authorizing: typingsJapgolly.braintree.braintreeStrings.authorizing = this.cast("authorizing")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def failed: typingsJapgolly.braintree.braintreeStrings.failed = this.cast("failed")
  @scala.inline
  def gateway_rejected: typingsJapgolly.braintree.braintreeStrings.gateway_rejected = this.cast("gateway_rejected")
  @scala.inline
  def processor_declined: typingsJapgolly.braintree.braintreeStrings.processor_declined = this.cast("processor_declined")
  @scala.inline
  def settled: typingsJapgolly.braintree.braintreeStrings.settled = this.cast("settled")
  @scala.inline
  def settlement_declined: typingsJapgolly.braintree.braintreeStrings.settlement_declined = this.cast("settlement_declined")
  @scala.inline
  def settlement_pending: typingsJapgolly.braintree.braintreeStrings.settlement_pending = this.cast("settlement_pending")
  @scala.inline
  def settling: typingsJapgolly.braintree.braintreeStrings.settling = this.cast("settling")
  @scala.inline
  def submitted_for_settlement: typingsJapgolly.braintree.braintreeStrings.submitted_for_settlement = this.cast("submitted_for_settlement")
  @scala.inline
  def voided: typingsJapgolly.braintree.braintreeStrings.voided = this.cast("voided")
}

