package typingsJapgolly.twilsock.protocolMod.Protocol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.twilsock.twilsockStrings.notification
  - typingsJapgolly.twilsock.twilsockStrings.message
  - typingsJapgolly.twilsock.twilsockStrings.reply
  - typingsJapgolly.twilsock.twilsockStrings.ping
  - typingsJapgolly.twilsock.twilsockStrings.close
  - typingsJapgolly.twilsock.twilsockStrings.init
*/
trait MessageType extends js.Object

object MessageType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def close: typingsJapgolly.twilsock.twilsockStrings.close = this.cast("close")
  @scala.inline
  def init: typingsJapgolly.twilsock.twilsockStrings.init = this.cast("init")
  @scala.inline
  def message: typingsJapgolly.twilsock.twilsockStrings.message = this.cast("message")
  @scala.inline
  def notification: typingsJapgolly.twilsock.twilsockStrings.notification = this.cast("notification")
  @scala.inline
  def ping: typingsJapgolly.twilsock.twilsockStrings.ping = this.cast("ping")
  @scala.inline
  def reply: typingsJapgolly.twilsock.twilsockStrings.reply = this.cast("reply")
}

