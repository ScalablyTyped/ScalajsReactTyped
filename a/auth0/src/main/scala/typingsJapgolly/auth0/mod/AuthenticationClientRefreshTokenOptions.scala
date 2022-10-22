package typingsJapgolly.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthenticationClientRefreshTokenOptions extends StObject {
  
  var client_id: js.UndefOr[String] = js.undefined
  
  var refresh_token: String
}
object AuthenticationClientRefreshTokenOptions {
  
  inline def apply(refresh_token: String): AuthenticationClientRefreshTokenOptions = {
    val __obj = js.Dynamic.literal(refresh_token = refresh_token.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticationClientRefreshTokenOptions]
  }
  
  extension [Self <: AuthenticationClientRefreshTokenOptions](x: Self) {
    
    inline def setClient_id(value: String): Self = StObject.set(x, "client_id", value.asInstanceOf[js.Any])
    
    inline def setClient_idUndefined: Self = StObject.set(x, "client_id", js.undefined)
    
    inline def setRefresh_token(value: String): Self = StObject.set(x, "refresh_token", value.asInstanceOf[js.Any])
  }
}
