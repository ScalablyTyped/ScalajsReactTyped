package typingsJapgolly.stripe.mod.transfers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.stripe.stripeStrings.pending
  - typingsJapgolly.stripe.stripeStrings.paid
  - typingsJapgolly.stripe.stripeStrings.failed
  - typingsJapgolly.stripe.stripeStrings.in_transit
  - typingsJapgolly.stripe.stripeStrings.canceled
*/
trait Statuses extends js.Object

object Statuses {
  @scala.inline
  def canceled: typingsJapgolly.stripe.stripeStrings.canceled = this.cast("canceled")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def failed: typingsJapgolly.stripe.stripeStrings.failed = this.cast("failed")
  @scala.inline
  def in_transit: typingsJapgolly.stripe.stripeStrings.in_transit = this.cast("in_transit")
  @scala.inline
  def paid: typingsJapgolly.stripe.stripeStrings.paid = this.cast("paid")
  @scala.inline
  def pending: typingsJapgolly.stripe.stripeStrings.pending = this.cast("pending")
}

