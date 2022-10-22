package typingsJapgolly.steamUser.anon

import typingsJapgolly.steamUser.componentsChatroomMod.ChatRoomGroupState
import typingsJapgolly.steamUser.componentsChatroomMod.UserChatRoomGroupState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Chatgroupid extends StObject {
  
  var chat_group_id: String
  
  var state: ChatRoomGroupState
  
  var user_chat_state: UserChatRoomGroupState
}
object Chatgroupid {
  
  inline def apply(chat_group_id: String, state: ChatRoomGroupState, user_chat_state: UserChatRoomGroupState): Chatgroupid = {
    val __obj = js.Dynamic.literal(chat_group_id = chat_group_id.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], user_chat_state = user_chat_state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Chatgroupid]
  }
  
  extension [Self <: Chatgroupid](x: Self) {
    
    inline def setChat_group_id(value: String): Self = StObject.set(x, "chat_group_id", value.asInstanceOf[js.Any])
    
    inline def setState(value: ChatRoomGroupState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setUser_chat_state(value: UserChatRoomGroupState): Self = StObject.set(x, "user_chat_state", value.asInstanceOf[js.Any])
  }
}
