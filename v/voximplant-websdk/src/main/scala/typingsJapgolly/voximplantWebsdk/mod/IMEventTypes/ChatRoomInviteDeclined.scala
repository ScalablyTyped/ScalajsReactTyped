package typingsJapgolly.voximplantWebsdk.mod.IMEventTypes

import typingsJapgolly.voximplantWebsdk.mod.VoxImplantIMEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		*	Event dispatched if an invitation to chat room was declined by the invitee
		*/
trait ChatRoomInviteDeclined extends VoxImplantIMEvent {
  /**
  			* User id (invitee)
  			*/
  var invitee: String
  /**
  			* A reason of the invitation
  			*/
  var reason: String
  /**
  			* Room id
  			*/
  var room: String
}

object ChatRoomInviteDeclined {
  @scala.inline
  def apply(invitee: String, reason: String, room: String): ChatRoomInviteDeclined = {
    val __obj = js.Dynamic.literal(invitee = invitee.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ChatRoomInviteDeclined]
  }
}

