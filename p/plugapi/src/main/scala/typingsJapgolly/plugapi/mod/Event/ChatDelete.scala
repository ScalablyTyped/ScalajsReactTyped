package typingsJapgolly.plugapi.mod.Event

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChatDelete extends StObject {
  
  var chatID: String
  
  var mi: Double
}
object ChatDelete {
  
  inline def apply(chatID: String, mi: Double): ChatDelete = {
    val __obj = js.Dynamic.literal(chatID = chatID.asInstanceOf[js.Any], mi = mi.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatDelete]
  }
  
  extension [Self <: ChatDelete](x: Self) {
    
    inline def setChatID(value: String): Self = StObject.set(x, "chatID", value.asInstanceOf[js.Any])
    
    inline def setMi(value: Double): Self = StObject.set(x, "mi", value.asInstanceOf[js.Any])
  }
}
