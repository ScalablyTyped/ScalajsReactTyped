package typingsJapgolly.stripe.mod.issuing.cards

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.stripe.stripeStrings.virtual
  - typingsJapgolly.stripe.stripeStrings.physical
*/
trait IssuingCardType extends js.Object

object IssuingCardType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def physical: typingsJapgolly.stripe.stripeStrings.physical = this.cast("physical")
  @scala.inline
  def virtual: typingsJapgolly.stripe.stripeStrings.virtual = this.cast("virtual")
}

