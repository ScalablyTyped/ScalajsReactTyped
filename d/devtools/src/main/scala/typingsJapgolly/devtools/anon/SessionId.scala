package typingsJapgolly.devtools.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SessionId extends StObject {
  
  var capabilities: BrowserName
  
  var sessionId: String
}
object SessionId {
  
  inline def apply(capabilities: BrowserName, sessionId: String): SessionId = {
    val __obj = js.Dynamic.literal(capabilities = capabilities.asInstanceOf[js.Any], sessionId = sessionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionId]
  }
  
  extension [Self <: SessionId](x: Self) {
    
    inline def setCapabilities(value: BrowserName): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
    
    inline def setSessionId(value: String): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
  }
}
