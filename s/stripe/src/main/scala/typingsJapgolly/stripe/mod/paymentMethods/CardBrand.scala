package typingsJapgolly.stripe.mod.paymentMethods

import typingsJapgolly.stripe.stripeStrings.discover_
import typingsJapgolly.stripe.stripeStrings.jcb_
import typingsJapgolly.stripe.stripeStrings.mastercard_
import typingsJapgolly.stripe.stripeStrings.unknown_
import typingsJapgolly.stripe.stripeStrings.visa_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.stripe.stripeStrings.amex
  - typingsJapgolly.stripe.stripeStrings.diners
  - typingsJapgolly.stripe.stripeStrings.discover_
  - typingsJapgolly.stripe.stripeStrings.jcb_
  - typingsJapgolly.stripe.stripeStrings.mastercard_
  - typingsJapgolly.stripe.stripeStrings.unionpay
  - typingsJapgolly.stripe.stripeStrings.visa_
  - typingsJapgolly.stripe.stripeStrings.unknown_
*/
trait CardBrand extends js.Object

object CardBrand {
  @scala.inline
  def amex: typingsJapgolly.stripe.stripeStrings.amex = this.cast("amex")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def diners: typingsJapgolly.stripe.stripeStrings.diners = this.cast("diners")
  @scala.inline
  def discover: discover_ = this.cast("discover")
  @scala.inline
  def jcb: jcb_ = this.cast("jcb")
  @scala.inline
  def mastercard: mastercard_ = this.cast("mastercard")
  @scala.inline
  def unionpay: typingsJapgolly.stripe.stripeStrings.unionpay = this.cast("unionpay")
  @scala.inline
  def unknown: unknown_ = this.cast("unknown")
  @scala.inline
  def visa: visa_ = this.cast("visa")
}

