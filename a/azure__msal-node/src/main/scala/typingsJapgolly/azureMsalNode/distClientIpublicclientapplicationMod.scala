package typingsJapgolly.azureMsalNode

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.azureMsalCommon.distResponseAuthenticationResultMod.AuthenticationResult
import typingsJapgolly.azureMsalCommon.mod.Logger
import typingsJapgolly.azureMsalNode.distCacheTokenCacheMod.TokenCache
import typingsJapgolly.azureMsalNode.distRequestAuthorizationCodeRequestMod.AuthorizationCodeRequest
import typingsJapgolly.azureMsalNode.distRequestAuthorizationUrlRequestMod.AuthorizationUrlRequest
import typingsJapgolly.azureMsalNode.distRequestDeviceCodeRequestMod.DeviceCodeRequest
import typingsJapgolly.azureMsalNode.distRequestInteractiveRequestMod.InteractiveRequest
import typingsJapgolly.azureMsalNode.distRequestRefreshTokenRequestMod.RefreshTokenRequest
import typingsJapgolly.azureMsalNode.distRequestSilentFlowRequestMod.SilentFlowRequest
import typingsJapgolly.azureMsalNode.distRequestUsernamePasswordRequestMod.UsernamePasswordRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distClientIpublicclientapplicationMod {
  
  trait IPublicClientApplication extends StObject {
    
    /** Acquires a token by exchanging the authorization code received from the first step of OAuth 2.0 Authorization Code Flow */
    def acquireTokenByCode(request: AuthorizationCodeRequest): js.Promise[AuthenticationResult]
    
    /** Acquires a token from the authority using OAuth2.0 device code flow */
    def acquireTokenByDeviceCode(request: DeviceCodeRequest): js.Promise[AuthenticationResult | Null]
    
    /** Acquires a token by exchanging the refresh token provided for a new set of tokens */
    def acquireTokenByRefreshToken(request: RefreshTokenRequest): js.Promise[AuthenticationResult | Null]
    
    /** Acquires tokens with password grant by exchanging client applications username and password for credentials */
    def acquireTokenByUsernamePassword(request: UsernamePasswordRequest): js.Promise[AuthenticationResult | Null]
    
    /** Acquires a token interactively */
    def acquireTokenInteractive(request: InteractiveRequest): js.Promise[AuthenticationResult]
    
    /** Acquires a token silently when a user specifies the account the token is requested for */
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
  object IPublicClientApplication {
    
    inline def apply(
      acquireTokenByCode: AuthorizationCodeRequest => js.Promise[AuthenticationResult],
      acquireTokenByDeviceCode: DeviceCodeRequest => js.Promise[AuthenticationResult | Null],
      acquireTokenByRefreshToken: RefreshTokenRequest => js.Promise[AuthenticationResult | Null],
      acquireTokenByUsernamePassword: UsernamePasswordRequest => js.Promise[AuthenticationResult | Null],
      acquireTokenInteractive: InteractiveRequest => js.Promise[AuthenticationResult],
      acquireTokenSilent: SilentFlowRequest => js.Promise[AuthenticationResult | Null],
      clearCache: Callback,
      getAuthCodeUrl: AuthorizationUrlRequest => js.Promise[String],
      getLogger: CallbackTo[Logger],
      getTokenCache: CallbackTo[TokenCache],
      setLogger: Logger => Callback
    ): IPublicClientApplication = {
      val __obj = js.Dynamic.literal(acquireTokenByCode = js.Any.fromFunction1(acquireTokenByCode), acquireTokenByDeviceCode = js.Any.fromFunction1(acquireTokenByDeviceCode), acquireTokenByRefreshToken = js.Any.fromFunction1(acquireTokenByRefreshToken), acquireTokenByUsernamePassword = js.Any.fromFunction1(acquireTokenByUsernamePassword), acquireTokenInteractive = js.Any.fromFunction1(acquireTokenInteractive), acquireTokenSilent = js.Any.fromFunction1(acquireTokenSilent), clearCache = clearCache.toJsFn, getAuthCodeUrl = js.Any.fromFunction1(getAuthCodeUrl), getLogger = getLogger.toJsFn, getTokenCache = getTokenCache.toJsFn, setLogger = js.Any.fromFunction1((t0: Logger) => setLogger(t0).runNow()))
      __obj.asInstanceOf[IPublicClientApplication]
    }
    
    extension [Self <: IPublicClientApplication](x: Self) {
      
      inline def setAcquireTokenByCode(value: AuthorizationCodeRequest => js.Promise[AuthenticationResult]): Self = StObject.set(x, "acquireTokenByCode", js.Any.fromFunction1(value))
      
      inline def setAcquireTokenByDeviceCode(value: DeviceCodeRequest => js.Promise[AuthenticationResult | Null]): Self = StObject.set(x, "acquireTokenByDeviceCode", js.Any.fromFunction1(value))
      
      inline def setAcquireTokenByRefreshToken(value: RefreshTokenRequest => js.Promise[AuthenticationResult | Null]): Self = StObject.set(x, "acquireTokenByRefreshToken", js.Any.fromFunction1(value))
      
      inline def setAcquireTokenByUsernamePassword(value: UsernamePasswordRequest => js.Promise[AuthenticationResult | Null]): Self = StObject.set(x, "acquireTokenByUsernamePassword", js.Any.fromFunction1(value))
      
      inline def setAcquireTokenInteractive(value: InteractiveRequest => js.Promise[AuthenticationResult]): Self = StObject.set(x, "acquireTokenInteractive", js.Any.fromFunction1(value))
      
      inline def setAcquireTokenSilent(value: SilentFlowRequest => js.Promise[AuthenticationResult | Null]): Self = StObject.set(x, "acquireTokenSilent", js.Any.fromFunction1(value))
      
      inline def setClearCache(value: Callback): Self = StObject.set(x, "clearCache", value.toJsFn)
      
      inline def setGetAuthCodeUrl(value: AuthorizationUrlRequest => js.Promise[String]): Self = StObject.set(x, "getAuthCodeUrl", js.Any.fromFunction1(value))
      
      inline def setGetLogger(value: CallbackTo[Logger]): Self = StObject.set(x, "getLogger", value.toJsFn)
      
      inline def setGetTokenCache(value: CallbackTo[TokenCache]): Self = StObject.set(x, "getTokenCache", value.toJsFn)
      
      inline def setSetLogger(value: Logger => Callback): Self = StObject.set(x, "setLogger", js.Any.fromFunction1((t0: Logger) => value(t0).runNow()))
    }
  }
}
