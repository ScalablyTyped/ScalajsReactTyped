package typingsJapgolly.klaw.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.klaw.klawStrings.close
  - typingsJapgolly.klaw.klawStrings.data
  - typingsJapgolly.klaw.klawStrings.end
  - typingsJapgolly.klaw.klawStrings.readable
  - typingsJapgolly.klaw.klawStrings.error
*/
trait Event extends js.Object

object Event {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def close: typingsJapgolly.klaw.klawStrings.close = this.cast("close")
  @scala.inline
  def data: typingsJapgolly.klaw.klawStrings.data = this.cast("data")
  @scala.inline
  def end: typingsJapgolly.klaw.klawStrings.end = this.cast("end")
  @scala.inline
  def error: typingsJapgolly.klaw.klawStrings.error = this.cast("error")
  @scala.inline
  def readable: typingsJapgolly.klaw.klawStrings.readable = this.cast("readable")
}

