package typingsJapgolly.stripeV3.stripe.paymentMethod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.stripeV3.stripeV3Strings.card
  - typingsJapgolly.stripeV3.stripeV3Strings.card_present
*/
trait paymentMethodType extends js.Object

object paymentMethodType {
  @scala.inline
  def card: typingsJapgolly.stripeV3.stripeV3Strings.card = this.cast("card")
  @scala.inline
  def card_present: typingsJapgolly.stripeV3.stripeV3Strings.card_present = this.cast("card_present")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

