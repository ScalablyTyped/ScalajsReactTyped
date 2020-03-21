package typingsJapgolly.jqueryPnotify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.jqueryPnotify.jqueryPnotifyStrings.notice
  - typingsJapgolly.jqueryPnotify.jqueryPnotifyStrings.info
  - typingsJapgolly.jqueryPnotify.jqueryPnotifyStrings.success
  - typingsJapgolly.jqueryPnotify.jqueryPnotifyStrings.error
*/
trait NoticeTypeOptions extends js.Object

object NoticeTypeOptions {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def error: typingsJapgolly.jqueryPnotify.jqueryPnotifyStrings.error = this.cast("error")
  @scala.inline
  def info: typingsJapgolly.jqueryPnotify.jqueryPnotifyStrings.info = this.cast("info")
  @scala.inline
  def notice: typingsJapgolly.jqueryPnotify.jqueryPnotifyStrings.notice = this.cast("notice")
  @scala.inline
  def success: typingsJapgolly.jqueryPnotify.jqueryPnotifyStrings.success = this.cast("success")
}

