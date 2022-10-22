package typingsJapgolly.wixUiCore.distEsSrcComponentsVideoTypesMod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDailyMotionPlayerAPI
  extends StObject
     with IPlayerAPI {
  
  var currentTime: Double
  
  var duration: Double
  
  var muted: Boolean
  
  def pause(): Unit
  
  def play(): Unit
  
  def setCurrentTime(amount: Double): Unit
  
  def setMuted(muted: Boolean): Unit
  
  def setVolume(fraction: Double): Unit
  
  var volume: Double
}
object IDailyMotionPlayerAPI {
  
  inline def apply(
    currentTime: Double,
    duration: Double,
    muted: Boolean,
    pause: Callback,
    play: Callback,
    setCurrentTime: Double => Callback,
    setMuted: Boolean => Callback,
    setVolume: Double => Callback,
    volume: Double
  ): IDailyMotionPlayerAPI = {
    val __obj = js.Dynamic.literal(currentTime = currentTime.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], muted = muted.asInstanceOf[js.Any], pause = pause.toJsFn, play = play.toJsFn, setCurrentTime = js.Any.fromFunction1((t0: Double) => setCurrentTime(t0).runNow()), setMuted = js.Any.fromFunction1((t0: Boolean) => setMuted(t0).runNow()), setVolume = js.Any.fromFunction1((t0: Double) => setVolume(t0).runNow()), volume = volume.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDailyMotionPlayerAPI]
  }
  
  extension [Self <: IDailyMotionPlayerAPI](x: Self) {
    
    inline def setCurrentTime(value: Double): Self = StObject.set(x, "currentTime", value.asInstanceOf[js.Any])
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setMuted(value: Boolean): Self = StObject.set(x, "muted", value.asInstanceOf[js.Any])
    
    inline def setPause(value: Callback): Self = StObject.set(x, "pause", value.toJsFn)
    
    inline def setPlay(value: Callback): Self = StObject.set(x, "play", value.toJsFn)
    
    inline def setSetCurrentTime(value: Double => Callback): Self = StObject.set(x, "setCurrentTime", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetMuted(value: Boolean => Callback): Self = StObject.set(x, "setMuted", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setSetVolume(value: Double => Callback): Self = StObject.set(x, "setVolume", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setVolume(value: Double): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
  }
}
