package typingsJapgolly.oidcProvider.anon

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.oidcProvider.mod.Account
import typingsJapgolly.oidcProvider.mod.AuthorizationCode
import typingsJapgolly.oidcProvider.mod.BackchannelAuthenticationRequest
import typingsJapgolly.oidcProvider.mod.ClientCredentials
import typingsJapgolly.oidcProvider.mod.DeviceCode
import typingsJapgolly.oidcProvider.mod.Grant
import typingsJapgolly.oidcProvider.mod.InitialAccessToken
import typingsJapgolly.oidcProvider.mod.PushedAuthorizationRequest
import typingsJapgolly.oidcProvider.mod.RefreshToken
import typingsJapgolly.oidcProvider.mod.RegistrationAccessToken
import typingsJapgolly.oidcProvider.mod.Session
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessToken
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  val AccessToken: js.UndefOr[typingsJapgolly.oidcProvider.mod.AccessToken] = js.undefined
  
  val Account: js.UndefOr[typingsJapgolly.oidcProvider.mod.Account] = js.undefined
  
  val AuthorizationCode: js.UndefOr[typingsJapgolly.oidcProvider.mod.AuthorizationCode] = js.undefined
  
  val BackchannelAuthenticationRequest: js.UndefOr[typingsJapgolly.oidcProvider.mod.BackchannelAuthenticationRequest] = js.undefined
  
  val Client: js.UndefOr[typingsJapgolly.oidcProvider.mod.Client] = js.undefined
  
  val ClientCredentials: js.UndefOr[typingsJapgolly.oidcProvider.mod.ClientCredentials] = js.undefined
  
  val DeviceCode: js.UndefOr[typingsJapgolly.oidcProvider.mod.DeviceCode] = js.undefined
  
  val Grant: js.UndefOr[typingsJapgolly.oidcProvider.mod.Grant] = js.undefined
  
  val IdTokenHint: js.UndefOr[Header] = js.undefined
  
  val InitialAccessToken: js.UndefOr[typingsJapgolly.oidcProvider.mod.InitialAccessToken] = js.undefined
  
  val Interaction: js.UndefOr[typingsJapgolly.oidcProvider.mod.Interaction] = js.undefined
  
  val PushedAuthorizationRequest: js.UndefOr[typingsJapgolly.oidcProvider.mod.PushedAuthorizationRequest] = js.undefined
  
  val RefreshToken: js.UndefOr[typingsJapgolly.oidcProvider.mod.RefreshToken] = js.undefined
  
  val RegistrationAccessToken: js.UndefOr[typingsJapgolly.oidcProvider.mod.RegistrationAccessToken] = js.undefined
  
  val RotatedRefreshToken: js.UndefOr[typingsJapgolly.oidcProvider.mod.RefreshToken] = js.undefined
  
  val RotatedRegistrationAccessToken: js.UndefOr[typingsJapgolly.oidcProvider.mod.RegistrationAccessToken] = js.undefined
  
  val Session: js.UndefOr[typingsJapgolly.oidcProvider.mod.Session] = js.undefined
}
object AccessToken {
  
