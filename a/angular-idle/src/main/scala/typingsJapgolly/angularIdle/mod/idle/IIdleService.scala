package typingsJapgolly.angularIdle.mod.idle

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Idle, once watch() is called, will start a timeout which if expires, will enter a warning state
  * countdown. Once the countdown reaches zero, idle will broadcast a timeout event indicating the
  * user has timed out (where your app should log them out or whatever you like). If the user performs
  * an action that triggers a watched DOM event that bubbles up to document.body, this will reset the
  * idle/warning state and start the process over again.
  */
trait IIdleService extends js.Object {
  /**
    * Gets the current idle value
    */
  def getIdle(): Double
  /**
    * Gets the current timeout value
    */
  def getTimeout(): Double
  /**
    * Whether or not the user appears to be idle.
    */
  def idling(): Boolean
  /**
    * Manually trigger the idle interrupt that normally occurs during user activity.
    */
  def interrupt(): js.Any
  /**
    * Whether user has timed out (meaning idleDuration + timeout has passed without any activity)
    */
  def isExpired(): Boolean
  /**
    * Whether or not the watch() has been called and it is watching for idleness.
    */
  def running(): Boolean
  /**
    * Updates the idle value (see IdleProvider.idle()) and
    * restarts the watch if its running.
    */
  def setIdle(idle: Double): Unit
  /**
    * Updates the timeout value (see IdleProvider.timeout()) and
    * restarts the watch if its running.
    */
  def setTimeout(timeout: Double): Unit
  /**
    * Stops watching for idleness, and resets the idle/warning state.
    */
  def unwatch(): Unit
  /**
    * Starts watching for idleness, or resets the idle/warning state and continues watching.
    */
  def watch(): Unit
}

object IIdleService {
  @scala.inline
  def apply(
    getIdle: CallbackTo[Double],
    getTimeout: CallbackTo[Double],
    idling: CallbackTo[Boolean],
    interrupt: CallbackTo[js.Any],
    isExpired: CallbackTo[Boolean],
    running: CallbackTo[Boolean],
    setIdle: Double => Callback,
    setTimeout: Double => Callback,
    unwatch: Callback,
    watch: Callback
  ): IIdleService = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getIdle")(getIdle.toJsFn)
    __obj.updateDynamic("getTimeout")(getTimeout.toJsFn)
    __obj.updateDynamic("idling")(idling.toJsFn)
    __obj.updateDynamic("interrupt")(interrupt.toJsFn)
    __obj.updateDynamic("isExpired")(isExpired.toJsFn)
    __obj.updateDynamic("running")(running.toJsFn)
    __obj.updateDynamic("setIdle")(js.Any.fromFunction1((t0: scala.Double) => setIdle(t0).runNow()))
    __obj.updateDynamic("setTimeout")(js.Any.fromFunction1((t0: scala.Double) => setTimeout(t0).runNow()))
    __obj.updateDynamic("unwatch")(unwatch.toJsFn)
    __obj.updateDynamic("watch")(watch.toJsFn)
    __obj.asInstanceOf[IIdleService]
  }
}

