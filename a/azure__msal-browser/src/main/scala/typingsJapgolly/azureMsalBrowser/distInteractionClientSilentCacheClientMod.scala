package typingsJapgolly.azureMsalBrowser

import typingsJapgolly.azureMsalBrowser.distBrokerNativeBrokerNativeMessageHandlerMod.NativeMessageHandler
import typingsJapgolly.azureMsalBrowser.distCacheBrowserCacheManagerMod.BrowserCacheManager
import typingsJapgolly.azureMsalBrowser.distConfigConfigurationMod.BrowserConfiguration
import typingsJapgolly.azureMsalBrowser.distEventEventHandlerMod.EventHandler
import typingsJapgolly.azureMsalBrowser.distInteractionClientStandardInteractionClientMod.StandardInteractionClient
import typingsJapgolly.azureMsalBrowser.distNavigationInavigationclientMod.INavigationClient
import typingsJapgolly.azureMsalBrowser.distRequestSilentRequestMod.SilentRequest
import typingsJapgolly.azureMsalCommon.distAccountAccountInfoMod.AccountInfo
import typingsJapgolly.azureMsalCommon.distConfigClientConfigurationMod.AzureCloudOptions
import typingsJapgolly.azureMsalCommon.distCryptoIcryptoMod.ICrypto
import typingsJapgolly.azureMsalCommon.distRequestCommonSilentFlowRequestMod.CommonSilentFlowRequest
import typingsJapgolly.azureMsalCommon.distResponseAuthenticationResultMod.AuthenticationResult
import typingsJapgolly.azureMsalCommon.distTelemetryPerformanceIperformanceclientMod.IPerformanceClient
import typingsJapgolly.azureMsalCommon.mod.Logger
import typingsJapgolly.azureMsalCommon.mod.ServerTelemetryManager
import typingsJapgolly.azureMsalCommon.mod.SilentFlowClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distInteractionClientSilentCacheClientMod {
  
  @JSImport("@azure/msal-browser/dist/interaction_client/SilentCacheClient", "SilentCacheClient")
  @js.native
  open class SilentCacheClient protected () extends StandardInteractionClient {
    def this(
      config: BrowserConfiguration,
      storageImpl: BrowserCacheManager,
      browserCrypto: ICrypto,
      logger: Logger,
      eventHandler: EventHandler,
      navigationClient: INavigationClient,
      performanceClient: IPerformanceClient
    ) = this()
    def this(
      config: BrowserConfiguration,
      storageImpl: BrowserCacheManager,
      browserCrypto: ICrypto,
      logger: Logger,
      eventHandler: EventHandler,
      navigationClient: INavigationClient,
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
      performanceClient: IPerformanceClient,
      nativeMessageHandler: NativeMessageHandler,
      correlationId: String
    ) = this()
    
    /**
      * Returns unexpired tokens from the cache, if available
      * @param silentRequest
      */
    def acquireToken(silentRequest: CommonSilentFlowRequest): js.Promise[AuthenticationResult] = js.native
    
    /**
      * Creates an Silent Flow Client with the given authority, or the default authority.
      * @param serverTelemetryManager
      * @param authorityUrl
      */
    /* protected */ def createSilentFlowClient(serverTelemetryManager: ServerTelemetryManager): js.Promise[SilentFlowClient] = js.native
    /* protected */ def createSilentFlowClient(serverTelemetryManager: ServerTelemetryManager, authorityUrl: String): js.Promise[SilentFlowClient] = js.native
    /* protected */ def createSilentFlowClient(
      serverTelemetryManager: ServerTelemetryManager,
      authorityUrl: String,
      azureCloudOptions: AzureCloudOptions
    ): js.Promise[SilentFlowClient] = js.native
    /* protected */ def createSilentFlowClient(
      serverTelemetryManager: ServerTelemetryManager,
      authorityUrl: Unit,
      azureCloudOptions: AzureCloudOptions
    ): js.Promise[SilentFlowClient] = js.native
    
    def initializeSilentRequest(request: SilentRequest, account: AccountInfo): js.Promise[CommonSilentFlowRequest] = js.native
    
    /**
      * Currently Unsupported
      */
    def logout(): js.Promise[Unit] = js.native
  }
}
