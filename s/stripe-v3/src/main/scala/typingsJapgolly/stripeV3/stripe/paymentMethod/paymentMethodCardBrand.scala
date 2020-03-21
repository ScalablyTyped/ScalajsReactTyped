package typingsJapgolly.stripeV3.stripe.paymentMethod

import typingsJapgolly.stripeV3.stripeV3Strings.discover_
import typingsJapgolly.stripeV3.stripeV3Strings.jcb_
import typingsJapgolly.stripeV3.stripeV3Strings.mastercard_
import typingsJapgolly.stripeV3.stripeV3Strings.unknown_
import typingsJapgolly.stripeV3.stripeV3Strings.visa_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.stripeV3.stripeV3Strings.amex
  - typingsJapgolly.stripeV3.stripeV3Strings.diners
  - typingsJapgolly.stripeV3.stripeV3Strings.discover_
  - typingsJapgolly.stripeV3.stripeV3Strings.jcb_
  - typingsJapgolly.stripeV3.stripeV3Strings.mastercard_
  - typingsJapgolly.stripeV3.stripeV3Strings.unionpay
  - typingsJapgolly.stripeV3.stripeV3Strings.visa_
  - typingsJapgolly.stripeV3.stripeV3Strings.unknown_
*/
trait paymentMethodCardBrand extends js.Object

object paymentMethodCardBrand {
  @scala.inline
  def amex: typingsJapgolly.stripeV3.stripeV3Strings.amex = this.cast("amex")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def diners: typingsJapgolly.stripeV3.stripeV3Strings.diners = this.cast("diners")
  @scala.inline
  def discover: discover_ = this.cast("discover")
  @scala.inline
  def jcb: jcb_ = this.cast("jcb")
  @scala.inline
  def mastercard: mastercard_ = this.cast("mastercard")
  @scala.inline
  def unionpay: typingsJapgolly.stripeV3.stripeV3Strings.unionpay = this.cast("unionpay")
  @scala.inline
  def unknown: unknown_ = this.cast("unknown")
  @scala.inline
  def visa: visa_ = this.cast("visa")
}

