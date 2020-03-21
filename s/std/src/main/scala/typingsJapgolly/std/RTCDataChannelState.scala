package typingsJapgolly.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.std.stdStrings.closed
  - typingsJapgolly.std.stdStrings.closing
  - typingsJapgolly.std.stdStrings.connecting
  - typingsJapgolly.std.stdStrings.open
*/
trait RTCDataChannelState extends js.Object

object RTCDataChannelState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def closed: typingsJapgolly.std.stdStrings.closed = this.cast("closed")
  @scala.inline
  def closing: typingsJapgolly.std.stdStrings.closing = this.cast("closing")
  @scala.inline
  def connecting: typingsJapgolly.std.stdStrings.connecting = this.cast("connecting")
  @scala.inline
  def open: typingsJapgolly.std.stdStrings.open = this.cast("open")
}

