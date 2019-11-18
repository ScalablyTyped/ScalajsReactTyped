package typingsJapgolly.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.std.stdStrings.`new`
  - typings.std.stdStrings.checking
  - typings.std.stdStrings.connected
  - typings.std.stdStrings.completed
  - typings.std.stdStrings.disconnected
  - typings.std.stdStrings.failed
  - typings.std.stdStrings.closed
*/
trait RTCIceTransportState extends js.Object

object RTCIceTransportState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def checking: typingsJapgolly.std.stdStrings.checking = this.cast("checking")
  @scala.inline
  def closed: typingsJapgolly.std.stdStrings.closed = this.cast("closed")
  @scala.inline
  def completed: typingsJapgolly.std.stdStrings.completed = this.cast("completed")
  @scala.inline
  def connected: typingsJapgolly.std.stdStrings.connected = this.cast("connected")
  @scala.inline
  def disconnected: typingsJapgolly.std.stdStrings.disconnected = this.cast("disconnected")
  @scala.inline
  def failed: typingsJapgolly.std.stdStrings.failed = this.cast("failed")
  @scala.inline
  def `new`: typingsJapgolly.std.stdStrings.`new` = this.cast("new")
}

