package typingsJapgolly.vscodeJsonrpc.messagesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.vscodeJsonrpc.vscodeJsonrpcStrings.`send-request`
  - typingsJapgolly.vscodeJsonrpc.vscodeJsonrpcStrings.`receive-request`
  - typingsJapgolly.vscodeJsonrpc.vscodeJsonrpcStrings.`send-response`
  - typingsJapgolly.vscodeJsonrpc.vscodeJsonrpcStrings.`receive-response`
  - typingsJapgolly.vscodeJsonrpc.vscodeJsonrpcStrings.`send-notification`
  - typingsJapgolly.vscodeJsonrpc.vscodeJsonrpcStrings.`receive-notification`
*/
trait LSPMessageType extends js.Object

object LSPMessageType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `receive-notification`: typingsJapgolly.vscodeJsonrpc.vscodeJsonrpcStrings.`receive-notification` = this.cast("receive-notification")
  @scala.inline
  def `receive-request`: typingsJapgolly.vscodeJsonrpc.vscodeJsonrpcStrings.`receive-request` = this.cast("receive-request")
  @scala.inline
  def `receive-response`: typingsJapgolly.vscodeJsonrpc.vscodeJsonrpcStrings.`receive-response` = this.cast("receive-response")
  @scala.inline
  def `send-notification`: typingsJapgolly.vscodeJsonrpc.vscodeJsonrpcStrings.`send-notification` = this.cast("send-notification")
  @scala.inline
  def `send-request`: typingsJapgolly.vscodeJsonrpc.vscodeJsonrpcStrings.`send-request` = this.cast("send-request")
  @scala.inline
  def `send-response`: typingsJapgolly.vscodeJsonrpc.vscodeJsonrpcStrings.`send-response` = this.cast("send-response")
}

