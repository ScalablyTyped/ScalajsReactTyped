package typingsJapgolly.sccBrokerClient.clusterBrokerClientMod

import typingsJapgolly.asyncStreamEmitter.mod.AsyncStreamEmitter
import typingsJapgolly.jsonwebtoken.mod.Secret
import typingsJapgolly.sccBrokerClient.AnonError
import typingsJapgolly.sccBrokerClient.AnonNoMatchingPublishTargetError
import typingsJapgolly.sccBrokerClient.clientPoolMod.PublishData
import typingsJapgolly.sccBrokerClient.clientPoolMod.PublishFailData
import typingsJapgolly.sccBrokerClient.clientPoolMod.SubscribeData
import typingsJapgolly.sccBrokerClient.clientPoolMod.SubscribeFailData
import typingsJapgolly.sccBrokerClient.mod.MappingEngine
import typingsJapgolly.sccBrokerClient.sccBrokerClientStrings.error
import typingsJapgolly.sccBrokerClient.sccBrokerClientStrings.message
import typingsJapgolly.sccBrokerClient.sccBrokerClientStrings.publish
import typingsJapgolly.sccBrokerClient.sccBrokerClientStrings.publishFail
import typingsJapgolly.sccBrokerClient.sccBrokerClientStrings.simple
import typingsJapgolly.sccBrokerClient.sccBrokerClientStrings.skeletonRendezvous
import typingsJapgolly.sccBrokerClient.sccBrokerClientStrings.subscribe
import typingsJapgolly.sccBrokerClient.sccBrokerClientStrings.subscribeFail
import typingsJapgolly.sccBrokerClient.sccBrokerClientStrings.updateBrokers
import typingsJapgolly.sccBrokerClient.sccBrokerClientStrings.updateWorkers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterBrokerClient
  extends AsyncStreamEmitter[js.Any] {
  var authKey: js.UndefOr[Secret] = js.native
  var broker: typingsJapgolly.scBroker.scbrokerMod.^ = js.native
  var clientPoolSize: Double = js.native
  var errors: AnonNoMatchingPublishTargetError = js.native
  var isReady: Boolean = js.native
  var mapper: MappingEngine = js.native
  var mappingEngine: skeletonRendezvous | simple | MappingEngine = js.native
  var sccBrokerClientPools: js.Array[typingsJapgolly.sccBrokerClient.clientPoolMod.^] = js.native
  var sccBrokerURIList: js.Array[String] = js.native
  @JSName("emit")
  def emit_error(eventName: error, data: AnonError): Unit = js.native
  @JSName("emit")
  def emit_message(eventName: message, data: MessageData): Unit = js.native
  @JSName("emit")
  def emit_publish(eventName: publish, data: PublishData): Unit = js.native
  @JSName("emit")
  def emit_publishFail(eventName: publishFail, data: PublishFailData): Unit = js.native
  @JSName("emit")
  def emit_subscribe(event: subscribe, data: SubscribeData): Unit = js.native
  @JSName("emit")
  def emit_subscribeFail(event: subscribeFail, data: SubscribeFailData): Unit = js.native
  @JSName("emit")
  def emit_updateBrokers(eventName: updateBrokers, data: UpdateBrokersData): Unit = js.native
  @JSName("emit")
  def emit_updateWorkers(eventName: updateWorkers, data: UpdateWorkersData): Unit = js.native
  def getAllSubscriptions(): js.Array[String] = js.native
  def invokePublish(channelName: String, data: js.Any): Unit = js.native
  @JSName("listener")
  def listener_error(eventName: error): typingsJapgolly.consumableStream.mod.^[AnonError] = js.native
  @JSName("listener")
  def listener_message(eventName: message): typingsJapgolly.consumableStream.mod.^[MessageData] = js.native
  @JSName("listener")
  def listener_publish(eventName: publish): typingsJapgolly.consumableStream.mod.^[PublishData] = js.native
  @JSName("listener")
  def listener_publishFail(eventName: publishFail): typingsJapgolly.consumableStream.mod.^[PublishFailData] = js.native
  @JSName("listener")
  def listener_subscribe(event: subscribe): typingsJapgolly.consumableStream.mod.^[SubscribeData] = js.native
  @JSName("listener")
  def listener_subscribeFail(event: subscribeFail): typingsJapgolly.consumableStream.mod.^[SubscribeFailData] = js.native
  @JSName("listener")
  def listener_updateBrokers(eventName: updateBrokers): typingsJapgolly.consumableStream.mod.^[UpdateBrokersData] = js.native
  @JSName("listener")
  def listener_updateWorkers(eventName: updateWorkers): typingsJapgolly.consumableStream.mod.^[UpdateWorkersData] = js.native
  def mapChannelNameToBrokerURI(channelName: String): String = js.native
  def setBrokers(sccBrokerURIList: js.Array[String]): Unit = js.native
  def subscribe(channelName: String): Unit = js.native
  def unsubscribe(channelName: String): Unit = js.native
}

