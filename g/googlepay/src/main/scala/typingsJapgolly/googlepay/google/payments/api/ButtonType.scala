package typingsJapgolly.googlepay.google.payments.api

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.googlepay.googlepayStrings.long
  - typingsJapgolly.googlepay.googlepayStrings.short
*/
trait ButtonType extends js.Object

object ButtonType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def long: typingsJapgolly.googlepay.googlepayStrings.long = this.cast("long")
  @scala.inline
  def short: typingsJapgolly.googlepay.googlepayStrings.short = this.cast("short")
}

