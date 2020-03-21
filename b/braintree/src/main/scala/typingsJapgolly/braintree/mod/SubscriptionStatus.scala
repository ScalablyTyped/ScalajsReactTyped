package typingsJapgolly.braintree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.braintree.braintreeStrings.Active
  - typingsJapgolly.braintree.braintreeStrings.Canceled
  - typingsJapgolly.braintree.braintreeStrings.Expired
  - typingsJapgolly.braintree.braintreeStrings.PastDue
  - typingsJapgolly.braintree.braintreeStrings.Pending
*/
trait SubscriptionStatus extends js.Object

object SubscriptionStatus {
  @scala.inline
  def Active: typingsJapgolly.braintree.braintreeStrings.Active = this.cast("Active")
  @scala.inline
  def Canceled: typingsJapgolly.braintree.braintreeStrings.Canceled = this.cast("Canceled")
  @scala.inline
  def Expired: typingsJapgolly.braintree.braintreeStrings.Expired = this.cast("Expired")
  @scala.inline
  def PastDue: typingsJapgolly.braintree.braintreeStrings.PastDue = this.cast("PastDue")
  @scala.inline
  def Pending: typingsJapgolly.braintree.braintreeStrings.Pending = this.cast("Pending")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

