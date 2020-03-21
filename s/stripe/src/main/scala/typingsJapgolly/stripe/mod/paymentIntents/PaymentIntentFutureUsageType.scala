package typingsJapgolly.stripe.mod.paymentIntents

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.stripe.stripeStrings.on_session
  - typingsJapgolly.stripe.stripeStrings.off_session
*/
trait PaymentIntentFutureUsageType extends js.Object

object PaymentIntentFutureUsageType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def off_session: typingsJapgolly.stripe.stripeStrings.off_session = this.cast("off_session")
  @scala.inline
  def on_session: typingsJapgolly.stripe.stripeStrings.on_session = this.cast("on_session")
}