  inline def apply(): AccessToken = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessToken]
  }
  
  extension [Self <: AccessToken](x: Self) {
    
    inline def setAccessToken(value: typingsJapgolly.oidcProvider.mod.AccessToken): Self = StObject.set(x, "AccessToken", value.asInstanceOf[js.Any])
    
    inline def setAccessTokenUndefined: Self = StObject.set(x, "AccessToken", js.undefined)
    
    inline def setAccount(value: Account): Self = StObject.set(x, "Account", value.asInstanceOf[js.Any])
    
    inline def setAccountUndefined: Self = StObject.set(x, "Account", js.undefined)
    
    inline def setAuthorizationCode(value: AuthorizationCode): Self = StObject.set(x, "AuthorizationCode", value.asInstanceOf[js.Any])
    
    inline def setAuthorizationCodeUndefined: Self = StObject.set(x, "AuthorizationCode", js.undefined)
    
    inline def setBackchannelAuthenticationRequest(value: BackchannelAuthenticationRequest): Self = StObject.set(x, "BackchannelAuthenticationRequest", value.asInstanceOf[js.Any])
    
    inline def setBackchannelAuthenticationRequestUndefined: Self = StObject.set(x, "BackchannelAuthenticationRequest", js.undefined)
    
    inline def setClient(value: typingsJapgolly.oidcProvider.mod.Client): Self = StObject.set(x, "Client", value.asInstanceOf[js.Any])
    
    inline def setClientCredentials(value: ClientCredentials): Self = StObject.set(x, "ClientCredentials", value.asInstanceOf[js.Any])
    
    inline def setClientCredentialsUndefined: Self = StObject.set(x, "ClientCredentials", js.undefined)
    
    inline def setClientUndefined: Self = StObject.set(x, "Client", js.undefined)
    
    inline def setDeviceCode(value: DeviceCode): Self = StObject.set(x, "DeviceCode", value.asInstanceOf[js.Any])
    
    inline def setDeviceCodeUndefined: Self = StObject.set(x, "DeviceCode", js.undefined)
    
    inline def setGrant(value: Grant): Self = StObject.set(x, "Grant", value.asInstanceOf[js.Any])
    
    inline def setGrantUndefined: Self = StObject.set(x, "Grant", js.undefined)
    
    inline def setIdTokenHint(value: Header): Self = StObject.set(x, "IdTokenHint", value.asInstanceOf[js.Any])
    
    inline def setIdTokenHintUndefined: Self = StObject.set(x, "IdTokenHint", js.undefined)
    
    inline def setInitialAccessToken(value: InitialAccessToken): Self = StObject.set(x, "InitialAccessToken", value.asInstanceOf[js.Any])
    
    inline def setInitialAccessTokenUndefined: Self = StObject.set(x, "InitialAccessToken", js.undefined)
    
    inline def setInteraction(value: typingsJapgolly.oidcProvider.mod.Interaction): Self = StObject.set(x, "Interaction", value.asInstanceOf[js.Any])
    
    inline def setInteractionUndefined: Self = StObject.set(x, "Interaction", js.undefined)
    
    inline def setPushedAuthorizationRequest(value: PushedAuthorizationRequest): Self = StObject.set(x, "PushedAuthorizationRequest", value.asInstanceOf[js.Any])
    
    inline def setPushedAuthorizationRequestUndefined: Self = StObject.set(x, "PushedAuthorizationRequest", js.undefined)
    
    inline def setRefreshToken(value: RefreshToken): Self = StObject.set(x, "RefreshToken", value.asInstanceOf[js.Any])
    
    inline def setRefreshTokenUndefined: Self = StObject.set(x, "RefreshToken", js.undefined)
    
    inline def setRegistrationAccessToken(value: RegistrationAccessToken): Self = StObject.set(x, "RegistrationAccessToken", value.asInstanceOf[js.Any])
    
    inline def setRegistrationAccessTokenUndefined: Self = StObject.set(x, "RegistrationAccessToken", js.undefined)
    
    inline def setRotatedRefreshToken(value: RefreshToken): Self = StObject.set(x, "RotatedRefreshToken", value.asInstanceOf[js.Any])
    
    inline def setRotatedRefreshTokenUndefined: Self = StObject.set(x, "RotatedRefreshToken", js.undefined)
    
    inline def setRotatedRegistrationAccessToken(value: RegistrationAccessToken): Self = StObject.set(x, "RotatedRegistrationAccessToken", value.asInstanceOf[js.Any])
    
    inline def setRotatedRegistrationAccessTokenUndefined: Self = StObject.set(x, "RotatedRegistrationAccessToken", js.undefined)
    
    inline def setSession(value: Session): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
    
    inline def setSessionUndefined: Self = StObject.set(x, "Session", js.undefined)
  }
}
