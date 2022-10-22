package typingsJapgolly.microsoftLiveConnect.Microsoft.Live

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the user's login status.
  */
trait ILoginStatus extends StObject {
  
  /**
    * A JSON object that contains the properties of the current session.
    */
  var session: ISession
  
  /**
    * The sign-in status of the user. Valid values are "connected",
    * "notConnected", or "unknown".
    */
  var status: String
}
object ILoginStatus {
  
  inline def apply(session: ISession, status: String): ILoginStatus = {
    val __obj = js.Dynamic.literal(session = session.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILoginStatus]
  }
  
  extension [Self <: ILoginStatus](x: Self) {
    
    inline def setSession(value: ISession): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
