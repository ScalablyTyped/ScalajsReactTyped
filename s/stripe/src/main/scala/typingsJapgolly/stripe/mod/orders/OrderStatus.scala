package typingsJapgolly.stripe.mod.orders

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Current order status. One of created, paid, canceled, fulfilled, or returned. More detail in the Relay API Overview.
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.stripe.stripeStrings.created
  - typingsJapgolly.stripe.stripeStrings.paid
  - typingsJapgolly.stripe.stripeStrings.canceled
  - typingsJapgolly.stripe.stripeStrings.fulfilled
  - typingsJapgolly.stripe.stripeStrings.returned
*/
trait OrderStatus extends js.Object

object OrderStatus {
  @scala.inline
  def canceled: typingsJapgolly.stripe.stripeStrings.canceled = this.cast("canceled")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def created: typingsJapgolly.stripe.stripeStrings.created = this.cast("created")
  @scala.inline
  def fulfilled: typingsJapgolly.stripe.stripeStrings.fulfilled = this.cast("fulfilled")
  @scala.inline
  def paid: typingsJapgolly.stripe.stripeStrings.paid = this.cast("paid")
  @scala.inline
  def returned: typingsJapgolly.stripe.stripeStrings.returned = this.cast("returned")
}

