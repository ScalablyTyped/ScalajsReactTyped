package typingsJapgolly.plugapi.mod.Event

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModAddDJ extends StObject {
  
  var moderator: String
  
  var username: String
}
object ModAddDJ {
  
  inline def apply(moderator: String, username: String): ModAddDJ = {
    val __obj = js.Dynamic.literal(moderator = moderator.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModAddDJ]
  }
  
  extension [Self <: ModAddDJ](x: Self) {
    
    inline def setModerator(value: String): Self = StObject.set(x, "moderator", value.asInstanceOf[js.Any])
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
