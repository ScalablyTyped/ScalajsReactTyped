package typingsJapgolly.reactCreditCards.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.reactCreditCards.reactCreditCardsStrings.name
  - typingsJapgolly.reactCreditCards.reactCreditCardsStrings.number
  - typingsJapgolly.reactCreditCards.reactCreditCardsStrings.expiry
  - typingsJapgolly.reactCreditCards.reactCreditCardsStrings.cvc
*/
trait Focused extends js.Object

object Focused {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def cvc: typingsJapgolly.reactCreditCards.reactCreditCardsStrings.cvc = this.cast("cvc")
  @scala.inline
  def expiry: typingsJapgolly.reactCreditCards.reactCreditCardsStrings.expiry = this.cast("expiry")
  @scala.inline
  def name: typingsJapgolly.reactCreditCards.reactCreditCardsStrings.name = this.cast("name")
  @scala.inline
  def number: typingsJapgolly.reactCreditCards.reactCreditCardsStrings.number = this.cast("number")
}

