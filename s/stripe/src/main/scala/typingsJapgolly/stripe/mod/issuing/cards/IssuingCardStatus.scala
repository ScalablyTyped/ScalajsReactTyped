package typingsJapgolly.stripe.mod.issuing.cards

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.stripe.stripeStrings.active
  - typingsJapgolly.stripe.stripeStrings.inactive
  - typingsJapgolly.stripe.stripeStrings.canceled
  - typingsJapgolly.stripe.stripeStrings.lost
  - typingsJapgolly.stripe.stripeStrings.stolen
*/
trait IssuingCardStatus extends js.Object

object IssuingCardStatus {
  @scala.inline
  def active: typingsJapgolly.stripe.stripeStrings.active = this.cast("active")
  @scala.inline
  def canceled: typingsJapgolly.stripe.stripeStrings.canceled = this.cast("canceled")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def inactive: typingsJapgolly.stripe.stripeStrings.inactive = this.cast("inactive")
  @scala.inline
  def lost: typingsJapgolly.stripe.stripeStrings.lost = this.cast("lost")
  @scala.inline
  def stolen: typingsJapgolly.stripe.stripeStrings.stolen = this.cast("stolen")
}

