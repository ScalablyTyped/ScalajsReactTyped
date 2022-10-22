package typingsJapgolly.reactNativeAuth0.mod

import typingsJapgolly.reactNativeAuth0.reactNativeAuth0Strings.Bearer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PasswordRealmResponse extends StObject {
  
  var accessToken: String
  
  var expiresIn: Double
  
  var idToken: String
  
  var refreshToken: js.UndefOr[String] = js.undefined
  
  var scope: String
  
  var tokenType: Bearer
}
object PasswordRealmResponse {
  
  inline def apply(accessToken: String, expiresIn: Double, idToken: String, scope: String): PasswordRealmResponse = {
    val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], expiresIn = expiresIn.asInstanceOf[js.Any], idToken = idToken.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], tokenType = "Bearer")
    __obj.asInstanceOf[PasswordRealmResponse]
  }
  
  extension [Self <: PasswordRealmResponse](x: Self) {
    
    inline def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
    
    inline def setExpiresIn(value: Double): Self = StObject.set(x, "expiresIn", value.asInstanceOf[js.Any])
    
    inline def setIdToken(value: String): Self = StObject.set(x, "idToken", value.asInstanceOf[js.Any])
    
    inline def setRefreshToken(value: String): Self = StObject.set(x, "refreshToken", value.asInstanceOf[js.Any])
    
    inline def setRefreshTokenUndefined: Self = StObject.set(x, "refreshToken", js.undefined)
    
    inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setTokenType(value: Bearer): Self = StObject.set(x, "tokenType", value.asInstanceOf[js.Any])
  }
}
