package typingsJapgolly.oidcTokenManager.Oidc

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OidcClient extends js.Object {
  var isOAuth: Boolean
  var isOidc: Boolean
  def createLogoutRequestAsync(id_token_hint: String): DefaultPromise
  def createTokenRequestAsync(): DefaultPromise
  def loadAuthorizationEndpoint(): Unit
  def loadMetadataAsync(): DefaultPromise
  def loadUserProfile(access_token: String): DefaultPromise
  def loadX509SigningKeyAsync(): DefaultPromise
  def processResponseAsync(queryString: String): DefaultPromise
  def validateAccessTokenAsync(id_token_contents: String, access_token: String): DefaultPromise
  def validateIdTokenAndAccessTokenAsync(id_token: String, nonce: String, access_token: String): DefaultPromise
  def validateIdTokenAsync(id_token: String, nonce: String, access_token: String): DefaultPromise
}

object OidcClient {
  @scala.inline
  def apply(
    createLogoutRequestAsync: String => CallbackTo[DefaultPromise],
    createTokenRequestAsync: CallbackTo[DefaultPromise],
    isOAuth: Boolean,
    isOidc: Boolean,
    loadAuthorizationEndpoint: Callback,
    loadMetadataAsync: CallbackTo[DefaultPromise],
    loadUserProfile: String => CallbackTo[DefaultPromise],
    loadX509SigningKeyAsync: CallbackTo[DefaultPromise],
    processResponseAsync: String => CallbackTo[DefaultPromise],
    validateAccessTokenAsync: (String, String) => CallbackTo[DefaultPromise],
    validateIdTokenAndAccessTokenAsync: (String, String, String) => CallbackTo[DefaultPromise],
    validateIdTokenAsync: (String, String, String) => CallbackTo[DefaultPromise]
  ): OidcClient = {
    val __obj = js.Dynamic.literal(isOAuth = isOAuth.asInstanceOf[js.Any], isOidc = isOidc.asInstanceOf[js.Any])
    __obj.updateDynamic("createLogoutRequestAsync")(js.Any.fromFunction1((t0: java.lang.String) => createLogoutRequestAsync(t0).runNow()))
    __obj.updateDynamic("createTokenRequestAsync")(createTokenRequestAsync.toJsFn)
    __obj.updateDynamic("loadAuthorizationEndpoint")(loadAuthorizationEndpoint.toJsFn)
    __obj.updateDynamic("loadMetadataAsync")(loadMetadataAsync.toJsFn)
    __obj.updateDynamic("loadUserProfile")(js.Any.fromFunction1((t0: java.lang.String) => loadUserProfile(t0).runNow()))
    __obj.updateDynamic("loadX509SigningKeyAsync")(loadX509SigningKeyAsync.toJsFn)
    __obj.updateDynamic("processResponseAsync")(js.Any.fromFunction1((t0: java.lang.String) => processResponseAsync(t0).runNow()))
    __obj.updateDynamic("validateAccessTokenAsync")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => validateAccessTokenAsync(t0, t1).runNow()))
    __obj.updateDynamic("validateIdTokenAndAccessTokenAsync")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: java.lang.String) => validateIdTokenAndAccessTokenAsync(t0, t1, t2).runNow()))
    __obj.updateDynamic("validateIdTokenAsync")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: java.lang.String) => validateIdTokenAsync(t0, t1, t2).runNow()))
    __obj.asInstanceOf[OidcClient]
  }
}

