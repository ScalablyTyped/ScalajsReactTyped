package typingsJapgolly.stripeV2.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.stripeV2.stripeV2Strings.Visa
  - typingsJapgolly.stripeV2.stripeV2Strings.`American Express`
  - typingsJapgolly.stripeV2.stripeV2Strings.MasterCard
  - typingsJapgolly.stripeV2.stripeV2Strings.Discover
  - typingsJapgolly.stripeV2.stripeV2Strings.JCB
  - typingsJapgolly.stripeV2.stripeV2Strings.`Diners Club`
  - typingsJapgolly.stripeV2.stripeV2Strings.Unknown
*/
trait StripeCardDataBrand extends js.Object

object StripeCardDataBrand {
  @scala.inline
  def `American Express`: typingsJapgolly.stripeV2.stripeV2Strings.`American Express` = this.cast("American Express")
  @scala.inline
  def `Diners Club`: typingsJapgolly.stripeV2.stripeV2Strings.`Diners Club` = this.cast("Diners Club")
  @scala.inline
  def Discover: typingsJapgolly.stripeV2.stripeV2Strings.Discover = this.cast("Discover")
  @scala.inline
  def JCB: typingsJapgolly.stripeV2.stripeV2Strings.JCB = this.cast("JCB")
  @scala.inline
  def MasterCard: typingsJapgolly.stripeV2.stripeV2Strings.MasterCard = this.cast("MasterCard")
  @scala.inline
  def Unknown: typingsJapgolly.stripeV2.stripeV2Strings.Unknown = this.cast("Unknown")
  @scala.inline
  def Visa: typingsJapgolly.stripeV2.stripeV2Strings.Visa = this.cast("Visa")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

