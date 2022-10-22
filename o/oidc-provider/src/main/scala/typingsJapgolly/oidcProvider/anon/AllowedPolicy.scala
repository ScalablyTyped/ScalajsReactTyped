package typingsJapgolly.oidcProvider.anon

import typingsJapgolly.oidcProvider.mod.CanBePromise
import typingsJapgolly.oidcProvider.mod.ClientCredentials
import typingsJapgolly.oidcProvider.mod.KoaContextWithOIDC
import typingsJapgolly.oidcProvider.mod.RefreshToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllowedPolicy extends StObject {
  
  var allowedPolicy: js.UndefOr[
    js.Function3[
      /* ctx */ KoaContextWithOIDC, 
      /* client */ typingsJapgolly.oidcProvider.mod.Client, 
      /* token */ typingsJapgolly.oidcProvider.mod.AccessToken | ClientCredentials | RefreshToken, 
      CanBePromise[Boolean]
    ]
  ] = js.undefined
  
  var enabled: js.UndefOr[Boolean] = js.undefined
}
object AllowedPolicy {
  
  inline def apply(): AllowedPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowedPolicy]
  }
  
  extension [Self <: AllowedPolicy](x: Self) {
    
    inline def setAllowedPolicy(
      value: (/* ctx */ KoaContextWithOIDC, /* client */ typingsJapgolly.oidcProvider.mod.Client, /* token */ typingsJapgolly.oidcProvider.mod.AccessToken | ClientCredentials | RefreshToken) => CanBePromise[Boolean]
    ): Self = StObject.set(x, "allowedPolicy", js.Any.fromFunction3(value))
    
    inline def setAllowedPolicyUndefined: Self = StObject.set(x, "allowedPolicy", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
  }
}
