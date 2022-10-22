package typingsJapgolly.azureMsalBrowser

import typingsJapgolly.azureMsalBrowser.distBrokerNativeBrokerNativeMessageHandlerMod.NativeMessageHandler
import typingsJapgolly.azureMsalBrowser.distCacheBrowserCacheManagerMod.BrowserCacheManager
import typingsJapgolly.azureMsalBrowser.distConfigConfigurationMod.BrowserConfiguration
import typingsJapgolly.azureMsalBrowser.distEventEventHandlerMod.EventHandler
import typingsJapgolly.azureMsalBrowser.distInteractionClientStandardInteractionClientMod.StandardInteractionClient
import typingsJapgolly.azureMsalBrowser.distNavigationInavigationclientMod.INavigationClient
import typingsJapgolly.azureMsalBrowser.distRequestAuthorizationCodeRequestMod.AuthorizationCodeRequest
import typingsJapgolly.azureMsalBrowser.distUtilsBrowserConstantsMod.ApiId
import typingsJapgolly.azureMsalCommon.distCryptoIcryptoMod.ICrypto
import typingsJapgolly.azureMsalCommon.distResponseAuthenticationResultMod.AuthenticationResult
import typingsJapgolly.azureMsalCommon.distTelemetryPerformanceIperformanceclientMod.IPerformanceClient
import typingsJapgolly.azureMsalCommon.mod.Logger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distInteractionClientSilentAuthCodeClientMod {
  
  @JSImport("@azure/msal-browser/dist/interaction_client/SilentAuthCodeClient", "SilentAuthCodeClient")
  @js.native
  open class SilentAuthCodeClient protected () extends StandardInteractionClient {
    def this(
      config: BrowserConfiguration,
      storageImpl: BrowserCacheManager,
      browserCrypto: ICrypto,
      logger: Logger,
      eventHandler: EventHandler,
      navigationClient: INavigationClient,
      apiId: ApiId,
      performanceClient: IPerformanceClient
    ) = this()
    def this(
      config: BrowserConfiguration,
      storageImpl: BrowserCacheManager,
      browserCrypto: ICrypto,
      logger: Logger,
      eventHandler: EventHandler,
      navigationClient: INavigationClient,
      apiId: ApiId,
      performanceClient: IPerformanceClient,
      nativeMessageHandler: NativeMessageHandler
    ) = this()
    def this(
      config: BrowserConfiguration,
      storageImpl: BrowserCacheManager,
      browserCrypto: ICrypto,
      logger: Logger,
      eventHandler: EventHandler,
      navigationClient: INavigationClient,
      apiId: ApiId,
      performanceClient: IPerformanceClient,
      nativeMessageHandler: Unit,
      correlationId: String
    ) = this()
    def this(
      config: BrowserConfiguration,
      storageImpl: BrowserCacheManager,
      browserCrypto: ICrypto,
      logger: Logger,
      eventHandler: EventHandler,
      navigationClient: INavigationClient,
      apiId: ApiId,
      performanceClient: IPerformanceClient,
      nativeMessageHandler: NativeMessageHandler,
      correlationId: String
    ) = this()
    
    /**
      * Acquires a token silently by redeeming an authorization code against the /token endpoint
      * @param request
      */
    def acquireToken(request: AuthorizationCodeRequest): js.Promise[AuthenticationResult] = js.native
    
    /* private */ var apiId: Any = js.native
    
    /**
      * Currently Unsupported
      */
    def logout(): js.Promise[Unit] = js.native
  }
}
