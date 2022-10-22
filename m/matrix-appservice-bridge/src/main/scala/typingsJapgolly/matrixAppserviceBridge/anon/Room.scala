package typingsJapgolly.matrixAppserviceBridge.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Room extends StObject {
  
  var room: String
  
  var sender: String
  
  var target: js.UndefOr[String] = js.undefined
}
object Room {
  
  inline def apply(room: String, sender: String): Room = {
    val __obj = js.Dynamic.literal(room = room.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[Room]
  }
  
  extension [Self <: Room](x: Self) {
    
    inline def setRoom(value: String): Self = StObject.set(x, "room", value.asInstanceOf[js.Any])
    
    inline def setSender(value: String): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
