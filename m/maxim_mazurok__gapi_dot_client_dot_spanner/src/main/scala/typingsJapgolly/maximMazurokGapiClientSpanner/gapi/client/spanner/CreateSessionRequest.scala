package typingsJapgolly.maximMazurokGapiClientSpanner.gapi.client.spanner

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSessionRequest extends StObject {
  
  /** Required. The session to create. */
  var session: js.UndefOr[Session] = js.undefined
}
object CreateSessionRequest {
  
  inline def apply(): CreateSessionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSessionRequest]
  }
  
  extension [Self <: CreateSessionRequest](x: Self) {
    
    inline def setSession(value: Session): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    inline def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
  }
}
