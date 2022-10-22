package typingsJapgolly.cswAasJs

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.cswAasJs.distComponentsContextAuthContextProviderMod.AuthContextConfig
import typingsJapgolly.keycloakJs.mod.KeycloakError
import typingsJapgolly.keycloakJs.mod.KeycloakInstance
import typingsJapgolly.keycloakJs.mod.KeycloakProfile
import typingsJapgolly.keycloakJs.mod.KeycloakPromise
import typingsJapgolly.keycloakJs.mod.KeycloakResourceAccess
import typingsJapgolly.keycloakJs.mod.KeycloakRoles
import typingsJapgolly.keycloakJs.mod.KeycloakTokenParsed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distComponentsAuthMod {
  
  @JSImport("csw-aas-js/dist/components/Auth", "TMTAuth")
  @js.native
  val TMTAuth: AuthStore = js.native
  
  @js.native
  trait Auth extends StObject {
    
    def hasRealmRole(role: String): Boolean = js.native
    
    def hasResourceRole(role: String): Boolean = js.native
    def hasResourceRole(role: String, resource: String): Boolean = js.native
    
    def isAuthenticated(): js.UndefOr[Boolean] = js.native
    
    def loadUserProfile(): KeycloakPromise[KeycloakProfile, Unit] = js.native
    
    def logout(): KeycloakPromise[Unit, Unit] = js.native
    def logout(options: Any): KeycloakPromise[Unit, Unit] = js.native
    
    def realmAccess(): js.UndefOr[KeycloakRoles] = js.native
    
    def resourceAccess(): js.UndefOr[KeycloakResourceAccess] = js.native
    
    def token(): js.UndefOr[String] = js.native
    
    def tokenParsed(): js.UndefOr[KeycloakTokenParsed] = js.native
  }
  
  /**
    * Adapter for authentication and authorization service
    */
  trait AuthStore extends StObject {
    
    /**
      * Responsible for instantiating keycloak using provided config and authentication. It also creates hooks for refreshing token when
      * token is expired which silently refresh token resulting seamless user experience once logged in
      *
      * @param config json object which is UI application specific keycloak configuration e.g. realm and clientID.
      * @param url json object which contains AAS url
      * @param redirect boolean which decides instantiation mode for keycloak. e.g. login-required or check-sso.
      * login-required mode redirects user to login screen if not logged in already. check-sso only checks if already
      * logged in without redirecting to login screen if not logged in.
      * @return {{ keycloak, authenticated }} json which contains keycloak instance and authenticated which is promise after
      * initializing keycloak
      */
    def authenticate(config: AuthContextConfig, url: String, redirect: Boolean): AuthenticateResult
    
    /**
      * Create instance of TMTAuth from keycloak.
      *
      * @param keycloak keycloak instance instantiated using keyclok-js
      */
    def from(keycloak: KeycloakInstance): Auth
    
    /**
      * Responsible for resolving AAS Server using location service. If not found returns AAS-server-url specified in
      * config
      *
      * @return url string which is AAS server url
      */
    def getAASUrl(): js.Promise[String]
  }
  object AuthStore {
    
    inline def apply(
      authenticate: (AuthContextConfig, String, Boolean) => AuthenticateResult,
      from: KeycloakInstance => Auth,
      getAASUrl: CallbackTo[js.Promise[String]]
    ): AuthStore = {
      val __obj = js.Dynamic.literal(authenticate = js.Any.fromFunction3(authenticate), from = js.Any.fromFunction1(from), getAASUrl = getAASUrl.toJsFn)
      __obj.asInstanceOf[AuthStore]
    }
    
    extension [Self <: AuthStore](x: Self) {
      
      inline def setAuthenticate(value: (AuthContextConfig, String, Boolean) => AuthenticateResult): Self = StObject.set(x, "authenticate", js.Any.fromFunction3(value))
      
      inline def setFrom(value: KeycloakInstance => Auth): Self = StObject.set(x, "from", js.Any.fromFunction1(value))
      
      inline def setGetAASUrl(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getAASUrl", value.toJsFn)
    }
  }
  
  trait AuthenticateResult extends StObject {
    
    var authenticated: KeycloakPromise[Boolean, KeycloakError]
    
    var keycloak: KeycloakInstance
  }
  object AuthenticateResult {
    
    inline def apply(authenticated: KeycloakPromise[Boolean, KeycloakError], keycloak: KeycloakInstance): AuthenticateResult = {
      val __obj = js.Dynamic.literal(authenticated = authenticated.asInstanceOf[js.Any], keycloak = keycloak.asInstanceOf[js.Any])
      __obj.asInstanceOf[AuthenticateResult]
    }
    
    extension [Self <: AuthenticateResult](x: Self) {
      
      inline def setAuthenticated(value: KeycloakPromise[Boolean, KeycloakError]): Self = StObject.set(x, "authenticated", value.asInstanceOf[js.Any])
      
      inline def setKeycloak(value: KeycloakInstance): Self = StObject.set(x, "keycloak", value.asInstanceOf[js.Any])
    }
  }
}
