package typingsJapgolly.reactToastify.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.reactToastify.reactToastifyStrings.info
  - typingsJapgolly.reactToastify.reactToastifyStrings.success
  - typingsJapgolly.reactToastify.reactToastifyStrings.warning
  - typingsJapgolly.reactToastify.reactToastifyStrings.error
  - typingsJapgolly.reactToastify.reactToastifyStrings.default
*/
trait TypeOptions extends js.Object

object TypeOptions {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def default: typingsJapgolly.reactToastify.reactToastifyStrings.default = this.cast("default")
  @scala.inline
  def error: typingsJapgolly.reactToastify.reactToastifyStrings.error = this.cast("error")
  @scala.inline
  def info: typingsJapgolly.reactToastify.reactToastifyStrings.info = this.cast("info")
  @scala.inline
  def success: typingsJapgolly.reactToastify.reactToastifyStrings.success = this.cast("success")
  @scala.inline
  def warning: typingsJapgolly.reactToastify.reactToastifyStrings.warning = this.cast("warning")
}

