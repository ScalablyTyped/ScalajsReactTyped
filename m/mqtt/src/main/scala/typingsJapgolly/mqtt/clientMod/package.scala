package typingsJapgolly.mqtt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientMod {
  type ClientSubscribeCallback = js.Function2[
    /* err */ js.Error, 
    /* granted */ js.Array[typingsJapgolly.mqtt.clientMod.ISubscriptionGrant], 
    scala.Unit
  ]
  type CloseCallback = js.Function0[scala.Unit]
  type ISubscriptionMap = /**
    * object which has topic names as object keys and as value the options, like {'test1': {qos: 0}, 'test2': {qos: 2}}.
    */
  org.scalablytyped.runtime.StringDictionary[typingsJapgolly.mqtt.AnonNl]
  type OnErrorCallback = js.Function1[/* error */ js.Error, scala.Unit]
  type OnMessageCallback = js.Function3[
    /* topic */ java.lang.String, 
    /* payload */ typingsJapgolly.node.Buffer, 
    /* packet */ typingsJapgolly.mqttPacket.mod.Packet, 
    scala.Unit
  ]
  type OnPacketCallback = js.Function1[/* packet */ typingsJapgolly.mqttPacket.mod.Packet, scala.Unit]
  type PacketCallback = js.Function2[
    /* error */ js.UndefOr[js.Error], 
    /* packet */ js.UndefOr[typingsJapgolly.mqttPacket.mod.Packet], 
    js.Any
  ]
}
