package typingsJapgolly.twilsock.twilsockMod

import typingsJapgolly.twilsock.configurationMod.Configuration
import typingsJapgolly.twilsock.packetinterfaceMod.PacketInterface
import typingsJapgolly.twilsock.websocketchannelMod.WebSocketChannel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Twilsock channel level protocol implementation
  */
@JSImport("twilsock/lib/twilsock", "TwilsockImpl")
@js.native
class TwilsockImpl protected () extends TwilsockChannel {
  def this(websocket: WebSocketChannel, transport: PacketInterface, config: Configuration) = this()
}

/**
  * Enum for connection state values.
  * @readonly
  * @enum {number}
  */
@JSImport("twilsock/lib/twilsock", "TwilsockImpl")
@js.native
object TwilsockImpl extends js.Object

