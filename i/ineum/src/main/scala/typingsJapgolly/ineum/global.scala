package typingsJapgolly.ineum

import typingsJapgolly.ineum.anon.BackendTraceId
import typingsJapgolly.ineum.anon.ComponentStack
import typingsJapgolly.ineum.ineumStrings.allowedOrigins
import typingsJapgolly.ineum.ineumStrings.apiKey
import typingsJapgolly.ineum.ineumStrings.beaconBatchingTime
import typingsJapgolly.ineum.ineumStrings.captureHeaders
import typingsJapgolly.ineum.ineumStrings.getPageLoadId
import typingsJapgolly.ineum.ineumStrings.ignoreErrorMessages
import typingsJapgolly.ineum.ineumStrings.ignorePings
import typingsJapgolly.ineum.ineumStrings.ignoreUrls
import typingsJapgolly.ineum.ineumStrings.ignoreUserTimings
import typingsJapgolly.ineum.ineumStrings.key
import typingsJapgolly.ineum.ineumStrings.maxMaitForPageLoadMetricsMillis
import typingsJapgolly.ineum.ineumStrings.maxWaitForResourceTimingsMillis
import typingsJapgolly.ineum.ineumStrings.meta
import typingsJapgolly.ineum.ineumStrings.page
import typingsJapgolly.ineum.ineumStrings.reportError
import typingsJapgolly.ineum.ineumStrings.reportEvent
import typingsJapgolly.ineum.ineumStrings.reportingUrl
import typingsJapgolly.ineum.ineumStrings.secrets
import typingsJapgolly.ineum.ineumStrings.terminateSession
import typingsJapgolly.ineum.ineumStrings.traceId
import typingsJapgolly.ineum.ineumStrings.trackSessions
import typingsJapgolly.ineum.ineumStrings.urlsToCheckForGraphQlInsights
import typingsJapgolly.ineum.ineumStrings.user
import typingsJapgolly.ineum.ineumStrings.whitelistedOrigins
import typingsJapgolly.ineum.ineumStrings.wrapEventHandlers
import typingsJapgolly.ineum.ineumStrings.wrapTimers
import typingsJapgolly.ineum.ineumStrings.xhrTransmissionTimeout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  inline def ineum(
    command: beaconBatchingTime | maxMaitForPageLoadMetricsMillis | maxWaitForResourceTimingsMillis | xhrTransmissionTimeout,
    durationMillis: Double
  ): Unit = (js.Dynamic.global.applyDynamic("ineum")(command.asInstanceOf[js.Any], durationMillis.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def ineum(command: key | page | reportingUrl | traceId, value: String): Unit = (js.Dynamic.global.applyDynamic("ineum")(command.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def ineum(command: ignorePings | wrapEventHandlers | wrapTimers, value: Boolean): Unit = (js.Dynamic.global.applyDynamic("ineum")(command.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def ineum(
    command: allowedOrigins | captureHeaders | ignoreErrorMessages | ignoreUrls | ignoreUserTimings | secrets | urlsToCheckForGraphQlInsights,
    values: js.Array[js.RegExp]
  ): Unit = (js.Dynamic.global.applyDynamic("ineum")(command.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Use command: 'key' instead.
    *
    * @deprecated
    */
  // tslint:disable-next-line unified-signatures
  inline def ineum_apiKey(command: apiKey, value: String): Unit = (js.Dynamic.global.applyDynamic("ineum")(command.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def ineum_getPageLoadId(command: getPageLoadId): js.UndefOr[String] = js.Dynamic.global.applyDynamic("ineum")(command.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  
  inline def ineum_meta(command: meta, key: String, value: String): Unit = (js.Dynamic.global.applyDynamic("ineum")(command.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def ineum_meta(command: meta, key: String, value: Boolean): Unit = (js.Dynamic.global.applyDynamic("ineum")(command.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def ineum_meta(command: meta, key: String, value: Double): Unit = (js.Dynamic.global.applyDynamic("ineum")(command.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def ineum_reportError(command: reportError, error: String): Unit = (js.Dynamic.global.applyDynamic("ineum")(command.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def ineum_reportError(command: reportError, error: String, opts: ComponentStack): Unit = (js.Dynamic.global.applyDynamic("ineum")(command.asInstanceOf[js.Any], error.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def ineum_reportError(command: reportError, error: js.Error): Unit = (js.Dynamic.global.applyDynamic("ineum")(command.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def ineum_reportError(command: reportError, error: js.Error, opts: ComponentStack): Unit = (js.Dynamic.global.applyDynamic("ineum")(command.asInstanceOf[js.Any], error.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def ineum_reportEvent(command: reportEvent, name: String): Unit = (js.Dynamic.global.applyDynamic("ineum")(command.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def ineum_reportEvent(command: reportEvent, name: String, opts: BackendTraceId): Unit = (js.Dynamic.global.applyDynamic("ineum")(command.asInstanceOf[js.Any], name.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def ineum_terminateSession(command: terminateSession): Unit = js.Dynamic.global.applyDynamic("ineum")(command.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def ineum_trackSessions(command: trackSessions): Unit = js.Dynamic.global.applyDynamic("ineum")(command.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def ineum_trackSessions(command: trackSessions, sessionInactivityTimeout: Double): Unit = (js.Dynamic.global.applyDynamic("ineum")(command.asInstanceOf[js.Any], sessionInactivityTimeout.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def ineum_trackSessions(command: trackSessions, sessionInactivityTimeout: Double, sessionTerminationTimeout: Double): Unit = (js.Dynamic.global.applyDynamic("ineum")(command.asInstanceOf[js.Any], sessionInactivityTimeout.asInstanceOf[js.Any], sessionTerminationTimeout.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def ineum_trackSessions(command: trackSessions, sessionInactivityTimeout: Unit, sessionTerminationTimeout: Double): Unit = (js.Dynamic.global.applyDynamic("ineum")(command.asInstanceOf[js.Any], sessionInactivityTimeout.asInstanceOf[js.Any], sessionTerminationTimeout.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def ineum_user(command: user): Unit = js.Dynamic.global.applyDynamic("ineum")(command.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def ineum_user(command: user, userId: String): Unit = (js.Dynamic.global.applyDynamic("ineum")(command.asInstanceOf[js.Any], userId.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def ineum_user(command: user, userId: String, userName: String): Unit = (js.Dynamic.global.applyDynamic("ineum")(command.asInstanceOf[js.Any], userId.asInstanceOf[js.Any], userName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def ineum_user(command: user, userId: String, userName: String, userEmail: String): Unit = (js.Dynamic.global.applyDynamic("ineum")(command.asInstanceOf[js.Any], userId.asInstanceOf[js.Any], userName.asInstanceOf[js.Any], userEmail.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def ineum_user(command: user, userId: String, userName: Unit, userEmail: String): Unit = (js.Dynamic.global.applyDynamic("ineum")(command.asInstanceOf[js.Any], userId.asInstanceOf[js.Any], userName.asInstanceOf[js.Any], userEmail.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def ineum_user(command: user, userId: Unit, userName: String): Unit = (js.Dynamic.global.applyDynamic("ineum")(command.asInstanceOf[js.Any], userId.asInstanceOf[js.Any], userName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def ineum_user(command: user, userId: Unit, userName: String, userEmail: String): Unit = (js.Dynamic.global.applyDynamic("ineum")(command.asInstanceOf[js.Any], userId.asInstanceOf[js.Any], userName.asInstanceOf[js.Any], userEmail.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def ineum_user(command: user, userId: Unit, userName: Unit, userEmail: String): Unit = (js.Dynamic.global.applyDynamic("ineum")(command.asInstanceOf[js.Any], userId.asInstanceOf[js.Any], userName.asInstanceOf[js.Any], userEmail.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Use command: 'allowedOrigins' instead (from release 185).
    *
    * @deprecated
    */
  // tslint:disable-next-line unified-signatures
  inline def ineum_whitelistedOrigins(command: whitelistedOrigins, values: js.Array[js.RegExp]): Unit = (js.Dynamic.global.applyDynamic("ineum")(command.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
