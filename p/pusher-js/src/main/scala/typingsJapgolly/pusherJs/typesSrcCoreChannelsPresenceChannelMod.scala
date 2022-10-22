package typingsJapgolly.pusherJs

import typingsJapgolly.pusherJs.typesSrcCoreConnectionProtocolMessageTypesMod.PusherEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcCoreChannelsPresenceChannelMod {
  
  @JSImport("pusher-js/types/src/core/channels/presence_channel", JSImport.Default)
  @js.native
  open class default protected () extends PresenceChannel {
    def this(name: String, pusher: typingsJapgolly.pusherJs.typesSrcCorePusherMod.default) = this()
  }
  
  @js.native
  trait PresenceChannel
    extends typingsJapgolly.pusherJs.typesSrcCoreChannelsPrivateChannelMod.default {
    
    def authorize(socketId: String, callback: js.Function): Unit = js.native
    
    def handleInternalEvent(event: PusherEvent): Unit = js.native
    
    var members: typingsJapgolly.pusherJs.typesSrcCoreChannelsMembersMod.default = js.native
  }
}
