package typingsJapgolly.scriptableIos

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * _A timer that fires after a time interval has elapsed._
  *
  * Constructs a timer that fires after a specified time interval.
  * @see https://docs.scriptable.app/timer/#-new-timer
  */
trait Timer extends StObject {
  
  /**
    * _Stops the timer from firing._
    *
    * Stops the timer from firing ever again. Non-repeating timers are automatically invalidated after they have fired once. Repeating timers must be manually invalidated.
    * @see https://docs.scriptable.app/timer/#-invalidate
    */
  def invalidate(): Unit
  
  /**
    * _Whether the timer should repeat._
    *
    * A repeating timer will keep firing until it is invalidated. In contrast to non-repeating timers, repeating timers are not automatically invalidated. Defaults to false.
    * @see https://docs.scriptable.app/timer/#repeats
    */
  var repeats: Boolean
  
  /**
    * _Schedules the timer._
    *
    * Schedules the timer using its configuration. The supplied function is called when the timer fires. To stop the timer from firing, call the `invalidate()` function.
    * @param callback - The callback to be called when the timer fires.
    * @see https://docs.scriptable.app/timer/#-schedule
    */
  def schedule(callback: js.Function0[Unit]): Unit
  
  /**
    * _The frequency at which the timer fires, in milliseconds._
    *
    * Be aware that the time interval is specified in setting. Defaults to 0, causing the timer to fire instantly.
    * @see https://docs.scriptable.app/timer/#timeinterval
    */
  var timeInterval: Double
}
object Timer {
  
  inline def apply(
    invalidate: Callback,
    repeats: Boolean,
    schedule: js.Function0[Unit] => Callback,
    timeInterval: Double
  ): Timer = {
    val __obj = js.Dynamic.literal(invalidate = invalidate.toJsFn, repeats = repeats.asInstanceOf[js.Any], schedule = js.Any.fromFunction1((t0: js.Function0[Unit]) => schedule(t0).runNow()), timeInterval = timeInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[Timer]
  }
  
  extension [Self <: Timer](x: Self) {
    
    inline def setInvalidate(value: Callback): Self = StObject.set(x, "invalidate", value.toJsFn)
    
    inline def setRepeats(value: Boolean): Self = StObject.set(x, "repeats", value.asInstanceOf[js.Any])
    
    inline def setSchedule(value: js.Function0[Unit] => Callback): Self = StObject.set(x, "schedule", js.Any.fromFunction1((t0: js.Function0[Unit]) => value(t0).runNow()))
    
    inline def setTimeInterval(value: Double): Self = StObject.set(x, "timeInterval", value.asInstanceOf[js.Any])
  }
}
