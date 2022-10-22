package typingsJapgolly.angularAnimations.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/animations", "NoopAnimationPlayer")
@js.native
open class NoopAnimationPlayer ()
  extends StObject
     with AnimationPlayer {
  def this(duration: Double) = this()
  def this(duration: Double, delay: Double) = this()
  def this(duration: Unit, delay: Double) = this()
  
  /* private */ var _destroyed: Any = js.native
  
  /* private */ var _finished: Any = js.native
  
  /* private */ var _onDestroyFns: Any = js.native
  
  /* private */ var _onDoneFns: Any = js.native
  
  /* private */ var _onFinish: Any = js.native
  
  /* private */ var _onStart: Any = js.native
  
  /* private */ var _onStartFns: Any = js.native
  
  /* private */ var _originalOnDoneFns: Any = js.native
  
  /* private */ var _originalOnStartFns: Any = js.native
  
  /* private */ var _position: Any = js.native
  
  /* private */ var _started: Any = js.native
  
  /**
    * Destroys the animation, after invoking the `beforeDestroy()` callback.
    * Calls the `onDestroy()` callback when destruction is completed.
    */
  /* CompleteClass */
  override def destroy(): Unit = js.native
  
  /**
    * Ends the animation, invoking the `onDone()` callback.
    */
  /* CompleteClass */
  override def finish(): Unit = js.native
  
  /**
    * Reports the current position of the animation.
    * @returns A 0-based offset into the duration, in milliseconds.
    */
  /* CompleteClass */
  override def getPosition(): Double = js.native
  
  /**
    * Reports whether the animation has started.
    * @returns True if the animation has started, false otherwise.
    */
  /* CompleteClass */
  override def hasStarted(): Boolean = js.native
  
  /**
    * Initializes the animation.
    */
  /* CompleteClass */
  override def init(): Unit = js.native
  
  /**
    * Provides a callback to invoke after the animation is destroyed.
    * @param fn The callback function.
    * @see `destroy()`
    * @see `beforeDestroy()`
    */
  /* CompleteClass */
  override def onDestroy(fn: js.Function0[Unit]): Unit = js.native
  
  /**
    * Provides a callback to invoke when the animation finishes.
    * @param fn The callback function.
    * @see `finish()`
    */
  /* CompleteClass */
  override def onDone(fn: js.Function0[Unit]): Unit = js.native
  
  /**
    * Provides a callback to invoke when the animation starts.
    * @param fn The callback function.
    * @see `run()`
    */
  /* CompleteClass */
  override def onStart(fn: js.Function0[Unit]): Unit = js.native
  
  /**
    * The parent of this player, if any.
    */
  /* CompleteClass */
  var parentPlayer: AnimationPlayer | Null = js.native
  
  /**
    * Pauses the animation.
    */
  /* CompleteClass */
  override def pause(): Unit = js.native
  
  /**
    * Runs the animation, invoking the `onStart()` callback.
    */
  /* CompleteClass */
  override def play(): Unit = js.native
  
  /**
    * Resets the animation to its initial state.
    */
  /* CompleteClass */
  override def reset(): Unit = js.native
  
  /**
    * Restarts the paused animation.
    */
  /* CompleteClass */
  override def restart(): Unit = js.native
  
  /**
    * Sets the position of the animation.
    * @param position A 0-based offset into the duration, in milliseconds.
    */
  /* CompleteClass */
  override def setPosition(position: Any): Unit = js.native
  def setPosition(position: Double): Unit = js.native
  
  /**
    * The total run time of the animation, in milliseconds.
    */
  /* CompleteClass */
  override val totalTime: Double = js.native
}
