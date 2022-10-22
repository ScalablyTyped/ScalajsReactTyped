package typingsJapgolly.firefoxWebextBrowser.global.browser

import typingsJapgolly.firefoxWebextBrowser.WebExtEvent
import typingsJapgolly.firefoxWebextBrowser.browser.idle.IdleState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Use the `browser.idle` API to detect when the machine's idle state changes.
  *
  * Permissions: `idle`
  *
  * Not allowed in: Content scripts, Devtools pages
  */
object idle {
  
  @JSGlobal("browser.idle")
  @js.native
  val ^ : js.Any = js.native
  
  /* idle events */
  /**
    * Fired when the system changes to an active or idle state. The event fires with "idle" if the the user has not generated any input for a specified number of seconds, and "active" when the user generates input on an idle system.
    */
  @JSGlobal("browser.idle.onStateChanged")
  @js.native
  val onStateChanged: WebExtEvent[js.Function1[/* newState */ IdleState, Unit]] = js.native
  
  /* idle functions */
  /**
    * Returns "idle" if the user has not generated any input for a specified number of seconds, or "active" otherwise.
    * @param detectionIntervalInSeconds The system is considered idle if detectionIntervalInSeconds seconds have elapsed since the last user input detected.
    */
  inline def queryState(detectionIntervalInSeconds: Double): js.Promise[IdleState] = ^.asInstanceOf[js.Dynamic].applyDynamic("queryState")(detectionIntervalInSeconds.asInstanceOf[js.Any]).asInstanceOf[js.Promise[IdleState]]
  
  /**
    * Sets the interval, in seconds, used to determine when the system is in an idle state for onStateChanged events. The default interval is 60 seconds.
    * @param intervalInSeconds Threshold, in seconds, used to determine when the system is in an idle state.
    */
  inline def setDetectionInterval(intervalInSeconds: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDetectionInterval")(intervalInSeconds.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
