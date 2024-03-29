package typingsJapgolly.awsSdk.clientsRumMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserDetails extends StObject {
  
  /**
    * The session ID that the performance events are from.
    */
  var sessionId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the user for this user session. This ID is generated by RUM and does not include any personally identifiable information about the user.
    */
  var userId: js.UndefOr[String] = js.undefined
}
object UserDetails {
  
  inline def apply(): UserDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserDetails]
  }
  
  extension [Self <: UserDetails](x: Self) {
    
    inline def setSessionId(value: String): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
    
    inline def setSessionIdUndefined: Self = StObject.set(x, "sessionId", js.undefined)
    
    inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}
