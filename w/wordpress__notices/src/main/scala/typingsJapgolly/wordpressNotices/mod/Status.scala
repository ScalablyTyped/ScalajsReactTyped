package typingsJapgolly.wordpressNotices.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.wordpressNotices.wordpressNoticesStrings.error
  - typingsJapgolly.wordpressNotices.wordpressNoticesStrings.info
  - typingsJapgolly.wordpressNotices.wordpressNoticesStrings.success
  - typingsJapgolly.wordpressNotices.wordpressNoticesStrings.warning
*/
trait Status extends js.Object

object Status {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def error: typingsJapgolly.wordpressNotices.wordpressNoticesStrings.error = this.cast("error")
  @scala.inline
  def info: typingsJapgolly.wordpressNotices.wordpressNoticesStrings.info = this.cast("info")
  @scala.inline
  def success: typingsJapgolly.wordpressNotices.wordpressNoticesStrings.success = this.cast("success")
  @scala.inline
  def warning: typingsJapgolly.wordpressNotices.wordpressNoticesStrings.warning = this.cast("warning")
}

