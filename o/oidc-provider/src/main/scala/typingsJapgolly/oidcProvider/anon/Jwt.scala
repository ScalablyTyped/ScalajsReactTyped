package typingsJapgolly.oidcProvider.anon

import typingsJapgolly.oidcProvider.mod.CanBePromise
import typingsJapgolly.oidcProvider.mod.ClientCredentials
import typingsJapgolly.oidcProvider.mod.JWTStructured
import typingsJapgolly.oidcProvider.mod.KoaContextWithOIDC
import typingsJapgolly.oidcProvider.mod.PASETOStructured
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Jwt extends StObject {
  
  var jwt: js.UndefOr[
    js.Function3[
      /* ctx */ KoaContextWithOIDC, 
      /* token */ typingsJapgolly.oidcProvider.mod.AccessToken | ClientCredentials, 
      /* parts */ JWTStructured, 
      CanBePromise[JWTStructured]
    ]
  ] = js.undefined
  
  var paseto: js.UndefOr[
    js.Function3[
      /* ctx */ KoaContextWithOIDC, 
      /* token */ typingsJapgolly.oidcProvider.mod.AccessToken | ClientCredentials, 
      /* parts */ PASETOStructured, 
      CanBePromise[PASETOStructured]
    ]
  ] = js.undefined
}
object Jwt {
  
  inline def apply(): Jwt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Jwt]
  }
  
  extension [Self <: Jwt](x: Self) {
    
    inline def setJwt(
      value: (/* ctx */ KoaContextWithOIDC, /* token */ typingsJapgolly.oidcProvider.mod.AccessToken | ClientCredentials, /* parts */ JWTStructured) => CanBePromise[JWTStructured]
    ): Self = StObject.set(x, "jwt", js.Any.fromFunction3(value))
    
    inline def setJwtUndefined: Self = StObject.set(x, "jwt", js.undefined)
    
    inline def setPaseto(
      value: (/* ctx */ KoaContextWithOIDC, /* token */ typingsJapgolly.oidcProvider.mod.AccessToken | ClientCredentials, /* parts */ PASETOStructured) => CanBePromise[PASETOStructured]
    ): Self = StObject.set(x, "paseto", js.Any.fromFunction3(value))
    
    inline def setPasetoUndefined: Self = StObject.set(x, "paseto", js.undefined)
  }
}
