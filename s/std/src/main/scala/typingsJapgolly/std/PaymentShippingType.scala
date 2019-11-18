package typingsJapgolly.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.std.stdStrings.shipping
  - typings.std.stdStrings.delivery
  - typings.std.stdStrings.pickup
*/
trait PaymentShippingType extends js.Object

object PaymentShippingType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def delivery: typingsJapgolly.std.stdStrings.delivery = this.cast("delivery")
  @scala.inline
  def pickup: typingsJapgolly.std.stdStrings.pickup = this.cast("pickup")
  @scala.inline
  def shipping: typingsJapgolly.std.stdStrings.shipping = this.cast("shipping")
}

