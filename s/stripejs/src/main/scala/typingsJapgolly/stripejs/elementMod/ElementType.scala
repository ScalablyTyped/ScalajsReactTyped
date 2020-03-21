package typingsJapgolly.stripejs.elementMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.stripejs.stripejsStrings.card
  - typingsJapgolly.stripejs.stripejsStrings.cardNumber
  - typingsJapgolly.stripejs.stripejsStrings.cardExpiry
  - typingsJapgolly.stripejs.stripejsStrings.cardCvc
  - typingsJapgolly.stripejs.stripejsStrings.postalCode
  - typingsJapgolly.stripejs.stripejsStrings.paymentRequestButton
*/
trait ElementType extends js.Object

object ElementType {
  @scala.inline
  def card: typingsJapgolly.stripejs.stripejsStrings.card = this.cast("card")
  @scala.inline
  def cardCvc: typingsJapgolly.stripejs.stripejsStrings.cardCvc = this.cast("cardCvc")
  @scala.inline
  def cardExpiry: typingsJapgolly.stripejs.stripejsStrings.cardExpiry = this.cast("cardExpiry")
  @scala.inline
  def cardNumber: typingsJapgolly.stripejs.stripejsStrings.cardNumber = this.cast("cardNumber")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def paymentRequestButton: typingsJapgolly.stripejs.stripejsStrings.paymentRequestButton = this.cast("paymentRequestButton")
  @scala.inline
  def postalCode: typingsJapgolly.stripejs.stripejsStrings.postalCode = this.cast("postalCode")
}

