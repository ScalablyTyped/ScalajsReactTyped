package typingsJapgolly.angularAnimations.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimationPlayer extends js.Object {
  /**
    * Provides a callback to invoke before the animation is destroyed.
    */
  var beforeDestroy: js.UndefOr[js.Function0[_]] = js.undefined
  /**
    * The parent of this player, if any.
    */
  var parentPlayer: AnimationPlayer | Null
  /**
    * The total run time of the animation, in milliseconds.
    */
  val totalTime: Double
  /**
    * Destroys the animation, after invoking the `beforeDestroy()` callback.
    * Calls the `onDestroy()` callback when destruction is completed.
    */
  def destroy(): Unit
  /**
    * Ends the animation, invoking the `onDone()` callback.
    */
  def finish(): Unit
  /**
    * Reports the current position of the animation.
    * @returns A 0-based offset into the duration, in milliseconds.
    */
  def getPosition(): Double
  /**
    * Reports whether the animation has started.
    * @returns True if the animation has started, false otherwise.
    */
  def hasStarted(): Boolean
  /**
    * Initializes the animation.
    */
  def init(): Unit
  /**
    * Provides a callback to invoke after the animation is destroyed.
    * @param fn The callback function.
    * @see `destroy()`
    * @see `beforeDestroy()`
    */
  def onDestroy(fn: js.Function0[Unit]): Unit
  /**
    * Provides a callback to invoke when the animation finishes.
    * @param fn The callback function.
    * @see `finish()`
    */
  def onDone(fn: js.Function0[Unit]): Unit
  /**
    * Provides a callback to invoke when the animation starts.
    * @param fn The callback function.
    * @see `run()`
    */
  def onStart(fn: js.Function0[Unit]): Unit
  /**
    * Pauses the animation.
    */
  def pause(): Unit
  /**
    * Runs the animation, invoking the `onStart()` callback.
    */
  def play(): Unit
  /**
    * Resets the animation to its initial state.
    */
  def reset(): Unit
  /**
    * Restarts the paused animation.
    */
  def restart(): Unit
  /**
    * Sets the position of the animation.
    * @param position A 0-based offset into the duration, in milliseconds.
    */
  def setPosition(position: js.Any): Unit
}

object AnimationPlayer {
  @scala.inline
  def apply(
    destroy: Callback,
    finish: Callback,
    getPosition: CallbackTo[Double],
    hasStarted: CallbackTo[Boolean],
    init: Callback,
    onDestroy: js.Function0[Unit] => Callback,
    onDone: js.Function0[Unit] => Callback,
    onStart: js.Function0[Unit] => Callback,
    pause: Callback,
    play: Callback,
    reset: Callback,
    restart: Callback,
    setPosition: js.Any => Callback,
    totalTime: Double,
    beforeDestroy: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    parentPlayer: AnimationPlayer = null
  ): AnimationPlayer = {
    val __obj = js.Dynamic.literal(totalTime = totalTime.asInstanceOf[js.Any])
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.updateDynamic("finish")(finish.toJsFn)
    __obj.updateDynamic("getPosition")(getPosition.toJsFn)
    __obj.updateDynamic("hasStarted")(hasStarted.toJsFn)
    __obj.updateDynamic("init")(init.toJsFn)
    __obj.updateDynamic("onDestroy")(js.Any.fromFunction1((t0: js.Function0[scala.Unit]) => onDestroy(t0).runNow()))
    __obj.updateDynamic("onDone")(js.Any.fromFunction1((t0: js.Function0[scala.Unit]) => onDone(t0).runNow()))
    __obj.updateDynamic("onStart")(js.Any.fromFunction1((t0: js.Function0[scala.Unit]) => onStart(t0).runNow()))
    __obj.updateDynamic("pause")(pause.toJsFn)
    __obj.updateDynamic("play")(play.toJsFn)
    __obj.updateDynamic("reset")(reset.toJsFn)
    __obj.updateDynamic("restart")(restart.toJsFn)
    __obj.updateDynamic("setPosition")(js.Any.fromFunction1((t0: js.Any) => setPosition(t0).runNow()))
    beforeDestroy.foreach(p => __obj.updateDynamic("beforeDestroy")(p.toJsFn))
    if (parentPlayer != null) __obj.updateDynamic("parentPlayer")(parentPlayer.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationPlayer]
  }
}

