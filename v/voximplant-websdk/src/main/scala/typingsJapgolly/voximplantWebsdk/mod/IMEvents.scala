package typingsJapgolly.voximplantWebsdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait IMEvents extends StObject
/**
  *    VoxImplant.Client Instant Messaging and Presence events
  */
@JSImport("voximplant-websdk", "IMEvents")
@js.native
object IMEvents extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[IMEvents & Double] = js.native
  
  @js.native
  sealed trait ChatHistoryReceived
    extends StObject
       with IMEvents
  /* 0 */ val ChatHistoryReceived: typingsJapgolly.voximplantWebsdk.mod.IMEvents.ChatHistoryReceived & Double = js.native
  
  @js.native
  sealed trait ChatRoomBanList
    extends StObject
       with IMEvents
  /* 1 */ val ChatRoomBanList: typingsJapgolly.voximplantWebsdk.mod.IMEvents.ChatRoomBanList & Double = js.native
  
  @js.native
  sealed trait ChatRoomCreated
    extends StObject
       with IMEvents
  /* 2 */ val ChatRoomCreated: typingsJapgolly.voximplantWebsdk.mod.IMEvents.ChatRoomCreated & Double = js.native
  
  @js.native
  sealed trait ChatRoomError
    extends StObject
       with IMEvents
  /* 3 */ val ChatRoomError: typingsJapgolly.voximplantWebsdk.mod.IMEvents.ChatRoomError & Double = js.native
  
  @js.native
  sealed trait ChatRoomHistoryReceived
    extends StObject
       with IMEvents
  /* 4 */ val ChatRoomHistoryReceived: typingsJapgolly.voximplantWebsdk.mod.IMEvents.ChatRoomHistoryReceived & Double = js.native
  
  @js.native
  sealed trait ChatRoomInfo
    extends StObject
       with IMEvents
  /* 5 */ val ChatRoomInfo: typingsJapgolly.voximplantWebsdk.mod.IMEvents.ChatRoomInfo & Double = js.native
  
  @js.native
  sealed trait ChatRoomInvitation
    extends StObject
       with IMEvents
  /* 6 */ val ChatRoomInvitation: typingsJapgolly.voximplantWebsdk.mod.IMEvents.ChatRoomInvitation & Double = js.native
  
  @js.native
  sealed trait ChatRoomInviteDeclined
    extends StObject
       with IMEvents
  /* 7 */ val ChatRoomInviteDeclined: typingsJapgolly.voximplantWebsdk.mod.IMEvents.ChatRoomInviteDeclined & Double = js.native
  
  @js.native
  sealed trait ChatRoomMessageModified
    extends StObject
       with IMEvents
  /* 8 */ val ChatRoomMessageModified: typingsJapgolly.voximplantWebsdk.mod.IMEvents.ChatRoomMessageModified & Double = js.native
  
  @js.native
  sealed trait ChatRoomMessageNotModified
    extends StObject
       with IMEvents
  /* 9 */ val ChatRoomMessageNotModified: typingsJapgolly.voximplantWebsdk.mod.IMEvents.ChatRoomMessageNotModified & Double = js.native
  
  @js.native
  sealed trait ChatRoomMessageReceived
    extends StObject
       with IMEvents
  /* 10 */ val ChatRoomMessageReceived: typingsJapgolly.voximplantWebsdk.mod.IMEvents.ChatRoomMessageReceived & Double = js.native
  
  @js.native
  sealed trait ChatRoomMessageRemoved
    extends StObject
       with IMEvents
  /* 11 */ val ChatRoomMessageRemoved: typingsJapgolly.voximplantWebsdk.mod.IMEvents.ChatRoomMessageRemoved & Double = js.native
  
  @js.native
  sealed trait ChatRoomNewParticipant
    extends StObject
       with IMEvents
  /* 12 */ val ChatRoomNewParticipant: typingsJapgolly.voximplantWebsdk.mod.IMEvents.ChatRoomNewParticipant & Double = js.native
  
  @js.native
  sealed trait ChatRoomOperation
    extends StObject
       with IMEvents
  /* 13 */ val ChatRoomOperation: typingsJapgolly.voximplantWebsdk.mod.IMEvents.ChatRoomOperation & Double = js.native
  
  @js.native
  sealed trait ChatRoomParticipantExit
    extends StObject
       with IMEvents
  /* 14 */ val ChatRoomParticipantExit: typingsJapgolly.voximplantWebsdk.mod.IMEvents.ChatRoomParticipantExit & Double = js.native
  
  @js.native
  sealed trait ChatRoomParticipants
    extends StObject
       with IMEvents
  /* 15 */ val ChatRoomParticipants: typingsJapgolly.voximplantWebsdk.mod.IMEvents.ChatRoomParticipants & Double = js.native
  
  @js.native
  sealed trait ChatRoomPresenceUpdate
    extends StObject
       with IMEvents
  /* 16 */ val ChatRoomPresenceUpdate: typingsJapgolly.voximplantWebsdk.mod.IMEvents.ChatRoomPresenceUpdate & Double = js.native
  
  @js.native
  sealed trait ChatRoomStateUpdate
    extends StObject
       with IMEvents
  /* 17 */ val ChatRoomStateUpdate: typingsJapgolly.voximplantWebsdk.mod.IMEvents.ChatRoomStateUpdate & Double = js.native
  
  @js.native
  sealed trait ChatRoomSubjectChange
    extends StObject
       with IMEvents
  /* 18 */ val ChatRoomSubjectChange: typingsJapgolly.voximplantWebsdk.mod.IMEvents.ChatRoomSubjectChange & Double = js.native
  
  @js.native
  sealed trait ChatRoomsDataReceived
    extends StObject
       with IMEvents
  /* 19 */ val ChatRoomsDataReceived: typingsJapgolly.voximplantWebsdk.mod.IMEvents.ChatRoomsDataReceived & Double = js.native
  
  @js.native
  sealed trait ChatStateUpdate
    extends StObject
       with IMEvents
  /* 20 */ val ChatStateUpdate: typingsJapgolly.voximplantWebsdk.mod.IMEvents.ChatStateUpdate & Double = js.native
  
  @js.native
  sealed trait MessageModified
    extends StObject
       with IMEvents
  /* 21 */ val MessageModified: typingsJapgolly.voximplantWebsdk.mod.IMEvents.MessageModified & Double = js.native
  
  @js.native
  sealed trait MessageNotModified
    extends StObject
       with IMEvents
  /* 22 */ val MessageNotModified: typingsJapgolly.voximplantWebsdk.mod.IMEvents.MessageNotModified & Double = js.native
  
  @js.native
  sealed trait MessageReceived
    extends StObject
       with IMEvents
  /* 23 */ val MessageReceived: typingsJapgolly.voximplantWebsdk.mod.IMEvents.MessageReceived & Double = js.native
  
  @js.native
  sealed trait MessageRemoved
    extends StObject
       with IMEvents
  /* 24 */ val MessageRemoved: typingsJapgolly.voximplantWebsdk.mod.IMEvents.MessageRemoved & Double = js.native
  
  @js.native
  sealed trait MessageStatus
    extends StObject
       with IMEvents
  /* 25 */ val MessageStatus: typingsJapgolly.voximplantWebsdk.mod.IMEvents.MessageStatus & Double = js.native
  
  @js.native
  sealed trait PresenceUpdate
    extends StObject
       with IMEvents
  /* 26 */ val PresenceUpdate: typingsJapgolly.voximplantWebsdk.mod.IMEvents.PresenceUpdate & Double = js.native
  
  @js.native
  sealed trait RosterItemChange
    extends StObject
       with IMEvents
  /* 27 */ val RosterItemChange: typingsJapgolly.voximplantWebsdk.mod.IMEvents.RosterItemChange & Double = js.native
  
  @js.native
  sealed trait RosterPresenceUpdate
    extends StObject
       with IMEvents
  /* 28 */ val RosterPresenceUpdate: typingsJapgolly.voximplantWebsdk.mod.IMEvents.RosterPresenceUpdate & Double = js.native
  
  @js.native
  sealed trait RosterReceived
    extends StObject
       with IMEvents
  /* 29 */ val RosterReceived: typingsJapgolly.voximplantWebsdk.mod.IMEvents.RosterReceived & Double = js.native
  
  @js.native
  sealed trait SubscriptionRequest
    extends StObject
       with IMEvents
  /* 30 */ val SubscriptionRequest: typingsJapgolly.voximplantWebsdk.mod.IMEvents.SubscriptionRequest & Double = js.native
  
  @js.native
  sealed trait SystemError
    extends StObject
       with IMEvents
  /* 31 */ val SystemError: typingsJapgolly.voximplantWebsdk.mod.IMEvents.SystemError & Double = js.native
  
  @js.native
  sealed trait UCConnected
    extends StObject
       with IMEvents
  /* 32 */ val UCConnected: typingsJapgolly.voximplantWebsdk.mod.IMEvents.UCConnected & Double = js.native
  
  @js.native
  sealed trait UCDisconnected
    extends StObject
       with IMEvents
  /* 33 */ val UCDisconnected: typingsJapgolly.voximplantWebsdk.mod.IMEvents.UCDisconnected & Double = js.native
}
