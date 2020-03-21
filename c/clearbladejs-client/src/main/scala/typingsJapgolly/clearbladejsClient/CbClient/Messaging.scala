package typingsJapgolly.clearbladejsClient.CbClient

import japgolly.scalajs.react.Callback
import typingsJapgolly.pahoMqtt.mod._Global_.Paho.MQTT.Client
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Messaging extends js.Object {
  var URI: String
  var callTimeout: Double
  var client: Client
  var endpoint: String
  var systemKey: String
  var systemSecret: String
  var user: APIUser
  def currentTopics(callback: CbCallback): Unit
  def disconnect(): Unit
  def getAndDeleteMessageHistory(topic: String, count: Double, last: Double, start: Double, stop: Double, callback: CbCallback): Unit
  def getMessageHistory(topic: String, last: Double, count: Double, callback: CbCallback): Unit
  def getMessageHistoryWithTimeFrame(topic: String, count: Double, last: Double, start: Double, stop: Double, callback: CbCallback): Unit
  def publish(topic: String, payload: js.Object): Unit
  def publishREST(topic: String, payload: js.Object, callback: CbCallback): Unit
  def subscribe(topic: String, options: MessagingSubscribeOptions, messageCallback: MessageCallback): Unit
  def unsubscribe(topic: String, options: MessagingSubscribeOptions): Unit
}

object Messaging {
  @scala.inline
  def apply(
    URI: String,
    callTimeout: Double,
    client: Client,
    currentTopics: CbCallback => Callback,
    disconnect: Callback,
    endpoint: String,
    getAndDeleteMessageHistory: (String, Double, Double, Double, Double, CbCallback) => Callback,
    getMessageHistory: (String, Double, Double, CbCallback) => Callback,
    getMessageHistoryWithTimeFrame: (String, Double, Double, Double, Double, CbCallback) => Callback,
    publish: (String, js.Object) => Callback,
    publishREST: (String, js.Object, CbCallback) => Callback,
    subscribe: (String, MessagingSubscribeOptions, MessageCallback) => Callback,
    systemKey: String,
    systemSecret: String,
    unsubscribe: (String, MessagingSubscribeOptions) => Callback,
    user: APIUser
  ): Messaging = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], callTimeout = callTimeout.asInstanceOf[js.Any], client = client.asInstanceOf[js.Any], endpoint = endpoint.asInstanceOf[js.Any], systemKey = systemKey.asInstanceOf[js.Any], systemSecret = systemSecret.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.updateDynamic("currentTopics")(js.Any.fromFunction1((t0: typingsJapgolly.clearbladejsClient.CbClient.CbCallback) => currentTopics(t0).runNow()))
    __obj.updateDynamic("disconnect")(disconnect.toJsFn)
    __obj.updateDynamic("getAndDeleteMessageHistory")(js.Any.fromFunction6((t0: java.lang.String, t1: scala.Double, t2: scala.Double, t3: scala.Double, t4: scala.Double, t5: typingsJapgolly.clearbladejsClient.CbClient.CbCallback) => getAndDeleteMessageHistory(t0, t1, t2, t3, t4, t5).runNow()))
    __obj.updateDynamic("getMessageHistory")(js.Any.fromFunction4((t0: java.lang.String, t1: scala.Double, t2: scala.Double, t3: typingsJapgolly.clearbladejsClient.CbClient.CbCallback) => getMessageHistory(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("getMessageHistoryWithTimeFrame")(js.Any.fromFunction6((t0: java.lang.String, t1: scala.Double, t2: scala.Double, t3: scala.Double, t4: scala.Double, t5: typingsJapgolly.clearbladejsClient.CbClient.CbCallback) => getMessageHistoryWithTimeFrame(t0, t1, t2, t3, t4, t5).runNow()))
    __obj.updateDynamic("publish")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Object) => publish(t0, t1).runNow()))
    __obj.updateDynamic("publishREST")(js.Any.fromFunction3((t0: java.lang.String, t1: js.Object, t2: typingsJapgolly.clearbladejsClient.CbClient.CbCallback) => publishREST(t0, t1, t2).runNow()))
    __obj.updateDynamic("subscribe")(js.Any.fromFunction3((t0: java.lang.String, t1: typingsJapgolly.clearbladejsClient.CbClient.MessagingSubscribeOptions, t2: typingsJapgolly.clearbladejsClient.CbClient.MessageCallback) => subscribe(t0, t1, t2).runNow()))
    __obj.updateDynamic("unsubscribe")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.clearbladejsClient.CbClient.MessagingSubscribeOptions) => unsubscribe(t0, t1).runNow()))
    __obj.asInstanceOf[Messaging]
  }
}

