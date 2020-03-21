package typingsJapgolly.angularUiNotification.mod.uiNotification

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.angularUiNotification.angularUiNotificationStrings.primary
  - typingsJapgolly.angularUiNotification.angularUiNotificationStrings.info
  - typingsJapgolly.angularUiNotification.angularUiNotificationStrings.success
  - typingsJapgolly.angularUiNotification.angularUiNotificationStrings.warning
  - typingsJapgolly.angularUiNotification.angularUiNotificationStrings.error
*/
trait MessageType extends js.Object

object MessageType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def error: typingsJapgolly.angularUiNotification.angularUiNotificationStrings.error = this.cast("error")
  @scala.inline
  def info: typingsJapgolly.angularUiNotification.angularUiNotificationStrings.info = this.cast("info")
  @scala.inline
  def primary: typingsJapgolly.angularUiNotification.angularUiNotificationStrings.primary = this.cast("primary")
  @scala.inline
  def success: typingsJapgolly.angularUiNotification.angularUiNotificationStrings.success = this.cast("success")
  @scala.inline
  def warning: typingsJapgolly.angularUiNotification.angularUiNotificationStrings.warning = this.cast("warning")
}

