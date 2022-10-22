package typingsJapgolly.pusherJs

import typingsJapgolly.pusherJs.typesSrcCoreConnectionConnectionManagerOptionsMod.ConnectionManagerOptions
import typingsJapgolly.pusherJs.typesSrcCoreTimelineTimelineSenderMod.TimelineSenderOptions
import typingsJapgolly.pusherJs.typesSrcCoreTransportsPingDelayOptionsMod.PingDelayOptions
import typingsJapgolly.tweetnacl.mod.nacl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcCoreUtilsFactoryMod {
  
  object default {
    
    @JSImport("pusher-js/types/src/core/utils/factory", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def createAssistantToTheTransportManager(
      manager: typingsJapgolly.pusherJs.typesSrcCoreTransportsTransportManagerMod.default,
      transport: typingsJapgolly.pusherJs.typesSrcCoreTransportsTransportMod.default,
      options: PingDelayOptions
    ): typingsJapgolly.pusherJs.typesSrcCoreTransportsAssistantToTheTransportManagerMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("createAssistantToTheTransportManager")(manager.asInstanceOf[js.Any], transport.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pusherJs.typesSrcCoreTransportsAssistantToTheTransportManagerMod.default]
    
    inline def createChannel(name: String, pusher: typingsJapgolly.pusherJs.typesSrcCorePusherMod.default): typingsJapgolly.pusherJs.typesSrcCoreChannelsChannelMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("createChannel")(name.asInstanceOf[js.Any], pusher.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pusherJs.typesSrcCoreChannelsChannelMod.default]
    
    inline def createChannels(): typingsJapgolly.pusherJs.typesSrcCoreChannelsChannelsMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("createChannels")().asInstanceOf[typingsJapgolly.pusherJs.typesSrcCoreChannelsChannelsMod.default]
    
    inline def createConnectionManager(key: String, options: ConnectionManagerOptions): typingsJapgolly.pusherJs.typesSrcCoreConnectionConnectionManagerMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("createConnectionManager")(key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pusherJs.typesSrcCoreConnectionConnectionManagerMod.default]
    
    inline def createEncryptedChannel(name: String, pusher: typingsJapgolly.pusherJs.typesSrcCorePusherMod.default, nacl: nacl): typingsJapgolly.pusherJs.typesSrcCoreChannelsEncryptedChannelMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("createEncryptedChannel")(name.asInstanceOf[js.Any], pusher.asInstanceOf[js.Any], nacl.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pusherJs.typesSrcCoreChannelsEncryptedChannelMod.default]
    
    inline def createHandshake(
      transport: typingsJapgolly.pusherJs.typesSrcCoreTransportsTransportConnectionMod.default,
      callback: js.Function1[/* HandshakePayload */ Any, Unit]
    ): typingsJapgolly.pusherJs.typesSrcCoreConnectionHandshakeMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("createHandshake")(transport.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pusherJs.typesSrcCoreConnectionHandshakeMod.default]
    
    inline def createPresenceChannel(name: String, pusher: typingsJapgolly.pusherJs.typesSrcCorePusherMod.default): typingsJapgolly.pusherJs.typesSrcCoreChannelsPresenceChannelMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("createPresenceChannel")(name.asInstanceOf[js.Any], pusher.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pusherJs.typesSrcCoreChannelsPresenceChannelMod.default]
    
    inline def createPrivateChannel(name: String, pusher: typingsJapgolly.pusherJs.typesSrcCorePusherMod.default): typingsJapgolly.pusherJs.typesSrcCoreChannelsPrivateChannelMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("createPrivateChannel")(name.asInstanceOf[js.Any], pusher.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pusherJs.typesSrcCoreChannelsPrivateChannelMod.default]
    
    inline def createTimelineSender(
      timeline: typingsJapgolly.pusherJs.typesSrcCoreTimelineTimelineMod.default,
      options: TimelineSenderOptions
    ): typingsJapgolly.pusherJs.typesSrcCoreTimelineTimelineSenderMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("createTimelineSender")(timeline.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pusherJs.typesSrcCoreTimelineTimelineSenderMod.default]
  }
}
