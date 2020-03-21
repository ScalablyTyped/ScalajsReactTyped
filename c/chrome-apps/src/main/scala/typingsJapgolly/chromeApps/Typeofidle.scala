package typingsJapgolly.chromeApps

import japgolly.scalajs.react.Callback
import typingsJapgolly.chromeApps.chrome.events.Event
import typingsJapgolly.chromeApps.chrome.idle.IdleState
import typingsJapgolly.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofidle extends js.Object {
  /**
    * Fired when the system changes to an active, idle or locked state.
    * The event fires with 'locked' if the screen is locked or the screensaver activates,
    * 'idle' if the system is unlocked and the user has not generated any input for a
    * specified number of seconds, and 'active' when the user generates input on an idle system.
    */
  val onStateChanged: Event[js.Function1[/* newState */ IdleState, Unit]]
  /**
    * Returns 'locked' if the system is locked, 'idle' if the user has not generated any input for a specified number of seconds, or 'active' otherwise.
    * @param detectionIntervalInSeconds The system is considered idle if detectionIntervalInSeconds seconds have elapsed since the last user input detected.
    * Since Chrome 25.
    * @param callback The callback parameter should be a function that looks like this:
    * function( IdleState newState) {...};
    */
  def queryState(detectionIntervalInSeconds: integer, callback: js.Function1[/* newState */ IdleState, Unit]): Unit
  /**
    * Sets the interval, in seconds, used to determine when the system is in an idle state for
    * onStateChanged events.
    * The default interval is 60 seconds.
    * @since Chrome 25.
    * @param intervalInSeconds Threshold, in seconds, used to determine when the system is in an idle state.
    */
  def setDetectionInterval(intervalInSeconds: integer): Unit
}

object Typeofidle {
  @scala.inline
  def apply(
    onStateChanged: Event[js.Function1[/* newState */ IdleState, Unit]],
    queryState: (integer, js.Function1[/* newState */ IdleState, Unit]) => Callback,
    setDetectionInterval: integer => Callback
  ): Typeofidle = {
    val __obj = js.Dynamic.literal(onStateChanged = onStateChanged.asInstanceOf[js.Any])
    __obj.updateDynamic("queryState")(js.Any.fromFunction2((t0: typingsJapgolly.chromeApps.chrome.integer, t1: js.Function1[/* newState */ typingsJapgolly.chromeApps.chrome.idle.IdleState, scala.Unit]) => queryState(t0, t1).runNow()))
    __obj.updateDynamic("setDetectionInterval")(js.Any.fromFunction1((t0: typingsJapgolly.chromeApps.chrome.integer) => setDetectionInterval(t0).runNow()))
    __obj.asInstanceOf[Typeofidle]
  }
}

