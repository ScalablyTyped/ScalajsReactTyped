package typingsJapgolly.oidcProvider.anon

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.oidcProvider.mod.AuthorizationCode
import typingsJapgolly.oidcProvider.mod.BackchannelAuthenticationRequest
import typingsJapgolly.oidcProvider.mod.ClientCredentials
import typingsJapgolly.oidcProvider.mod.DeviceCode
import typingsJapgolly.oidcProvider.mod.Grant
import typingsJapgolly.oidcProvider.mod.IdToken
import typingsJapgolly.oidcProvider.mod.KoaContextWithOIDC
import typingsJapgolly.oidcProvider.mod.RefreshToken
import typingsJapgolly.oidcProvider.mod.Session
import typingsJapgolly.oidcProvider.mod.TTLFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dictkey
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var AccessToken: js.UndefOr[TTLFunction[typingsJapgolly.oidcProvider.mod.AccessToken] | Double] = js.undefined
  
  var AuthorizationCode: js.UndefOr[TTLFunction[typingsJapgolly.oidcProvider.mod.AuthorizationCode] | Double] = js.undefined
  
  var BackchannelAuthenticationRequest: js.UndefOr[
    TTLFunction[typingsJapgolly.oidcProvider.mod.BackchannelAuthenticationRequest] | Double
  ] = js.undefined
  
  var ClientCredentials: js.UndefOr[TTLFunction[typingsJapgolly.oidcProvider.mod.ClientCredentials] | Double] = js.undefined
  
  var DeviceCode: js.UndefOr[TTLFunction[typingsJapgolly.oidcProvider.mod.DeviceCode] | Double] = js.undefined
  
  var Grant: js.UndefOr[TTLFunction[typingsJapgolly.oidcProvider.mod.Grant] | Double] = js.undefined
  
  var IdToken: js.UndefOr[TTLFunction[typingsJapgolly.oidcProvider.mod.IdToken] | Double] = js.undefined
  
  var Interaction: js.UndefOr[TTLFunction[typingsJapgolly.oidcProvider.mod.Interaction] | Double] = js.undefined
  
  var RefreshToken: js.UndefOr[TTLFunction[typingsJapgolly.oidcProvider.mod.RefreshToken] | Double] = js.undefined
  
  var Session: js.UndefOr[TTLFunction[typingsJapgolly.oidcProvider.mod.Session] | Double] = js.undefined
}
object Dictkey {
  
