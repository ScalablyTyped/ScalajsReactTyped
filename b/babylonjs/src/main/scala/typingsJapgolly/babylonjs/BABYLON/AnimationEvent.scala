package typingsJapgolly.babylonjs.BABYLON

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimationEvent extends StObject {
  
  /** @internal */
  def _clone(): AnimationEvent
  
  /** The event to perform when triggered **/
  def action(currentFrame: Double): Unit
  
  /** The frame for which the event is triggered **/
  var frame: Double
  
  /**
    * Specifies if the animation event is done
    */
  var isDone: Boolean
  
  /** Specifies if the event should be triggered only once**/
  var onlyOnce: js.UndefOr[Boolean] = js.undefined
}
object AnimationEvent {
  
  inline def apply(_clone: CallbackTo[AnimationEvent], action: Double => Callback, frame: Double, isDone: Boolean): AnimationEvent = {
    val __obj = js.Dynamic.literal(_clone = _clone.toJsFn, action = js.Any.fromFunction1((t0: Double) => action(t0).runNow()), frame = frame.asInstanceOf[js.Any], isDone = isDone.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationEvent]
  }
  
  extension [Self <: AnimationEvent](x: Self) {
    
    inline def setAction(value: Double => Callback): Self = StObject.set(x, "action", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setFrame(value: Double): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
    
    inline def setIsDone(value: Boolean): Self = StObject.set(x, "isDone", value.asInstanceOf[js.Any])
    
    inline def setOnlyOnce(value: Boolean): Self = StObject.set(x, "onlyOnce", value.asInstanceOf[js.Any])
    
    inline def setOnlyOnceUndefined: Self = StObject.set(x, "onlyOnce", js.undefined)
    
    inline def set_clone(value: CallbackTo[AnimationEvent]): Self = StObject.set(x, "_clone", value.toJsFn)
  }
}
