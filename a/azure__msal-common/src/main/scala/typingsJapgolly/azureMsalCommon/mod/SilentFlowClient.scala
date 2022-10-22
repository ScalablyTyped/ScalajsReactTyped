package typingsJapgolly.azureMsalCommon.mod

import typingsJapgolly.azureMsalCommon.distConfigClientConfigurationMod.ClientConfiguration
import typingsJapgolly.azureMsalCommon.distTelemetryPerformanceIperformanceclientMod.IPerformanceClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@azure/msal-common", "SilentFlowClient")
@js.native
open class SilentFlowClient protected ()
  extends typingsJapgolly.azureMsalCommon.distClientSilentFlowClientMod.SilentFlowClient {
  def this(configuration: ClientConfiguration) = this()
  def this(configuration: ClientConfiguration, performanceClient: IPerformanceClient) = this()
}
