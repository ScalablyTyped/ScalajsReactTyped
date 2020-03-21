package typingsJapgolly.scBroker.scbrokerMod

import typingsJapgolly.expirymanager.mod.ExpiryManager
import typingsJapgolly.fleximap.mod.FlexiMap
import typingsJapgolly.fleximap.mod.KeyChain
import typingsJapgolly.node.eventsMod.EventEmitter
import typingsJapgolly.scBroker.scBrokerStrings.broker
import typingsJapgolly.scBroker.scBrokerStrings.masterMessage
import typingsJapgolly.scBroker.scBrokerStrings.message
import typingsJapgolly.scBroker.scBrokerStrings.publish
import typingsJapgolly.scBroker.scBrokerStrings.publishIn
import typingsJapgolly.scBroker.scBrokerStrings.subscribe
import typingsJapgolly.scBroker.scBrokerStrings.unsubscribe
import typingsJapgolly.scBroker.scBrokerStrings.warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SCBroker extends EventEmitter {
  val MIDDLEWARE_PUBLISH_IN: publishIn = js.native
  val MIDDLEWARE_SUBSCRIBE: subscribe = js.native
  var dataExpirer: ExpiryManager = js.native
  var dataMap: FlexiMap = js.native
  var debugPort: Double = js.native
  var id: Double = js.native
  var instanceId: Double = js.native
  var options: SCBrokerOptions = js.native
  var subscriptions: Subscriptions = js.native
  val `type`: broker = js.native
  @JSName("addMiddleware")
  def addMiddleware_publish(`type`: publish, middleware: PublishMiddleware): Unit = js.native
  @JSName("addMiddleware")
  def addMiddleware_subscribe(`type`: subscribe, middleware: SubscribeMiddleware): Unit = js.native
  def exec(query: QueryFunction): js.Any = js.native
  def exec(query: QueryFunction, baseKey: KeyChain): js.Any = js.native
  @JSName("on")
  def on_masterMessage(
    event: masterMessage,
    listener: js.Function2[
      /* data */ js.Any, 
      /* respond */ js.Function2[/* err */ js.Error | Null, /* responseData */ js.Any, Unit], 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_message(
    event: message,
    listener: js.Function2[
      /* message */ js.Any, 
      /* respond */ js.Function2[/* err */ js.Error | Null, /* responseData */ js.Any, Unit], 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_publish(event: publish, listener: js.Function2[/* channel */ String, /* data */ js.Any, Unit]): this.type = js.native
  @JSName("on")
  def on_subscribe(event: subscribe, listener: js.Function1[/* channel */ String, Unit]): this.type = js.native
  @JSName("on")
  def on_unsubscribe(event: unsubscribe, listener: js.Function1[/* channel */ String, Unit]): this.type = js.native
  @JSName("on")
  def on_warning(event: warning, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  def publish(channel: String, message: js.Any): Unit = js.native
  @JSName("removeMiddleware")
  def removeMiddleware_publish(`type`: publish, middleware: PublishMiddleware): Unit = js.native
  @JSName("removeMiddleware")
  def removeMiddleware_subscribe(`type`: subscribe, middleware: SubscribeMiddleware): Unit = js.native
  def run(): Unit = js.native
  def sendToMaster(data: js.Any): Unit = js.native
  def sendToMaster(data: js.Any, callback: js.Function2[/* err */ js.Error | Null, /* responseData */ js.Any, Unit]): Unit = js.native
}

