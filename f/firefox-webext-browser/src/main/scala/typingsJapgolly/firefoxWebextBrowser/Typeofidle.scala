package typingsJapgolly.firefoxWebextBrowser

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.firefoxWebextBrowser.browser.idle.IdleState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofidle extends js.Object {
  /* idle events */
  /**
    * Fired when the system changes to an active or idle state. The event fires with "idle" if the the user has not
    * generated any input for a specified number of seconds, and "active" when the user generates input on an idle
    * system.
    */
  val onStateChanged: WebExtEvent[js.Function1[/* newState */ IdleState, Unit]]
  /* idle functions */
  /**
    * Returns "idle" if the user has not generated any input for a specified number of seconds, or "active" otherwise.
    * @param detectionIntervalInSeconds The system is considered idle if detectionIntervalInSeconds seconds have
    *     elapsed since the last user input detected.
    */
  def queryState(detectionIntervalInSeconds: Double): js.Promise[IdleState]
  /**
    * Sets the interval, in seconds, used to determine when the system is in an idle state for onStateChanged events.
    * The default interval is 60 seconds.
    * @param intervalInSeconds Threshold, in seconds, used to determine when the system is in an idle state.
    */
  def setDetectionInterval(intervalInSeconds: Double): Unit
}

object Typeofidle {
  @scala.inline
  def apply(
    onStateChanged: WebExtEvent[js.Function1[/* newState */ IdleState, Unit]],
    queryState: Double => CallbackTo[js.Promise[IdleState]],
    setDetectionInterval: Double => Callback
  ): Typeofidle = {
    val __obj = js.Dynamic.literal(onStateChanged = onStateChanged.asInstanceOf[js.Any])
    __obj.updateDynamic("queryState")(js.Any.fromFunction1((t0: scala.Double) => queryState(t0).runNow()))
    __obj.updateDynamic("setDetectionInterval")(js.Any.fromFunction1((t0: scala.Double) => setDetectionInterval(t0).runNow()))
    __obj.asInstanceOf[Typeofidle]
  }
}

