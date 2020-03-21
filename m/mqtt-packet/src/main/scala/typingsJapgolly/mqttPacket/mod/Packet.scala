package typingsJapgolly.mqttPacket.mod

import typingsJapgolly.mqttPacket.AnonAssignedClientIdentifier
import typingsJapgolly.mqttPacket.AnonAuthenticationData
import typingsJapgolly.mqttPacket.AnonCorrelationData
import typingsJapgolly.mqttPacket.AnonPayload
import typingsJapgolly.mqttPacket.AnonReasonString
import typingsJapgolly.mqttPacket.AnonServerReference
import typingsJapgolly.mqttPacket.mqttPacketNumbers.`3`
import typingsJapgolly.mqttPacket.mqttPacketNumbers.`4`
import typingsJapgolly.mqttPacket.mqttPacketNumbers.`5`
import typingsJapgolly.mqttPacket.mqttPacketStrings.MQIsdp
import typingsJapgolly.mqttPacket.mqttPacketStrings.MQTT
import typingsJapgolly.mqttPacket.mqttPacketStrings.connack
import typingsJapgolly.mqttPacket.mqttPacketStrings.connect
import typingsJapgolly.mqttPacket.mqttPacketStrings.disconnect
import typingsJapgolly.mqttPacket.mqttPacketStrings.pingreq
import typingsJapgolly.mqttPacket.mqttPacketStrings.pingresp
import typingsJapgolly.mqttPacket.mqttPacketStrings.puback
import typingsJapgolly.mqttPacket.mqttPacketStrings.pubcomp
import typingsJapgolly.mqttPacket.mqttPacketStrings.publish
import typingsJapgolly.mqttPacket.mqttPacketStrings.pubrec
import typingsJapgolly.mqttPacket.mqttPacketStrings.pubrel
import typingsJapgolly.mqttPacket.mqttPacketStrings.suback
import typingsJapgolly.mqttPacket.mqttPacketStrings.subscribe
import typingsJapgolly.mqttPacket.mqttPacketStrings.unsuback
import typingsJapgolly.mqttPacket.mqttPacketStrings.unsubscribe
import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.mqttPacket.mod.IConnectPacket
  - typingsJapgolly.mqttPacket.mod.IPublishPacket
  - typingsJapgolly.mqttPacket.mod.IConnackPacket
  - typingsJapgolly.mqttPacket.mod.ISubscribePacket
  - typingsJapgolly.mqttPacket.mod.ISubackPacket
  - typingsJapgolly.mqttPacket.mod.IUnsubscribePacket
  - typingsJapgolly.mqttPacket.mod.IUnsubackPacket
  - typingsJapgolly.mqttPacket.mod.IPubackPacket
  - typingsJapgolly.mqttPacket.mod.IPubcompPacket
  - typingsJapgolly.mqttPacket.mod.IPubrelPacket
  - typingsJapgolly.mqttPacket.mod.IPingreqPacket
  - typingsJapgolly.mqttPacket.mod.IPingrespPacket
  - typingsJapgolly.mqttPacket.mod.IDisconnectPacket
  - typingsJapgolly.mqttPacket.mod.IPubrecPacket
*/
trait Packet extends js.Object

