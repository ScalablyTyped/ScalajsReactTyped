package typingsJapgolly.scChannel

import typingsJapgolly.scChannel.scChannelStrings.pending
import typingsJapgolly.scChannel.scChannelStrings.subscribed
import typingsJapgolly.scChannel.scChannelStrings.unsubscribed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sc-channel", JSImport.Namespace)
  @js.native
  open class ^[T] protected () extends SCChannel[T] {
    def this(
      name: String,
      client: Client,
      eventDemux: typingsJapgolly.streamDemux.mod.^[T],
      dataStream: typingsJapgolly.asyncIterableStream.mod.^[T]
    ) = this()
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.scChannel.scChannelStrings.pending
    - typingsJapgolly.scChannel.scChannelStrings.subscribed
    - typingsJapgolly.scChannel.scChannelStrings.unsubscribed
  */
  trait ChannelState extends StObject
  object ChannelState {
    
    inline def pending: typingsJapgolly.scChannel.scChannelStrings.pending = "pending".asInstanceOf[typingsJapgolly.scChannel.scChannelStrings.pending]
    
    inline def subscribed: typingsJapgolly.scChannel.scChannelStrings.subscribed = "subscribed".asInstanceOf[typingsJapgolly.scChannel.scChannelStrings.subscribed]
    
    inline def unsubscribed: typingsJapgolly.scChannel.scChannelStrings.unsubscribed = "unsubscribed".asInstanceOf[typingsJapgolly.scChannel.scChannelStrings.unsubscribed]
  }
  
  @js.native
  trait Client extends StObject {
    
    def closeChannel(channelName: String): Unit = js.native
    
    def getChannelOptions(channelName: String): js.Object = js.native
    
    def getChannelState(channelName: String): ChannelState = js.native
    
    def isSubscribed(channelName: String): Boolean = js.native
    def isSubscribed(channelName: String, includePending: Boolean): Boolean = js.native
    
    def publish(channelName: String, data: Any): Any = js.native
    
    def subscribe(channelName: String): SCChannel[Any] = js.native
    
    def unsubscribe(channelName: String): Unit = js.native
  }
  
  @js.native
  trait SCChannel[T]
    extends typingsJapgolly.asyncIterableStream.mod.^[T] {
    
    val PENDING: pending = js.native
    
    val SUBSCRIBED: subscribed = js.native
    
    val UNSUBSCRIBED: unsubscribed = js.native
    
    var client: Client = js.native
    
    def close(): Unit = js.native
    
    def closeAllListeners(): Unit = js.native
    
    def closeListener(eventName: String): Unit = js.native
    
    def isSubscribed(): Boolean = js.native
    def isSubscribed(includePending: Boolean): Boolean = js.native
    
    def listener(eventName: String): typingsJapgolly.streamDemux.demuxedConsumableStreamMod.^[T] = js.native
    
    var name: String = js.native
    
    var options: js.Object = js.native
    
    def publish(data: Any): Any = js.native
    
    var state: ChannelState = js.native
    
    def subscribe(): Unit = js.native
    def subscribe(options: Any): Unit = js.native
    
    def unsubscribe(): Unit = js.native
  }
}
