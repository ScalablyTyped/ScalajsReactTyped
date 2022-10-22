package typingsJapgolly.serverless.pluginsAwsProviderAwsProviderMod

import typingsJapgolly.serverless.anon.Prompt
import typingsJapgolly.serverless.serverlessStrings.oidc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OidcAuthorizer extends StObject {
  
  var allowUnauthenticated: js.UndefOr[Boolean] = js.undefined
  
  var authorizationEndpoint: String
  
  var clientId: String
  
  var clientSecret: js.UndefOr[String] = js.undefined
  
  var issuer: String
  
  var requestExtraParams: js.UndefOr[Prompt] = js.undefined
  
  var scope: js.UndefOr[String] = js.undefined
  
  var sessionCookieName: js.UndefOr[String] = js.undefined
  
  var sessionTimeout: js.UndefOr[Double | String] = js.undefined
  
  var tokenEndpoint: String
  
  var `type`: oidc
  
  var useExistingClientSecret: js.UndefOr[Boolean] = js.undefined
  
  var userInfoEndpoint: String
}
object OidcAuthorizer {
  
  inline def apply(
    authorizationEndpoint: String,
    clientId: String,
    issuer: String,
    tokenEndpoint: String,
    userInfoEndpoint: String
  ): OidcAuthorizer = {
    val __obj = js.Dynamic.literal(authorizationEndpoint = authorizationEndpoint.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], issuer = issuer.asInstanceOf[js.Any], tokenEndpoint = tokenEndpoint.asInstanceOf[js.Any], userInfoEndpoint = userInfoEndpoint.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("oidc")
    __obj.asInstanceOf[OidcAuthorizer]
  }
  
  extension [Self <: OidcAuthorizer](x: Self) {
    
    inline def setAllowUnauthenticated(value: Boolean): Self = StObject.set(x, "allowUnauthenticated", value.asInstanceOf[js.Any])
    
    inline def setAllowUnauthenticatedUndefined: Self = StObject.set(x, "allowUnauthenticated", js.undefined)
    
    inline def setAuthorizationEndpoint(value: String): Self = StObject.set(x, "authorizationEndpoint", value.asInstanceOf[js.Any])
    
    inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    inline def setClientSecret(value: String): Self = StObject.set(x, "clientSecret", value.asInstanceOf[js.Any])
    
    inline def setClientSecretUndefined: Self = StObject.set(x, "clientSecret", js.undefined)
    
    inline def setIssuer(value: String): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
    
    inline def setRequestExtraParams(value: Prompt): Self = StObject.set(x, "requestExtraParams", value.asInstanceOf[js.Any])
    
    inline def setRequestExtraParamsUndefined: Self = StObject.set(x, "requestExtraParams", js.undefined)
    
    inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    inline def setSessionCookieName(value: String): Self = StObject.set(x, "sessionCookieName", value.asInstanceOf[js.Any])
    
    inline def setSessionCookieNameUndefined: Self = StObject.set(x, "sessionCookieName", js.undefined)
    
    inline def setSessionTimeout(value: Double | String): Self = StObject.set(x, "sessionTimeout", value.asInstanceOf[js.Any])
    
    inline def setSessionTimeoutUndefined: Self = StObject.set(x, "sessionTimeout", js.undefined)
    
    inline def setTokenEndpoint(value: String): Self = StObject.set(x, "tokenEndpoint", value.asInstanceOf[js.Any])
    
    inline def setType(value: oidc): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUseExistingClientSecret(value: Boolean): Self = StObject.set(x, "useExistingClientSecret", value.asInstanceOf[js.Any])
    
    inline def setUseExistingClientSecretUndefined: Self = StObject.set(x, "useExistingClientSecret", js.undefined)
    
    inline def setUserInfoEndpoint(value: String): Self = StObject.set(x, "userInfoEndpoint", value.asInstanceOf[js.Any])
  }
}