object Packet {
  @scala.inline
  def IPingreqPacket(cmd: pingreq, length: Int | Double = null, messageId: Int | Double = null): Packet = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (messageId != null) __obj.updateDynamic("messageId")(messageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Packet]
  }
  @scala.inline
  def IPubrelPacket(
    cmd: pubrel,
    length: Int | Double = null,
    messageId: Int | Double = null,
    properties: AnonReasonString = null
  ): Packet = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (messageId != null) __obj.updateDynamic("messageId")(messageId.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[Packet]
  }
  @scala.inline
  def IConnectPacket(
    clientId: String,
    cmd: connect,
    clean: js.UndefOr[Boolean] = js.undefined,
    keepalive: Int | Double = null,
    length: Int | Double = null,
    messageId: Int | Double = null,
    password: Buffer = null,
    properties: AnonAuthenticationData = null,
    protocolId: MQTT | MQIsdp = null,
    protocolVersion: `4` | `5` | `3` = null,
    username: String = null,
    will: AnonPayload = null
  ): Packet = {
    val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], cmd = cmd.asInstanceOf[js.Any])
    if (!js.isUndefined(clean)) __obj.updateDynamic("clean")(clean.asInstanceOf[js.Any])
    if (keepalive != null) __obj.updateDynamic("keepalive")(keepalive.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (messageId != null) __obj.updateDynamic("messageId")(messageId.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    if (protocolId != null) __obj.updateDynamic("protocolId")(protocolId.asInstanceOf[js.Any])
    if (protocolVersion != null) __obj.updateDynamic("protocolVersion")(protocolVersion.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    if (will != null) __obj.updateDynamic("will")(will.asInstanceOf[js.Any])
    __obj.asInstanceOf[Packet]
  }
  @scala.inline
  def IConnackPacket(
    cmd: connack,
    returnCode: Double,
    sessionPresent: Boolean,
    length: Int | Double = null,
    messageId: Int | Double = null,
    properties: AnonAssignedClientIdentifier = null
  ): Packet = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any], returnCode = returnCode.asInstanceOf[js.Any], sessionPresent = sessionPresent.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (messageId != null) __obj.updateDynamic("messageId")(messageId.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[Packet]
  }
  @scala.inline
  def IUnsubackPacket(
    cmd: unsuback,
    length: Int | Double = null,
    messageId: Int | Double = null,
    properties: AnonReasonString = null
  ): Packet = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (messageId != null) __obj.updateDynamic("messageId")(messageId.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[Packet]
  }
  @scala.inline
  def IPubackPacket(
    cmd: puback,
    length: Int | Double = null,
    messageId: Int | Double = null,
    properties: AnonReasonString = null
  ): Packet = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (messageId != null) __obj.updateDynamic("messageId")(messageId.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[Packet]
  }
  @scala.inline
  def IPingrespPacket(cmd: pingresp, length: Int | Double = null, messageId: Int | Double = null): Packet = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (messageId != null) __obj.updateDynamic("messageId")(messageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Packet]
  }
  @scala.inline
  def IUnsubscribePacket(
    cmd: unsubscribe,
    unsubscriptions: js.Array[String],
    length: Int | Double = null,
    messageId: Int | Double = null,
    properties: AnonReasonString = null
  ): Packet = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any], unsubscriptions = unsubscriptions.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (messageId != null) __obj.updateDynamic("messageId")(messageId.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[Packet]
  }
  @scala.inline
  def ISubscribePacket(
    cmd: subscribe,
    subscriptions: js.Array[ISubscription],
    length: Int | Double = null,
    messageId: Int | Double = null,
    properties: AnonReasonString = null
  ): Packet = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any], subscriptions = subscriptions.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (messageId != null) __obj.updateDynamic("messageId")(messageId.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[Packet]
  }
  @scala.inline
  def ISubackPacket(
    cmd: suback,
    granted: js.Array[Double | js.Object],
    length: Int | Double = null,
    messageId: Int | Double = null,
    properties: AnonReasonString = null
  ): Packet = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any], granted = granted.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (messageId != null) __obj.updateDynamic("messageId")(messageId.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[Packet]
  }
  @scala.inline
  def IDisconnectPacket(
    cmd: disconnect,
    length: Int | Double = null,
    messageId: Int | Double = null,
    properties: AnonServerReference = null
  ): Packet = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (messageId != null) __obj.updateDynamic("messageId")(messageId.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[Packet]
  }
  @scala.inline
  def IPublishPacket(
    cmd: publish,
    dup: Boolean,
    payload: String | Buffer,
    qos: QoS,
    retain: Boolean,
    topic: String,
    length: Int | Double = null,
    messageId: Int | Double = null,
    properties: AnonCorrelationData = null
  ): Packet = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any], dup = dup.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], qos = qos.asInstanceOf[js.Any], retain = retain.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (messageId != null) __obj.updateDynamic("messageId")(messageId.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[Packet]
  }
  @scala.inline
  def IPubcompPacket(
    cmd: pubcomp,
    length: Int | Double = null,
    messageId: Int | Double = null,
    properties: AnonReasonString = null
  ): Packet = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (messageId != null) __obj.updateDynamic("messageId")(messageId.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[Packet]
  }
  @scala.inline
  def IPubrecPacket(
    cmd: pubrec,
    length: Int | Double = null,
    messageId: Int | Double = null,
    properties: AnonReasonString = null
  ): Packet = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (messageId != null) __obj.updateDynamic("messageId")(messageId.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[Packet]
  }
}

