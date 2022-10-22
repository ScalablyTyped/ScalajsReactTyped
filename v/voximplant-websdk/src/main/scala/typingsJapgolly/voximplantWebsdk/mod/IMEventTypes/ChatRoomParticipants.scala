package typingsJapgolly.voximplantWebsdk.mod.IMEventTypes

import typingsJapgolly.voximplantWebsdk.mod.ChatRoomParticipant
import typingsJapgolly.voximplantWebsdk.mod.VoxImplantIMEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *    Event dispatched when info about chat room participants received
  */
trait ChatRoomParticipants
  extends StObject
     with VoxImplantIMEvent {
  
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
  
  inline def apply(participants: js.Array[ChatRoomParticipant], room: String): ChatRoomParticipants = {
    val __obj = js.Dynamic.literal(participants = participants.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatRoomParticipants]
  }
  
  extension [Self <: ChatRoomParticipants](x: Self) {
    
    inline def setParticipants(value: js.Array[ChatRoomParticipant]): Self = StObject.set(x, "participants", value.asInstanceOf[js.Any])
    
    inline def setParticipantsVarargs(value: ChatRoomParticipant*): Self = StObject.set(x, "participants", js.Array(value*))
    
    inline def setRoom(value: String): Self = StObject.set(x, "room", value.asInstanceOf[js.Any])
  }
}
