package typingsJapgolly.stripejs.paymentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.stripejs.stripejsStrings.success
  - typingsJapgolly.stripejs.stripejsStrings.fail
  - typingsJapgolly.stripejs.stripejsStrings.invalid_payer_name
  - typingsJapgolly.stripejs.stripejsStrings.invalid_payer_phone
  - typingsJapgolly.stripejs.stripejsStrings.invalid_payer_email
  - typingsJapgolly.stripejs.stripejsStrings.invalid_shipping_address
*/
trait completeStatus extends js.Object

object completeStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def fail: typingsJapgolly.stripejs.stripejsStrings.fail = this.cast("fail")
  @scala.inline
  def invalid_payer_email: typingsJapgolly.stripejs.stripejsStrings.invalid_payer_email = this.cast("invalid_payer_email")
  @scala.inline
  def invalid_payer_name: typingsJapgolly.stripejs.stripejsStrings.invalid_payer_name = this.cast("invalid_payer_name")
  @scala.inline
  def invalid_payer_phone: typingsJapgolly.stripejs.stripejsStrings.invalid_payer_phone = this.cast("invalid_payer_phone")
  @scala.inline
  def invalid_shipping_address: typingsJapgolly.stripejs.stripejsStrings.invalid_shipping_address = this.cast("invalid_shipping_address")
  @scala.inline
  def success: typingsJapgolly.stripejs.stripejsStrings.success = this.cast("success")
}

