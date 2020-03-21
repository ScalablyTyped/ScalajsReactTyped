package typingsJapgolly.cswAasJs.authMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.cswAasJs.authContextProviderMod.AuthContextConfig
import typingsJapgolly.keycloakJs.mod.KeycloakInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Adapter for authentication and authorization service
  */
trait AuthStore extends js.Object {
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
  def from(keycloak: KeycloakInstance[js.UndefOr[scala.Nothing]]): Auth
  /**
    * Responsible for resolving AAS Server using location service. If not found returns AAS-server-url specified in
    * config
    *
    * @return url string which is AAS server url
    */
  def getAASUrl(): js.Promise[String]
}

object AuthStore {
  @scala.inline
  def apply(
    authenticate: (AuthContextConfig, String, Boolean) => CallbackTo[AuthenticateResult],
    from: KeycloakInstance[js.UndefOr[scala.Nothing]] => CallbackTo[Auth],
    getAASUrl: CallbackTo[js.Promise[String]]
  ): AuthStore = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("authenticate")(js.Any.fromFunction3((t0: typingsJapgolly.cswAasJs.authContextProviderMod.AuthContextConfig, t1: java.lang.String, t2: scala.Boolean) => authenticate(t0, t1, t2).runNow()))
    __obj.updateDynamic("from")(js.Any.fromFunction1((t0: typingsJapgolly.keycloakJs.mod.KeycloakInstance[js.UndefOr[scala.Nothing]]) => from(t0).runNow()))
    __obj.updateDynamic("getAASUrl")(getAASUrl.toJsFn)
    __obj.asInstanceOf[AuthStore]
  }
}

