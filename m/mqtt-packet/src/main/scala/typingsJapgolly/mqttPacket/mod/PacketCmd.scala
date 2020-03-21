package typingsJapgolly.mqttPacket.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.mqttPacket.mqttPacketStrings.connack
  - typingsJapgolly.mqttPacket.mqttPacketStrings.connect
  - typingsJapgolly.mqttPacket.mqttPacketStrings.disconnect
  - typingsJapgolly.mqttPacket.mqttPacketStrings.pingreq
  - typingsJapgolly.mqttPacket.mqttPacketStrings.pingresp
  - typingsJapgolly.mqttPacket.mqttPacketStrings.puback
  - typingsJapgolly.mqttPacket.mqttPacketStrings.pubcomp
  - typingsJapgolly.mqttPacket.mqttPacketStrings.publish
  - typingsJapgolly.mqttPacket.mqttPacketStrings.pubrel
  - typingsJapgolly.mqttPacket.mqttPacketStrings.pubrec
  - typingsJapgolly.mqttPacket.mqttPacketStrings.suback
  - typingsJapgolly.mqttPacket.mqttPacketStrings.subscribe
  - typingsJapgolly.mqttPacket.mqttPacketStrings.unsuback
  - typingsJapgolly.mqttPacket.mqttPacketStrings.unsubscribe
*/
trait PacketCmd extends js.Object

object PacketCmd {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def connack: typingsJapgolly.mqttPacket.mqttPacketStrings.connack = this.cast("connack")
  @scala.inline
  def connect: typingsJapgolly.mqttPacket.mqttPacketStrings.connect = this.cast("connect")
  @scala.inline
  def disconnect: typingsJapgolly.mqttPacket.mqttPacketStrings.disconnect = this.cast("disconnect")
  @scala.inline
  def pingreq: typingsJapgolly.mqttPacket.mqttPacketStrings.pingreq = this.cast("pingreq")
  @scala.inline
  def pingresp: typingsJapgolly.mqttPacket.mqttPacketStrings.pingresp = this.cast("pingresp")
  @scala.inline
  def puback: typingsJapgolly.mqttPacket.mqttPacketStrings.puback = this.cast("puback")
  @scala.inline
  def pubcomp: typingsJapgolly.mqttPacket.mqttPacketStrings.pubcomp = this.cast("pubcomp")
  @scala.inline
  def publish: typingsJapgolly.mqttPacket.mqttPacketStrings.publish = this.cast("publish")
  @scala.inline
  def pubrec: typingsJapgolly.mqttPacket.mqttPacketStrings.pubrec = this.cast("pubrec")
  @scala.inline
  def pubrel: typingsJapgolly.mqttPacket.mqttPacketStrings.pubrel = this.cast("pubrel")
  @scala.inline
  def suback: typingsJapgolly.mqttPacket.mqttPacketStrings.suback = this.cast("suback")
  @scala.inline
  def subscribe: typingsJapgolly.mqttPacket.mqttPacketStrings.subscribe = this.cast("subscribe")
  @scala.inline
  def unsuback: typingsJapgolly.mqttPacket.mqttPacketStrings.unsuback = this.cast("unsuback")
  @scala.inline
  def unsubscribe: typingsJapgolly.mqttPacket.mqttPacketStrings.unsubscribe = this.cast("unsubscribe")
}

