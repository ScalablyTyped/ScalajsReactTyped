package typingsJapgolly.braintree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.braintree.braintreeStrings.Accepted
  - typingsJapgolly.braintree.braintreeStrings.Disputed
  - typingsJapgolly.braintree.braintreeStrings.Expired
  - typingsJapgolly.braintree.braintreeStrings.Open
  - typingsJapgolly.braintree.braintreeStrings.Lost
  - typingsJapgolly.braintree.braintreeStrings.Won
*/
trait DisputeStatus extends js.Object

object DisputeStatus {
  @scala.inline
  def Accepted: typingsJapgolly.braintree.braintreeStrings.Accepted = this.cast("Accepted")
  @scala.inline
  def Disputed: typingsJapgolly.braintree.braintreeStrings.Disputed = this.cast("Disputed")
  @scala.inline
  def Expired: typingsJapgolly.braintree.braintreeStrings.Expired = this.cast("Expired")
  @scala.inline
  def Lost: typingsJapgolly.braintree.braintreeStrings.Lost = this.cast("Lost")
  @scala.inline
  def Open: typingsJapgolly.braintree.braintreeStrings.Open = this.cast("Open")
  @scala.inline
  def Won: typingsJapgolly.braintree.braintreeStrings.Won = this.cast("Won")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

