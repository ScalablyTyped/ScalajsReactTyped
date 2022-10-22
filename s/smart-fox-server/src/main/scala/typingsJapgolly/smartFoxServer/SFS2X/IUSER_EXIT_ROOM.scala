package typingsJapgolly.smartFoxServer.SFS2X

import typingsJapgolly.smartFoxServer.SFS2X.Entities.SFSRoom
import typingsJapgolly.smartFoxServer.SFS2X.Entities.SFSUser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IUSER_EXIT_ROOM extends StObject {
  
  var room: SFSRoom
  
  var user: SFSUser
}
object IUSER_EXIT_ROOM {
  
  inline def apply(room: SFSRoom, user: SFSUser): IUSER_EXIT_ROOM = {
    val __obj = js.Dynamic.literal(room = room.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUSER_EXIT_ROOM]
  }
  
  extension [Self <: IUSER_EXIT_ROOM](x: Self) {
    
    inline def setRoom(value: SFSRoom): Self = StObject.set(x, "room", value.asInstanceOf[js.Any])
    
    inline def setUser(value: SFSUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
