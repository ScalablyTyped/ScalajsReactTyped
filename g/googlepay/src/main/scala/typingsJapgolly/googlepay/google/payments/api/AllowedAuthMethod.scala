package typingsJapgolly.googlepay.google.payments.api

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.googlepay.googlepayStrings.PAN_ONLY
  - typingsJapgolly.googlepay.googlepayStrings.CRYPTOGRAM_3DS
*/
trait AllowedAuthMethod extends js.Object

object AllowedAuthMethod {
  @scala.inline
  def CRYPTOGRAM_3DS: typingsJapgolly.googlepay.googlepayStrings.CRYPTOGRAM_3DS = this.cast("CRYPTOGRAM_3DS")
  @scala.inline
  def PAN_ONLY: typingsJapgolly.googlepay.googlepayStrings.PAN_ONLY = this.cast("PAN_ONLY")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

