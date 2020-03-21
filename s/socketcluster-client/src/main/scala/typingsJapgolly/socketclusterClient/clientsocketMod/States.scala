package typingsJapgolly.socketclusterClient.clientsocketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.socketclusterClient.socketclusterClientStrings.connecting
  - typingsJapgolly.socketclusterClient.socketclusterClientStrings.open
  - typingsJapgolly.socketclusterClient.socketclusterClientStrings.closed
*/
trait States extends js.Object

object States {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def closed: typingsJapgolly.socketclusterClient.socketclusterClientStrings.closed = this.cast("closed")
  @scala.inline
  def connecting: typingsJapgolly.socketclusterClient.socketclusterClientStrings.connecting = this.cast("connecting")
  @scala.inline
  def open: typingsJapgolly.socketclusterClient.socketclusterClientStrings.open = this.cast("open")
}

