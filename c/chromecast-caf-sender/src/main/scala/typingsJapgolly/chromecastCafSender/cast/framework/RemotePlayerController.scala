package typingsJapgolly.chromecastCafSender.cast.framework

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemotePlayerController extends StObject {
  
  def addEventListener(
    `type`: RemotePlayerEventType,
    handler: js.Function1[/* event */ RemotePlayerChangedEvent[Any], Unit]
  ): Unit
  
  def getFormattedTime(timeInSec: Double): String
  
  def getSeekPosition(currentTime: Double, duration: Double): Double
  
  def getSeekTime(currentPosition: Double, duration: Double): Double
  
  def muteOrUnmute(): Unit
  
  def playOrPause(): Unit
  
  def removeEventListener(
    `type`: RemotePlayerEventType,
    handler: js.Function1[/* event */ RemotePlayerChangedEvent[Any], Unit]
  ): Unit
  
  def seek(): Unit
  
  def setVolumeLevel(): Unit
  
  def stop(): Unit
}
object RemotePlayerController {
  
  inline def apply(
    addEventListener: (RemotePlayerEventType, js.Function1[/* event */ RemotePlayerChangedEvent[Any], Unit]) => Callback,
    getFormattedTime: Double => String,
    getSeekPosition: (Double, Double) => Double,
    getSeekTime: (Double, Double) => Double,
    muteOrUnmute: Callback,
    playOrPause: Callback,
    removeEventListener: (RemotePlayerEventType, js.Function1[/* event */ RemotePlayerChangedEvent[Any], Unit]) => Callback,
    seek: Callback,
    setVolumeLevel: Callback,
    stop: Callback
  ): RemotePlayerController = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2((t0: RemotePlayerEventType, t1: js.Function1[/* event */ RemotePlayerChangedEvent[Any], Unit]) => (addEventListener(t0, t1)).runNow()), getFormattedTime = js.Any.fromFunction1(getFormattedTime), getSeekPosition = js.Any.fromFunction2(getSeekPosition), getSeekTime = js.Any.fromFunction2(getSeekTime), muteOrUnmute = muteOrUnmute.toJsFn, playOrPause = playOrPause.toJsFn, removeEventListener = js.Any.fromFunction2((t0: RemotePlayerEventType, t1: js.Function1[/* event */ RemotePlayerChangedEvent[Any], Unit]) => (removeEventListener(t0, t1)).runNow()), seek = seek.toJsFn, setVolumeLevel = setVolumeLevel.toJsFn, stop = stop.toJsFn)
    __obj.asInstanceOf[RemotePlayerController]
  }
  
  extension [Self <: RemotePlayerController](x: Self) {
    
    inline def setAddEventListener(
      value: (RemotePlayerEventType, js.Function1[/* event */ RemotePlayerChangedEvent[Any], Unit]) => Callback
    ): Self = StObject.set(x, "addEventListener", js.Any.fromFunction2((t0: RemotePlayerEventType, t1: js.Function1[/* event */ RemotePlayerChangedEvent[Any], Unit]) => (value(t0, t1)).runNow()))
    
    inline def setGetFormattedTime(value: Double => String): Self = StObject.set(x, "getFormattedTime", js.Any.fromFunction1(value))
    
    inline def setGetSeekPosition(value: (Double, Double) => Double): Self = StObject.set(x, "getSeekPosition", js.Any.fromFunction2(value))
    
    inline def setGetSeekTime(value: (Double, Double) => Double): Self = StObject.set(x, "getSeekTime", js.Any.fromFunction2(value))
    
    inline def setMuteOrUnmute(value: Callback): Self = StObject.set(x, "muteOrUnmute", value.toJsFn)
    
    inline def setPlayOrPause(value: Callback): Self = StObject.set(x, "playOrPause", value.toJsFn)
    
    inline def setRemoveEventListener(
      value: (RemotePlayerEventType, js.Function1[/* event */ RemotePlayerChangedEvent[Any], Unit]) => Callback
    ): Self = StObject.set(x, "removeEventListener", js.Any.fromFunction2((t0: RemotePlayerEventType, t1: js.Function1[/* event */ RemotePlayerChangedEvent[Any], Unit]) => (value(t0, t1)).runNow()))
    
    inline def setSeek(value: Callback): Self = StObject.set(x, "seek", value.toJsFn)
    
    inline def setSetVolumeLevel(value: Callback): Self = StObject.set(x, "setVolumeLevel", value.toJsFn)
    
    inline def setStop(value: Callback): Self = StObject.set(x, "stop", value.toJsFn)
  }
}
