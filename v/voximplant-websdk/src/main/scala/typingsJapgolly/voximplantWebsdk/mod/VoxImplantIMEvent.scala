package typingsJapgolly.voximplantWebsdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.voximplantWebsdk.mod.IMEventTypes.ChatHistoryReceived
  - typingsJapgolly.voximplantWebsdk.mod.IMEventTypes.ChatRoomBanList
  - typingsJapgolly.voximplantWebsdk.mod.IMEventTypes.ChatRoomCreated
  - typingsJapgolly.voximplantWebsdk.mod.IMEventTypes.ChatRoomError
  - typingsJapgolly.voximplantWebsdk.mod.IMEventTypes.ChatRoomHistoryReceived
  - typingsJapgolly.voximplantWebsdk.mod.IMEventTypes.ChatRoomInfo
  - typingsJapgolly.voximplantWebsdk.mod.IMEventTypes.ChatRoomInvitation
  - typingsJapgolly.voximplantWebsdk.mod.IMEventTypes.ChatRoomInviteDeclined
  - typingsJapgolly.voximplantWebsdk.mod.IMEventTypes.ChatRoomMessageModified
  - typingsJapgolly.voximplantWebsdk.mod.IMEventTypes.ChatRoomMessageNotModified
  - typingsJapgolly.voximplantWebsdk.mod.IMEventTypes.ChatRoomMessageReceived
  - typingsJapgolly.voximplantWebsdk.mod.IMEventTypes.ChatRoomMessageRemoved
  - typingsJapgolly.voximplantWebsdk.mod.IMEventTypes.ChatRoomNewParticipant
  - typingsJapgolly.voximplantWebsdk.mod.IMEventTypes.ChatRoomOperation
  - typingsJapgolly.voximplantWebsdk.mod.IMEventTypes.ChatRoomParticipantExit
  - typingsJapgolly.voximplantWebsdk.mod.IMEventTypes.ChatRoomParticipants
  - typingsJapgolly.voximplantWebsdk.mod.IMEventTypes.ChatRoomPresenceUpdate
  - typingsJapgolly.voximplantWebsdk.mod.IMEventTypes.ChatRoomStateUpdate
  - typingsJapgolly.voximplantWebsdk.mod.IMEventTypes.ChatRoomSubjectChange
  - typingsJapgolly.voximplantWebsdk.mod.IMEventTypes.ChatRoomsDataReceived
  - typingsJapgolly.voximplantWebsdk.mod.IMEventTypes.ChatStateUpdate
  - typingsJapgolly.voximplantWebsdk.mod.IMEventTypes.MessageModified
  - typingsJapgolly.voximplantWebsdk.mod.IMEventTypes.MessageNotModified
  - typingsJapgolly.voximplantWebsdk.mod.IMEventTypes.MessageReceived
  - typingsJapgolly.voximplantWebsdk.mod.IMEventTypes.MessageRemoved
  - typingsJapgolly.voximplantWebsdk.mod.IMEventTypes.MessageStatus
  - typingsJapgolly.voximplantWebsdk.mod.IMEventTypes.PresenceUpdate
  - typingsJapgolly.voximplantWebsdk.mod.IMEventTypes.RosterItemChange
  - typingsJapgolly.voximplantWebsdk.mod.IMEventTypes.RosterPresenceUpdate
  - typingsJapgolly.voximplantWebsdk.mod.IMEventTypes.RosterReceived
  - typingsJapgolly.voximplantWebsdk.mod.IMEventTypes.SubscriptionRequest
  - typingsJapgolly.voximplantWebsdk.mod.IMEventTypes.SystemError
  - typingsJapgolly.voximplantWebsdk.mod.IMEventTypes.UCConnected
  - typingsJapgolly.voximplantWebsdk.mod.IMEventTypes.UCDisconnected
*/
trait VoxImplantIMEvent extends StObject
object VoxImplantIMEvent {
  
