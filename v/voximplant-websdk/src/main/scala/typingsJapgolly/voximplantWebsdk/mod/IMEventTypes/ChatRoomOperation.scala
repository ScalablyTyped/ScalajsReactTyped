package typingsJapgolly.voximplantWebsdk.mod.IMEventTypes

import typingsJapgolly.voximplantWebsdk.mod.ChatRoomOperationType
import typingsJapgolly.voximplantWebsdk.mod.VoxImplantIMEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *    Event dispatched when chat room participant was banned/unbanned
  */
trait ChatRoomOperation
  extends StObject
     with VoxImplantIMEvent {
  
  /**
    * Operation type
    */
  var operation: ChatRoomOperationType
  
  /**
    * Operation result: true/false - success/failure
    */
  var result: Boolean
  
  /**
    * Room id
    */
  var room: String
}
object ChatRoomOperation {
  
  inline def apply(operation: ChatRoomOperationType, result: Boolean, room: String): ChatRoomOperation = {
    val __obj = js.Dynamic.literal(operation = operation.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatRoomOperation]
  }
  
  extension [Self <: ChatRoomOperation](x: Self) {
    
    inline def setOperation(value: ChatRoomOperationType): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    inline def setResult(value: Boolean): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setRoom(value: String): Self = StObject.set(x, "room", value.asInstanceOf[js.Any])
  }
}
