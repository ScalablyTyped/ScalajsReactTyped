package typingsJapgolly.twilioNotifications.clientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.twilioNotifications.twilioNotificationsStrings.connecting
  - typingsJapgolly.twilioNotifications.twilioNotificationsStrings.connected
  - typingsJapgolly.twilioNotifications.twilioNotificationsStrings.disconnecting
  - typingsJapgolly.twilioNotifications.twilioNotificationsStrings.disconnected
  - typingsJapgolly.twilioNotifications.twilioNotificationsStrings.denied
*/
trait ConnectionState extends js.Object

object ConnectionState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def connected: typingsJapgolly.twilioNotifications.twilioNotificationsStrings.connected = this.cast("connected")
  @scala.inline
  def connecting: typingsJapgolly.twilioNotifications.twilioNotificationsStrings.connecting = this.cast("connecting")
  @scala.inline
  def denied: typingsJapgolly.twilioNotifications.twilioNotificationsStrings.denied = this.cast("denied")
  @scala.inline
  def disconnected: typingsJapgolly.twilioNotifications.twilioNotificationsStrings.disconnected = this.cast("disconnected")
  @scala.inline
  def disconnecting: typingsJapgolly.twilioNotifications.twilioNotificationsStrings.disconnecting = this.cast("disconnecting")
}

