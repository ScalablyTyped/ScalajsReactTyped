package typingsJapgolly.googlepay.google.payments.api

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.googlepay.googlepayStrings.DEFAULT
  - typingsJapgolly.googlepay.googlepayStrings.COMPLETE_IMMEDIATE_PURCHASE
*/
trait CheckoutOption extends js.Object

object CheckoutOption {
  @scala.inline
  def COMPLETE_IMMEDIATE_PURCHASE: typingsJapgolly.googlepay.googlepayStrings.COMPLETE_IMMEDIATE_PURCHASE = this.cast("COMPLETE_IMMEDIATE_PURCHASE")
  @scala.inline
  def DEFAULT: typingsJapgolly.googlepay.googlepayStrings.DEFAULT = this.cast("DEFAULT")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

