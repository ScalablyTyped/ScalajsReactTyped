package typingsJapgolly.passportGoogleOauth2

import typingsJapgolly.passportGoogleOauth2.passportGoogleOauth2Strings.Bearer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Accesstoken extends StObject {
    
    var access_token: String
    
    var expires_in: Double
    
    var id_token: String
    
    var scope: String
    
    var token_type: Bearer
  }
  object Accesstoken {
    
    inline def apply(access_token: String, expires_in: Double, id_token: String, scope: String): Accesstoken = {
      val __obj = js.Dynamic.literal(access_token = access_token.asInstanceOf[js.Any], expires_in = expires_in.asInstanceOf[js.Any], id_token = id_token.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], token_type = "Bearer")
      __obj.asInstanceOf[Accesstoken]
    }
    
    extension [Self <: Accesstoken](x: Self) {
      
      inline def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
      
      inline def setExpires_in(value: Double): Self = StObject.set(x, "expires_in", value.asInstanceOf[js.Any])
      
      inline def setId_token(value: String): Self = StObject.set(x, "id_token", value.asInstanceOf[js.Any])
      
      inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setToken_type(value: Bearer): Self = StObject.set(x, "token_type", value.asInstanceOf[js.Any])
    }
  }
}
