package typingsJapgolly.awsSdk.clientsNimbleMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartStreamingSessionResponse extends StObject {
  
  var session: js.UndefOr[StreamingSession] = js.undefined
}
object StartStreamingSessionResponse {
  
  inline def apply(): StartStreamingSessionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartStreamingSessionResponse]
  }
  
  extension [Self <: StartStreamingSessionResponse](x: Self) {
    
    inline def setSession(value: StreamingSession): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    inline def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
  }
}
