package typingsJapgolly.azureMsalCommon

import typingsJapgolly.azureMsalCommon.distClientBaseClientMod.BaseClient
import typingsJapgolly.azureMsalCommon.distConfigClientConfigurationMod.ClientConfiguration
import typingsJapgolly.azureMsalCommon.distRequestCommonSilentFlowRequestMod.CommonSilentFlowRequest
import typingsJapgolly.azureMsalCommon.distResponseAuthenticationResultMod.AuthenticationResult
import typingsJapgolly.azureMsalCommon.distTelemetryPerformanceIperformanceclientMod.IPerformanceClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distClientSilentFlowClientMod {
  
  @JSImport("@azure/msal-common/dist/client/SilentFlowClient", "SilentFlowClient")
  @js.native
  open class SilentFlowClient protected () extends BaseClient {
    def this(configuration: ClientConfiguration) = this()
    def this(configuration: ClientConfiguration, performanceClient: IPerformanceClient) = this()
    
    /**
      * Retrieves token from cache or throws an error if it must be refreshed.
      * @param request
      */
    def acquireCachedToken(request: CommonSilentFlowRequest): js.Promise[AuthenticationResult] = js.native
    
    /**
      * Retrieves a token from cache if it is still valid, or uses the cached refresh token to renew
      * the given token and returns the renewed token
      * @param request
      */
    def acquireToken(request: CommonSilentFlowRequest): js.Promise[AuthenticationResult] = js.native
    
    /**
      * Helper function to build response object from the CacheRecord
      * @param cacheRecord
      */
    /* private */ var generateResultFromCacheRecord: Any = js.native
  }
}
