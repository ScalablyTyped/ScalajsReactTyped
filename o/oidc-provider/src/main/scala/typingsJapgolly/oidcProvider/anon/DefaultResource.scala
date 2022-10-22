package typingsJapgolly.oidcProvider.anon

import typingsJapgolly.oidcProvider.mod.AuthorizationCode
import typingsJapgolly.oidcProvider.mod.BackchannelAuthenticationRequest
import typingsJapgolly.oidcProvider.mod.CanBePromise
import typingsJapgolly.oidcProvider.mod.DeviceCode
import typingsJapgolly.oidcProvider.mod.KoaContextWithOIDC
import typingsJapgolly.oidcProvider.mod.RefreshToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultResource extends StObject {
  
  var defaultResource: js.UndefOr[
    js.Function1[/* ctx */ KoaContextWithOIDC, CanBePromise[String | js.Array[String]]]
  ] = js.undefined
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var getResourceServerInfo: js.UndefOr[
    js.Function3[
      /* ctx */ KoaContextWithOIDC, 
      /* resourceIndicator */ String, 
      /* client */ typingsJapgolly.oidcProvider.mod.Client, 
      CanBePromise[typingsJapgolly.oidcProvider.mod.ResourceServer]
    ]
  ] = js.undefined
  
  var useGrantedResource: js.UndefOr[
    js.Function2[
      /* ctx */ KoaContextWithOIDC, 
      /* model */ AuthorizationCode | RefreshToken | DeviceCode | BackchannelAuthenticationRequest, 
      CanBePromise[Boolean]
    ]
  ] = js.undefined
}
object DefaultResource {
  
  inline def apply(): DefaultResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultResource]
  }
  
  extension [Self <: DefaultResource](x: Self) {
    
    inline def setDefaultResource(value: /* ctx */ KoaContextWithOIDC => CanBePromise[String | js.Array[String]]): Self = StObject.set(x, "defaultResource", js.Any.fromFunction1(value))
    
    inline def setDefaultResourceUndefined: Self = StObject.set(x, "defaultResource", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setGetResourceServerInfo(
      value: (/* ctx */ KoaContextWithOIDC, /* resourceIndicator */ String, /* client */ typingsJapgolly.oidcProvider.mod.Client) => CanBePromise[typingsJapgolly.oidcProvider.mod.ResourceServer]
    ): Self = StObject.set(x, "getResourceServerInfo", js.Any.fromFunction3(value))
    
    inline def setGetResourceServerInfoUndefined: Self = StObject.set(x, "getResourceServerInfo", js.undefined)
    
    inline def setUseGrantedResource(
      value: (/* ctx */ KoaContextWithOIDC, /* model */ AuthorizationCode | RefreshToken | DeviceCode | BackchannelAuthenticationRequest) => CanBePromise[Boolean]
    ): Self = StObject.set(x, "useGrantedResource", js.Any.fromFunction2(value))
    
    inline def setUseGrantedResourceUndefined: Self = StObject.set(x, "useGrantedResource", js.undefined)
  }
}
