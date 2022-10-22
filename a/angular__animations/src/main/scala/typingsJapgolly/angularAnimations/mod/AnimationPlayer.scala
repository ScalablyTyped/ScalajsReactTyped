package typingsJapgolly.angularAnimations.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimationPlayer extends StObject {
  
  /**
    * Provides a callback to invoke before the animation is destroyed.
    */
  var beforeDestroy: js.UndefOr[js.Function0[Any]] = js.undefined
  
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
    * The parent of this player, if any.
    */
  var parentPlayer: AnimationPlayer | Null
  
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
  def setPosition(position: Any): Unit
  
  /**
    * The total run time of the animation, in milliseconds.
    */
  val totalTime: Double
}
object AnimationPlayer {
  
  inline def apply(
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
    setPosition: Any => Callback,
    totalTime: Double
  ): AnimationPlayer = {
    val __obj = js.Dynamic.literal(destroy = destroy.toJsFn, finish = finish.toJsFn, getPosition = getPosition.toJsFn, hasStarted = hasStarted.toJsFn, init = init.toJsFn, onDestroy = js.Any.fromFunction1((t0: js.Function0[Unit]) => onDestroy(t0).runNow()), onDone = js.Any.fromFunction1((t0: js.Function0[Unit]) => onDone(t0).runNow()), onStart = js.Any.fromFunction1((t0: js.Function0[Unit]) => onStart(t0).runNow()), pause = pause.toJsFn, play = play.toJsFn, reset = reset.toJsFn, restart = restart.toJsFn, setPosition = js.Any.fromFunction1((t0: Any) => setPosition(t0).runNow()), totalTime = totalTime.asInstanceOf[js.Any], parentPlayer = null)
    __obj.asInstanceOf[AnimationPlayer]
  }
  
  extension [Self <: AnimationPlayer](x: Self) {
    
    inline def setBeforeDestroy(value: CallbackTo[Any]): Self = StObject.set(x, "beforeDestroy", value.toJsFn)
    
    inline def setBeforeDestroyUndefined: Self = StObject.set(x, "beforeDestroy", js.undefined)
    
    inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
    
    inline def setFinish(value: Callback): Self = StObject.set(x, "finish", value.toJsFn)
    
    inline def setGetPosition(value: CallbackTo[Double]): Self = StObject.set(x, "getPosition", value.toJsFn)
    
    inline def setHasStarted(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasStarted", value.toJsFn)
    
    inline def setInit(value: Callback): Self = StObject.set(x, "init", value.toJsFn)
    
    inline def setOnDestroy(value: js.Function0[Unit] => Callback): Self = StObject.set(x, "onDestroy", js.Any.fromFunction1((t0: js.Function0[Unit]) => value(t0).runNow()))
    
    inline def setOnDone(value: js.Function0[Unit] => Callback): Self = StObject.set(x, "onDone", js.Any.fromFunction1((t0: js.Function0[Unit]) => value(t0).runNow()))
    
    inline def setOnStart(value: js.Function0[Unit] => Callback): Self = StObject.set(x, "onStart", js.Any.fromFunction1((t0: js.Function0[Unit]) => value(t0).runNow()))
    
    inline def setParentPlayer(value: AnimationPlayer): Self = StObject.set(x, "parentPlayer", value.asInstanceOf[js.Any])
    
    inline def setParentPlayerNull: Self = StObject.set(x, "parentPlayer", null)
    
    inline def setPause(value: Callback): Self = StObject.set(x, "pause", value.toJsFn)
    
    inline def setPlay(value: Callback): Self = StObject.set(x, "play", value.toJsFn)
    
    inline def setReset(value: Callback): Self = StObject.set(x, "reset", value.toJsFn)
    
    inline def setRestart(value: Callback): Self = StObject.set(x, "restart", value.toJsFn)
    
    inline def setSetPosition(value: Any => Callback): Self = StObject.set(x, "setPosition", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setTotalTime(value: Double): Self = StObject.set(x, "totalTime", value.asInstanceOf[js.Any])
  }
}
