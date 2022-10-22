package typingsJapgolly.coinbase.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Auth extends StObject {
  
  /**
    * Authentication method e.g. "oauth"
    */
  var method: String
  
  var oauth_meta: js.UndefOr[Any] = js.undefined
  
  /**
    * Permissions for this user e.g. "wallet:user:read"
    */
  var scopes: js.Array[String]
}
object Auth {
  
  inline def apply(method: String, scopes: js.Array[String]): Auth = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Auth]
  }
  
  extension [Self <: Auth](x: Self) {
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setOauth_meta(value: Any): Self = StObject.set(x, "oauth_meta", value.asInstanceOf[js.Any])
    
    inline def setOauth_metaUndefined: Self = StObject.set(x, "oauth_meta", js.undefined)
    
    inline def setScopes(value: js.Array[String]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
    
    inline def setScopesVarargs(value: String*): Self = StObject.set(x, "scopes", js.Array(value*))
  }
}
