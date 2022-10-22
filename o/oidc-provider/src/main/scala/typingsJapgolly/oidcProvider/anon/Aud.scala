package typingsJapgolly.oidcProvider.anon

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.oidcProvider.mod.ClaimsParameter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Aud
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var accountId: String
  
  var aud: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var claims: js.UndefOr[ClaimsParameter] = js.undefined
  
  var client: typingsJapgolly.oidcProvider.mod.Client
  
  var expiresWithSession: js.UndefOr[Boolean] = js.undefined
  
  var grantId: String
  
  var gty: String
  
  var jkt: js.UndefOr[String] = js.undefined
  
  var resourceServer: js.UndefOr[typingsJapgolly.oidcProvider.mod.ResourceServer] = js.undefined
  
  var scope: String
  
  var sessionUid: js.UndefOr[String] = js.undefined
  
  var sid: js.UndefOr[String] = js.undefined
  
  @JSName("x5t#S256")
  var x5tNumbersignS256: js.UndefOr[String] = js.undefined
}
object Aud {
  
  inline def apply(
    accountId: String,
    client: typingsJapgolly.oidcProvider.mod.Client,
    grantId: String,
    gty: String,
    scope: String
  ): Aud = {
    val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], client = client.asInstanceOf[js.Any], grantId = grantId.asInstanceOf[js.Any], gty = gty.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[Aud]
  }
  
  extension [Self <: Aud](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAud(value: String | js.Array[String]): Self = StObject.set(x, "aud", value.asInstanceOf[js.Any])
    
    inline def setAudUndefined: Self = StObject.set(x, "aud", js.undefined)
    
    inline def setAudVarargs(value: String*): Self = StObject.set(x, "aud", js.Array(value*))
    
    inline def setClaims(value: ClaimsParameter): Self = StObject.set(x, "claims", value.asInstanceOf[js.Any])
    
    inline def setClaimsUndefined: Self = StObject.set(x, "claims", js.undefined)
    
    inline def setClient(value: typingsJapgolly.oidcProvider.mod.Client): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    inline def setExpiresWithSession(value: Boolean): Self = StObject.set(x, "expiresWithSession", value.asInstanceOf[js.Any])
    
    inline def setExpiresWithSessionUndefined: Self = StObject.set(x, "expiresWithSession", js.undefined)
    
    inline def setGrantId(value: String): Self = StObject.set(x, "grantId", value.asInstanceOf[js.Any])
    
    inline def setGty(value: String): Self = StObject.set(x, "gty", value.asInstanceOf[js.Any])
    
    inline def setJkt(value: String): Self = StObject.set(x, "jkt", value.asInstanceOf[js.Any])
    
    inline def setJktUndefined: Self = StObject.set(x, "jkt", js.undefined)
    
    inline def setResourceServer(value: typingsJapgolly.oidcProvider.mod.ResourceServer): Self = StObject.set(x, "resourceServer", value.asInstanceOf[js.Any])
    
    inline def setResourceServerUndefined: Self = StObject.set(x, "resourceServer", js.undefined)
    
    inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setSessionUid(value: String): Self = StObject.set(x, "sessionUid", value.asInstanceOf[js.Any])
    
    inline def setSessionUidUndefined: Self = StObject.set(x, "sessionUid", js.undefined)
    
    inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
    
    inline def setSidUndefined: Self = StObject.set(x, "sid", js.undefined)
    
    inline def setX5tNumbersignS256(value: String): Self = StObject.set(x, "x5t#S256", value.asInstanceOf[js.Any])
    
    inline def setX5tNumbersignS256Undefined: Self = StObject.set(x, "x5t#S256", js.undefined)
  }
}
