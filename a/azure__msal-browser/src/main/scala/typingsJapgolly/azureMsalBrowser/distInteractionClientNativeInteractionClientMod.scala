package typingsJapgolly.azureMsalBrowser

import typingsJapgolly.azureMsalBrowser.distBrokerNativeBrokerNativeMessageHandlerMod.NativeMessageHandler
import typingsJapgolly.azureMsalBrowser.distBrokerNativeBrokerNativeRequestMod.NativeTokenRequest
import typingsJapgolly.azureMsalBrowser.distBrokerNativeBrokerNativeResponseMod.NativeResponse
import typingsJapgolly.azureMsalBrowser.distCacheBrowserCacheManagerMod.BrowserCacheManager
import typingsJapgolly.azureMsalBrowser.distConfigConfigurationMod.BrowserConfiguration
import typingsJapgolly.azureMsalBrowser.distEventEventHandlerMod.EventHandler
import typingsJapgolly.azureMsalBrowser.distInteractionClientBaseInteractionClientMod.BaseInteractionClient
import typingsJapgolly.azureMsalBrowser.distInteractionClientSilentCacheClientMod.SilentCacheClient
import typingsJapgolly.azureMsalBrowser.distNavigationInavigationclientMod.INavigationClient
import typingsJapgolly.azureMsalBrowser.distRequestPopupRequestMod.PopupRequest
import typingsJapgolly.azureMsalBrowser.distRequestRedirectRequestMod.RedirectRequest
import typingsJapgolly.azureMsalBrowser.distRequestSilentRequestMod.SilentRequest
import typingsJapgolly.azureMsalBrowser.distRequestSsoSilentRequestMod.SsoSilentRequest
import typingsJapgolly.azureMsalBrowser.distUtilsBrowserConstantsMod.ApiId
import typingsJapgolly.azureMsalCommon.distCryptoIcryptoMod.ICrypto
import typingsJapgolly.azureMsalCommon.distResponseAuthenticationResultMod.AuthenticationResult
import typingsJapgolly.azureMsalCommon.distTelemetryPerformanceIperformanceclientMod.IPerformanceClient
import typingsJapgolly.azureMsalCommon.mod.Logger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distInteractionClientNativeInteractionClientMod {
  
  @JSImport("@azure/msal-browser/dist/interaction_client/NativeInteractionClient", "NativeInteractionClient")
  @js.native
  open class NativeInteractionClient protected () extends BaseInteractionClient {
    def this(
      config: BrowserConfiguration,
      browserStorage: BrowserCacheManager,
      browserCrypto: ICrypto,
      logger: Logger,
      eventHandler: EventHandler,
      navigationClient: INavigationClient,
      apiId: ApiId,
      performanceClient: IPerformanceClient,
      provider: NativeMessageHandler,
      accountId: String,
      nativeStorageImpl: BrowserCacheManager
    ) = this()
    def this(
      config: BrowserConfiguration,
      browserStorage: BrowserCacheManager,
      browserCrypto: ICrypto,
      logger: Logger,
      eventHandler: EventHandler,
      navigationClient: INavigationClient,
      apiId: ApiId,
      performanceClient: IPerformanceClient,
      provider: NativeMessageHandler,
      accountId: String,
      nativeStorageImpl: BrowserCacheManager,
      correlationId: String
    ) = this()
    
    /* protected */ var accountId: String = js.native
    
    def acquireToken(request: SilentRequest): js.Promise[AuthenticationResult] = js.native
    
    /**
      * Acquires a token from native platform then redirects to the redirectUri instead of returning the response
      * @param request
      */
    def acquireTokenRedirect(request: RedirectRequest): js.Promise[Unit] = js.native
    
    /**
      * Fetches the tokens from the cache if un-expired
      * @param nativeAccountId
      * @param request
      * @returns authenticationResult
      */
    /* protected */ def acquireTokensFromCache(nativeAccountId: String, request: NativeTokenRequest): js.Promise[AuthenticationResult] = js.native
    
    /* protected */ var apiId: ApiId = js.native
    
    /**
      * Creates silent flow request
      * @param request
      * @param cachedAccount
      * @returns CommonSilentFlowRequest
      */
    /* private */ var createSilentCacheRequest: Any = js.native
    
    /**
      * Gets MATS telemetry from native response
      * @param response
      * @returns
      */
    /* private */ var getMATSFromResponse: Any = js.native
    
    /**
      * Transform response from native platform into AuthenticationResult object which will be returned to the end user
      * @param response
      * @param request
      * @param reqTimestamp
      */
    /* protected */ def handleNativeResponse(response: NativeResponse, request: NativeTokenRequest, reqTimestamp: Double): js.Promise[AuthenticationResult] = js.native
    
    /**
      * If the previous page called native platform for a token using redirect APIs, send the same request again and return the response
      */
    def handleRedirectPromise(): js.Promise[AuthenticationResult | Null] = js.native
    
    /**
      * Translates developer provided request object into NativeRequest object
      * @param request
      */
    /* protected */ def initializeNativeRequest(request: PopupRequest): js.Promise[NativeTokenRequest] = js.native
    /* protected */ def initializeNativeRequest(request: SsoSilentRequest): js.Promise[NativeTokenRequest] = js.native
    
    /**
      * Returns whether or not response came from native cache
      * @param response
      * @returns
      */
    /* private */ var isResponseFromCache: Any = js.native
    
    /**
      * Logout from native platform via browser extension
      * @param request
      */
    def logout(): js.Promise[Unit] = js.native
    
    /* protected */ @JSName("nativeMessageHandler")
    var nativeMessageHandler_NativeInteractionClient: NativeMessageHandler = js.native
    
    /* protected */ var nativeStorageManager: BrowserCacheManager = js.native
    
    /* protected */ var silentCacheClient: SilentCacheClient = js.native
    
    /**
      * Validates native platform response before processing
      * @param response
      */
    /* private */ var validateNativeResponse: Any = js.native
  }
}
