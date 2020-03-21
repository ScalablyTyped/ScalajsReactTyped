package typingsJapgolly.reactNotificationSystemRedux.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.reactNotificationSystemRedux.reactNotificationSystemReduxStrings.error
  - typingsJapgolly.reactNotificationSystemRedux.reactNotificationSystemReduxStrings.warning
  - typingsJapgolly.reactNotificationSystemRedux.reactNotificationSystemReduxStrings.info
  - typingsJapgolly.reactNotificationSystemRedux.reactNotificationSystemReduxStrings.success
*/
trait NotificationLevel extends js.Object

object NotificationLevel {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def error: typingsJapgolly.reactNotificationSystemRedux.reactNotificationSystemReduxStrings.error = this.cast("error")
  @scala.inline
  def info: typingsJapgolly.reactNotificationSystemRedux.reactNotificationSystemReduxStrings.info = this.cast("info")
  @scala.inline
  def success: typingsJapgolly.reactNotificationSystemRedux.reactNotificationSystemReduxStrings.success = this.cast("success")
  @scala.inline
  def warning: typingsJapgolly.reactNotificationSystemRedux.reactNotificationSystemReduxStrings.warning = this.cast("warning")
}

