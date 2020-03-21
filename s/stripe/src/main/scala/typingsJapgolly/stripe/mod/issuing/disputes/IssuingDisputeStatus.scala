package typingsJapgolly.stripe.mod.issuing.disputes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.stripe.stripeStrings.lost
  - typingsJapgolly.stripe.stripeStrings.under_review
  - typingsJapgolly.stripe.stripeStrings.unsubmitted
  - typingsJapgolly.stripe.stripeStrings.won
*/
trait IssuingDisputeStatus extends js.Object

object IssuingDisputeStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def lost: typingsJapgolly.stripe.stripeStrings.lost = this.cast("lost")
  @scala.inline
  def under_review: typingsJapgolly.stripe.stripeStrings.under_review = this.cast("under_review")
  @scala.inline
  def unsubmitted: typingsJapgolly.stripe.stripeStrings.unsubmitted = this.cast("unsubmitted")
  @scala.inline
  def won: typingsJapgolly.stripe.stripeStrings.won = this.cast("won")
}

