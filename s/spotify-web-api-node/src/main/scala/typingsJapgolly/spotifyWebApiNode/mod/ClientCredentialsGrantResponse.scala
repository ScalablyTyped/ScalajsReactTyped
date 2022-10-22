package typingsJapgolly.spotifyWebApiNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response returned when using Client Credentials authentication flow
  * https://developer.spotify.com/documentation/general/guides/authorization-guide/#example-4
  */
trait ClientCredentialsGrantResponse extends StObject {
  
  var access_token: String
  
  var expires_in: Double
  
  var token_type: String
}
object ClientCredentialsGrantResponse {
  
  inline def apply(access_token: String, expires_in: Double, token_type: String): ClientCredentialsGrantResponse = {
    val __obj = js.Dynamic.literal(access_token = access_token.asInstanceOf[js.Any], expires_in = expires_in.asInstanceOf[js.Any], token_type = token_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientCredentialsGrantResponse]
  }
  
  extension [Self <: ClientCredentialsGrantResponse](x: Self) {
    
    inline def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
    
    inline def setExpires_in(value: Double): Self = StObject.set(x, "expires_in", value.asInstanceOf[js.Any])
    
    inline def setToken_type(value: String): Self = StObject.set(x, "token_type", value.asInstanceOf[js.Any])
  }
}
