package typingsJapgolly.braintree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.braintree.braintreeStrings.dispute_opened
  - typingsJapgolly.braintree.braintreeStrings.dispute_lost
  - typingsJapgolly.braintree.braintreeStrings.dispute_won
*/
trait DisputeNotificationKind extends _WebhookNotificationKind

object DisputeNotificationKind {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def dispute_lost: typingsJapgolly.braintree.braintreeStrings.dispute_lost = this.cast("dispute_lost")
  @scala.inline
  def dispute_opened: typingsJapgolly.braintree.braintreeStrings.dispute_opened = this.cast("dispute_opened")
  @scala.inline
  def dispute_won: typingsJapgolly.braintree.braintreeStrings.dispute_won = this.cast("dispute_won")
}

