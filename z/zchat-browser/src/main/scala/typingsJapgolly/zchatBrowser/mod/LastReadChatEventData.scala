package typingsJapgolly.zchatBrowser.mod

import typingsJapgolly.zchatBrowser.zchatBrowserStrings.last_read
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LastReadChatEventData
  extends StObject
     with ChatEventData {
  
  var nick: String
  
  var timestamp: Double
  
  var `type`: last_read
}
object LastReadChatEventData {
  
  inline def apply(nick: String, timestamp: Double): LastReadChatEventData = {
    val __obj = js.Dynamic.literal(nick = nick.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("last_read")
    __obj.asInstanceOf[LastReadChatEventData]
  }
  
  extension [Self <: LastReadChatEventData](x: Self) {
    
    inline def setNick(value: String): Self = StObject.set(x, "nick", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setType(value: last_read): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
