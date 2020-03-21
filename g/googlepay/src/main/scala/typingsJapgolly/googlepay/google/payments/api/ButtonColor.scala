package typingsJapgolly.googlepay.google.payments.api

import typingsJapgolly.googlepay.googlepayStrings.default_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.googlepay.googlepayStrings.default_
  - typingsJapgolly.googlepay.googlepayStrings.black
  - typingsJapgolly.googlepay.googlepayStrings.white
*/
trait ButtonColor extends js.Object

object ButtonColor {
  @scala.inline
  def black: typingsJapgolly.googlepay.googlepayStrings.black = this.cast("black")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def default: default_ = this.cast("default")
  @scala.inline
  def white: typingsJapgolly.googlepay.googlepayStrings.white = this.cast("white")
}

