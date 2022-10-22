package typingsJapgolly.nextAuth.anon

import typingsJapgolly.nextAuth.nextAuthStrings.oauth
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Accesstoken extends StObject {
  
  var access_token: js.UndefOr[String] = js.undefined
  
  var expires_at: js.UndefOr[Double] = js.undefined
  
  var expires_in: js.UndefOr[Double] = js.undefined
  
  var id_token: js.UndefOr[String] = js.undefined
  
  var provider: String
  
  var providerAccountId: String
  
  var refresh_token: js.UndefOr[String] = js.undefined
  
  var scope: js.UndefOr[String] = js.undefined
  
  var session_state: js.UndefOr[String] = js.undefined
  
  var token_type: js.UndefOr[String] = js.undefined
  
  var `type`: oauth
}
object Accesstoken {
  
  inline def apply(provider: String, providerAccountId: String): Accesstoken = {
    val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any], providerAccountId = providerAccountId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("oauth")
    __obj.asInstanceOf[Accesstoken]
  }
  
  extension [Self <: Accesstoken](x: Self) {
    
    inline def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
    
    inline def setAccess_tokenUndefined: Self = StObject.set(x, "access_token", js.undefined)
    
    inline def setExpires_at(value: Double): Self = StObject.set(x, "expires_at", value.asInstanceOf[js.Any])
    
    inline def setExpires_atUndefined: Self = StObject.set(x, "expires_at", js.undefined)
    
    inline def setExpires_in(value: Double): Self = StObject.set(x, "expires_in", value.asInstanceOf[js.Any])
    
    inline def setExpires_inUndefined: Self = StObject.set(x, "expires_in", js.undefined)
    
    inline def setId_token(value: String): Self = StObject.set(x, "id_token", value.asInstanceOf[js.Any])
    
    inline def setId_tokenUndefined: Self = StObject.set(x, "id_token", js.undefined)
    
    inline def setProvider(value: String): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    inline def setProviderAccountId(value: String): Self = StObject.set(x, "providerAccountId", value.asInstanceOf[js.Any])
    
    inline def setRefresh_token(value: String): Self = StObject.set(x, "refresh_token", value.asInstanceOf[js.Any])
    
    inline def setRefresh_tokenUndefined: Self = StObject.set(x, "refresh_token", js.undefined)
    
    inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    inline def setSession_state(value: String): Self = StObject.set(x, "session_state", value.asInstanceOf[js.Any])
    
    inline def setSession_stateUndefined: Self = StObject.set(x, "session_state", js.undefined)
    
    inline def setToken_type(value: String): Self = StObject.set(x, "token_type", value.asInstanceOf[js.Any])
    
    inline def setToken_typeUndefined: Self = StObject.set(x, "token_type", js.undefined)
    
    inline def setType(value: oauth): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
