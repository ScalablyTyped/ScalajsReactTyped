package typingsJapgolly.azureMsalBrowser

import typingsJapgolly.azureMsalCommon.distConfigClientConfigurationMod.ApplicationTelemetry
import typingsJapgolly.azureMsalCommon.mod.Logger
import typingsJapgolly.azureMsalCommon.mod.PerformanceClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTelemetryBrowserPerformanceClientMod {
  
  @JSImport("@azure/msal-browser/dist/telemetry/BrowserPerformanceClient", "BrowserPerformanceClient")
  @js.native
  open class BrowserPerformanceClient protected () extends PerformanceClient {
    def this(
      clientId: String,
      authority: String,
      logger: Logger,
      libraryName: String,
      libraryVersion: String,
      applicationTelemetry: ApplicationTelemetry
    ) = this()
    
    /* private */ var browserCrypto: Any = js.native
    
    /* private */ var getPageVisibility: Any = js.native
    
    /* private */ var guidGenerator: Any = js.native
  }
}
