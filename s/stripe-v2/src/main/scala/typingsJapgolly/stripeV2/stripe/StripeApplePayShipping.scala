package typingsJapgolly.stripeV2.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.stripeV2.stripeV2Strings.shipping
  - typingsJapgolly.stripeV2.stripeV2Strings.delivery
  - typingsJapgolly.stripeV2.stripeV2Strings.storePickup
  - typingsJapgolly.stripeV2.stripeV2Strings.servicePickup
*/
trait StripeApplePayShipping extends js.Object

object StripeApplePayShipping {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def delivery: typingsJapgolly.stripeV2.stripeV2Strings.delivery = this.cast("delivery")
  @scala.inline
  def servicePickup: typingsJapgolly.stripeV2.stripeV2Strings.servicePickup = this.cast("servicePickup")
  @scala.inline
  def shipping: typingsJapgolly.stripeV2.stripeV2Strings.shipping = this.cast("shipping")
  @scala.inline
  def storePickup: typingsJapgolly.stripeV2.stripeV2Strings.storePickup = this.cast("storePickup")
}

