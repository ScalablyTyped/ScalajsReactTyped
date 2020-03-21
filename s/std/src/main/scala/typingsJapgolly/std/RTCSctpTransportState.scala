package typingsJapgolly.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.std.stdStrings.closed
  - typingsJapgolly.std.stdStrings.connected
  - typingsJapgolly.std.stdStrings.connecting
*/
trait RTCSctpTransportState extends js.Object

object RTCSctpTransportState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def closed: typingsJapgolly.std.stdStrings.closed = this.cast("closed")
  @scala.inline
  def connected: typingsJapgolly.std.stdStrings.connected = this.cast("connected")
  @scala.inline
  def connecting: typingsJapgolly.std.stdStrings.connecting = this.cast("connecting")
}

