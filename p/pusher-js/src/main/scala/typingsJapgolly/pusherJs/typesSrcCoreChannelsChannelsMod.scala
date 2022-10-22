package typingsJapgolly.pusherJs

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.pusherJs.typesSrcCoreChannelsChannelTableMod.ChannelTable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcCoreChannelsChannelsMod {
  
  @JSImport("pusher-js/types/src/core/channels/channels", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with Channels {
    
    /* CompleteClass */
    override def add(name: String, pusher: typingsJapgolly.pusherJs.typesSrcCorePusherMod.default): typingsJapgolly.pusherJs.typesSrcCoreChannelsChannelMod.default = js.native
    
    /* CompleteClass */
    override def all(): js.Array[typingsJapgolly.pusherJs.typesSrcCoreChannelsChannelMod.default] = js.native
    
    /* CompleteClass */
    var channels: ChannelTable = js.native
    
    /* CompleteClass */
    override def disconnect(): Unit = js.native
    
    /* CompleteClass */
    override def find(name: String): typingsJapgolly.pusherJs.typesSrcCoreChannelsChannelMod.default = js.native
    
    /* CompleteClass */
    override def remove(name: String): typingsJapgolly.pusherJs.typesSrcCoreChannelsChannelMod.default = js.native
  }
  
  trait Channels extends StObject {
    
    def add(name: String, pusher: typingsJapgolly.pusherJs.typesSrcCorePusherMod.default): typingsJapgolly.pusherJs.typesSrcCoreChannelsChannelMod.default
    
    def all(): js.Array[typingsJapgolly.pusherJs.typesSrcCoreChannelsChannelMod.default]
    
    var channels: ChannelTable
    
    def disconnect(): Unit
    
    def find(name: String): typingsJapgolly.pusherJs.typesSrcCoreChannelsChannelMod.default
    
    def remove(name: String): typingsJapgolly.pusherJs.typesSrcCoreChannelsChannelMod.default
  }
  object Channels {
    
    inline def apply(
      add: (String, typingsJapgolly.pusherJs.typesSrcCorePusherMod.default) => typingsJapgolly.pusherJs.typesSrcCoreChannelsChannelMod.default,
      all: CallbackTo[js.Array[typingsJapgolly.pusherJs.typesSrcCoreChannelsChannelMod.default]],
      channels: ChannelTable,
      disconnect: Callback,
      find: String => typingsJapgolly.pusherJs.typesSrcCoreChannelsChannelMod.default,
      remove: String => typingsJapgolly.pusherJs.typesSrcCoreChannelsChannelMod.default
    ): Channels = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), all = all.toJsFn, channels = channels.asInstanceOf[js.Any], disconnect = disconnect.toJsFn, find = js.Any.fromFunction1(find), remove = js.Any.fromFunction1(remove))
      __obj.asInstanceOf[Channels]
    }
    
    extension [Self <: Channels](x: Self) {
      
      inline def setAdd(
        value: (String, typingsJapgolly.pusherJs.typesSrcCorePusherMod.default) => typingsJapgolly.pusherJs.typesSrcCoreChannelsChannelMod.default
      ): Self = StObject.set(x, "add", js.Any.fromFunction2(value))
      
      inline def setAll(value: CallbackTo[js.Array[typingsJapgolly.pusherJs.typesSrcCoreChannelsChannelMod.default]]): Self = StObject.set(x, "all", value.toJsFn)
      
      inline def setChannels(value: ChannelTable): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
      
      inline def setDisconnect(value: Callback): Self = StObject.set(x, "disconnect", value.toJsFn)
      
      inline def setFind(value: String => typingsJapgolly.pusherJs.typesSrcCoreChannelsChannelMod.default): Self = StObject.set(x, "find", js.Any.fromFunction1(value))
      
      inline def setRemove(value: String => typingsJapgolly.pusherJs.typesSrcCoreChannelsChannelMod.default): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
    }
  }
}
