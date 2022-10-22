package typingsJapgolly.googleEarth.google.earth

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GETourPlayer extends StObject {
  
  /**
    * The current elapsed playing time of the active tour, in seconds.
    */
  def getCurrentTime(): Double
  
  /**
    * The total duration of the active tour, in seconds. If no tour is loaded, the behavior of this method is undefined.
    */
  def getDuration(): Double
  
  /**
    * Pauses the currently active tour.
    */
  def pause(): Unit
  
  /**
    * Plays the currently active tour.
    */
  def play(): Unit
  
  /**
    * Resets the currently active tour, stopping playback and rewinding to the start of the tour.
    */
  def reset(): Unit
  
  /**
    * The current elapsed playing time of the active tour, in seconds.
    */
  def setCurrentTime(currentTime: Double): Unit
  
  /**
    * Enters the given tour object, exiting any other currently active tour.
    * This method does not automatically begin playing the tour. 
    * If the argument is null, then any currently active tour is exited and normal globe navigation is enabled.
    */
  def setTour(tour: KmlTour): Unit
}
object GETourPlayer {
  
  inline def apply(
    getCurrentTime: CallbackTo[Double],
    getDuration: CallbackTo[Double],
    pause: Callback,
    play: Callback,
    reset: Callback,
    setCurrentTime: Double => Callback,
    setTour: KmlTour => Callback
  ): GETourPlayer = {
    val __obj = js.Dynamic.literal(getCurrentTime = getCurrentTime.toJsFn, getDuration = getDuration.toJsFn, pause = pause.toJsFn, play = play.toJsFn, reset = reset.toJsFn, setCurrentTime = js.Any.fromFunction1((t0: Double) => setCurrentTime(t0).runNow()), setTour = js.Any.fromFunction1((t0: KmlTour) => setTour(t0).runNow()))
    __obj.asInstanceOf[GETourPlayer]
  }
  
  extension [Self <: GETourPlayer](x: Self) {
    
    inline def setGetCurrentTime(value: CallbackTo[Double]): Self = StObject.set(x, "getCurrentTime", value.toJsFn)
    
    inline def setGetDuration(value: CallbackTo[Double]): Self = StObject.set(x, "getDuration", value.toJsFn)
    
    inline def setPause(value: Callback): Self = StObject.set(x, "pause", value.toJsFn)
    
    inline def setPlay(value: Callback): Self = StObject.set(x, "play", value.toJsFn)
    
    inline def setReset(value: Callback): Self = StObject.set(x, "reset", value.toJsFn)
    
    inline def setSetCurrentTime(value: Double => Callback): Self = StObject.set(x, "setCurrentTime", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetTour(value: KmlTour => Callback): Self = StObject.set(x, "setTour", js.Any.fromFunction1((t0: KmlTour) => value(t0).runNow()))
  }
}
