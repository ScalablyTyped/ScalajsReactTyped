package typingsJapgolly.sccBrokerClient.clientPoolMod

import typingsJapgolly.asyncStreamEmitter.mod.AsyncStreamEmitter
import typingsJapgolly.jsonwebtoken.mod.Secret
import typingsJapgolly.sccBrokerClient.AnonError
import typingsJapgolly.sccBrokerClient.sccBrokerClientStrings.error
import typingsJapgolly.sccBrokerClient.sccBrokerClientStrings.publish
import typingsJapgolly.sccBrokerClient.sccBrokerClientStrings.publishFail
import typingsJapgolly.sccBrokerClient.sccBrokerClientStrings.subscribe
import typingsJapgolly.sccBrokerClient.sccBrokerClientStrings.subscribeFail
import typingsJapgolly.socketclusterClient.clientsocketMod.SubscribeOptions
import typingsJapgolly.socketclusterClient.mod.AGClientSocket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientPool
  extends AsyncStreamEmitter[js.Any] {
  var authKey: js.UndefOr[Secret] = js.native
  var clientCount: Double = js.native
  var clients: js.Array[AGClientSocket] = js.native
  var hasher: typingsJapgolly.sccBrokerClient.hasherMod.^ = js.native
  var targetURI: String = js.native
  def breakDownURI(uri: String): BrokenDownURI = js.native
  def closeChannel(channelName: String): Unit = js.native
  def destroy(): Unit = js.native
  @JSName("emit")
  def emit_error(eventName: error, data: AnonError): Unit = js.native
  @JSName("emit")
  def emit_publish(eventName: publish, data: PublishData): Unit = js.native
  @JSName("emit")
  def emit_publishFail(eventName: publishFail, data: PublishFailData): Unit = js.native
  @JSName("emit")
  def emit_subscribe(eventName: subscribe, data: SubscribeData): Unit = js.native
  @JSName("emit")
  def emit_subscribeFail(eventName: subscribeFail, data: SubscribeFailData): Unit = js.native
  def invokePublish(channelName: String, data: js.Any): js.Promise[Unit] = js.native
  def isSubscribed(channelName: String): Boolean = js.native
  def isSubscribed(channelName: String, includePending: Boolean): Boolean = js.native
  @JSName("listener")
  def listener_error(eventName: error): typingsJapgolly.consumableStream.mod.^[AnonError] = js.native
  @JSName("listener")
  def listener_publish(eventName: publish): typingsJapgolly.consumableStream.mod.^[PublishData] = js.native
  @JSName("listener")
  def listener_publishFail(eventName: publishFail): typingsJapgolly.consumableStream.mod.^[PublishFailData] = js.native
  @JSName("listener")
  def listener_subscribe(eventName: subscribe): typingsJapgolly.consumableStream.mod.^[SubscribeData] = js.native
  @JSName("listener")
  def listener_subscribeFail(eventName: subscribeFail): typingsJapgolly.consumableStream.mod.^[SubscribeFailData] = js.native
  def selectClient(key: String): AGClientSocket = js.native
  def subscribe(channelName: String): typingsJapgolly.agChannel.mod.^[_] = js.native
  def subscribe(channelName: String, options: SubscribeOptions): typingsJapgolly.agChannel.mod.^[_] = js.native
  def subscriptions(): js.Array[String] = js.native
  def subscriptions(includePending: Boolean): js.Array[String] = js.native
  def unsubscribe(channelName: String): js.Promise[Unit] = js.native
}

