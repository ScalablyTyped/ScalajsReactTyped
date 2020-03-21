package typingsJapgolly.stripe.mod.transfers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.stripe.stripeStrings.alipay_account
  - typingsJapgolly.stripe.stripeStrings.bank_account
  - typingsJapgolly.stripe.stripeStrings.bitcoin_receiver
  - typingsJapgolly.stripe.stripeStrings.card
*/
trait SourceTypes extends js.Object

object SourceTypes {
  @scala.inline
  def alipay_account: typingsJapgolly.stripe.stripeStrings.alipay_account = this.cast("alipay_account")
  @scala.inline
  def bank_account: typingsJapgolly.stripe.stripeStrings.bank_account = this.cast("bank_account")
  @scala.inline
  def bitcoin_receiver: typingsJapgolly.stripe.stripeStrings.bitcoin_receiver = this.cast("bitcoin_receiver")
  @scala.inline
  def card: typingsJapgolly.stripe.stripeStrings.card = this.cast("card")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

