package typingsJapgolly.mqtt

import typingsJapgolly.mqtt.mqttStrings.mqtts
import typingsJapgolly.mqtt.mqttStrings.ssl
import typingsJapgolly.mqtt.mqttStrings.tcp
import typingsJapgolly.mqtt.mqttStrings.ws
import typingsJapgolly.mqtt.mqttStrings.wss
import typingsJapgolly.mqtt.mqttStrings.wx
import typingsJapgolly.mqtt.mqttStrings.wxs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHost extends js.Object {
  var host: String
  var port: Double
  var protocol: js.UndefOr[wss | ws | typingsJapgolly.mqtt.mqttStrings.mqtt | mqtts | tcp | ssl | wx | wxs] = js.undefined
}

object AnonHost {
  @scala.inline
  def apply(
    host: String,
    port: Double,
    protocol: wss | ws | typingsJapgolly.mqtt.mqttStrings.mqtt | mqtts | tcp | ssl | wx | wxs = null
  ): AnonHost = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHost]
  }
}

