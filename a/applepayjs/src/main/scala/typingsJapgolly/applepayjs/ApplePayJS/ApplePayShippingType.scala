package typingsJapgolly.applepayjs.ApplePayJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A type that indicates how purchased items are to be shipped.
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.applepayjs.applepayjsStrings.shipping
  - typingsJapgolly.applepayjs.applepayjsStrings.delivery
  - typingsJapgolly.applepayjs.applepayjsStrings.storePickup
  - typingsJapgolly.applepayjs.applepayjsStrings.servicePickup
*/
trait ApplePayShippingType extends js.Object

object ApplePayShippingType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def delivery: typingsJapgolly.applepayjs.applepayjsStrings.delivery = this.cast("delivery")
  @scala.inline
  def servicePickup: typingsJapgolly.applepayjs.applepayjsStrings.servicePickup = this.cast("servicePickup")
  @scala.inline
  def shipping: typingsJapgolly.applepayjs.applepayjsStrings.shipping = this.cast("shipping")
  @scala.inline
  def storePickup: typingsJapgolly.applepayjs.applepayjsStrings.storePickup = this.cast("storePickup")
}

