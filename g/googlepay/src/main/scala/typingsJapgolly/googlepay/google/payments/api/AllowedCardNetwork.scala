package typingsJapgolly.googlepay.google.payments.api

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.googlepay.googlepayStrings.AMEX
  - typingsJapgolly.googlepay.googlepayStrings.DISCOVER
  - typingsJapgolly.googlepay.googlepayStrings.JCB
  - typingsJapgolly.googlepay.googlepayStrings.MASTERCARD
  - typingsJapgolly.googlepay.googlepayStrings.VISA
  - typingsJapgolly.googlepay.googlepayStrings.INTERAC
*/
trait AllowedCardNetwork extends js.Object

object AllowedCardNetwork {
  @scala.inline
  def AMEX: typingsJapgolly.googlepay.googlepayStrings.AMEX = this.cast("AMEX")
  @scala.inline
  def DISCOVER: typingsJapgolly.googlepay.googlepayStrings.DISCOVER = this.cast("DISCOVER")
  @scala.inline
  def INTERAC: typingsJapgolly.googlepay.googlepayStrings.INTERAC = this.cast("INTERAC")
  @scala.inline
  def JCB: typingsJapgolly.googlepay.googlepayStrings.JCB = this.cast("JCB")
  @scala.inline
  def MASTERCARD: typingsJapgolly.googlepay.googlepayStrings.MASTERCARD = this.cast("MASTERCARD")
  @scala.inline
  def VISA: typingsJapgolly.googlepay.googlepayStrings.VISA = this.cast("VISA")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

