package typingsJapgolly.smartFoxServer.SFS2X

import typingsJapgolly.smartFoxServer.SFS2X.Entities.SFSRoom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IROOM_GROUP_SUBSCRIBE extends StObject {
  
  var groupId: String
  
  var newRooms: js.Array[SFSRoom]
}
object IROOM_GROUP_SUBSCRIBE {
  
  inline def apply(groupId: String, newRooms: js.Array[SFSRoom]): IROOM_GROUP_SUBSCRIBE = {
    val __obj = js.Dynamic.literal(groupId = groupId.asInstanceOf[js.Any], newRooms = newRooms.asInstanceOf[js.Any])
    __obj.asInstanceOf[IROOM_GROUP_SUBSCRIBE]
  }
  
  extension [Self <: IROOM_GROUP_SUBSCRIBE](x: Self) {
    
    inline def setGroupId(value: String): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
    
    inline def setNewRooms(value: js.Array[SFSRoom]): Self = StObject.set(x, "newRooms", value.asInstanceOf[js.Any])
    
    inline def setNewRoomsVarargs(value: SFSRoom*): Self = StObject.set(x, "newRooms", js.Array(value*))
  }
}
