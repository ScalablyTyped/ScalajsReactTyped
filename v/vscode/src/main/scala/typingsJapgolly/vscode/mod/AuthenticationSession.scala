package typingsJapgolly.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthenticationSession extends StObject {
  
  /**
    * The access token.
    */
  val accessToken: String
  
  /**
    * The account associated with the session.
    */
  val account: AuthenticationSessionAccountInformation
  
  /**
    * The identifier of the authentication session.
    */
  val id: String
  
  /**
    * The permissions granted by the session's access token. Available scopes
    * are defined by the {@link AuthenticationProvider}.
    */
  val scopes: js.Array[String]
}
object AuthenticationSession {
  
  inline def apply(
    accessToken: String,
    account: AuthenticationSessionAccountInformation,
    id: String,
    scopes: js.Array[String]
  ): AuthenticationSession = {
    val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], account = account.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticationSession]
  }
  
  extension [Self <: AuthenticationSession](x: Self) {
    
    inline def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
    
    inline def setAccount(value: AuthenticationSessionAccountInformation): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setScopes(value: js.Array[String]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
    
    inline def setScopesVarargs(value: String*): Self = StObject.set(x, "scopes", js.Array(value*))
  }
}
