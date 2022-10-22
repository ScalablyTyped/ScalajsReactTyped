package typingsJapgolly.azureMsalCommon.mod

import typingsJapgolly.azureMsalCommon.distTelemetryServerServerTelemetryRequestMod.ServerTelemetryRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@azure/msal-common", "ServerTelemetryManager")
@js.native
open class ServerTelemetryManager protected ()
  extends typingsJapgolly.azureMsalCommon.distTelemetryServerServerTelemetryManagerMod.ServerTelemetryManager {
  def this(
    telemetryRequest: ServerTelemetryRequest,
    cacheManager: typingsJapgolly.azureMsalCommon.distCacheCacheManagerMod.CacheManager
  ) = this()
}
/* static members */
object ServerTelemetryManager {
  
  @JSImport("@azure/msal-common", "ServerTelemetryManager")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Returns the maximum number of errors that can be flushed to the server in the next network request
    * @param serverTelemetryEntity
    */
  inline def maxErrorsToSend(
    serverTelemetryEntity: typingsJapgolly.azureMsalCommon.distCacheEntitiesServerTelemetryEntityMod.ServerTelemetryEntity
  ): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("maxErrorsToSend")(serverTelemetryEntity.asInstanceOf[js.Any]).asInstanceOf[Double]
}
