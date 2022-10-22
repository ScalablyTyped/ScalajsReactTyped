package typingsJapgolly.chromecastCafSender.cast.framework

import typingsJapgolly.chrome.chrome.cast.ErrorCode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SessionStateEventData
  extends StObject
     with EventData {
  
  var errorCode: ErrorCode
  
  var session: CastSession
  
  var sessionState: SessionState
}
object SessionStateEventData {
  
  inline def apply(errorCode: ErrorCode, session: CastSession, sessionState: SessionState, `type`: String): SessionStateEventData = {
    val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any], sessionState = sessionState.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionStateEventData]
  }
  
  extension [Self <: SessionStateEventData](x: Self) {
    
    inline def setErrorCode(value: ErrorCode): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    inline def setSession(value: CastSession): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    inline def setSessionState(value: SessionState): Self = StObject.set(x, "sessionState", value.asInstanceOf[js.Any])
  }
}
