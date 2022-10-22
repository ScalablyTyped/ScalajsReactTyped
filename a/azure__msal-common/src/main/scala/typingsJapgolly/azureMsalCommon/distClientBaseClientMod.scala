package typingsJapgolly.azureMsalCommon

import typingsJapgolly.azureMsalCommon.distAccountCcsCredentialMod.CcsCredential
import typingsJapgolly.azureMsalCommon.distAuthorityAuthorityMod.Authority
import typingsJapgolly.azureMsalCommon.distCacheCacheManagerMod.CacheManager
import typingsJapgolly.azureMsalCommon.distConfigClientConfigurationMod.ClientConfiguration
import typingsJapgolly.azureMsalCommon.distConfigClientConfigurationMod.CommonClientConfiguration
import typingsJapgolly.azureMsalCommon.distCryptoIcryptoMod.ICrypto
import typingsJapgolly.azureMsalCommon.distLoggerLoggerMod.Logger
import typingsJapgolly.azureMsalCommon.distNetworkInetworkmoduleMod.INetworkModule
import typingsJapgolly.azureMsalCommon.distNetworkNetworkManagerMod.NetworkManager
import typingsJapgolly.azureMsalCommon.distNetworkNetworkManagerMod.NetworkResponse
import typingsJapgolly.azureMsalCommon.distNetworkRequestThumbprintMod.RequestThumbprint
import typingsJapgolly.azureMsalCommon.distResponseServerAuthorizationTokenResponseMod.ServerAuthorizationTokenResponse
import typingsJapgolly.azureMsalCommon.distTelemetryPerformanceIperformanceclientMod.IPerformanceClient
import typingsJapgolly.azureMsalCommon.distTelemetryServerServerTelemetryManagerMod.ServerTelemetryManager
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distClientBaseClientMod {
  
  /* note: abstract class */ @JSImport("@azure/msal-common/dist/client/BaseClient", "BaseClient")
  @js.native
  open class BaseClient protected () extends StObject {
    /* protected */ def this(configuration: ClientConfiguration) = this()
    /* protected */ def this(configuration: ClientConfiguration, performanceClient: IPerformanceClient) = this()
    
    var authority: Authority = js.native
    
    /* protected */ var cacheManager: CacheManager = js.native
    
    /* protected */ var config: CommonClientConfiguration = js.native
    
    /**
      * Creates default headers for requests to token endpoint
      */
    /* protected */ def createTokenRequestHeaders(): Record[String, String] = js.native
    /* protected */ def createTokenRequestHeaders(ccsCred: CcsCredential): Record[String, String] = js.native
    
    /* protected */ var cryptoUtils: ICrypto = js.native
    
    /**
      * Http post to token endpoint
      * @param tokenEndpoint
      * @param queryString
      * @param headers
      * @param thumbprint
      */
    /* protected */ def executePostToTokenEndpoint(
      tokenEndpoint: String,
      queryString: String,
      headers: Record[String, String],
      thumbprint: RequestThumbprint
    ): js.Promise[NetworkResponse[ServerAuthorizationTokenResponse]] = js.native
    
    var logger: Logger = js.native
    
    /* protected */ var networkClient: INetworkModule = js.native
    
    /* protected */ var networkManager: NetworkManager = js.native
    
    /* protected */ var performanceClient: js.UndefOr[IPerformanceClient] = js.native
    
    /* protected */ var serverTelemetryManager: ServerTelemetryManager | Null = js.native
    
    /**
      * Updates the authority object of the client. Endpoint discovery must be completed.
      * @param updatedAuthority
      */
    def updateAuthority(updatedAuthority: Authority): Unit = js.native
  }
}
