package typingsJapgolly.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.std.stdStrings.closed
  - typingsJapgolly.std.stdStrings.connected
  - typingsJapgolly.std.stdStrings.connecting
  - typingsJapgolly.std.stdStrings.disconnected
  - typingsJapgolly.std.stdStrings.failed
  - typingsJapgolly.std.stdStrings.`new`
*/
trait RTCPeerConnectionState extends js.Object

object RTCPeerConnectionState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def closed: typingsJapgolly.std.stdStrings.closed = this.cast("closed")
  @scala.inline
  def connected: typingsJapgolly.std.stdStrings.connected = this.cast("connected")
  @scala.inline
  def connecting: typingsJapgolly.std.stdStrings.connecting = this.cast("connecting")
  @scala.inline
  def disconnected: typingsJapgolly.std.stdStrings.disconnected = this.cast("disconnected")
  @scala.inline
  def failed: typingsJapgolly.std.stdStrings.failed = this.cast("failed")
  @scala.inline
  def `new`: typingsJapgolly.std.stdStrings.`new` = this.cast("new")
}

