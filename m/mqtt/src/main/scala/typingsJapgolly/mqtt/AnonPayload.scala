package typingsJapgolly.mqtt

import typingsJapgolly.mqttPacket.mod.QoS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPayload extends js.Object {
  /**
    * the message to publish
    */
  var payload: String
  /*
    *  properies object of will
    * */
  var properties: js.UndefOr[AnonContentType] = js.undefined
  /**
    * the QoS
    */
  var qos: QoS
  /**
    * the retain flag
    */
  var retain: Boolean
  /**
    * the topic to publish
    */
  var topic: String
}

object AnonPayload {
  @scala.inline
  def apply(payload: String, qos: QoS, retain: Boolean, topic: String, properties: AnonContentType = null): AnonPayload = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], qos = qos.asInstanceOf[js.Any], retain = retain.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPayload]
  }
}

