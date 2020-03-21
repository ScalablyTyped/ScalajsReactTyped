package typingsJapgolly.voximplantWebsdk.mod.IMEventTypes

import typingsJapgolly.voximplantWebsdk.mod.ChatRoomParticipant
import typingsJapgolly.voximplantWebsdk.mod.VoxImplantIMEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		*	Event dispatched when info about chat room participants received
		*/
trait ChatRoomParticipants extends VoxImplantIMEvent {
  /**
  			* Participants list
  			*/
  var participants: js.Array[ChatRoomParticipant]
  /**
  			* Room id
  			*/
  var room: String
}

object ChatRoomParticipants {
  @scala.inline
  def apply(participants: js.Array[ChatRoomParticipant], room: String): ChatRoomParticipants = {
    val __obj = js.Dynamic.literal(participants = participants.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ChatRoomParticipants]
  }
}

