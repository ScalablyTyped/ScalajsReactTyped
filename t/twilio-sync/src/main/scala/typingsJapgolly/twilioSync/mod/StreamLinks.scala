package typingsJapgolly.twilioSync.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreamLinks extends StObject {
  
  var messages: String
}
object StreamLinks {
  
  inline def apply(messages: String): StreamLinks = {
    val __obj = js.Dynamic.literal(messages = messages.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamLinks]
  }
  
  extension [Self <: StreamLinks](x: Self) {
    
    inline def setMessages(value: String): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
  }
}