  inline def apply(): Dictkey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dictkey]
  }
  
  extension [Self <: Dictkey](x: Self) {
    
    inline def setAccessToken(value: TTLFunction[typingsJapgolly.oidcProvider.mod.AccessToken] | Double): Self = StObject.set(x, "AccessToken", value.asInstanceOf[js.Any])
    
    inline def setAccessTokenFunction3(
      value: (/* ctx */ KoaContextWithOIDC, typingsJapgolly.oidcProvider.mod.AccessToken, /* client */ typingsJapgolly.oidcProvider.mod.Client) => Double
    ): Self = StObject.set(x, "AccessToken", js.Any.fromFunction3(value))
    
    inline def setAccessTokenUndefined: Self = StObject.set(x, "AccessToken", js.undefined)
    
    inline def setAuthorizationCode(value: TTLFunction[AuthorizationCode] | Double): Self = StObject.set(x, "AuthorizationCode", value.asInstanceOf[js.Any])
    
    inline def setAuthorizationCodeFunction3(
      value: (/* ctx */ KoaContextWithOIDC, AuthorizationCode, /* client */ typingsJapgolly.oidcProvider.mod.Client) => Double
    ): Self = StObject.set(x, "AuthorizationCode", js.Any.fromFunction3(value))
    
    inline def setAuthorizationCodeUndefined: Self = StObject.set(x, "AuthorizationCode", js.undefined)
    
    inline def setBackchannelAuthenticationRequest(value: TTLFunction[BackchannelAuthenticationRequest] | Double): Self = StObject.set(x, "BackchannelAuthenticationRequest", value.asInstanceOf[js.Any])
    
    inline def setBackchannelAuthenticationRequestFunction3(
      value: (/* ctx */ KoaContextWithOIDC, BackchannelAuthenticationRequest, /* client */ typingsJapgolly.oidcProvider.mod.Client) => Double
    ): Self = StObject.set(x, "BackchannelAuthenticationRequest", js.Any.fromFunction3(value))
    
    inline def setBackchannelAuthenticationRequestUndefined: Self = StObject.set(x, "BackchannelAuthenticationRequest", js.undefined)
    
    inline def setClientCredentials(value: TTLFunction[ClientCredentials] | Double): Self = StObject.set(x, "ClientCredentials", value.asInstanceOf[js.Any])
    
    inline def setClientCredentialsFunction3(
      value: (/* ctx */ KoaContextWithOIDC, ClientCredentials, /* client */ typingsJapgolly.oidcProvider.mod.Client) => Double
    ): Self = StObject.set(x, "ClientCredentials", js.Any.fromFunction3(value))
    
    inline def setClientCredentialsUndefined: Self = StObject.set(x, "ClientCredentials", js.undefined)
    
    inline def setDeviceCode(value: TTLFunction[DeviceCode] | Double): Self = StObject.set(x, "DeviceCode", value.asInstanceOf[js.Any])
    
    inline def setDeviceCodeFunction3(
      value: (/* ctx */ KoaContextWithOIDC, DeviceCode, /* client */ typingsJapgolly.oidcProvider.mod.Client) => Double
    ): Self = StObject.set(x, "DeviceCode", js.Any.fromFunction3(value))
    
    inline def setDeviceCodeUndefined: Self = StObject.set(x, "DeviceCode", js.undefined)
    
    inline def setGrant(value: TTLFunction[Grant] | Double): Self = StObject.set(x, "Grant", value.asInstanceOf[js.Any])
    
    inline def setGrantFunction3(
      value: (/* ctx */ KoaContextWithOIDC, Grant, /* client */ typingsJapgolly.oidcProvider.mod.Client) => Double
    ): Self = StObject.set(x, "Grant", js.Any.fromFunction3(value))
    
    inline def setGrantUndefined: Self = StObject.set(x, "Grant", js.undefined)
    
    inline def setIdToken(value: TTLFunction[IdToken] | Double): Self = StObject.set(x, "IdToken", value.asInstanceOf[js.Any])
    
    inline def setIdTokenFunction3(
      value: (/* ctx */ KoaContextWithOIDC, IdToken, /* client */ typingsJapgolly.oidcProvider.mod.Client) => Double
    ): Self = StObject.set(x, "IdToken", js.Any.fromFunction3(value))
    
    inline def setIdTokenUndefined: Self = StObject.set(x, "IdToken", js.undefined)
    
    inline def setInteraction(value: TTLFunction[typingsJapgolly.oidcProvider.mod.Interaction] | Double): Self = StObject.set(x, "Interaction", value.asInstanceOf[js.Any])
    
    inline def setInteractionFunction3(
      value: (/* ctx */ KoaContextWithOIDC, typingsJapgolly.oidcProvider.mod.Interaction, /* client */ typingsJapgolly.oidcProvider.mod.Client) => Double
    ): Self = StObject.set(x, "Interaction", js.Any.fromFunction3(value))
    
    inline def setInteractionUndefined: Self = StObject.set(x, "Interaction", js.undefined)
    
    inline def setRefreshToken(value: TTLFunction[RefreshToken] | Double): Self = StObject.set(x, "RefreshToken", value.asInstanceOf[js.Any])
    
    inline def setRefreshTokenFunction3(
      value: (/* ctx */ KoaContextWithOIDC, RefreshToken, /* client */ typingsJapgolly.oidcProvider.mod.Client) => Double
    ): Self = StObject.set(x, "RefreshToken", js.Any.fromFunction3(value))
    
    inline def setRefreshTokenUndefined: Self = StObject.set(x, "RefreshToken", js.undefined)
    
    inline def setSession(value: TTLFunction[Session] | Double): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
    
    inline def setSessionFunction3(
      value: (/* ctx */ KoaContextWithOIDC, Session, /* client */ typingsJapgolly.oidcProvider.mod.Client) => Double
    ): Self = StObject.set(x, "Session", js.Any.fromFunction3(value))
    
    inline def setSessionUndefined: Self = StObject.set(x, "Session", js.undefined)
  }
}
