package typingsJapgolly.mqtt

import typingsJapgolly.mqtt.clientMod.IStream
import typingsJapgolly.mqtt.clientOptionsMod.IClientOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mqtt/types/lib/connect", JSImport.Namespace)
@js.native
object connectMod extends js.Object {
  @js.native
  class MqttClient protected ()
    extends typingsJapgolly.mqtt.clientMod.MqttClient {
    def this(
      streamBuilder: js.Function1[/* client */ typingsJapgolly.mqtt.clientMod.MqttClient, IStream],
      options: IClientOptions
    ) = this()
  }
  
  /**
    * connect - connect to an MQTT broker.
    *
    * @param {String} [brokerUrl] - url of the broker, optional
    * @param {Object} opts - see MqttClient#constructor
    */
  def connect(): typingsJapgolly.mqtt.clientMod.MqttClient = js.native
  def connect(brokerUrl: String): typingsJapgolly.mqtt.clientMod.MqttClient = js.native
  def connect(brokerUrl: String, opts: IClientOptions): typingsJapgolly.mqtt.clientMod.MqttClient = js.native
  def connect(brokerUrl: js.Any): typingsJapgolly.mqtt.clientMod.MqttClient = js.native
  def connect(brokerUrl: js.Any, opts: IClientOptions): typingsJapgolly.mqtt.clientMod.MqttClient = js.native
}

