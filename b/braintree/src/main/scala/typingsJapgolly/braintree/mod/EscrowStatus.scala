package typingsJapgolly.braintree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.braintree.braintreeStrings.hold_pending
  - typingsJapgolly.braintree.braintreeStrings.held
  - typingsJapgolly.braintree.braintreeStrings.release_pending
  - typingsJapgolly.braintree.braintreeStrings.released
  - typingsJapgolly.braintree.braintreeStrings.refunded
*/
trait EscrowStatus extends js.Object

object EscrowStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def held: typingsJapgolly.braintree.braintreeStrings.held = this.cast("held")
  @scala.inline
  def hold_pending: typingsJapgolly.braintree.braintreeStrings.hold_pending = this.cast("hold_pending")
  @scala.inline
  def refunded: typingsJapgolly.braintree.braintreeStrings.refunded = this.cast("refunded")
  @scala.inline
  def release_pending: typingsJapgolly.braintree.braintreeStrings.release_pending = this.cast("release_pending")
  @scala.inline
  def released: typingsJapgolly.braintree.braintreeStrings.released = this.cast("released")
}

