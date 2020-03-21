package typingsJapgolly.applepayjs.ApplePayJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The error code that indicates whether an error on the payment sheet is for shipping or billing information, or for another kind of error.
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.applepayjs.applepayjsStrings.shippingContactInvalid
  - typingsJapgolly.applepayjs.applepayjsStrings.billingContactInvalid
  - typingsJapgolly.applepayjs.applepayjsStrings.addressUnserviceable
  - typingsJapgolly.applepayjs.applepayjsStrings.unknown
*/
trait ApplePayErrorCode extends js.Object

object ApplePayErrorCode {
  @scala.inline
  def addressUnserviceable: typingsJapgolly.applepayjs.applepayjsStrings.addressUnserviceable = this.cast("addressUnserviceable")
  @scala.inline
  def billingContactInvalid: typingsJapgolly.applepayjs.applepayjsStrings.billingContactInvalid = this.cast("billingContactInvalid")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def shippingContactInvalid: typingsJapgolly.applepayjs.applepayjsStrings.shippingContactInvalid = this.cast("shippingContactInvalid")
  @scala.inline
  def unknown: typingsJapgolly.applepayjs.applepayjsStrings.unknown = this.cast("unknown")
}

