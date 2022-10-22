package typingsJapgolly.mqttPacket.mod

import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  - typingsJapgolly.mqttPacket.mod.IAuthPacket
*/
trait Packet extends StObject
object Packet {
  
  inline def IAuthPacket(reasonCode: Double): typingsJapgolly.mqttPacket.mod.IAuthPacket = {
    val __obj = js.Dynamic.literal(cmd = "auth", reasonCode = reasonCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.mqttPacket.mod.IAuthPacket]
  }
  
  inline def IConnackPacket(sessionPresent: Boolean): typingsJapgolly.mqttPacket.mod.IConnackPacket = {
    val __obj = js.Dynamic.literal(cmd = "connack", sessionPresent = sessionPresent.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.mqttPacket.mod.IConnackPacket]
  }
  
  inline def IConnectPacket(clientId: String): typingsJapgolly.mqttPacket.mod.IConnectPacket = {
    val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], cmd = "connect")
    __obj.asInstanceOf[typingsJapgolly.mqttPacket.mod.IConnectPacket]
  }
  
  inline def IDisconnectPacket(): typingsJapgolly.mqttPacket.mod.IDisconnectPacket = {
    val __obj = js.Dynamic.literal(cmd = "disconnect")
    __obj.asInstanceOf[typingsJapgolly.mqttPacket.mod.IDisconnectPacket]
  }
  
  inline def IPingreqPacket(): typingsJapgolly.mqttPacket.mod.IPingreqPacket = {
    val __obj = js.Dynamic.literal(cmd = "pingreq")
    __obj.asInstanceOf[typingsJapgolly.mqttPacket.mod.IPingreqPacket]
  }
  
  inline def IPingrespPacket(): typingsJapgolly.mqttPacket.mod.IPingrespPacket = {
    val __obj = js.Dynamic.literal(cmd = "pingresp")
    __obj.asInstanceOf[typingsJapgolly.mqttPacket.mod.IPingrespPacket]
  }
  
  inline def IPubackPacket(): typingsJapgolly.mqttPacket.mod.IPubackPacket = {
    val __obj = js.Dynamic.literal(cmd = "puback")
    __obj.asInstanceOf[typingsJapgolly.mqttPacket.mod.IPubackPacket]
  }
  
  inline def IPubcompPacket(): typingsJapgolly.mqttPacket.mod.IPubcompPacket = {
    val __obj = js.Dynamic.literal(cmd = "pubcomp")
    __obj.asInstanceOf[typingsJapgolly.mqttPacket.mod.IPubcompPacket]
  }
  
  inline def IPublishPacket(dup: Boolean, payload: String | Buffer, qos: QoS, retain: Boolean, topic: String): typingsJapgolly.mqttPacket.mod.IPublishPacket = {
    val __obj = js.Dynamic.literal(cmd = "publish", dup = dup.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], qos = qos.asInstanceOf[js.Any], retain = retain.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.mqttPacket.mod.IPublishPacket]
  }
  
  inline def IPubrecPacket(): typingsJapgolly.mqttPacket.mod.IPubrecPacket = {
    val __obj = js.Dynamic.literal(cmd = "pubrec")
    __obj.asInstanceOf[typingsJapgolly.mqttPacket.mod.IPubrecPacket]
  }
  
  inline def IPubrelPacket(): typingsJapgolly.mqttPacket.mod.IPubrelPacket = {
    val __obj = js.Dynamic.literal(cmd = "pubrel")
    __obj.asInstanceOf[typingsJapgolly.mqttPacket.mod.IPubrelPacket]
  }
  
  inline def ISubackPacket(granted: js.Array[Double | js.Object]): typingsJapgolly.mqttPacket.mod.ISubackPacket = {
    val __obj = js.Dynamic.literal(cmd = "suback", granted = granted.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.mqttPacket.mod.ISubackPacket]
  }
  
  inline def ISubscribePacket(subscriptions: js.Array[ISubscription]): typingsJapgolly.mqttPacket.mod.ISubscribePacket = {
    val __obj = js.Dynamic.literal(cmd = "subscribe", subscriptions = subscriptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.mqttPacket.mod.ISubscribePacket]
  }
  
  inline def IUnsubackPacket(): typingsJapgolly.mqttPacket.mod.IUnsubackPacket = {
    val __obj = js.Dynamic.literal(cmd = "unsuback")
    __obj.asInstanceOf[typingsJapgolly.mqttPacket.mod.IUnsubackPacket]
  }
  
  inline def IUnsubscribePacket(unsubscriptions: js.Array[String]): typingsJapgolly.mqttPacket.mod.IUnsubscribePacket = {
    val __obj = js.Dynamic.literal(cmd = "unsubscribe", unsubscriptions = unsubscriptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.mqttPacket.mod.IUnsubscribePacket]
  }
}
