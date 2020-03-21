package typingsJapgolly.voximplantWebsdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
trait VoxImplantIMEvent extends js.Object

object VoxImplantIMEvent {
  @scala.inline
  def ChatRoomStateUpdate(from: String, resource: String, room: String, state: ChatStateType): VoxImplantIMEvent = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VoxImplantIMEvent]
  }
  @scala.inline
  def SystemError(errorData: js.Object, errorType: IMErrorType): VoxImplantIMEvent = {
    val __obj = js.Dynamic.literal(errorData = errorData.asInstanceOf[js.Any], errorType = errorType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VoxImplantIMEvent]
  }
  @scala.inline
  def RosterReceived(id: String, roster: js.Array[RosterItem]): VoxImplantIMEvent = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], roster = roster.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VoxImplantIMEvent]
  }
  @scala.inline
  def ChatHistoryReceived(id: String, message_id: String, messages: js.Array[IMHistoryMessage]): VoxImplantIMEvent = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], message_id = message_id.asInstanceOf[js.Any], messages = messages.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VoxImplantIMEvent]
  }
  @scala.inline
  def ChatRoomNewParticipant(displayName: String, participant: String, room: String): VoxImplantIMEvent = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], participant = participant.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VoxImplantIMEvent]
  }
  @scala.inline
  def ChatRoomBanList(participants: js.Array[ChatRoomParticipant], room: String): VoxImplantIMEvent = {
    val __obj = js.Dynamic.literal(participants = participants.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VoxImplantIMEvent]
  }
  @scala.inline
  def ChatRoomMessageRemoved(
    from: String,
    message_id: String,
    private_message: String,
    resource: String,
    room: String,
    timestamp: String
  ): VoxImplantIMEvent = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], message_id = message_id.asInstanceOf[js.Any], private_message = private_message.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VoxImplantIMEvent]
  }
  @scala.inline
  def MessageStatus(id: String, message_id: String, `type`: MessageEventType, resource: String = null): VoxImplantIMEvent = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], message_id = message_id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoxImplantIMEvent]
  }
  @scala.inline
  def ChatRoomMessageModified(
    content: String,
    from: String,
    message_id: String,
    private_message: String,
    resource: String,
    room: String,
    timestamp: String
  ): VoxImplantIMEvent = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], message_id = message_id.asInstanceOf[js.Any], private_message = private_message.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VoxImplantIMEvent]
  }
  @scala.inline
  def ChatRoomHistoryReceived(message_id: String, messages: js.Array[IMHistoryMessage], room: String): VoxImplantIMEvent = {
    val __obj = js.Dynamic.literal(message_id = message_id.asInstanceOf[js.Any], messages = messages.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VoxImplantIMEvent]
  }
  @scala.inline
  def ChatRoomParticipants(participants: js.Array[ChatRoomParticipant], room: String): VoxImplantIMEvent = {
    val __obj = js.Dynamic.literal(participants = participants.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VoxImplantIMEvent]
  }
  @scala.inline
  def ChatRoomPresenceUpdate(message: String, participant: ParticipantInfo, presence: UserStatuses, room: String): VoxImplantIMEvent = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], participant = participant.asInstanceOf[js.Any], presence = presence.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VoxImplantIMEvent]
  }
  @scala.inline
  def ChatRoomError(code: String, operation: String, room: String, text: String): VoxImplantIMEvent = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VoxImplantIMEvent]
  }
  @scala.inline
  def MessageNotModified(code: Double, message_id: String, to: String): VoxImplantIMEvent = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message_id = message_id.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VoxImplantIMEvent]
  }
  @scala.inline
  def SubscriptionRequest(id: String, `type`: SubscriptionRequestType, message: String = null, resource: String = null): VoxImplantIMEvent = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoxImplantIMEvent]
  }
  @scala.inline
  def ChatRoomInvitation(body: String, from: String, password: String, reason: String, room: String): VoxImplantIMEvent = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VoxImplantIMEvent]
  }
  @scala.inline
  def PresenceUpdate(id: String, message: String, presence: UserStatuses, resource: String = null): VoxImplantIMEvent = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], presence = presence.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoxImplantIMEvent]
  }
  @scala.inline
  def MessageReceived(content: String, id: String, message_id: String, to: String, resource: String = null): VoxImplantIMEvent = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], message_id = message_id.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoxImplantIMEvent]
  }
  @scala.inline
  def ChatRoomInfo(
    features: Double,
    info: typingsJapgolly.voximplantWebsdk.mod.IMEventTypes.ChatRoomInfo,
    room: String,
    room_name: String
  ): VoxImplantIMEvent = {
    val __obj = js.Dynamic.literal(features = features.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any], room_name = room_name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VoxImplantIMEvent]
  }
  @scala.inline
  def ChatRoomOperation(operation: ChatRoomOperationType, result: Boolean, room: String): VoxImplantIMEvent = {
    val __obj = js.Dynamic.literal(operation = operation.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VoxImplantIMEvent]
  }
  @scala.inline
  def ChatRoomParticipantExit(participant: String, room: String): VoxImplantIMEvent = {
    val __obj = js.Dynamic.literal(participant = participant.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VoxImplantIMEvent]
  }
  @scala.inline
  def RosterItemChange(
    displayName: String,
    groups: js.Array[String],
    id: String,
    `type`: RosterItemEvent,
    resource: String = null
  ): VoxImplantIMEvent = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], groups = groups.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoxImplantIMEvent]
  }
  @scala.inline
  def ChatRoomSubjectChange(id: String, resource: String, room: String, subject: String): VoxImplantIMEvent = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VoxImplantIMEvent]
  }
  @scala.inline
  def MessageModified(content: String, id: String, message_id: String, to: String): VoxImplantIMEvent = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], message_id = message_id.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VoxImplantIMEvent]
  }
  @scala.inline
  def ChatRoomsDataReceived(rooms: js.Array[ChatRoom]): VoxImplantIMEvent = {
    val __obj = js.Dynamic.literal(rooms = rooms.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VoxImplantIMEvent]
  }
  @scala.inline
  def ChatRoomMessageNotModified(code: Double, message_id: String, private_message: String, room: String): VoxImplantIMEvent = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message_id = message_id.asInstanceOf[js.Any], private_message = private_message.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VoxImplantIMEvent]
  }
  @scala.inline
  def ChatRoomMessageReceived(
    content: String,
    from: String,
    message_id: String,
    private_message: String,
    resource: String,
    room: String,
    timestamp: String
  ): VoxImplantIMEvent = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], message_id = message_id.asInstanceOf[js.Any], private_message = private_message.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VoxImplantIMEvent]
  }
  @scala.inline
  def ChatRoomCreated(room: String): VoxImplantIMEvent = {
    val __obj = js.Dynamic.literal(room = room.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VoxImplantIMEvent]
  }
  @scala.inline
  def RosterPresenceUpdate(id: String, presence: UserStatuses, message: String = null, resource: String = null): VoxImplantIMEvent = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], presence = presence.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoxImplantIMEvent]
  }
  @scala.inline
  def ChatStateUpdate(id: String, state: ChatStateType, resource: String = null): VoxImplantIMEvent = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoxImplantIMEvent]
  }
  @scala.inline
  def MessageRemoved(id: String, message_id: String, to: String): VoxImplantIMEvent = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], message_id = message_id.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VoxImplantIMEvent]
  }
  @scala.inline
  def ChatRoomInviteDeclined(invitee: String, reason: String, room: String): VoxImplantIMEvent = {
    val __obj = js.Dynamic.literal(invitee = invitee.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VoxImplantIMEvent]
  }
}

