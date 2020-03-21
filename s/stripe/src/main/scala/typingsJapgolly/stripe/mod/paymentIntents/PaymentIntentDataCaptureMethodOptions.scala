package typingsJapgolly.stripe.mod.paymentIntents

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.stripe.stripeStrings.automatic
  - typingsJapgolly.stripe.stripeStrings.manual
*/
trait PaymentIntentDataCaptureMethodOptions extends js.Object

object PaymentIntentDataCaptureMethodOptions {
  @scala.inline
  def automatic: typingsJapgolly.stripe.stripeStrings.automatic = this.cast("automatic")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def manual: typingsJapgolly.stripe.stripeStrings.manual = this.cast("manual")
}

