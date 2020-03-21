package typingsJapgolly.jqueryToastmessagePlugin.JQueryToastmessage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.jqueryToastmessagePlugin.jqueryToastmessagePluginStrings.notice
  - typingsJapgolly.jqueryToastmessagePlugin.jqueryToastmessagePluginStrings.warning
  - typingsJapgolly.jqueryToastmessagePlugin.jqueryToastmessagePluginStrings.error
  - typingsJapgolly.jqueryToastmessagePlugin.jqueryToastmessagePluginStrings.success
*/
trait ToastType extends js.Object

object ToastType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def error: typingsJapgolly.jqueryToastmessagePlugin.jqueryToastmessagePluginStrings.error = this.cast("error")
  @scala.inline
  def notice: typingsJapgolly.jqueryToastmessagePlugin.jqueryToastmessagePluginStrings.notice = this.cast("notice")
  @scala.inline
  def success: typingsJapgolly.jqueryToastmessagePlugin.jqueryToastmessagePluginStrings.success = this.cast("success")
  @scala.inline
  def warning: typingsJapgolly.jqueryToastmessagePlugin.jqueryToastmessagePluginStrings.warning = this.cast("warning")
}

