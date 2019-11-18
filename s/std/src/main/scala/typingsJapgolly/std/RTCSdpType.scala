package typingsJapgolly.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.std.stdStrings.offer
  - typings.std.stdStrings.pranswer
  - typings.std.stdStrings.answer
  - typings.std.stdStrings.rollback
*/
trait RTCSdpType extends js.Object

object RTCSdpType {
  @scala.inline
  def answer: typingsJapgolly.std.stdStrings.answer = this.cast("answer")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def offer: typingsJapgolly.std.stdStrings.offer = this.cast("offer")
  @scala.inline
  def pranswer: typingsJapgolly.std.stdStrings.pranswer = this.cast("pranswer")
  @scala.inline
  def rollback: typingsJapgolly.std.stdStrings.rollback = this.cast("rollback")
}

