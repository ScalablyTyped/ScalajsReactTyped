package typingsJapgolly.phoenix.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.phoenix.phoenixStrings.connecting
  - typingsJapgolly.phoenix.phoenixStrings.open
  - typingsJapgolly.phoenix.phoenixStrings.closing
  - typingsJapgolly.phoenix.phoenixStrings.closed
*/
trait ConnectionState extends js.Object

object ConnectionState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def closed: typingsJapgolly.phoenix.phoenixStrings.closed = this.cast("closed")
  @scala.inline
  def closing: typingsJapgolly.phoenix.phoenixStrings.closing = this.cast("closing")
  @scala.inline
  def connecting: typingsJapgolly.phoenix.phoenixStrings.connecting = this.cast("connecting")
  @scala.inline
  def open: typingsJapgolly.phoenix.phoenixStrings.open = this.cast("open")
}

