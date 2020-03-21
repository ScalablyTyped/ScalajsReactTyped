package typingsJapgolly.mqttPacket.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.mqttPacket.mqttPacketNumbers.`0`
  - typingsJapgolly.mqttPacket.mqttPacketNumbers.`1`
  - typingsJapgolly.mqttPacket.mqttPacketNumbers.`2`
*/
trait QoS extends js.Object

object QoS {
  @scala.inline
  def `0`: typingsJapgolly.mqttPacket.mqttPacketNumbers.`0` = this.cast(0)
  @scala.inline
  def `1`: typingsJapgolly.mqttPacket.mqttPacketNumbers.`1` = this.cast(1)
  @scala.inline
  def `2`: typingsJapgolly.mqttPacket.mqttPacketNumbers.`2` = this.cast(2)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

