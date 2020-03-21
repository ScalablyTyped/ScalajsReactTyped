package typingsJapgolly.twilioSync.clientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.twilioSync.twilioSyncStrings.disconnected
  - typingsJapgolly.twilioSync.twilioSyncStrings.connecting
  - typingsJapgolly.twilioSync.twilioSyncStrings.connected
  - typingsJapgolly.twilioSync.twilioSyncStrings.disconnecting
  - typingsJapgolly.twilioSync.twilioSyncStrings.denied
  - typingsJapgolly.twilioSync.twilioSyncStrings.error
*/
trait ConnectionState extends js.Object

object ConnectionState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def connected: typingsJapgolly.twilioSync.twilioSyncStrings.connected = this.cast("connected")
  @scala.inline
  def connecting: typingsJapgolly.twilioSync.twilioSyncStrings.connecting = this.cast("connecting")
  @scala.inline
  def denied: typingsJapgolly.twilioSync.twilioSyncStrings.denied = this.cast("denied")
  @scala.inline
  def disconnected: typingsJapgolly.twilioSync.twilioSyncStrings.disconnected = this.cast("disconnected")
  @scala.inline
  def disconnecting: typingsJapgolly.twilioSync.twilioSyncStrings.disconnecting = this.cast("disconnecting")
  @scala.inline
  def error: typingsJapgolly.twilioSync.twilioSyncStrings.error = this.cast("error")
}

