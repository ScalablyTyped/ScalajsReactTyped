package typingsJapgolly.stripe.mod.issuing.cardholders

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.stripe.stripeStrings.per_authorization
  - typingsJapgolly.stripe.stripeStrings.daily
  - typingsJapgolly.stripe.stripeStrings.weekly
  - typingsJapgolly.stripe.stripeStrings.monthly
  - typingsJapgolly.stripe.stripeStrings.yearly
  - typingsJapgolly.stripe.stripeStrings.all_time
*/
trait SpendingLimitInterval extends js.Object

object SpendingLimitInterval {
  @scala.inline
  def all_time: typingsJapgolly.stripe.stripeStrings.all_time = this.cast("all_time")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def daily: typingsJapgolly.stripe.stripeStrings.daily = this.cast("daily")
  @scala.inline
  def monthly: typingsJapgolly.stripe.stripeStrings.monthly = this.cast("monthly")
  @scala.inline
  def per_authorization: typingsJapgolly.stripe.stripeStrings.per_authorization = this.cast("per_authorization")
  @scala.inline
  def weekly: typingsJapgolly.stripe.stripeStrings.weekly = this.cast("weekly")
  @scala.inline
  def yearly: typingsJapgolly.stripe.stripeStrings.yearly = this.cast("yearly")
}

