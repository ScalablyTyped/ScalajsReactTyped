package typingsJapgolly.oidcTokenManager

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalajs.dom.Storage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Oidc {
  
  trait DefaultHttpRequest extends StObject {
    
    def getJSON(url: String, config: Any): DefaultPromise
  }
  object DefaultHttpRequest {
    
    inline def apply(getJSON: (String, Any) => DefaultPromise): DefaultHttpRequest = {
      val __obj = js.Dynamic.literal(getJSON = js.Any.fromFunction2(getJSON))
      __obj.asInstanceOf[DefaultHttpRequest]
    }
    
    extension [Self <: DefaultHttpRequest](x: Self) {
      
      inline def setGetJSON(value: (String, Any) => DefaultPromise): Self = StObject.set(x, "getJSON", js.Any.fromFunction2(value))
    }
  }
  
  trait DefaultPromise extends StObject {
    
    def `catch`(errorCallback: js.Function0[Unit]): DefaultPromise
    
    def `then`(
      successCallback: js.Function1[/* value */ js.UndefOr[Any], Unit],
      errorCallback: js.Function1[/* reason */ js.UndefOr[Any], Unit]
    ): DefaultPromise
  }
  object DefaultPromise {
    
    inline def apply(
      `catch`: js.Function0[Unit] => DefaultPromise,
      `then`: (js.Function1[/* value */ js.UndefOr[Any], Unit], js.Function1[/* reason */ js.UndefOr[Any], Unit]) => DefaultPromise
    ): DefaultPromise = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("catch")(js.Any.fromFunction1(`catch`))
      __obj.updateDynamic("then")(js.Any.fromFunction2(`then`))
      __obj.asInstanceOf[DefaultPromise]
    }
    
    extension [Self <: DefaultPromise](x: Self) {
      
      inline def setCatch(value: js.Function0[Unit] => DefaultPromise): Self = StObject.set(x, "catch", js.Any.fromFunction1(value))
      
      inline def setThen(
        value: (js.Function1[/* value */ js.UndefOr[Any], Unit], js.Function1[/* reason */ js.UndefOr[Any], Unit]) => DefaultPromise
      ): Self = StObject.set(x, "then", js.Any.fromFunction2(value))
    }
  }
  
  trait DefaultPromiseFactory extends StObject {
    
    def create(callback: Any): DefaultPromise
    
    def reject(reason: Any): DefaultPromise
    
    def resolve(value: Any): DefaultPromise
  }
  object DefaultPromiseFactory {
    
    inline def apply(create: Any => DefaultPromise, reject: Any => DefaultPromise, resolve: Any => DefaultPromise): DefaultPromiseFactory = {
      val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), reject = js.Any.fromFunction1(reject), resolve = js.Any.fromFunction1(resolve))
      __obj.asInstanceOf[DefaultPromiseFactory]
    }
    
    extension [Self <: DefaultPromiseFactory](x: Self) {
      
      inline def setCreate(value: Any => DefaultPromise): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
      
      inline def setReject(value: Any => DefaultPromise): Self = StObject.set(x, "reject", js.Any.fromFunction1(value))
      
      inline def setResolve(value: Any => DefaultPromise): Self = StObject.set(x, "resolve", js.Any.fromFunction1(value))
    }
  }
  
  trait OidcClient extends StObject {
    
    def createLogoutRequestAsync(id_token_hint: String): DefaultPromise
    
    def createTokenRequestAsync(): DefaultPromise
    
    var isOAuth: Boolean
    
    var isOidc: Boolean
    
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
    
    inline def apply(
      createLogoutRequestAsync: String => DefaultPromise,
      createTokenRequestAsync: CallbackTo[DefaultPromise],
      isOAuth: Boolean,
      isOidc: Boolean,
      loadAuthorizationEndpoint: Callback,
      loadMetadataAsync: CallbackTo[DefaultPromise],
      loadUserProfile: String => DefaultPromise,
      loadX509SigningKeyAsync: CallbackTo[DefaultPromise],
      processResponseAsync: String => DefaultPromise,
      validateAccessTokenAsync: (String, String) => DefaultPromise,
      validateIdTokenAndAccessTokenAsync: (String, String, String) => DefaultPromise,
      validateIdTokenAsync: (String, String, String) => DefaultPromise
    ): OidcClient = {
      val __obj = js.Dynamic.literal(createLogoutRequestAsync = js.Any.fromFunction1(createLogoutRequestAsync), createTokenRequestAsync = createTokenRequestAsync.toJsFn, isOAuth = isOAuth.asInstanceOf[js.Any], isOidc = isOidc.asInstanceOf[js.Any], loadAuthorizationEndpoint = loadAuthorizationEndpoint.toJsFn, loadMetadataAsync = loadMetadataAsync.toJsFn, loadUserProfile = js.Any.fromFunction1(loadUserProfile), loadX509SigningKeyAsync = loadX509SigningKeyAsync.toJsFn, processResponseAsync = js.Any.fromFunction1(processResponseAsync), validateAccessTokenAsync = js.Any.fromFunction2(validateAccessTokenAsync), validateIdTokenAndAccessTokenAsync = js.Any.fromFunction3(validateIdTokenAndAccessTokenAsync), validateIdTokenAsync = js.Any.fromFunction3(validateIdTokenAsync))
      __obj.asInstanceOf[OidcClient]
    }
    
    extension [Self <: OidcClient](x: Self) {
      
      inline def setCreateLogoutRequestAsync(value: String => DefaultPromise): Self = StObject.set(x, "createLogoutRequestAsync", js.Any.fromFunction1(value))
      
      inline def setCreateTokenRequestAsync(value: CallbackTo[DefaultPromise]): Self = StObject.set(x, "createTokenRequestAsync", value.toJsFn)
      
      inline def setIsOAuth(value: Boolean): Self = StObject.set(x, "isOAuth", value.asInstanceOf[js.Any])
      
      inline def setIsOidc(value: Boolean): Self = StObject.set(x, "isOidc", value.asInstanceOf[js.Any])
      
      inline def setLoadAuthorizationEndpoint(value: Callback): Self = StObject.set(x, "loadAuthorizationEndpoint", value.toJsFn)
      
      inline def setLoadMetadataAsync(value: CallbackTo[DefaultPromise]): Self = StObject.set(x, "loadMetadataAsync", value.toJsFn)
      
      inline def setLoadUserProfile(value: String => DefaultPromise): Self = StObject.set(x, "loadUserProfile", js.Any.fromFunction1(value))
      
      inline def setLoadX509SigningKeyAsync(value: CallbackTo[DefaultPromise]): Self = StObject.set(x, "loadX509SigningKeyAsync", value.toJsFn)
      
      inline def setProcessResponseAsync(value: String => DefaultPromise): Self = StObject.set(x, "processResponseAsync", js.Any.fromFunction1(value))
      
      inline def setValidateAccessTokenAsync(value: (String, String) => DefaultPromise): Self = StObject.set(x, "validateAccessTokenAsync", js.Any.fromFunction2(value))
      
      inline def setValidateIdTokenAndAccessTokenAsync(value: (String, String, String) => DefaultPromise): Self = StObject.set(x, "validateIdTokenAndAccessTokenAsync", js.Any.fromFunction3(value))
      
      inline def setValidateIdTokenAsync(value: (String, String, String) => DefaultPromise): Self = StObject.set(x, "validateIdTokenAsync", js.Any.fromFunction3(value))
    }
  }
  
  trait OidcClientSettings extends StObject {
    
    var authority: js.UndefOr[String] = js.undefined
    
    var filter_protocol_claims: js.UndefOr[Boolean] = js.undefined
    
    var load_user_profile: js.UndefOr[Boolean] = js.undefined
    
    var request_state_key: js.UndefOr[String] = js.undefined
    
    var request_state_store: js.UndefOr[Any] = js.undefined
    
    var response_type: js.UndefOr[String] = js.undefined
  }
  object OidcClientSettings {
    
    inline def apply(): OidcClientSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OidcClientSettings]
    }
    
    extension [Self <: OidcClientSettings](x: Self) {
      
      inline def setAuthority(value: String): Self = StObject.set(x, "authority", value.asInstanceOf[js.Any])
      
      inline def setAuthorityUndefined: Self = StObject.set(x, "authority", js.undefined)
      
      inline def setFilter_protocol_claims(value: Boolean): Self = StObject.set(x, "filter_protocol_claims", value.asInstanceOf[js.Any])
      
      inline def setFilter_protocol_claimsUndefined: Self = StObject.set(x, "filter_protocol_claims", js.undefined)
      
      inline def setLoad_user_profile(value: Boolean): Self = StObject.set(x, "load_user_profile", value.asInstanceOf[js.Any])
      
      inline def setLoad_user_profileUndefined: Self = StObject.set(x, "load_user_profile", js.undefined)
      
      inline def setRequest_state_key(value: String): Self = StObject.set(x, "request_state_key", value.asInstanceOf[js.Any])
      
      inline def setRequest_state_keyUndefined: Self = StObject.set(x, "request_state_key", js.undefined)
      
      inline def setRequest_state_store(value: Any): Self = StObject.set(x, "request_state_store", value.asInstanceOf[js.Any])
      
      inline def setRequest_state_storeUndefined: Self = StObject.set(x, "request_state_store", js.undefined)
      
      inline def setResponse_type(value: String): Self = StObject.set(x, "response_type", value.asInstanceOf[js.Any])
      
      inline def setResponse_typeUndefined: Self = StObject.set(x, "response_type", js.undefined)
    }
  }
  
  @js.native
  trait OidcClientStatic
    extends StObject
       with Instantiable1[/* settings */ OidcClientSettings, OidcTokenManager]
  
  trait OidcToken extends StObject {
    
    var access_token: String
    
    var expired: Boolean
    
    var expires_at: Double
    
    var expires_in: Double
    
    var id_token: String
    
    var profile: String
    
    var scope: String
    
    var scopes: js.Array[String]
    
    var session_state: Any
    
    def toJSON(): String
  }
  object OidcToken {
    
    inline def apply(
      access_token: String,
      expired: Boolean,
      expires_at: Double,
      expires_in: Double,
      id_token: String,
      profile: String,
      scope: String,
      scopes: js.Array[String],
      session_state: Any,
      toJSON: CallbackTo[String]
    ): OidcToken = {
      val __obj = js.Dynamic.literal(access_token = access_token.asInstanceOf[js.Any], expired = expired.asInstanceOf[js.Any], expires_at = expires_at.asInstanceOf[js.Any], expires_in = expires_in.asInstanceOf[js.Any], id_token = id_token.asInstanceOf[js.Any], profile = profile.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any], session_state = session_state.asInstanceOf[js.Any], toJSON = toJSON.toJsFn)
      __obj.asInstanceOf[OidcToken]
    }
    
    extension [Self <: OidcToken](x: Self) {
      
      inline def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
      
      inline def setExpired(value: Boolean): Self = StObject.set(x, "expired", value.asInstanceOf[js.Any])
      
      inline def setExpires_at(value: Double): Self = StObject.set(x, "expires_at", value.asInstanceOf[js.Any])
      
      inline def setExpires_in(value: Double): Self = StObject.set(x, "expires_in", value.asInstanceOf[js.Any])
      
      inline def setId_token(value: String): Self = StObject.set(x, "id_token", value.asInstanceOf[js.Any])
      
      inline def setProfile(value: String): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
      
      inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopes(value: js.Array[String]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
      
      inline def setScopesVarargs(value: String*): Self = StObject.set(x, "scopes", js.Array(value*))
      
      inline def setSession_state(value: Any): Self = StObject.set(x, "session_state", value.asInstanceOf[js.Any])
      
      inline def setToJSON(value: CallbackTo[String]): Self = StObject.set(x, "toJSON", value.toJsFn)
    }
  }
  
  @js.native
  trait OidcTokenManager extends StObject {
    
    var access_token: String = js.native
    
    def addOnSilentTokenRenewFailed(cb: js.Function0[Unit]): Unit = js.native
    
    def addOnTokenExpired(cb: js.Function0[Unit]): Unit = js.native
    
    def addOnTokenExpiring(cb: js.Function0[Unit]): Unit = js.native
    
    def addOnTokenObtained(cb: js.Function0[Unit]): Unit = js.native
    
    def addOnTokenRemoved(cb: js.Function0[Unit]): Unit = js.native
    
    var expired: Boolean = js.native
    
    var expires_at: Double = js.native
    
    var expires_in: Double = js.native
    
    var id_token: String = js.native
    
    def openPopupForTokenAsync(): DefaultPromise = js.native
    def openPopupForTokenAsync(popupSettings: PopupSettings): DefaultPromise = js.native
    
    def processTokenCallbackAsync(): DefaultPromise = js.native
    def processTokenCallbackAsync(queryString: String): DefaultPromise = js.native
    
    def processTokenCallbackSilent(): Unit = js.native
    def processTokenCallbackSilent(hash: String): Unit = js.native
    
    def processTokenPopup(): Unit = js.native
    def processTokenPopup(hash: String): Unit = js.native
    
    var profile: Any = js.native
    
    def redirectForLogout(): DefaultPromise = js.native
    
    def redirectForToken(): DefaultPromise = js.native
    
    def removeToken(): Unit = js.native
    
    def renewTokenSilentAsync(): DefaultPromise = js.native
    
    def saveToken(token: OidcToken): Unit = js.native
    
    var scope: String = js.native
    
    var scopes: js.Array[String] = js.native
    
    var session_state: Any = js.native
  }
  
  trait OidcTokenManagerSettings extends StObject {
    
    var authority: js.UndefOr[String] = js.undefined
    
    var authorization_endpoint: js.UndefOr[String] = js.undefined
    
    var client_id: js.UndefOr[String] = js.undefined
    
    var end_session_endpoint: js.UndefOr[String] = js.undefined
    
    var jwks: js.UndefOr[Any] = js.undefined
    
    var jwks_uri: js.UndefOr[String] = js.undefined
    
    var load_user_profile: js.UndefOr[Boolean] = js.undefined
    
    var metadata: js.UndefOr[Any] = js.undefined
    
    var persist: js.UndefOr[Boolean] = js.undefined
    
    var persistKey: js.UndefOr[String] = js.undefined
    
    var popup_redirect_uri: js.UndefOr[String] = js.undefined
    
    var post_logout_redirect_uri: js.UndefOr[String] = js.undefined
    
    var redirect_uri: js.UndefOr[String] = js.undefined
    
    var request_state_key: js.UndefOr[String] = js.undefined
    
    var request_state_store: js.UndefOr[Storage] = js.undefined
    
    var response_type: js.UndefOr[String] = js.undefined
    
    var scope: js.UndefOr[String] = js.undefined
    
    var silent_redirect_uri: js.UndefOr[String] = js.undefined
    
    var silent_renew: js.UndefOr[Boolean] = js.undefined
    
    var store: js.UndefOr[Storage] = js.undefined
    
    var userinfo_endpoint: js.UndefOr[String] = js.undefined
  }
  object OidcTokenManagerSettings {
    
    inline def apply(): OidcTokenManagerSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OidcTokenManagerSettings]
    }
    
    extension [Self <: OidcTokenManagerSettings](x: Self) {
      
      inline def setAuthority(value: String): Self = StObject.set(x, "authority", value.asInstanceOf[js.Any])
      
      inline def setAuthorityUndefined: Self = StObject.set(x, "authority", js.undefined)
      
      inline def setAuthorization_endpoint(value: String): Self = StObject.set(x, "authorization_endpoint", value.asInstanceOf[js.Any])
      
      inline def setAuthorization_endpointUndefined: Self = StObject.set(x, "authorization_endpoint", js.undefined)
      
      inline def setClient_id(value: String): Self = StObject.set(x, "client_id", value.asInstanceOf[js.Any])
      
      inline def setClient_idUndefined: Self = StObject.set(x, "client_id", js.undefined)
      
      inline def setEnd_session_endpoint(value: String): Self = StObject.set(x, "end_session_endpoint", value.asInstanceOf[js.Any])
      
      inline def setEnd_session_endpointUndefined: Self = StObject.set(x, "end_session_endpoint", js.undefined)
      
      inline def setJwks(value: Any): Self = StObject.set(x, "jwks", value.asInstanceOf[js.Any])
      
      inline def setJwksUndefined: Self = StObject.set(x, "jwks", js.undefined)
      
      inline def setJwks_uri(value: String): Self = StObject.set(x, "jwks_uri", value.asInstanceOf[js.Any])
      
      inline def setJwks_uriUndefined: Self = StObject.set(x, "jwks_uri", js.undefined)
      
      inline def setLoad_user_profile(value: Boolean): Self = StObject.set(x, "load_user_profile", value.asInstanceOf[js.Any])
      
      inline def setLoad_user_profileUndefined: Self = StObject.set(x, "load_user_profile", js.undefined)
      
      inline def setMetadata(value: Any): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      inline def setPersist(value: Boolean): Self = StObject.set(x, "persist", value.asInstanceOf[js.Any])
      
      inline def setPersistKey(value: String): Self = StObject.set(x, "persistKey", value.asInstanceOf[js.Any])
      
      inline def setPersistKeyUndefined: Self = StObject.set(x, "persistKey", js.undefined)
      
      inline def setPersistUndefined: Self = StObject.set(x, "persist", js.undefined)
      
      inline def setPopup_redirect_uri(value: String): Self = StObject.set(x, "popup_redirect_uri", value.asInstanceOf[js.Any])
      
      inline def setPopup_redirect_uriUndefined: Self = StObject.set(x, "popup_redirect_uri", js.undefined)
      
      inline def setPost_logout_redirect_uri(value: String): Self = StObject.set(x, "post_logout_redirect_uri", value.asInstanceOf[js.Any])
      
      inline def setPost_logout_redirect_uriUndefined: Self = StObject.set(x, "post_logout_redirect_uri", js.undefined)
      
      inline def setRedirect_uri(value: String): Self = StObject.set(x, "redirect_uri", value.asInstanceOf[js.Any])
      
      inline def setRedirect_uriUndefined: Self = StObject.set(x, "redirect_uri", js.undefined)
      
      inline def setRequest_state_key(value: String): Self = StObject.set(x, "request_state_key", value.asInstanceOf[js.Any])
      
      inline def setRequest_state_keyUndefined: Self = StObject.set(x, "request_state_key", js.undefined)
      
      inline def setRequest_state_store(value: Storage): Self = StObject.set(x, "request_state_store", value.asInstanceOf[js.Any])
      
      inline def setRequest_state_storeUndefined: Self = StObject.set(x, "request_state_store", js.undefined)
      
      inline def setResponse_type(value: String): Self = StObject.set(x, "response_type", value.asInstanceOf[js.Any])
      
      inline def setResponse_typeUndefined: Self = StObject.set(x, "response_type", js.undefined)
      
      inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      inline def setSilent_redirect_uri(value: String): Self = StObject.set(x, "silent_redirect_uri", value.asInstanceOf[js.Any])
      
      inline def setSilent_redirect_uriUndefined: Self = StObject.set(x, "silent_redirect_uri", js.undefined)
      
      inline def setSilent_renew(value: Boolean): Self = StObject.set(x, "silent_renew", value.asInstanceOf[js.Any])
      
      inline def setSilent_renewUndefined: Self = StObject.set(x, "silent_renew", js.undefined)
      
      inline def setStore(value: Storage): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
      
      inline def setStoreUndefined: Self = StObject.set(x, "store", js.undefined)
      
      inline def setUserinfo_endpoint(value: String): Self = StObject.set(x, "userinfo_endpoint", value.asInstanceOf[js.Any])
      
      inline def setUserinfo_endpointUndefined: Self = StObject.set(x, "userinfo_endpoint", js.undefined)
    }
  }
  
  @js.native
  trait OidcTokenManagerStatic
    extends StObject
       with Instantiable0[OidcTokenManager]
       with Instantiable1[/* settings */ OidcTokenManagerSettings, OidcTokenManager] {
    
    def setHttpRequest(httpRequest: DefaultHttpRequest): Unit = js.native
    
    def setPromiseFactory(promiseFactory: DefaultPromiseFactory): Unit = js.native
  }
  
  trait PopupSettings extends StObject {
    
    var features: js.UndefOr[String] = js.undefined
    
    var target: js.UndefOr[String] = js.undefined
  }
  object PopupSettings {
    
    inline def apply(): PopupSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PopupSettings]
    }
    
    extension [Self <: PopupSettings](x: Self) {
      
      inline def setFeatures(value: String): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
      
      inline def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
      
      inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
}
