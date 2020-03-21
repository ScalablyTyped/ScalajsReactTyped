package typingsJapgolly.stripe.mod.payouts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.stripe.stripeStrings.bank_account
  - typingsJapgolly.stripe.stripeStrings.card
*/
trait PayoutTypes extends js.Object

object PayoutTypes {
  @scala.inline
  def bank_account: typingsJapgolly.stripe.stripeStrings.bank_account = this.cast("bank_account")
  @scala.inline
  def card: typingsJapgolly.stripe.stripeStrings.card = this.cast("card")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

