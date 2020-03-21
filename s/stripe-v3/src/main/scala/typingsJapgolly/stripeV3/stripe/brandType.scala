package typingsJapgolly.stripeV3.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.stripeV3.stripeV3Strings.Visa
  - typingsJapgolly.stripeV3.stripeV3Strings.`American Express`
  - typingsJapgolly.stripeV3.stripeV3Strings.MasterCard
  - typingsJapgolly.stripeV3.stripeV3Strings.Discover
  - typingsJapgolly.stripeV3.stripeV3Strings.JCB
  - typingsJapgolly.stripeV3.stripeV3Strings.`Diners Club`
  - typingsJapgolly.stripeV3.stripeV3Strings.Unknown
*/
trait brandType extends js.Object

object brandType {
  @scala.inline
  def `American Express`: typingsJapgolly.stripeV3.stripeV3Strings.`American Express` = this.cast("American Express")
  @scala.inline
  def `Diners Club`: typingsJapgolly.stripeV3.stripeV3Strings.`Diners Club` = this.cast("Diners Club")
  @scala.inline
  def Discover: typingsJapgolly.stripeV3.stripeV3Strings.Discover = this.cast("Discover")
  @scala.inline
  def JCB: typingsJapgolly.stripeV3.stripeV3Strings.JCB = this.cast("JCB")
  @scala.inline
  def MasterCard: typingsJapgolly.stripeV3.stripeV3Strings.MasterCard = this.cast("MasterCard")
  @scala.inline
  def Unknown: typingsJapgolly.stripeV3.stripeV3Strings.Unknown = this.cast("Unknown")
  @scala.inline
  def Visa: typingsJapgolly.stripeV3.stripeV3Strings.Visa = this.cast("Visa")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

