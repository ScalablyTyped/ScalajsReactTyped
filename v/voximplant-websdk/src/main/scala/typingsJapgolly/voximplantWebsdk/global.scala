package typingsJapgolly.voximplantWebsdk

import typingsJapgolly.voximplantWebsdk.mod.Client
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object VoxImplant {
    
    @JSGlobal("VoxImplant")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      *    VoxImplant.Call events
      */
    @JSGlobal("VoxImplant.CallEvents")
    @js.native
    object CallEvents extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsJapgolly.voximplantWebsdk.mod.CallEvents & Double] = js.native
      
      /* 0 */ val Connected: typingsJapgolly.voximplantWebsdk.mod.CallEvents.Connected & Double = js.native
      
      /* 1 */ val Disconnected: typingsJapgolly.voximplantWebsdk.mod.CallEvents.Disconnected & Double = js.native
      
      /* 2 */ val Failed: typingsJapgolly.voximplantWebsdk.mod.CallEvents.Failed & Double = js.native
      
      /* 3 */ val ICETimeout: typingsJapgolly.voximplantWebsdk.mod.CallEvents.ICETimeout & Double = js.native
      
      /* 4 */ val InfoReceived: typingsJapgolly.voximplantWebsdk.mod.CallEvents.InfoReceived & Double = js.native
      
      /* 5 */ val MessageReceived: typingsJapgolly.voximplantWebsdk.mod.CallEvents.MessageReceived & Double = js.native
      
      /* 6 */ val ProgressToneStart: typingsJapgolly.voximplantWebsdk.mod.CallEvents.ProgressToneStart & Double = js.native
      
      /* 7 */ val ProgressToneStop: typingsJapgolly.voximplantWebsdk.mod.CallEvents.ProgressToneStop & Double = js.native
      
      /* 8 */ val TransferComplete: typingsJapgolly.voximplantWebsdk.mod.CallEvents.TransferComplete & Double = js.native
      
      /* 9 */ val TransferFailed: typingsJapgolly.voximplantWebsdk.mod.CallEvents.TransferFailed & Double = js.native
    }
    
    @JSGlobal("VoxImplant.ChatRoomOperationType")
    @js.native
    object ChatRoomOperationType extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsJapgolly.voximplantWebsdk.mod.ChatRoomOperationType & Double] = js.native
      
      /* 0 */ val Ban: typingsJapgolly.voximplantWebsdk.mod.ChatRoomOperationType.Ban & Double = js.native
      
      /* 1 */ val Unban: typingsJapgolly.voximplantWebsdk.mod.ChatRoomOperationType.Unban & Double = js.native
    }
    
    @JSGlobal("VoxImplant.ChatStateType")
    @js.native
    object ChatStateType extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsJapgolly.voximplantWebsdk.mod.ChatStateType & Double] = js.native
      
      /* 0 */ val Active: typingsJapgolly.voximplantWebsdk.mod.ChatStateType.Active & Double = js.native
      
      /* 1 */ val Composing: typingsJapgolly.voximplantWebsdk.mod.ChatStateType.Composing & Double = js.native
      
      /* 2 */ val Gone: typingsJapgolly.voximplantWebsdk.mod.ChatStateType.Gone & Double = js.native
      
      /* 3 */ val Inactive: typingsJapgolly.voximplantWebsdk.mod.ChatStateType.Inactive & Double = js.native
      
      /* 4 */ val Invalid: typingsJapgolly.voximplantWebsdk.mod.ChatStateType.Invalid & Double = js.native
      
      /* 5 */ val Paused: typingsJapgolly.voximplantWebsdk.mod.ChatStateType.Paused & Double = js.native
    }
    
    /**
      *    VoxImplant.Client general events
      */
    @JSGlobal("VoxImplant.Events")
    @js.native
    object Events extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsJapgolly.voximplantWebsdk.mod.Events & Double] = js.native
      
      /* 0 */ val AuthResult: typingsJapgolly.voximplantWebsdk.mod.Events.AuthResult & Double = js.native
      
      /* 1 */ val ConnectionClosed: typingsJapgolly.voximplantWebsdk.mod.Events.ConnectionClosed & Double = js.native
      
      /* 2 */ val ConnectionEstablished: typingsJapgolly.voximplantWebsdk.mod.Events.ConnectionEstablished & Double = js.native
      
      /* 3 */ val ConnectionFailed: typingsJapgolly.voximplantWebsdk.mod.Events.ConnectionFailed & Double = js.native
      
      /* 4 */ val IncomingCall: typingsJapgolly.voximplantWebsdk.mod.Events.IncomingCall & Double = js.native
      
      /* 5 */ val MicAccessResult: typingsJapgolly.voximplantWebsdk.mod.Events.MicAccessResult & Double = js.native
      
      /* 6 */ val NetStatsReceived: typingsJapgolly.voximplantWebsdk.mod.Events.NetStatsReceived & Double = js.native
      
      /* 7 */ val PlaybackFinished: typingsJapgolly.voximplantWebsdk.mod.Events.PlaybackFinished & Double = js.native
      
      /* 8 */ val SDKReady: typingsJapgolly.voximplantWebsdk.mod.Events.SDKReady & Double = js.native
      
      /* 9 */ val SourcesInfoUpdated: typingsJapgolly.voximplantWebsdk.mod.Events.SourcesInfoUpdated & Double = js.native
    }
    
    @JSGlobal("VoxImplant.IMErrorType")
    @js.native
    object IMErrorType extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsJapgolly.voximplantWebsdk.mod.IMErrorType & Double] = js.native
      
      /* 1 */ val Error: typingsJapgolly.voximplantWebsdk.mod.IMErrorType.Error & Double = js.native
      
      /* 0 */ val RemoteFunctionError: typingsJapgolly.voximplantWebsdk.mod.IMErrorType.RemoteFunctionError & Double = js.native
      
      /* 2 */ val RosterError: typingsJapgolly.voximplantWebsdk.mod.IMErrorType.RosterError & Double = js.native
    }
    
    /**
      *    VoxImplant.Client Instant Messaging and Presence events
      */
    @JSGlobal("VoxImplant.IMEvents")
    @js.native
    object IMEvents extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsJapgolly.voximplantWebsdk.mod.IMEvents & Double] = js.native
      
      /* 0 */ val ChatHistoryReceived: typingsJapgolly.voximplantWebsdk.mod.IMEvents.ChatHistoryReceived & Double = js.native
      
      /* 1 */ val ChatRoomBanList: typingsJapgolly.voximplantWebsdk.mod.IMEvents.ChatRoomBanList & Double = js.native
      
      /* 2 */ val ChatRoomCreated: typingsJapgolly.voximplantWebsdk.mod.IMEvents.ChatRoomCreated & Double = js.native
      
      /* 3 */ val ChatRoomError: typingsJapgolly.voximplantWebsdk.mod.IMEvents.ChatRoomError & Double = js.native
      
      /* 4 */ val ChatRoomHistoryReceived: typingsJapgolly.voximplantWebsdk.mod.IMEvents.ChatRoomHistoryReceived & Double = js.native
      
      /* 5 */ val ChatRoomInfo: typingsJapgolly.voximplantWebsdk.mod.IMEvents.ChatRoomInfo & Double = js.native
      
      /* 6 */ val ChatRoomInvitation: typingsJapgolly.voximplantWebsdk.mod.IMEvents.ChatRoomInvitation & Double = js.native
      
      /* 7 */ val ChatRoomInviteDeclined: typingsJapgolly.voximplantWebsdk.mod.IMEvents.ChatRoomInviteDeclined & Double = js.native
      
      /* 8 */ val ChatRoomMessageModified: typingsJapgolly.voximplantWebsdk.mod.IMEvents.ChatRoomMessageModified & Double = js.native
      
      /* 9 */ val ChatRoomMessageNotModified: typingsJapgolly.voximplantWebsdk.mod.IMEvents.ChatRoomMessageNotModified & Double = js.native
      
      /* 10 */ val ChatRoomMessageReceived: typingsJapgolly.voximplantWebsdk.mod.IMEvents.ChatRoomMessageReceived & Double = js.native
      
      /* 11 */ val ChatRoomMessageRemoved: typingsJapgolly.voximplantWebsdk.mod.IMEvents.ChatRoomMessageRemoved & Double = js.native
      
      /* 12 */ val ChatRoomNewParticipant: typingsJapgolly.voximplantWebsdk.mod.IMEvents.ChatRoomNewParticipant & Double = js.native
      
      /* 13 */ val ChatRoomOperation: typingsJapgolly.voximplantWebsdk.mod.IMEvents.ChatRoomOperation & Double = js.native
      
      /* 14 */ val ChatRoomParticipantExit: typingsJapgolly.voximplantWebsdk.mod.IMEvents.ChatRoomParticipantExit & Double = js.native
      
      /* 15 */ val ChatRoomParticipants: typingsJapgolly.voximplantWebsdk.mod.IMEvents.ChatRoomParticipants & Double = js.native
      
      /* 16 */ val ChatRoomPresenceUpdate: typingsJapgolly.voximplantWebsdk.mod.IMEvents.ChatRoomPresenceUpdate & Double = js.native
      
      /* 17 */ val ChatRoomStateUpdate: typingsJapgolly.voximplantWebsdk.mod.IMEvents.ChatRoomStateUpdate & Double = js.native
      
      /* 18 */ val ChatRoomSubjectChange: typingsJapgolly.voximplantWebsdk.mod.IMEvents.ChatRoomSubjectChange & Double = js.native
      
      /* 19 */ val ChatRoomsDataReceived: typingsJapgolly.voximplantWebsdk.mod.IMEvents.ChatRoomsDataReceived & Double = js.native
      
      /* 20 */ val ChatStateUpdate: typingsJapgolly.voximplantWebsdk.mod.IMEvents.ChatStateUpdate & Double = js.native
      
      /* 21 */ val MessageModified: typingsJapgolly.voximplantWebsdk.mod.IMEvents.MessageModified & Double = js.native
      
      /* 22 */ val MessageNotModified: typingsJapgolly.voximplantWebsdk.mod.IMEvents.MessageNotModified & Double = js.native
      
      /* 23 */ val MessageReceived: typingsJapgolly.voximplantWebsdk.mod.IMEvents.MessageReceived & Double = js.native
      
      /* 24 */ val MessageRemoved: typingsJapgolly.voximplantWebsdk.mod.IMEvents.MessageRemoved & Double = js.native
      
      /* 25 */ val MessageStatus: typingsJapgolly.voximplantWebsdk.mod.IMEvents.MessageStatus & Double = js.native
      
      /* 26 */ val PresenceUpdate: typingsJapgolly.voximplantWebsdk.mod.IMEvents.PresenceUpdate & Double = js.native
      
      /* 27 */ val RosterItemChange: typingsJapgolly.voximplantWebsdk.mod.IMEvents.RosterItemChange & Double = js.native
      
      /* 28 */ val RosterPresenceUpdate: typingsJapgolly.voximplantWebsdk.mod.IMEvents.RosterPresenceUpdate & Double = js.native
      
      /* 29 */ val RosterReceived: typingsJapgolly.voximplantWebsdk.mod.IMEvents.RosterReceived & Double = js.native
      
      /* 30 */ val SubscriptionRequest: typingsJapgolly.voximplantWebsdk.mod.IMEvents.SubscriptionRequest & Double = js.native
      
      /* 31 */ val SystemError: typingsJapgolly.voximplantWebsdk.mod.IMEvents.SystemError & Double = js.native
      
      /* 32 */ val UCConnected: typingsJapgolly.voximplantWebsdk.mod.IMEvents.UCConnected & Double = js.native
      
      /* 33 */ val UCDisconnected: typingsJapgolly.voximplantWebsdk.mod.IMEvents.UCDisconnected & Double = js.native
    }
    
    @JSGlobal("VoxImplant.MessageEventType")
    @js.native
    object MessageEventType extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsJapgolly.voximplantWebsdk.mod.MessageEventType & Double] = js.native
      
      /* 0 */ val Cancel: typingsJapgolly.voximplantWebsdk.mod.MessageEventType.Cancel & Double = js.native
      
      /* 1 */ val Composing: typingsJapgolly.voximplantWebsdk.mod.MessageEventType.Composing & Double = js.native
      
      /* 2 */ val Delivered: typingsJapgolly.voximplantWebsdk.mod.MessageEventType.Delivered & Double = js.native
      
      /* 3 */ val Displayed: typingsJapgolly.voximplantWebsdk.mod.MessageEventType.Displayed & Double = js.native
      
      /* 4 */ val Invalid: typingsJapgolly.voximplantWebsdk.mod.MessageEventType.Invalid & Double = js.native
      
      /* 5 */ val Offline: typingsJapgolly.voximplantWebsdk.mod.MessageEventType.Offline & Double = js.native
    }
    
    @JSGlobal("VoxImplant.OperatorACDStatuses")
    @js.native
    object OperatorACDStatuses extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsJapgolly.voximplantWebsdk.mod.OperatorACDStatuses & Double] = js.native
      
      /* 0 */ val AfterService: typingsJapgolly.voximplantWebsdk.mod.OperatorACDStatuses.AfterService & Double = js.native
      
      /* 1 */ val DND: typingsJapgolly.voximplantWebsdk.mod.OperatorACDStatuses.DND & Double = js.native
      
      /* 2 */ val InService: typingsJapgolly.voximplantWebsdk.mod.OperatorACDStatuses.InService & Double = js.native
      
      /* 3 */ val Offline: typingsJapgolly.voximplantWebsdk.mod.OperatorACDStatuses.Offline & Double = js.native
      
      /* 4 */ val Online: typingsJapgolly.voximplantWebsdk.mod.OperatorACDStatuses.Online & Double = js.native
      
      /* 5 */ val Ready: typingsJapgolly.voximplantWebsdk.mod.OperatorACDStatuses.Ready & Double = js.native
      
      /* 6 */ val Timeout: typingsJapgolly.voximplantWebsdk.mod.OperatorACDStatuses.Timeout & Double = js.native
    }
    
    @JSGlobal("VoxImplant.RosterItemEvent")
    @js.native
    object RosterItemEvent extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsJapgolly.voximplantWebsdk.mod.RosterItemEvent & Double] = js.native
      
      /* 0 */ val Added: typingsJapgolly.voximplantWebsdk.mod.RosterItemEvent.Added & Double = js.native
      
      /* 1 */ val Removed: typingsJapgolly.voximplantWebsdk.mod.RosterItemEvent.Removed & Double = js.native
      
      /* 2 */ val Subscribed: typingsJapgolly.voximplantWebsdk.mod.RosterItemEvent.Subscribed & Double = js.native
      
      /* 3 */ val Unsubscribed: typingsJapgolly.voximplantWebsdk.mod.RosterItemEvent.Unsubscribed & Double = js.native
      
      /* 4 */ val Updated: typingsJapgolly.voximplantWebsdk.mod.RosterItemEvent.Updated & Double = js.native
    }
    
    @JSGlobal("VoxImplant.SubscriptionRequestType")
    @js.native
    object SubscriptionRequestType extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsJapgolly.voximplantWebsdk.mod.SubscriptionRequestType & Double] = js.native
      
      /* 0 */ val Subscribe: typingsJapgolly.voximplantWebsdk.mod.SubscriptionRequestType.Subscribe & Double = js.native
      
      /* 1 */ val Unsubscribe: typingsJapgolly.voximplantWebsdk.mod.SubscriptionRequestType.Unsubscribe & Double = js.native
    }
    
    @JSGlobal("VoxImplant.UserStatuses")
    @js.native
    object UserStatuses extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsJapgolly.voximplantWebsdk.mod.UserStatuses & Double] = js.native
      
      /* 0 */ val Away: typingsJapgolly.voximplantWebsdk.mod.UserStatuses.Away & Double = js.native
      
      /* 1 */ val Chat: typingsJapgolly.voximplantWebsdk.mod.UserStatuses.Chat & Double = js.native
      
      /* 2 */ val DND: typingsJapgolly.voximplantWebsdk.mod.UserStatuses.DND & Double = js.native
      
      /* 3 */ val Offline: typingsJapgolly.voximplantWebsdk.mod.UserStatuses.Offline & Double = js.native
      
      /* 4 */ val Online: typingsJapgolly.voximplantWebsdk.mod.UserStatuses.Online & Double = js.native
      
      /* 5 */ val XA: typingsJapgolly.voximplantWebsdk.mod.UserStatuses.XA & Double = js.native
    }
    
    /**
      *    Get Client instance to use platform functions
      */
    inline def getInstance(): Client = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")().asInstanceOf[Client]
    
    /**
      *    VoxImplant Web SDK lib version
      */
    inline def version(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("version")().asInstanceOf[String]
  }
}
