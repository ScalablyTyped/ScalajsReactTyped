package typingsJapgolly.sccBrokerClient

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.agSimpleBroker.mod.PublishData
import typingsJapgolly.agSimpleBroker.mod.SubscribeData
import typingsJapgolly.agSimpleBroker.mod.UnsubscribeData
import typingsJapgolly.jsonwebtoken.mod.Secret
import typingsJapgolly.sccBrokerClient.sccBrokerClientStrings.publish
import typingsJapgolly.sccBrokerClient.sccBrokerClientStrings.simple
import typingsJapgolly.sccBrokerClient.sccBrokerClientStrings.skeletonRendezvous
import typingsJapgolly.sccBrokerClient.sccBrokerClientStrings.subscribe
import typingsJapgolly.sccBrokerClient.sccBrokerClientStrings.unsubscribe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("scc-broker-client", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def attach(broker: Broker, options: SCCBrokerClientOptions): typingsJapgolly.sccBrokerClient.clusterBrokerClientMod.^ = (^.asInstanceOf[js.Dynamic].applyDynamic("attach")(broker.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.sccBrokerClient.clusterBrokerClientMod.^]
  
  @js.native
  trait Broker extends StObject {
    
    def invokePublish(channelName: String, data: Any, suppressEvent: Boolean): js.Promise[Unit] = js.native
    
    @JSName("listener")
    def listener_publish(eventName: publish): typingsJapgolly.consumableStream.mod.^[PublishData] = js.native
    @JSName("listener")
    def listener_subscribe(eventName: subscribe): typingsJapgolly.consumableStream.mod.^[SubscribeData] = js.native
    @JSName("listener")
    def listener_unsubscribe(eventName: unsubscribe): typingsJapgolly.consumableStream.mod.^[UnsubscribeData] = js.native
    
    def subscriptions(): js.Array[String] = js.native
  }
  
  trait MappingEngine extends StObject {
    
    def findSite(key: String): String
    
    def getSites(): js.Array[String]
    
    def setSites(sites: js.Array[String]): Unit
  }
  object MappingEngine {
    
    inline def apply(
      findSite: String => String,
      getSites: CallbackTo[js.Array[String]],
      setSites: js.Array[String] => Callback
    ): MappingEngine = {
      val __obj = js.Dynamic.literal(findSite = js.Any.fromFunction1(findSite), getSites = getSites.toJsFn, setSites = js.Any.fromFunction1((t0: js.Array[String]) => setSites(t0).runNow()))
      __obj.asInstanceOf[MappingEngine]
    }
    
    extension [Self <: MappingEngine](x: Self) {
      
      inline def setFindSite(value: String => String): Self = StObject.set(x, "findSite", js.Any.fromFunction1(value))
      
      inline def setGetSites(value: CallbackTo[js.Array[String]]): Self = StObject.set(x, "getSites", value.toJsFn)
      
      inline def setSetSites(value: js.Array[String] => Callback): Self = StObject.set(x, "setSites", js.Any.fromFunction1((t0: js.Array[String]) => value(t0).runNow()))
    }
  }
  
  trait SCCBrokerClientOptions extends StObject {
    
    var authKey: js.UndefOr[Secret] = js.undefined
    
    var brokerRetryDelay: js.UndefOr[Double] = js.undefined
    
    var clientPoolSize: js.UndefOr[Double] = js.undefined
    
    var instanceId: js.UndefOr[String] = js.undefined
    
    var instanceIp: js.UndefOr[String] = js.undefined
    
    var instanceIpFamily: js.UndefOr[String] = js.undefined
    
    var instancePort: js.UndefOr[Double] = js.undefined
    
    var mappingEngine: js.UndefOr[skeletonRendezvous | simple | MappingEngine] = js.undefined
    
    var noErrorLogging: js.UndefOr[Boolean] = js.undefined
    
    var pubSubBatchDuration: js.UndefOr[Double] = js.undefined
    
    var stateServerAckTimeout: js.UndefOr[Double] = js.undefined
    
    var stateServerConnectTimeout: js.UndefOr[Double] = js.undefined
    
    var stateServerHost: String
    
    var stateServerPort: js.UndefOr[Double] = js.undefined
    
    var stateServerReconnectRandomness: js.UndefOr[Double] = js.undefined
  }
  object SCCBrokerClientOptions {
    
    inline def apply(stateServerHost: String): SCCBrokerClientOptions = {
      val __obj = js.Dynamic.literal(stateServerHost = stateServerHost.asInstanceOf[js.Any])
      __obj.asInstanceOf[SCCBrokerClientOptions]
    }
    
    extension [Self <: SCCBrokerClientOptions](x: Self) {
      
      inline def setAuthKey(value: Secret): Self = StObject.set(x, "authKey", value.asInstanceOf[js.Any])
      
      inline def setAuthKeyUndefined: Self = StObject.set(x, "authKey", js.undefined)
      
      inline def setBrokerRetryDelay(value: Double): Self = StObject.set(x, "brokerRetryDelay", value.asInstanceOf[js.Any])
      
      inline def setBrokerRetryDelayUndefined: Self = StObject.set(x, "brokerRetryDelay", js.undefined)
      
      inline def setClientPoolSize(value: Double): Self = StObject.set(x, "clientPoolSize", value.asInstanceOf[js.Any])
      
      inline def setClientPoolSizeUndefined: Self = StObject.set(x, "clientPoolSize", js.undefined)
      
      inline def setInstanceId(value: String): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
      
      inline def setInstanceIdUndefined: Self = StObject.set(x, "instanceId", js.undefined)
      
      inline def setInstanceIp(value: String): Self = StObject.set(x, "instanceIp", value.asInstanceOf[js.Any])
      
      inline def setInstanceIpFamily(value: String): Self = StObject.set(x, "instanceIpFamily", value.asInstanceOf[js.Any])
      
      inline def setInstanceIpFamilyUndefined: Self = StObject.set(x, "instanceIpFamily", js.undefined)
      
      inline def setInstanceIpUndefined: Self = StObject.set(x, "instanceIp", js.undefined)
      
      inline def setInstancePort(value: Double): Self = StObject.set(x, "instancePort", value.asInstanceOf[js.Any])
      
      inline def setInstancePortUndefined: Self = StObject.set(x, "instancePort", js.undefined)
      
      inline def setMappingEngine(value: skeletonRendezvous | simple | MappingEngine): Self = StObject.set(x, "mappingEngine", value.asInstanceOf[js.Any])
      
      inline def setMappingEngineUndefined: Self = StObject.set(x, "mappingEngine", js.undefined)
      
      inline def setNoErrorLogging(value: Boolean): Self = StObject.set(x, "noErrorLogging", value.asInstanceOf[js.Any])
      
      inline def setNoErrorLoggingUndefined: Self = StObject.set(x, "noErrorLogging", js.undefined)
      
      inline def setPubSubBatchDuration(value: Double): Self = StObject.set(x, "pubSubBatchDuration", value.asInstanceOf[js.Any])
      
      inline def setPubSubBatchDurationUndefined: Self = StObject.set(x, "pubSubBatchDuration", js.undefined)
      
      inline def setStateServerAckTimeout(value: Double): Self = StObject.set(x, "stateServerAckTimeout", value.asInstanceOf[js.Any])
      
      inline def setStateServerAckTimeoutUndefined: Self = StObject.set(x, "stateServerAckTimeout", js.undefined)
      
      inline def setStateServerConnectTimeout(value: Double): Self = StObject.set(x, "stateServerConnectTimeout", value.asInstanceOf[js.Any])
      
      inline def setStateServerConnectTimeoutUndefined: Self = StObject.set(x, "stateServerConnectTimeout", js.undefined)
      
      inline def setStateServerHost(value: String): Self = StObject.set(x, "stateServerHost", value.asInstanceOf[js.Any])
      
      inline def setStateServerPort(value: Double): Self = StObject.set(x, "stateServerPort", value.asInstanceOf[js.Any])
      
      inline def setStateServerPortUndefined: Self = StObject.set(x, "stateServerPort", js.undefined)
      
      inline def setStateServerReconnectRandomness(value: Double): Self = StObject.set(x, "stateServerReconnectRandomness", value.asInstanceOf[js.Any])
      
      inline def setStateServerReconnectRandomnessUndefined: Self = StObject.set(x, "stateServerReconnectRandomness", js.undefined)
    }
  }
}
