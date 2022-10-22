package typingsJapgolly.twilioChat.mod

import typingsJapgolly.std.Map
import typingsJapgolly.twilioReplayEventEmitter.mod.ReplayEventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents channels collection
  * {@see Channel}
  */
@js.native
trait Channels extends ReplayEventEmitter[ChannelsEvents] {
  
  /* private */ var _fetchMyChannels: Any = js.native
  
  /* private */ var _updateChannel: Any = js.native
  
  /* private */ var _wrapPaginator: Any = js.native
  
  /**
    * Add channel to server
    * @private
    * @returns {Promise<Channel>} Channel
    */
  def addChannel(options: Any): js.Promise[Channel] = js.native
  
  val channels: Map[String, Channel] = js.native
  
  /* private */ val configuration: Any = js.native
  
  /**
    * Fetch channels list and instantiate all necessary objects
    */
  def fetchChannels(): js.Promise[Channels] = js.native
  
  def getChannel(sid: String): js.Promise[Channel] = js.native
  
  def getChannels(args: Any): js.Promise[SyncPaginator[Channel]] = js.native
  
  /* private */ var getMap: Any = js.native
  
  /* private */ var myChannelsFetched: Any = js.native
  
  var myChannelsRead: Deferred[Boolean] = js.native
  
  /* private */ var onChannelRemoved: Any = js.native
  
  def pushChannel(descriptor: Channel): js.Promise[Channel] = js.native
  def pushChannel(descriptor: ChannelDescriptor0): js.Promise[Channel] = js.native
  
  /* private */ var registerForEvents: Any = js.native
  
  /* private */ val services: Any = js.native
  
  /* private */ val tombstones: Any = js.native
  
  /* private */ var upsertChannel: Any = js.native
}
object Channels {
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.twilioChat.twilioChatStrings.sync
    - typingsJapgolly.twilioChat.twilioChatStrings.chat
    - typingsJapgolly.twilioChat.twilioChatStrings.rest
  */
  trait DataSource extends StObject
  object DataSource {
    
    inline def chat: typingsJapgolly.twilioChat.twilioChatStrings.chat = "chat".asInstanceOf[typingsJapgolly.twilioChat.twilioChatStrings.chat]
    
    inline def rest: typingsJapgolly.twilioChat.twilioChatStrings.rest = "rest".asInstanceOf[typingsJapgolly.twilioChat.twilioChatStrings.rest]
    
    inline def sync: typingsJapgolly.twilioChat.twilioChatStrings.sync = "sync".asInstanceOf[typingsJapgolly.twilioChat.twilioChatStrings.sync]
  }
}
