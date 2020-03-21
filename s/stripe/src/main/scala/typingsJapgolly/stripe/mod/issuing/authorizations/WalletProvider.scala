package typingsJapgolly.stripe.mod.issuing.authorizations

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.stripe.stripeStrings.apple_pay
  - typingsJapgolly.stripe.stripeStrings.google_pay
  - typingsJapgolly.stripe.stripeStrings.samsung_pay
*/
trait WalletProvider extends js.Object

object WalletProvider {
  @scala.inline
  def apple_pay: typingsJapgolly.stripe.stripeStrings.apple_pay = this.cast("apple_pay")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def google_pay: typingsJapgolly.stripe.stripeStrings.google_pay = this.cast("google_pay")
  @scala.inline
  def samsung_pay: typingsJapgolly.stripe.stripeStrings.samsung_pay = this.cast("samsung_pay")
}

