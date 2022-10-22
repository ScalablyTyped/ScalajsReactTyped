package typingsJapgolly.voximplantWebsdk.mod.IMEventTypes

import typingsJapgolly.voximplantWebsdk.mod.VoxImplantIMEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Event dispatched if chat room was created successfully
  */
trait ChatRoomCreated
  extends StObject
     with VoxImplantIMEvent {
  
  /**
    * Room id
    */
  var room: String
}
object ChatRoomCreated {
  
  inline def apply(room: String): ChatRoomCreated = {
    val __obj = js.Dynamic.literal(room = room.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatRoomCreated]
  }
  
  extension [Self <: ChatRoomCreated](x: Self) {
    
    inline def setRoom(value: String): Self = StObject.set(x, "room", value.asInstanceOf[js.Any])
  }
}
