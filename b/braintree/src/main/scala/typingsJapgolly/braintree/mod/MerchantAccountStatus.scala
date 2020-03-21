package typingsJapgolly.braintree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.braintree.braintreeStrings.Pending
  - typingsJapgolly.braintree.braintreeStrings.Active
  - typingsJapgolly.braintree.braintreeStrings.Suspended
*/
trait MerchantAccountStatus extends js.Object

object MerchantAccountStatus {
  @scala.inline
  def Active: typingsJapgolly.braintree.braintreeStrings.Active = this.cast("Active")
  @scala.inline
  def Pending: typingsJapgolly.braintree.braintreeStrings.Pending = this.cast("Pending")
  @scala.inline
  def Suspended: typingsJapgolly.braintree.braintreeStrings.Suspended = this.cast("Suspended")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

