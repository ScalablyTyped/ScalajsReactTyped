package typingsJapgolly.twilsock.twilsockMod.TwilsockChannel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.twilsock.twilsockStrings.unknown
  - typingsJapgolly.twilsock.twilsockStrings.disconnecting
  - typingsJapgolly.twilsock.twilsockStrings.disconnected
  - typingsJapgolly.twilsock.twilsockStrings.connecting
  - typingsJapgolly.twilsock.twilsockStrings.connected
  - typingsJapgolly.twilsock.twilsockStrings.error
  - typingsJapgolly.twilsock.twilsockStrings.rejected
*/
trait State extends js.Object

object State {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def connected: typingsJapgolly.twilsock.twilsockStrings.connected = this.cast("connected")
  @scala.inline
  def connecting: typingsJapgolly.twilsock.twilsockStrings.connecting = this.cast("connecting")
  @scala.inline
  def disconnected: typingsJapgolly.twilsock.twilsockStrings.disconnected = this.cast("disconnected")
  @scala.inline
  def disconnecting: typingsJapgolly.twilsock.twilsockStrings.disconnecting = this.cast("disconnecting")
  @scala.inline
  def error: typingsJapgolly.twilsock.twilsockStrings.error = this.cast("error")
  @scala.inline
  def rejected: typingsJapgolly.twilsock.twilsockStrings.rejected = this.cast("rejected")
  @scala.inline
  def unknown: typingsJapgolly.twilsock.twilsockStrings.unknown = this.cast("unknown")
}

