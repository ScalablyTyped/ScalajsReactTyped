package typingsJapgolly.stripe.mod.issuing.cards

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.stripe.stripeStrings.damage
  - typingsJapgolly.stripe.stripeStrings.expiration
  - typingsJapgolly.stripe.stripeStrings.loss
  - typingsJapgolly.stripe.stripeStrings.theft
*/
trait IssuingCardReplacementReason extends js.Object

object IssuingCardReplacementReason {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def damage: typingsJapgolly.stripe.stripeStrings.damage = this.cast("damage")
  @scala.inline
  def expiration: typingsJapgolly.stripe.stripeStrings.expiration = this.cast("expiration")
  @scala.inline
  def loss: typingsJapgolly.stripe.stripeStrings.loss = this.cast("loss")
  @scala.inline
  def theft: typingsJapgolly.stripe.stripeStrings.theft = this.cast("theft")
}

