package typingsJapgolly.mqttPacket.mod

import typingsJapgolly.mqttPacket.mqttPacketStrings.error
import typingsJapgolly.mqttPacket.mqttPacketStrings.packet
import typingsJapgolly.node.Buffer
import typingsJapgolly.node.NodeJS.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Parser_ extends EventEmitter {
  @JSName("on")
  def on_error(event: error, callback: js.Function1[/* error */ js.Any, Unit]): this.type = js.native
  @JSName("on")
  def on_packet(event: packet, callback: js.Function1[/* packet */ Packet, Unit]): this.type = js.native
  def parse(buffer: Buffer): Double = js.native
  def parse(buffer: Buffer, opts: js.Object): Double = js.native
}

