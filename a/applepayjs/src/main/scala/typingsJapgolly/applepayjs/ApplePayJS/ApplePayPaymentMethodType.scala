package typingsJapgolly.applepayjs.ApplePayJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A payment card's type of payment.
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.applepayjs.applepayjsStrings.debit
  - typingsJapgolly.applepayjs.applepayjsStrings.credit
  - typingsJapgolly.applepayjs.applepayjsStrings.prepaid
  - typingsJapgolly.applepayjs.applepayjsStrings.store
*/
trait ApplePayPaymentMethodType extends js.Object

object ApplePayPaymentMethodType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def credit: typingsJapgolly.applepayjs.applepayjsStrings.credit = this.cast("credit")
  @scala.inline
  def debit: typingsJapgolly.applepayjs.applepayjsStrings.debit = this.cast("debit")
  @scala.inline
  def prepaid: typingsJapgolly.applepayjs.applepayjsStrings.prepaid = this.cast("prepaid")
  @scala.inline
  def store: typingsJapgolly.applepayjs.applepayjsStrings.store = this.cast("store")
}

