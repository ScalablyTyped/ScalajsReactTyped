package typingsJapgolly.stripeV3.stripe.setupIntents

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.stripeV3.stripeV3Strings.requires_payment_method
  - typingsJapgolly.stripeV3.stripeV3Strings.requires_confirmation
  - typingsJapgolly.stripeV3.stripeV3Strings.requires_action
  - typingsJapgolly.stripeV3.stripeV3Strings.processing
  - typingsJapgolly.stripeV3.stripeV3Strings.canceled
  - typingsJapgolly.stripeV3.stripeV3Strings.succeeded
*/
trait SetupIntentStatus extends js.Object

object SetupIntentStatus {
  @scala.inline
  def canceled: typingsJapgolly.stripeV3.stripeV3Strings.canceled = this.cast("canceled")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def processing: typingsJapgolly.stripeV3.stripeV3Strings.processing = this.cast("processing")
  @scala.inline
  def requires_action: typingsJapgolly.stripeV3.stripeV3Strings.requires_action = this.cast("requires_action")
  @scala.inline
  def requires_confirmation: typingsJapgolly.stripeV3.stripeV3Strings.requires_confirmation = this.cast("requires_confirmation")
  @scala.inline
  def requires_payment_method: typingsJapgolly.stripeV3.stripeV3Strings.requires_payment_method = this.cast("requires_payment_method")
  @scala.inline
  def succeeded: typingsJapgolly.stripeV3.stripeV3Strings.succeeded = this.cast("succeeded")
}

