package typingsJapgolly.azureMsalNode

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.azureMsalCommon.distConfigAppTokenProviderMod.IAppTokenProvider
import typingsJapgolly.azureMsalCommon.distResponseAuthenticationResultMod.AuthenticationResult
import typingsJapgolly.azureMsalCommon.mod.Logger
import typingsJapgolly.azureMsalNode.distCacheTokenCacheMod.TokenCache
import typingsJapgolly.azureMsalNode.distRequestAuthorizationCodeRequestMod.AuthorizationCodeRequest
import typingsJapgolly.azureMsalNode.distRequestAuthorizationUrlRequestMod.AuthorizationUrlRequest
import typingsJapgolly.azureMsalNode.distRequestClientCredentialRequestMod.ClientCredentialRequest
import typingsJapgolly.azureMsalNode.distRequestOnBehalfOfRequestMod.OnBehalfOfRequest
import typingsJapgolly.azureMsalNode.distRequestRefreshTokenRequestMod.RefreshTokenRequest
import typingsJapgolly.azureMsalNode.distRequestSilentFlowRequestMod.SilentFlowRequest
import typingsJapgolly.azureMsalNode.distRequestUsernamePasswordRequestMod.UsernamePasswordRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distClientIconfidentialclientapplicationMod {
  
  trait IConfidentialClientApplication extends StObject {
    
    /** This extensibility point is meant for Azure SDK to enhance Managed Identity support */
    def SetAppTokenProvider(provider: IAppTokenProvider): Unit
    
    /** Acquires tokens from the authority for the application (not for an end user) */
    def acquireTokenByClientCredential(request: ClientCredentialRequest): js.Promise[AuthenticationResult | Null]
    
    /**  Acquires a token by exchanging the authorization code received from the first step of OAuth 2.0 Authorization Code Flow */
    def acquireTokenByCode(request: AuthorizationCodeRequest): js.Promise[AuthenticationResult]
    
    /** Acquires a token by exchanging the refresh token provided for a new set of tokens */
    def acquireTokenByRefreshToken(request: RefreshTokenRequest): js.Promise[AuthenticationResult | Null]
    
    /** Acquires tokens with password grant by exchanging client applications username and password for credentials */
    def acquireTokenByUsernamePassword(request: UsernamePasswordRequest): js.Promise[AuthenticationResult | Null]
    
    /** Acquires tokens from the authority for the application */
    def acquireTokenOnBehalfOf(request: OnBehalfOfRequest): js.Promise[AuthenticationResult | Null]
    
    /**  Acquires a token silently when a user specifies the account the token is requested for */
    def acquireTokenSilent(request: SilentFlowRequest): js.Promise[AuthenticationResult | Null]
    
    /** Clear the cache */
    def clearCache(): Unit
    
    /** Creates the URL of the authorization request */
    def getAuthCodeUrl(request: AuthorizationUrlRequest): js.Promise[String]
    
    /** Returns the logger instance */
    def getLogger(): Logger
    
    /** Gets the token cache for the application */
    def getTokenCache(): TokenCache
    
    /** Replaces the default logger set in configurations with new Logger with new configurations */
    def setLogger(logger: Logger): Unit
  }
  object IConfidentialClientApplication {
    
    inline def apply(
      SetAppTokenProvider: IAppTokenProvider => Callback,
      acquireTokenByClientCredential: ClientCredentialRequest => js.Promise[AuthenticationResult | Null],
      acquireTokenByCode: AuthorizationCodeRequest => js.Promise[AuthenticationResult],
      acquireTokenByRefreshToken: RefreshTokenRequest => js.Promise[AuthenticationResult | Null],
      acquireTokenByUsernamePassword: UsernamePasswordRequest => js.Promise[AuthenticationResult | Null],
      acquireTokenOnBehalfOf: OnBehalfOfRequest => js.Promise[AuthenticationResult | Null],
      acquireTokenSilent: SilentFlowRequest => js.Promise[AuthenticationResult | Null],
      clearCache: Callback,
      getAuthCodeUrl: AuthorizationUrlRequest => js.Promise[String],
      getLogger: CallbackTo[Logger],
      getTokenCache: CallbackTo[TokenCache],
      setLogger: Logger => Callback
    ): IConfidentialClientApplication = {
      val __obj = js.Dynamic.literal(SetAppTokenProvider = js.Any.fromFunction1((t0: IAppTokenProvider) => SetAppTokenProvider(t0).runNow()), acquireTokenByClientCredential = js.Any.fromFunction1(acquireTokenByClientCredential), acquireTokenByCode = js.Any.fromFunction1(acquireTokenByCode), acquireTokenByRefreshToken = js.Any.fromFunction1(acquireTokenByRefreshToken), acquireTokenByUsernamePassword = js.Any.fromFunction1(acquireTokenByUsernamePassword), acquireTokenOnBehalfOf = js.Any.fromFunction1(acquireTokenOnBehalfOf), acquireTokenSilent = js.Any.fromFunction1(acquireTokenSilent), clearCache = clearCache.toJsFn, getAuthCodeUrl = js.Any.fromFunction1(getAuthCodeUrl), getLogger = getLogger.toJsFn, getTokenCache = getTokenCache.toJsFn, setLogger = js.Any.fromFunction1((t0: Logger) => setLogger(t0).runNow()))
      __obj.asInstanceOf[IConfidentialClientApplication]
    }
    
    extension [Self <: IConfidentialClientApplication](x: Self) {
      
      inline def setAcquireTokenByClientCredential(value: ClientCredentialRequest => js.Promise[AuthenticationResult | Null]): Self = StObject.set(x, "acquireTokenByClientCredential", js.Any.fromFunction1(value))
      
      inline def setAcquireTokenByCode(value: AuthorizationCodeRequest => js.Promise[AuthenticationResult]): Self = StObject.set(x, "acquireTokenByCode", js.Any.fromFunction1(value))
      
      inline def setAcquireTokenByRefreshToken(value: RefreshTokenRequest => js.Promise[AuthenticationResult | Null]): Self = StObject.set(x, "acquireTokenByRefreshToken", js.Any.fromFunction1(value))
      
      inline def setAcquireTokenByUsernamePassword(value: UsernamePasswordRequest => js.Promise[AuthenticationResult | Null]): Self = StObject.set(x, "acquireTokenByUsernamePassword", js.Any.fromFunction1(value))
      
      inline def setAcquireTokenOnBehalfOf(value: OnBehalfOfRequest => js.Promise[AuthenticationResult | Null]): Self = StObject.set(x, "acquireTokenOnBehalfOf", js.Any.fromFunction1(value))
      
      inline def setAcquireTokenSilent(value: SilentFlowRequest => js.Promise[AuthenticationResult | Null]): Self = StObject.set(x, "acquireTokenSilent", js.Any.fromFunction1(value))
      
      inline def setClearCache(value: Callback): Self = StObject.set(x, "clearCache", value.toJsFn)
      
      inline def setGetAuthCodeUrl(value: AuthorizationUrlRequest => js.Promise[String]): Self = StObject.set(x, "getAuthCodeUrl", js.Any.fromFunction1(value))
      
      inline def setGetLogger(value: CallbackTo[Logger]): Self = StObject.set(x, "getLogger", value.toJsFn)
      
      inline def setGetTokenCache(value: CallbackTo[TokenCache]): Self = StObject.set(x, "getTokenCache", value.toJsFn)
      
      inline def setSetAppTokenProvider(value: IAppTokenProvider => Callback): Self = StObject.set(x, "SetAppTokenProvider", js.Any.fromFunction1((t0: IAppTokenProvider) => value(t0).runNow()))
      
      inline def setSetLogger(value: Logger => Callback): Self = StObject.set(x, "setLogger", js.Any.fromFunction1((t0: Logger) => value(t0).runNow()))
    }
  }
}
