package typingsJapgolly.snapchatLensStudio

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.snapchatLensStudio.snapchatLensStudioStrings.enabled
import typingsJapgolly.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An event that gets triggered after a delay. */
trait DelayedCallbackEvent
  extends StObject
     with SceneEvent[DelayedCallbackEvent] {
  
  /** Returns the total delay time in seconds set on the event. */
  def getDelayTime(): Double
  
  /** Returns the current time in seconds left in the event’s delay. */
  def getTimeLeft(): Double
  
  /** Calling this will cause the event to trigger in time seconds. */
  def reset(time: Double): Unit
}
object DelayedCallbackEvent {
  
  inline def apply(
    bind: js.Function1[/* eventData */ Omit[DelayedCallbackEvent, enabled], Unit] => Callback,
    enabled: Boolean,
    getDelayTime: CallbackTo[Double],
    getTimeLeft: CallbackTo[Double],
    getTypeName: CallbackTo[String],
    isOfType: String => Boolean,
    reset: Double => Callback
  ): DelayedCallbackEvent = {
    val __obj = js.Dynamic.literal(bind = js.Any.fromFunction1((t0: js.Function1[/* eventData */ Omit[DelayedCallbackEvent, enabled], Unit]) => bind(t0).runNow()), enabled = enabled.asInstanceOf[js.Any], getDelayTime = getDelayTime.toJsFn, getTimeLeft = getTimeLeft.toJsFn, getTypeName = getTypeName.toJsFn, isOfType = js.Any.fromFunction1(isOfType), reset = js.Any.fromFunction1((t0: Double) => reset(t0).runNow()))
    __obj.asInstanceOf[DelayedCallbackEvent]
  }
  
  extension [Self <: DelayedCallbackEvent](x: Self) {
    
    inline def setGetDelayTime(value: CallbackTo[Double]): Self = StObject.set(x, "getDelayTime", value.toJsFn)
    
    inline def setGetTimeLeft(value: CallbackTo[Double]): Self = StObject.set(x, "getTimeLeft", value.toJsFn)
    
    inline def setReset(value: Double => Callback): Self = StObject.set(x, "reset", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
