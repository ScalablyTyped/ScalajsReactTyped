package typingsJapgolly.socketclusterServer.serverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.socketclusterServer.socketclusterServerStrings.handshake
  - typingsJapgolly.socketclusterServer.socketclusterServerStrings.inboundRaw
  - typingsJapgolly.socketclusterServer.socketclusterServerStrings.inbound
  - typingsJapgolly.socketclusterServer.socketclusterServerStrings.outbound
*/
trait Middlewares extends js.Object

object Middlewares {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def handshake: typingsJapgolly.socketclusterServer.socketclusterServerStrings.handshake = this.cast("handshake")
  @scala.inline
  def inbound: typingsJapgolly.socketclusterServer.socketclusterServerStrings.inbound = this.cast("inbound")
  @scala.inline
  def inboundRaw: typingsJapgolly.socketclusterServer.socketclusterServerStrings.inboundRaw = this.cast("inboundRaw")
  @scala.inline
  def outbound: typingsJapgolly.socketclusterServer.socketclusterServerStrings.outbound = this.cast("outbound")
}

