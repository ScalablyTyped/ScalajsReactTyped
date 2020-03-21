package typingsJapgolly.stripe.mod.subscriptions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.stripe.stripeStrings.charge_automatically
  - typingsJapgolly.stripe.stripeStrings.send_invoice
*/
trait SubscriptionBilling extends js.Object

object SubscriptionBilling {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def charge_automatically: typingsJapgolly.stripe.stripeStrings.charge_automatically = this.cast("charge_automatically")
  @scala.inline
  def send_invoice: typingsJapgolly.stripe.stripeStrings.send_invoice = this.cast("send_invoice")
}

