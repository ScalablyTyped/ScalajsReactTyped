package typingsJapgolly.stripe.mod.setupIntents

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.stripe.stripeStrings.abandoned
  - typingsJapgolly.stripe.stripeStrings.requested_by_customer
  - typingsJapgolly.stripe.stripeStrings.duplicate
*/
trait SetupIntentCancelationReason extends js.Object

object SetupIntentCancelationReason {
  @scala.inline
  def abandoned: typingsJapgolly.stripe.stripeStrings.abandoned = this.cast("abandoned")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def duplicate: typingsJapgolly.stripe.stripeStrings.duplicate = this.cast("duplicate")
  @scala.inline
  def requested_by_customer: typingsJapgolly.stripe.stripeStrings.requested_by_customer = this.cast("requested_by_customer")
}

