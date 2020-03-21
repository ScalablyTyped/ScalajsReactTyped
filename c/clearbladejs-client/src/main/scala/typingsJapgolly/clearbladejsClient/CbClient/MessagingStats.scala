package typingsJapgolly.clearbladejsClient.CbClient

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessagingStats extends js.Object {
  var URI: String
  var endpoint: String
  var systemKey: String
  var user: APIUser
  def getAveragePayloadSize(topic: String, start: Double, stop: Double, callback: CbCallback): Unit
  def getCurrentSubscribers(topic: String, callback: CbCallback): Unit
  def getOpenConnections(callback: CbCallback): Unit
}

object MessagingStats {
  @scala.inline
  def apply(
    URI: String,
    endpoint: String,
    getAveragePayloadSize: (String, Double, Double, CbCallback) => Callback,
    getCurrentSubscribers: (String, CbCallback) => Callback,
    getOpenConnections: CbCallback => Callback,
    systemKey: String,
    user: APIUser
  ): MessagingStats = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], endpoint = endpoint.asInstanceOf[js.Any], systemKey = systemKey.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.updateDynamic("getAveragePayloadSize")(js.Any.fromFunction4((t0: java.lang.String, t1: scala.Double, t2: scala.Double, t3: typingsJapgolly.clearbladejsClient.CbClient.CbCallback) => getAveragePayloadSize(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("getCurrentSubscribers")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.clearbladejsClient.CbClient.CbCallback) => getCurrentSubscribers(t0, t1).runNow()))
    __obj.updateDynamic("getOpenConnections")(js.Any.fromFunction1((t0: typingsJapgolly.clearbladejsClient.CbClient.CbCallback) => getOpenConnections(t0).runNow()))
    __obj.asInstanceOf[MessagingStats]
  }
}

