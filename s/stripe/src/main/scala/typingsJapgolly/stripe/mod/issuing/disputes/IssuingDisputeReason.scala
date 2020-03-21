package typingsJapgolly.stripe.mod.issuing.disputes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.stripe.stripeStrings.other
  - typingsJapgolly.stripe.stripeStrings.fraudlent
*/
trait IssuingDisputeReason extends js.Object

object IssuingDisputeReason {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def fraudlent: typingsJapgolly.stripe.stripeStrings.fraudlent = this.cast("fraudlent")
  @scala.inline
  def other: typingsJapgolly.stripe.stripeStrings.other = this.cast("other")
}