  inline def ChatHistoryReceived(id: String, message_id: String, messages: js.Array[IMHistoryMessage]): typingsJapgolly.voximplantWebsdk.mod.IMEventTypes.ChatHistoryReceived = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], message_id = message_id.asInstanceOf[js.Any], messages = messages.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.voximplantWebsdk.mod.IMEventTypes.ChatHistoryReceived]
  }
  
  inline def ChatRoomBanList(participants: js.Array[ChatRoomParticipant], room: String): typingsJapgolly.voximplantWebsdk.mod.IMEventTypes.ChatRoomBanList = {
    val __obj = js.Dynamic.literal(participants = participants.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.voximplantWebsdk.mod.IMEventTypes.ChatRoomBanList]
  }
  
  inline def ChatRoomCreated(room: String): typingsJapgolly.voximplantWebsdk.mod.IMEventTypes.ChatRoomCreated = {
    val __obj = js.Dynamic.literal(room = room.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.voximplantWebsdk.mod.IMEventTypes.ChatRoomCreated]
  }
  
  inline def ChatRoomError(code: String, operation: String, room: String, text: String): typingsJapgolly.voximplantWebsdk.mod.IMEventTypes.ChatRoomError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.voximplantWebsdk.mod.IMEventTypes.ChatRoomError]
  }
  
  inline def ChatRoomHistoryReceived(message_id: String, messages: js.Array[IMHistoryMessage], room: String): typingsJapgolly.voximplantWebsdk.mod.IMEventTypes.ChatRoomHistoryReceived = {
    val __obj = js.Dynamic.literal(message_id = message_id.asInstanceOf[js.Any], messages = messages.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.voximplantWebsdk.mod.IMEventTypes.ChatRoomHistoryReceived]
  }
  
  inline def ChatRoomInfo(
    features: Double,
    info: typingsJapgolly.voximplantWebsdk.mod.IMEventTypes.ChatRoomInfo,
    room: String,
    room_name: String
  ): typingsJapgolly.voximplantWebsdk.mod.IMEventTypes.ChatRoomInfo = {
    val __obj = js.Dynamic.literal(features = features.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any], room_name = room_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.voximplantWebsdk.mod.IMEventTypes.ChatRoomInfo]
  }
  
  inline def ChatRoomInvitation(body: String, from: String, password: String, reason: String, room: String): typingsJapgolly.voximplantWebsdk.mod.IMEventTypes.ChatRoomInvitation = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.voximplantWebsdk.mod.IMEventTypes.ChatRoomInvitation]
  }
  
  inline def ChatRoomInviteDeclined(invitee: String, reason: String, room: String): typingsJapgolly.voximplantWebsdk.mod.IMEventTypes.ChatRoomInviteDeclined = {
    val __obj = js.Dynamic.literal(invitee = invitee.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.voximplantWebsdk.mod.IMEventTypes.ChatRoomInviteDeclined]
  }
  
  inline def ChatRoomMessageModified(
    content: String,
    from: String,
    message_id: String,
    private_message: String,
    resource: String,
    room: String,
    timestamp: String
  ): typingsJapgolly.voximplantWebsdk.mod.IMEventTypes.ChatRoomMessageModified = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], message_id = message_id.asInstanceOf[js.Any], private_message = private_message.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.voximplantWebsdk.mod.IMEventTypes.ChatRoomMessageModified]
  }
  
  inline def ChatRoomMessageNotModified(code: Double, message_id: String, private_message: String, room: String): typingsJapgolly.voximplantWebsdk.mod.IMEventTypes.ChatRoomMessageNotModified = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message_id = message_id.asInstanceOf[js.Any], private_message = private_message.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.voximplantWebsdk.mod.IMEventTypes.ChatRoomMessageNotModified]
  }
  
  inline def ChatRoomMessageReceived(
    content: String,
    from: String,
    message_id: String,
    private_message: String,
    resource: String,
    room: String,
    timestamp: String
  ): typingsJapgolly.voximplantWebsdk.mod.IMEventTypes.ChatRoomMessageReceived = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], message_id = message_id.asInstanceOf[js.Any], private_message = private_message.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.voximplantWebsdk.mod.IMEventTypes.ChatRoomMessageReceived]
  }
  
  inline def ChatRoomMessageRemoved(
    from: String,
    message_id: String,
    private_message: String,
    resource: String,
    room: String,
    timestamp: String
  ): typingsJapgolly.voximplantWebsdk.mod.IMEventTypes.ChatRoomMessageRemoved = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], message_id = message_id.asInstanceOf[js.Any], private_message = private_message.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.voximplantWebsdk.mod.IMEventTypes.ChatRoomMessageRemoved]
  }
  
  inline def ChatRoomNewParticipant(displayName: String, participant: String, room: String): typingsJapgolly.voximplantWebsdk.mod.IMEventTypes.ChatRoomNewParticipant = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], participant = participant.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.voximplantWebsdk.mod.IMEventTypes.ChatRoomNewParticipant]
  }
  
  inline def ChatRoomOperation(operation: ChatRoomOperationType, result: Boolean, room: String): typingsJapgolly.voximplantWebsdk.mod.IMEventTypes.ChatRoomOperation = {
    val __obj = js.Dynamic.literal(operation = operation.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.voximplantWebsdk.mod.IMEventTypes.ChatRoomOperation]
  }
  
  inline def ChatRoomParticipantExit(participant: String, room: String): typingsJapgolly.voximplantWebsdk.mod.IMEventTypes.ChatRoomParticipantExit = {
    val __obj = js.Dynamic.literal(participant = participant.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.voximplantWebsdk.mod.IMEventTypes.ChatRoomParticipantExit]
  }
  
  inline def ChatRoomParticipants(participants: js.Array[ChatRoomParticipant], room: String): typingsJapgolly.voximplantWebsdk.mod.IMEventTypes.ChatRoomParticipants = {
    val __obj = js.Dynamic.literal(participants = participants.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.voximplantWebsdk.mod.IMEventTypes.ChatRoomParticipants]
  }
  
  inline def ChatRoomPresenceUpdate(message: String, participant: ParticipantInfo, presence: UserStatuses, room: String): typingsJapgolly.voximplantWebsdk.mod.IMEventTypes.ChatRoomPresenceUpdate = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], participant = participant.asInstanceOf[js.Any], presence = presence.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.voximplantWebsdk.mod.IMEventTypes.ChatRoomPresenceUpdate]
  }
  
  inline def ChatRoomStateUpdate(from: String, resource: String, room: String, state: ChatStateType): typingsJapgolly.voximplantWebsdk.mod.IMEventTypes.ChatRoomStateUpdate = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.voximplantWebsdk.mod.IMEventTypes.ChatRoomStateUpdate]
  }
  
  inline def ChatRoomSubjectChange(id: String, resource: String, room: String, subject: String): typingsJapgolly.voximplantWebsdk.mod.IMEventTypes.ChatRoomSubjectChange = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.voximplantWebsdk.mod.IMEventTypes.ChatRoomSubjectChange]
  }
  
  inline def ChatRoomsDataReceived(rooms: js.Array[ChatRoom]): typingsJapgolly.voximplantWebsdk.mod.IMEventTypes.ChatRoomsDataReceived = {
    val __obj = js.Dynamic.literal(rooms = rooms.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.voximplantWebsdk.mod.IMEventTypes.ChatRoomsDataReceived]
  }
  
  inline def ChatStateUpdate(id: String, state: ChatStateType): typingsJapgolly.voximplantWebsdk.mod.IMEventTypes.ChatStateUpdate = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.voximplantWebsdk.mod.IMEventTypes.ChatStateUpdate]
  }
  
  inline def MessageModified(content: String, id: String, message_id: String, to: String): typingsJapgolly.voximplantWebsdk.mod.IMEventTypes.MessageModified = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], message_id = message_id.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.voximplantWebsdk.mod.IMEventTypes.MessageModified]
  }
  
  inline def MessageNotModified(code: Double, message_id: String, to: String): typingsJapgolly.voximplantWebsdk.mod.IMEventTypes.MessageNotModified = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message_id = message_id.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.voximplantWebsdk.mod.IMEventTypes.MessageNotModified]
  }
  
  inline def MessageReceived(content: String, id: String, message_id: String, to: String): typingsJapgolly.voximplantWebsdk.mod.IMEventTypes.MessageReceived = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], message_id = message_id.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.voximplantWebsdk.mod.IMEventTypes.MessageReceived]
  }
  
  inline def MessageRemoved(id: String, message_id: String, to: String): typingsJapgolly.voximplantWebsdk.mod.IMEventTypes.MessageRemoved = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], message_id = message_id.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.voximplantWebsdk.mod.IMEventTypes.MessageRemoved]
  }
  
  inline def MessageStatus(id: String, message_id: String, `type`: MessageEventType): typingsJapgolly.voximplantWebsdk.mod.IMEventTypes.MessageStatus = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], message_id = message_id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.voximplantWebsdk.mod.IMEventTypes.MessageStatus]
  }
  
  inline def PresenceUpdate(id: String, message: String, presence: UserStatuses): typingsJapgolly.voximplantWebsdk.mod.IMEventTypes.PresenceUpdate = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], presence = presence.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.voximplantWebsdk.mod.IMEventTypes.PresenceUpdate]
  }
  
  inline def RosterItemChange(displayName: String, groups: js.Array[String], id: String, `type`: RosterItemEvent): typingsJapgolly.voximplantWebsdk.mod.IMEventTypes.RosterItemChange = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], groups = groups.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.voximplantWebsdk.mod.IMEventTypes.RosterItemChange]
  }
  
  inline def RosterPresenceUpdate(id: String, presence: UserStatuses): typingsJapgolly.voximplantWebsdk.mod.IMEventTypes.RosterPresenceUpdate = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], presence = presence.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.voximplantWebsdk.mod.IMEventTypes.RosterPresenceUpdate]
  }
  
  inline def RosterReceived(id: String, roster: js.Array[RosterItem]): typingsJapgolly.voximplantWebsdk.mod.IMEventTypes.RosterReceived = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], roster = roster.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.voximplantWebsdk.mod.IMEventTypes.RosterReceived]
  }
  
  inline def SubscriptionRequest(id: String, `type`: SubscriptionRequestType): typingsJapgolly.voximplantWebsdk.mod.IMEventTypes.SubscriptionRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.voximplantWebsdk.mod.IMEventTypes.SubscriptionRequest]
  }
  
  inline def SystemError(errorData: js.Object, errorType: IMErrorType): typingsJapgolly.voximplantWebsdk.mod.IMEventTypes.SystemError = {
    val __obj = js.Dynamic.literal(errorData = errorData.asInstanceOf[js.Any], errorType = errorType.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.voximplantWebsdk.mod.IMEventTypes.SystemError]
  }
}
