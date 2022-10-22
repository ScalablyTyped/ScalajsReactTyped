package typingsJapgolly.awsSdk.clientsWorkspaceswebMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetIdentityProviderResponse extends StObject {
  
  /**
    * The identity provider.
    */
  var identityProvider: js.UndefOr[IdentityProvider] = js.undefined
}
object GetIdentityProviderResponse {
  
  inline def apply(): GetIdentityProviderResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetIdentityProviderResponse]
  }
  
  extension [Self <: GetIdentityProviderResponse](x: Self) {
    
    inline def setIdentityProvider(value: IdentityProvider): Self = StObject.set(x, "identityProvider", value.asInstanceOf[js.Any])
    
    inline def setIdentityProviderUndefined: Self = StObject.set(x, "identityProvider", js.undefined)
  }
}
