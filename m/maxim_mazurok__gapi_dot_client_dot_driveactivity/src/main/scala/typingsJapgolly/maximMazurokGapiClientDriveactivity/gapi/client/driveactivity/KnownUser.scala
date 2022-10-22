package typingsJapgolly.maximMazurokGapiClientDriveactivity.gapi.client.driveactivity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KnownUser extends StObject {
  
  /** True if this is the user making the request. */
  var isCurrentUser: js.UndefOr[Boolean] = js.undefined
  
  /** The identifier for this user that can be used with the People API to get more information. The format is `people/ACCOUNT_ID`. See https://developers.google.com/people/. */
  var personName: js.UndefOr[String] = js.undefined
}
object KnownUser {
  
  inline def apply(): KnownUser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KnownUser]
  }
  
  extension [Self <: KnownUser](x: Self) {
    
    inline def setIsCurrentUser(value: Boolean): Self = StObject.set(x, "isCurrentUser", value.asInstanceOf[js.Any])
    
    inline def setIsCurrentUserUndefined: Self = StObject.set(x, "isCurrentUser", js.undefined)
    
    inline def setPersonName(value: String): Self = StObject.set(x, "personName", value.asInstanceOf[js.Any])
    
    inline def setPersonNameUndefined: Self = StObject.set(x, "personName", js.undefined)
  }
}
