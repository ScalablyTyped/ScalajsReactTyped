package typingsJapgolly.applepayjs.ApplePayJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The payment capabilities supported by the merchant.
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.applepayjs.applepayjsStrings.supports3DS
  - typingsJapgolly.applepayjs.applepayjsStrings.supportsEMV
  - typingsJapgolly.applepayjs.applepayjsStrings.supportsCredit
  - typingsJapgolly.applepayjs.applepayjsStrings.supportsDebit
*/
trait ApplePayMerchantCapability extends js.Object

object ApplePayMerchantCapability {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def supports3DS: typingsJapgolly.applepayjs.applepayjsStrings.supports3DS = this.cast("supports3DS")
  @scala.inline
  def supportsCredit: typingsJapgolly.applepayjs.applepayjsStrings.supportsCredit = this.cast("supportsCredit")
  @scala.inline
  def supportsDebit: typingsJapgolly.applepayjs.applepayjsStrings.supportsDebit = this.cast("supportsDebit")
  @scala.inline
  def supportsEMV: typingsJapgolly.applepayjs.applepayjsStrings.supportsEMV = this.cast("supportsEMV")
}

