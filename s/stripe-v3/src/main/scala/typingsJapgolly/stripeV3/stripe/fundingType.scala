package typingsJapgolly.stripeV3.stripe

import typingsJapgolly.stripeV3.stripeV3Strings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.stripeV3.stripeV3Strings.credit
  - typingsJapgolly.stripeV3.stripeV3Strings.debit
  - typingsJapgolly.stripeV3.stripeV3Strings.prepaid
  - typingsJapgolly.stripeV3.stripeV3Strings.unknown_
*/
trait fundingType extends js.Object

object fundingType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def credit: typingsJapgolly.stripeV3.stripeV3Strings.credit = this.cast("credit")
  @scala.inline
  def debit: typingsJapgolly.stripeV3.stripeV3Strings.debit = this.cast("debit")
  @scala.inline
  def prepaid: typingsJapgolly.stripeV3.stripeV3Strings.prepaid = this.cast("prepaid")
  @scala.inline
  def unknown: unknown_ = this.cast("unknown")
}

