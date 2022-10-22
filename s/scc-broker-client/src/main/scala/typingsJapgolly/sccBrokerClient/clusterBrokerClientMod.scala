package typingsJapgolly.sccBrokerClient

import typingsJapgolly.jsonwebtoken.mod.Secret
import typingsJapgolly.sccBrokerClient.anon.Error
import typingsJapgolly.sccBrokerClient.anon.NoMatchingPublishTargetError
import typingsJapgolly.sccBrokerClient.clientPoolMod.PublishData
import typingsJapgolly.sccBrokerClient.clientPoolMod.PublishFailData
import typingsJapgolly.sccBrokerClient.clientPoolMod.SubscribeData
import typingsJapgolly.sccBrokerClient.clientPoolMod.SubscribeFailData
import typingsJapgolly.sccBrokerClient.mod.Broker
import typingsJapgolly.sccBrokerClient.mod.MappingEngine
import typingsJapgolly.sccBrokerClient.mod.SCCBrokerClientOptions
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clusterBrokerClientMod {
  
  @JSImport("scc-broker-client/cluster-broker-client", JSImport.Namespace)
  @js.native
  open class ^ protected () extends ClusterBrokerClient {
    def this(broker: typingsJapgolly.scBroker.scbrokerMod.^) = this()
    def this(broker: typingsJapgolly.scBroker.scbrokerMod.^, options: SCCBrokerClientOptions) = this()
  }
  
  @js.native
  trait ClusterBrokerClient
    extends typingsJapgolly.asyncStreamEmitter.mod.^[Any] {
    
    var authKey: js.UndefOr[Secret] = js.native
    
    var broker: Broker = js.native
    
    var clientPoolSize: Double = js.native
    
    @JSName("emit")
    def emit_error(eventName: error, data: Error): Unit = js.native
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
    
    var errors: NoMatchingPublishTargetError = js.native
    
    def getAllSubscriptions(): js.Array[String] = js.native
    
    def invokePublish(channelName: String, data: Any): Unit = js.native
    
    var isReady: Boolean = js.native
    
    @JSName("listener")
    def listener_error(eventName: error): typingsJapgolly.consumableStream.mod.^[Error] = js.native
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
    
    var mapper: MappingEngine = js.native
    
    var mappingEngine: skeletonRendezvous | simple | MappingEngine = js.native
    
    var sccBrokerClientPools: js.Array[typingsJapgolly.sccBrokerClient.clientPoolMod.^] = js.native
    
    var sccBrokerURIList: js.Array[String] = js.native
    
    def setBrokers(sccBrokerURIList: js.Array[String]): Unit = js.native
    
    def subscribe(channelName: String): Unit = js.native
    
    def unsubscribe(channelName: String): Unit = js.native
  }
  
  trait MessageData extends StObject {
    
    var channelName: String
    
    var packet: Any
  }
  object MessageData {
    
    inline def apply(channelName: String, packet: Any): MessageData = {
      val __obj = js.Dynamic.literal(channelName = channelName.asInstanceOf[js.Any], packet = packet.asInstanceOf[js.Any])
      __obj.asInstanceOf[MessageData]
    }
    
    extension [Self <: MessageData](x: Self) {
      
      inline def setChannelName(value: String): Self = StObject.set(x, "channelName", value.asInstanceOf[js.Any])
      
      inline def setPacket(value: Any): Self = StObject.set(x, "packet", value.asInstanceOf[js.Any])
    }
  }
  
  trait UpdateBrokersData extends StObject {
    
    var brokerURIs: js.Array[String]
  }
  object UpdateBrokersData {
    
    inline def apply(brokerURIs: js.Array[String]): UpdateBrokersData = {
      val __obj = js.Dynamic.literal(brokerURIs = brokerURIs.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdateBrokersData]
    }
    
    extension [Self <: UpdateBrokersData](x: Self) {
      
      inline def setBrokerURIs(value: js.Array[String]): Self = StObject.set(x, "brokerURIs", value.asInstanceOf[js.Any])
      
      inline def setBrokerURIsVarargs(value: String*): Self = StObject.set(x, "brokerURIs", js.Array(value*))
    }
  }
  
  trait UpdateWorkersData extends StObject {
    
    var sourceWorkerURI: String
    
    var workerURIs: String
  }
  object UpdateWorkersData {
    
    inline def apply(sourceWorkerURI: String, workerURIs: String): UpdateWorkersData = {
      val __obj = js.Dynamic.literal(sourceWorkerURI = sourceWorkerURI.asInstanceOf[js.Any], workerURIs = workerURIs.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdateWorkersData]
    }
    
    extension [Self <: UpdateWorkersData](x: Self) {
      
      inline def setSourceWorkerURI(value: String): Self = StObject.set(x, "sourceWorkerURI", value.asInstanceOf[js.Any])
      
      inline def setWorkerURIs(value: String): Self = StObject.set(x, "workerURIs", value.asInstanceOf[js.Any])
    }
  }
}
