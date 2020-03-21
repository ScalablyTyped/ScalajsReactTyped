package typingsJapgolly.twilioNotifications.connectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.twilioNotifications.twilioNotificationsStrings.twilsock
  - typingsJapgolly.twilioNotifications.twilioNotificationsStrings.gcm
  - typingsJapgolly.twilioNotifications.twilioNotificationsStrings.fcm
  - typingsJapgolly.twilioNotifications.twilioNotificationsStrings.apn
*/
trait ChannelType extends js.Object

object ChannelType {
  @scala.inline
  def apn: typingsJapgolly.twilioNotifications.twilioNotificationsStrings.apn = this.cast("apn")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def fcm: typingsJapgolly.twilioNotifications.twilioNotificationsStrings.fcm = this.cast("fcm")
  @scala.inline
  def gcm: typingsJapgolly.twilioNotifications.twilioNotificationsStrings.gcm = this.cast("gcm")
  @scala.inline
  def twilsock: typingsJapgolly.twilioNotifications.twilioNotificationsStrings.twilsock = this.cast("twilsock")
}

