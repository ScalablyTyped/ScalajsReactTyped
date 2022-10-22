package typingsJapgolly.deezerSdk.DeezerSdk

import typingsJapgolly.deezerSdk.anon.AccessToken_
import typingsJapgolly.deezerSdk.deezerSdkStrings.connected
import typingsJapgolly.deezerSdk.deezerSdkStrings.not_authorized
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://developers.deezer.com/sdk/javascript/login | DZ.login}
  */
trait LoginResponse extends StObject {
  
  var authResponse: AccessToken_
  
  var status: connected | not_authorized
  
  var userID: String
}
object LoginResponse {
  
  inline def apply(authResponse: AccessToken_, status: connected | not_authorized, userID: String): LoginResponse = {
    val __obj = js.Dynamic.literal(authResponse = authResponse.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], userID = userID.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoginResponse]
  }
  
  extension [Self <: LoginResponse](x: Self) {
    
    inline def setAuthResponse(value: AccessToken_): Self = StObject.set(x, "authResponse", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: connected | not_authorized): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setUserID(value: String): Self = StObject.set(x, "userID", value.asInstanceOf[js.Any])
  }
}
