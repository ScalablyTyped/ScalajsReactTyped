package typingsJapgolly.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.actionsOnGoogle.actionsOnGoogleStrings.PAYMENT_TYPE_UNSPECIFIED
  - typingsJapgolly.actionsOnGoogle.actionsOnGoogleStrings.PAYMENT_CARD
  - typingsJapgolly.actionsOnGoogle.actionsOnGoogleStrings.BANK
  - typingsJapgolly.actionsOnGoogle.actionsOnGoogleStrings.LOYALTY_PROGRAM
  - typingsJapgolly.actionsOnGoogle.actionsOnGoogleStrings.ON_FULFILLMENT
  - typingsJapgolly.actionsOnGoogle.actionsOnGoogleStrings.GIFT_CARD
*/
trait GoogleActionsV2OrdersPaymentInfoPaymentType extends js.Object

object GoogleActionsV2OrdersPaymentInfoPaymentType {
  @scala.inline
  def BANK: typingsJapgolly.actionsOnGoogle.actionsOnGoogleStrings.BANK = this.cast("BANK")
  @scala.inline
  def GIFT_CARD: typingsJapgolly.actionsOnGoogle.actionsOnGoogleStrings.GIFT_CARD = this.cast("GIFT_CARD")
  @scala.inline
  def LOYALTY_PROGRAM: typingsJapgolly.actionsOnGoogle.actionsOnGoogleStrings.LOYALTY_PROGRAM = this.cast("LOYALTY_PROGRAM")
  @scala.inline
  def ON_FULFILLMENT: typingsJapgolly.actionsOnGoogle.actionsOnGoogleStrings.ON_FULFILLMENT = this.cast("ON_FULFILLMENT")
  @scala.inline
  def PAYMENT_CARD: typingsJapgolly.actionsOnGoogle.actionsOnGoogleStrings.PAYMENT_CARD = this.cast("PAYMENT_CARD")
  @scala.inline
  def PAYMENT_TYPE_UNSPECIFIED: typingsJapgolly.actionsOnGoogle.actionsOnGoogleStrings.PAYMENT_TYPE_UNSPECIFIED = this.cast("PAYMENT_TYPE_UNSPECIFIED")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

