package typingsJapgolly.stripe.mod.issuing.cardholders

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.stripe.stripeStrings.active
  - typingsJapgolly.stripe.stripeStrings.inactive
  - typingsJapgolly.stripe.stripeStrings.blocked
*/
trait CardholderStatus extends js.Object

object CardholderStatus {
  @scala.inline
  def active: typingsJapgolly.stripe.stripeStrings.active = this.cast("active")
  @scala.inline
  def blocked: typingsJapgolly.stripe.stripeStrings.blocked = this.cast("blocked")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def inactive: typingsJapgolly.stripe.stripeStrings.inactive = this.cast("inactive")
}

