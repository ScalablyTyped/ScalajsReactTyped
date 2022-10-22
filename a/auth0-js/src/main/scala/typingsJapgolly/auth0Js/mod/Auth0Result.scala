package typingsJapgolly.auth0Js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Auth0Result extends StObject {
  
  /**
    * token that allows access to the specified resource server (identified by the audience parameter
    * or by default Auth0's /userinfo endpoint)
    */
  var accessToken: js.UndefOr[String] = js.undefined
  
  /** values that you receive back on the authentication response */
  var appState: js.UndefOr[Any] = js.undefined
  
  /** number of seconds until the access token expires */
  var expiresIn: js.UndefOr[Double] = js.undefined
  
  /** token that identifies the user */
  var idToken: js.UndefOr[String] = js.undefined
  
  /**
    * token that can be used to get new access tokens from Auth0.
    * Note that not all Auth0 Applications can request them
    * or the resource server might not allow them.
    */
  var refreshToken: js.UndefOr[String] = js.undefined
}
object Auth0Result {
  
  inline def apply(): Auth0Result = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Auth0Result]
  }
  
  extension [Self <: Auth0Result](x: Self) {
    
    inline def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
    
    inline def setAccessTokenUndefined: Self = StObject.set(x, "accessToken", js.undefined)
    
    inline def setAppState(value: Any): Self = StObject.set(x, "appState", value.asInstanceOf[js.Any])
    
    inline def setAppStateUndefined: Self = StObject.set(x, "appState", js.undefined)
    
    inline def setExpiresIn(value: Double): Self = StObject.set(x, "expiresIn", value.asInstanceOf[js.Any])
    
    inline def setExpiresInUndefined: Self = StObject.set(x, "expiresIn", js.undefined)
    
    inline def setIdToken(value: String): Self = StObject.set(x, "idToken", value.asInstanceOf[js.Any])
    
    inline def setIdTokenUndefined: Self = StObject.set(x, "idToken", js.undefined)
    
    inline def setRefreshToken(value: String): Self = StObject.set(x, "refreshToken", value.asInstanceOf[js.Any])
    
    inline def setRefreshTokenUndefined: Self = StObject.set(x, "refreshToken", js.undefined)
  }
}
