package typingsJapgolly.clearbladejsClient.CbClient

import japgolly.scalajs.react.Callback
import typingsJapgolly.pahoMqtt.mod.global.Paho.MQTT.Client
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Messaging extends StObject {
  
  var URI: String
  
  var callTimeout: Double
  
  var client: Client
  
  def currentTopics(callback: CbCallback): Unit
  
  def disconnect(): Unit
  
  var endpoint: String
  
  def getAndDeleteMessageHistory(topic: String, count: Double, last: Double, start: Double, stop: Double, callback: CbCallback): Unit
  
  def getMessageHistory(topic: String, last: Double, count: Double, callback: CbCallback): Unit
  
  def getMessageHistoryWithTimeFrame(topic: String, count: Double, last: Double, start: Double, stop: Double, callback: CbCallback): Unit
  
  def publish(topic: String, payload: js.Object): Unit
  
  def publishREST(topic: String, payload: js.Object, callback: CbCallback): Unit
  
  def subscribe(topic: String, options: MessagingSubscribeOptions, messageCallback: MessageCallback): Unit
  
  var systemKey: String
  
  var systemSecret: String
  
  def unsubscribe(topic: String, options: MessagingSubscribeOptions): Unit
  
  var user: APIUser
}
object Messaging {
  
  inline def apply(
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
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], callTimeout = callTimeout.asInstanceOf[js.Any], client = client.asInstanceOf[js.Any], currentTopics = js.Any.fromFunction1((t0: CbCallback) => currentTopics(t0).runNow()), disconnect = disconnect.toJsFn, endpoint = endpoint.asInstanceOf[js.Any], getAndDeleteMessageHistory = js.Any.fromFunction6((t0: String, t1: Double, t2: Double, t3: Double, t4: Double, t5: CbCallback) => (getAndDeleteMessageHistory(t0, t1, t2, t3, t4, t5)).runNow()), getMessageHistory = js.Any.fromFunction4((t0: String, t1: Double, t2: Double, t3: CbCallback) => (getMessageHistory(t0, t1, t2, t3)).runNow()), getMessageHistoryWithTimeFrame = js.Any.fromFunction6((t0: String, t1: Double, t2: Double, t3: Double, t4: Double, t5: CbCallback) => (getMessageHistoryWithTimeFrame(t0, t1, t2, t3, t4, t5)).runNow()), publish = js.Any.fromFunction2((t0: String, t1: js.Object) => (publish(t0, t1)).runNow()), publishREST = js.Any.fromFunction3((t0: String, t1: js.Object, t2: CbCallback) => (publishREST(t0, t1, t2)).runNow()), subscribe = js.Any.fromFunction3((t0: String, t1: MessagingSubscribeOptions, t2: MessageCallback) => (subscribe(t0, t1, t2)).runNow()), systemKey = systemKey.asInstanceOf[js.Any], systemSecret = systemSecret.asInstanceOf[js.Any], unsubscribe = js.Any.fromFunction2((t0: String, t1: MessagingSubscribeOptions) => (unsubscribe(t0, t1)).runNow()), user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Messaging]
  }
  
  extension [Self <: Messaging](x: Self) {
    
    inline def setCallTimeout(value: Double): Self = StObject.set(x, "callTimeout", value.asInstanceOf[js.Any])
    
    inline def setClient(value: Client): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    inline def setCurrentTopics(value: CbCallback => Callback): Self = StObject.set(x, "currentTopics", js.Any.fromFunction1((t0: CbCallback) => value(t0).runNow()))
    
    inline def setDisconnect(value: Callback): Self = StObject.set(x, "disconnect", value.toJsFn)
    
    inline def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
    inline def setGetAndDeleteMessageHistory(value: (String, Double, Double, Double, Double, CbCallback) => Callback): Self = StObject.set(x, "getAndDeleteMessageHistory", js.Any.fromFunction6((t0: String, t1: Double, t2: Double, t3: Double, t4: Double, t5: CbCallback) => (value(t0, t1, t2, t3, t4, t5)).runNow()))
    
    inline def setGetMessageHistory(value: (String, Double, Double, CbCallback) => Callback): Self = StObject.set(x, "getMessageHistory", js.Any.fromFunction4((t0: String, t1: Double, t2: Double, t3: CbCallback) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setGetMessageHistoryWithTimeFrame(value: (String, Double, Double, Double, Double, CbCallback) => Callback): Self = StObject.set(x, "getMessageHistoryWithTimeFrame", js.Any.fromFunction6((t0: String, t1: Double, t2: Double, t3: Double, t4: Double, t5: CbCallback) => (value(t0, t1, t2, t3, t4, t5)).runNow()))
    
    inline def setPublish(value: (String, js.Object) => Callback): Self = StObject.set(x, "publish", js.Any.fromFunction2((t0: String, t1: js.Object) => (value(t0, t1)).runNow()))
    
    inline def setPublishREST(value: (String, js.Object, CbCallback) => Callback): Self = StObject.set(x, "publishREST", js.Any.fromFunction3((t0: String, t1: js.Object, t2: CbCallback) => (value(t0, t1, t2)).runNow()))
    
    inline def setSubscribe(value: (String, MessagingSubscribeOptions, MessageCallback) => Callback): Self = StObject.set(x, "subscribe", js.Any.fromFunction3((t0: String, t1: MessagingSubscribeOptions, t2: MessageCallback) => (value(t0, t1, t2)).runNow()))
    
    inline def setSystemKey(value: String): Self = StObject.set(x, "systemKey", value.asInstanceOf[js.Any])
    
    inline def setSystemSecret(value: String): Self = StObject.set(x, "systemSecret", value.asInstanceOf[js.Any])
    
    inline def setURI(value: String): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
    
    inline def setUnsubscribe(value: (String, MessagingSubscribeOptions) => Callback): Self = StObject.set(x, "unsubscribe", js.Any.fromFunction2((t0: String, t1: MessagingSubscribeOptions) => (value(t0, t1)).runNow()))
    
    inline def setUser(value: APIUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
