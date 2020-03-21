package typingsJapgolly.twilioNotifications.connectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.twilioNotifications.twilioNotificationsStrings.token
  - typingsJapgolly.twilioNotifications.twilioNotificationsStrings.notificationId
  - typingsJapgolly.twilioNotifications.twilioNotificationsStrings.messageType
*/
trait UpdateReason extends js.Object

object UpdateReason {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def messageType: typingsJapgolly.twilioNotifications.twilioNotificationsStrings.messageType = this.cast("messageType")
  @scala.inline
  def notificationId: typingsJapgolly.twilioNotifications.twilioNotificationsStrings.notificationId = this.cast("notificationId")
  @scala.inline
  def token: typingsJapgolly.twilioNotifications.twilioNotificationsStrings.token = this.cast("token")
}

