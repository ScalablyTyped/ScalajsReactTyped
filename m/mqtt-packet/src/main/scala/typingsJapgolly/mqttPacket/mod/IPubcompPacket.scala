package typingsJapgolly.mqttPacket.mod

import typingsJapgolly.mqttPacket.AnonReasonString
import typingsJapgolly.mqttPacket.mqttPacketStrings.pubcomp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPubcompPacket
  extends IPacket
     with Packet {
  @JSName("cmd")
  var cmd_IPubcompPacket: pubcomp
  var properties: js.UndefOr[AnonReasonString] = js.undefined
}

object IPubcompPacket {
  @scala.inline
  def apply(
    cmd: pubcomp,
    length: Int | Double = null,
    messageId: Int | Double = null,
    properties: AnonReasonString = null
  ): IPubcompPacket = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (messageId != null) __obj.updateDynamic("messageId")(messageId.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPubcompPacket]
  }
}

