package typingsJapgolly.stripe.mod.issuing.authorizations

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.stripe.stripeStrings.closed
  - typingsJapgolly.stripe.stripeStrings.pending
  - typingsJapgolly.stripe.stripeStrings.reversed
*/
trait AuthorizationStatus extends js.Object

object AuthorizationStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def closed: typingsJapgolly.stripe.stripeStrings.closed = this.cast("closed")
  @scala.inline
  def pending: typingsJapgolly.stripe.stripeStrings.pending = this.cast("pending")
  @scala.inline
  def reversed: typingsJapgolly.stripe.stripeStrings.reversed = this.cast("reversed")
}

