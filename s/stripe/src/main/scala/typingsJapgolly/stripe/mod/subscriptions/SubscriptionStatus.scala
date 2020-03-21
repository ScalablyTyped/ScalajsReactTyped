package typingsJapgolly.stripe.mod.subscriptions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.stripe.stripeStrings.incomplete
  - typingsJapgolly.stripe.stripeStrings.incomplete_expired
  - typingsJapgolly.stripe.stripeStrings.trialing
  - typingsJapgolly.stripe.stripeStrings.active
  - typingsJapgolly.stripe.stripeStrings.past_due
  - typingsJapgolly.stripe.stripeStrings.canceled
  - typingsJapgolly.stripe.stripeStrings.unpaid
*/
trait SubscriptionStatus extends js.Object

object SubscriptionStatus {
  @scala.inline
  def active: typingsJapgolly.stripe.stripeStrings.active = this.cast("active")
  @scala.inline
  def canceled: typingsJapgolly.stripe.stripeStrings.canceled = this.cast("canceled")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def incomplete: typingsJapgolly.stripe.stripeStrings.incomplete = this.cast("incomplete")
  @scala.inline
  def incomplete_expired: typingsJapgolly.stripe.stripeStrings.incomplete_expired = this.cast("incomplete_expired")
  @scala.inline
  def past_due: typingsJapgolly.stripe.stripeStrings.past_due = this.cast("past_due")
  @scala.inline
  def trialing: typingsJapgolly.stripe.stripeStrings.trialing = this.cast("trialing")
  @scala.inline
  def unpaid: typingsJapgolly.stripe.stripeStrings.unpaid = this.cast("unpaid")
}

