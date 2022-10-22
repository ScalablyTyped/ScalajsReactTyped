package typingsJapgolly.azureMsalCommon.mod

import typingsJapgolly.azureMsalCommon.distConfigClientConfigurationMod.ApplicationTelemetry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("@azure/msal-common", "PerformanceClient")
@js.native
open class PerformanceClient protected ()
  extends typingsJapgolly.azureMsalCommon.distTelemetryPerformancePerformanceClientMod.PerformanceClient {
  /**
    * Creates an instance of PerformanceClient,
    * an abstract class containing core performance telemetry logic.
    *
    * @constructor
    * @param {string} clientId Client ID of the application
    * @param {string} authority Authority used by the application
    * @param {Logger} logger Logger used by the application
    * @param {string} libraryName Name of the library
    * @param {string} libraryVersion Version of the library
    */
  def this(
    clientId: String,
    authority: String,
    logger: typingsJapgolly.azureMsalCommon.distLoggerLoggerMod.Logger,
    libraryName: String,
    libraryVersion: String,
    applicationTelemetry: ApplicationTelemetry
  ) = this()
}
