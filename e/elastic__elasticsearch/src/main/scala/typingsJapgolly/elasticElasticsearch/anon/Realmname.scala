package typingsJapgolly.elasticElasticsearch.anon

import typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.Username
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Realmname extends StObject {
  
  var realm_name: js.UndefOr[typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.Name] = js.undefined
  
  var refresh_token: js.UndefOr[String] = js.undefined
  
  var token: js.UndefOr[String] = js.undefined
  
  var username: js.UndefOr[Username] = js.undefined
}
object Realmname {
  
  inline def apply(): Realmname = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Realmname]
  }
  
  extension [Self <: Realmname](x: Self) {
    
    inline def setRealm_name(value: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.Name): Self = StObject.set(x, "realm_name", value.asInstanceOf[js.Any])
    
    inline def setRealm_nameUndefined: Self = StObject.set(x, "realm_name", js.undefined)
    
    inline def setRefresh_token(value: String): Self = StObject.set(x, "refresh_token", value.asInstanceOf[js.Any])
    
    inline def setRefresh_tokenUndefined: Self = StObject.set(x, "refresh_token", js.undefined)
    
    inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
    
    inline def setUsername(value: Username): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
