package typingsJapgolly.voximplantWebsdk.mod.IMEventTypes

import typingsJapgolly.voximplantWebsdk.mod.VoxImplantIMEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *    Event dispatched when invitation to chat room received
  */
trait ChatRoomInvitation
  extends StObject
     with VoxImplantIMEvent {
  
  /**
    * The body of the message
    */
  var body: String
  
  /**
    * User id (inviter)
    */
  var from: String
  
  /**
    * Password for the room
    */
  var password: String
  
  /**
    * A reason of the invitation
    */
  var reason: String
  
  /**
    * Room id
    */
  var room: String
}
object ChatRoomInvitation {
  
  inline def apply(body: String, from: String, password: String, reason: String, room: String): ChatRoomInvitation = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatRoomInvitation]
  }
  
  extension [Self <: ChatRoomInvitation](x: Self) {
    
    inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setRoom(value: String): Self = StObject.set(x, "room", value.asInstanceOf[js.Any])
  }
}
