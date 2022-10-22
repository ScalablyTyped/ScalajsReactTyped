package typingsJapgolly.sccBrokerClient

import typingsJapgolly.jsonwebtoken.mod.Secret
import typingsJapgolly.sccBrokerClient.anon.Error
import typingsJapgolly.sccBrokerClient.sccBrokerClientBooleans.`true`
import typingsJapgolly.sccBrokerClient.sccBrokerClientStrings.error
import typingsJapgolly.sccBrokerClient.sccBrokerClientStrings.publish
import typingsJapgolly.sccBrokerClient.sccBrokerClientStrings.publishFail
import typingsJapgolly.sccBrokerClient.sccBrokerClientStrings.subscribe
import typingsJapgolly.sccBrokerClient.sccBrokerClientStrings.subscribeFail
import typingsJapgolly.socketclusterClient.libClientsocketMod.SubscribeOptions
import typingsJapgolly.socketclusterClient.mod.AGClientSocket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clientPoolMod {
  
  @JSImport("scc-broker-client/client-pool", JSImport.Namespace)
  @js.native
  open class ^ () extends ClientPool {
    def this(options: ClientPoolOptions) = this()
  }
  
  trait BrokenDownURI extends StObject {
    
    var hostname: String
    
    var port: js.UndefOr[String] = js.undefined
    
    var secure: js.UndefOr[`true`] = js.undefined
  }
  object BrokenDownURI {
    
    inline def apply(hostname: String): BrokenDownURI = {
      val __obj = js.Dynamic.literal(hostname = hostname.asInstanceOf[js.Any])
      __obj.asInstanceOf[BrokenDownURI]
    }
    
    extension [Self <: BrokenDownURI](x: Self) {
      
      inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      inline def setPort(value: String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setSecure(value: `true`): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
      
      inline def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
    }
  }
  
  @js.native
  trait ClientPool
    extends typingsJapgolly.asyncStreamEmitter.mod.^[Any] {
    
    var authKey: js.UndefOr[Secret] = js.native
    
    def breakDownURI(uri: String): BrokenDownURI = js.native
    
    var clientCount: Double = js.native
    
    var clients: js.Array[AGClientSocket] = js.native
    
    def closeChannel(channelName: String): Unit = js.native
    
    def destroy(): Unit = js.native
    
    @JSName("emit")
    def emit_error(eventName: error, data: Error): Unit = js.native
    @JSName("emit")
    def emit_publish(eventName: publish, data: PublishData): Unit = js.native
    @JSName("emit")
    def emit_publishFail(eventName: publishFail, data: PublishFailData): Unit = js.native
    @JSName("emit")
    def emit_subscribe(eventName: subscribe, data: SubscribeData): Unit = js.native
    @JSName("emit")
    def emit_subscribeFail(eventName: subscribeFail, data: SubscribeFailData): Unit = js.native
    
    var hasher: typingsJapgolly.sccBrokerClient.hasherMod.^ = js.native
    
    def invokePublish(channelName: String, data: Any): js.Promise[Unit] = js.native
    
    def isSubscribed(channelName: String): Boolean = js.native
    def isSubscribed(channelName: String, includePending: Boolean): Boolean = js.native
    
    @JSName("listener")
    def listener_error(eventName: error): typingsJapgolly.consumableStream.mod.^[Error] = js.native
    @JSName("listener")
    def listener_publish(eventName: publish): typingsJapgolly.consumableStream.mod.^[PublishData] = js.native
    @JSName("listener")
    def listener_publishFail(eventName: publishFail): typingsJapgolly.consumableStream.mod.^[PublishFailData] = js.native
    @JSName("listener")
    def listener_subscribe(eventName: subscribe): typingsJapgolly.consumableStream.mod.^[SubscribeData] = js.native
    @JSName("listener")
    def listener_subscribeFail(eventName: subscribeFail): typingsJapgolly.consumableStream.mod.^[SubscribeFailData] = js.native
    
    def selectClient(key: String): AGClientSocket = js.native
    
    def subscribe(channelName: String): typingsJapgolly.agChannel.mod.^[Any] = js.native
    def subscribe(channelName: String, options: SubscribeOptions): typingsJapgolly.agChannel.mod.^[Any] = js.native
    
    def subscriptions(): js.Array[String] = js.native
    def subscriptions(includePending: Boolean): js.Array[String] = js.native
    
    var targetURI: String = js.native
    
    def unsubscribe(channelName: String): js.Promise[Unit] = js.native
  }
  
  trait ClientPoolOptions extends StObject {
    
    var authKey: js.UndefOr[Secret] = js.undefined
    
    var clientCount: js.UndefOr[Double] = js.undefined
    
    var targetURI: String
  }
  object ClientPoolOptions {
    
    inline def apply(targetURI: String): ClientPoolOptions = {
      val __obj = js.Dynamic.literal(targetURI = targetURI.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClientPoolOptions]
    }
    
    extension [Self <: ClientPoolOptions](x: Self) {
      
      inline def setAuthKey(value: Secret): Self = StObject.set(x, "authKey", value.asInstanceOf[js.Any])
      
      inline def setAuthKeyUndefined: Self = StObject.set(x, "authKey", js.undefined)
      
      inline def setClientCount(value: Double): Self = StObject.set(x, "clientCount", value.asInstanceOf[js.Any])
      
      inline def setClientCountUndefined: Self = StObject.set(x, "clientCount", js.undefined)
      
      inline def setTargetURI(value: String): Self = StObject.set(x, "targetURI", value.asInstanceOf[js.Any])
    }
  }
  
  trait PublishData extends StObject {
    
    var channel: String
    
    var data: Any
    
    var poolIndex: Double
    
    var targetURI: String
  }
  object PublishData {
    
    inline def apply(channel: String, data: Any, poolIndex: Double, targetURI: String): PublishData = {
      val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], poolIndex = poolIndex.asInstanceOf[js.Any], targetURI = targetURI.asInstanceOf[js.Any])
      __obj.asInstanceOf[PublishData]
    }
    
    extension [Self <: PublishData](x: Self) {
      
      inline def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setPoolIndex(value: Double): Self = StObject.set(x, "poolIndex", value.asInstanceOf[js.Any])
      
      inline def setTargetURI(value: String): Self = StObject.set(x, "targetURI", value.asInstanceOf[js.Any])
    }
  }
  
  trait PublishFailData extends StObject {
    
    var channel: String
    
    var error: js.Error
    
    var poolIndex: Double
    
    var targetURI: String
  }
  object PublishFailData {
    
    inline def apply(channel: String, error: js.Error, poolIndex: Double, targetURI: String): PublishFailData = {
      val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], poolIndex = poolIndex.asInstanceOf[js.Any], targetURI = targetURI.asInstanceOf[js.Any])
      __obj.asInstanceOf[PublishFailData]
    }
    
    extension [Self <: PublishFailData](x: Self) {
      
      inline def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setPoolIndex(value: Double): Self = StObject.set(x, "poolIndex", value.asInstanceOf[js.Any])
      
      inline def setTargetURI(value: String): Self = StObject.set(x, "targetURI", value.asInstanceOf[js.Any])
    }
  }
  
  trait SubscribeData extends StObject {
    
    var channel: String
    
    var poolIndex: Double
    
    var targetURI: String
  }
  object SubscribeData {
    
    inline def apply(channel: String, poolIndex: Double, targetURI: String): SubscribeData = {
      val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], poolIndex = poolIndex.asInstanceOf[js.Any], targetURI = targetURI.asInstanceOf[js.Any])
      __obj.asInstanceOf[SubscribeData]
    }
    
    extension [Self <: SubscribeData](x: Self) {
      
      inline def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      inline def setPoolIndex(value: Double): Self = StObject.set(x, "poolIndex", value.asInstanceOf[js.Any])
      
      inline def setTargetURI(value: String): Self = StObject.set(x, "targetURI", value.asInstanceOf[js.Any])
    }
  }
  
  trait SubscribeFailData
    extends StObject
       with SubscribeData {
    
    var error: js.Error
  }
  object SubscribeFailData {
    
    inline def apply(channel: String, error: js.Error, poolIndex: Double, targetURI: String): SubscribeFailData = {
      val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], poolIndex = poolIndex.asInstanceOf[js.Any], targetURI = targetURI.asInstanceOf[js.Any])
      __obj.asInstanceOf[SubscribeFailData]
    }
    
    extension [Self <: SubscribeFailData](x: Self) {
      
      inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    }
  }
}
